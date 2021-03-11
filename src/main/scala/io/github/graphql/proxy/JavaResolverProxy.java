package io.github.graphql.proxy;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequest;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import io.github.graphql.*;
import io.github.graphql.deserializer.JavaDeserializerAdapter;

import java.lang.reflect.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

final public class JavaResolverProxy implements InvocationHandler, JavaDeserializerAdapter {

    private GraphQLResponseProjection projection;

    private GraphQLOperationRequest request;

    private final ServerConfig config;

    public JavaResolverProxy(ServerConfig config, GraphQLResponseProjection projection, Class<? extends GraphQLOperationRequest> request) {
        this.config = config;
        this.projection = projection;
        try {
            this.request = request.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new ExecuteException("newInstance failed: ", e.getLocalizedMessage(), e);
        }
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        if (Object.class.equals(method.getDeclaringClass())) {
            try {
                return method.invoke(this, args);
            } catch (Throwable t) {
                throw new ExecuteException("invoke failed: ", t.getLocalizedMessage(), t);
            }
        } else {
            return proxyInvoke(method, args);
        }
    }

    private Object proxyInvoke(Method method, Object[] args) {
        Field field = null;
        List<GraphQLResponseField> fields;
        String entityClassName;
        Type type = method.getGenericReturnType();
        boolean isCollection = false;
        if (type instanceof ParameterizedType) {
            isCollection = true;
            Type[] parameterizedType = ((ParameterizedType) type).getActualTypeArguments();
            entityClassName = parameterizedType[0].getTypeName();
        } else {
            entityClassName = type.getTypeName();
        }
        List<Parameter> parameters = Arrays.stream(method.getParameters()).collect(Collectors.toList());

        if (!parameters.isEmpty()) {
            List<String> parameterNames = parameters.stream().map(Parameter::getName).collect(Collectors.toList());
            List<Object> arguments = Arrays.stream(args).collect(Collectors.toList());
            request.getInput().putAll(CollectionUtils.listToMap(parameterNames, arguments));
        }
        // TODO remove reflect
        try {
            field = projection.getClass().getSuperclass().getDeclaredField("fields");
            field.setAccessible(true);
            fields = (List<GraphQLResponseField>) field.get(projection);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new ExecuteException("access fields failed: ", e.getLocalizedMessage(), e);
        } finally {
            if (field != null) {
                field.setAccessible(false);
            }
        }

        //if fields not null, use it directly, because user want to select fields
        if (projection != null && (fields == null || fields.isEmpty())) {
            throw new ExecuteException("projection verification failed: ", "fields of projection cannot be empty", null);
        }

        GraphQLRequest graphQLRequest = new GraphQLRequest(request, projection);
        Object ret;
        ret = OkHttp.syncRunQuery(config, isCollection, graphQLRequest, entityClassName, buildFunction4());
        return ret;
    }

}