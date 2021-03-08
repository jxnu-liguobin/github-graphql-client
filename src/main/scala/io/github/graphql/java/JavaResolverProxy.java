package io.github.graphql.java;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import io.github.graphql.common.Execution;
import io.github.graphql.common.JavaCollectionUtils;

import java.lang.reflect.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

final public class JavaResolverProxy implements InvocationHandler, Execution {

    private GraphQLResponseProjection projection;

    private GraphQLOperationRequest request;

    private int maxDepth;

    public JavaResolverProxy(GraphQLResponseProjection projection, GraphQLOperationRequest request, int maxDepth) {
        this.projection = projection;
        this.request = request;
        this.maxDepth = maxDepth;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        System.out.println("before Invoking");
        if (Object.class.equals(method.getDeclaringClass())) {
            try {
                System.out.println("invoking by resolver implement");
                return method.invoke(this, args);
            } catch (Throwable t) {
                t.printStackTrace();
                return null;
            }
        } else {
            System.out.println("invoking by dynamic proxy");
            return proxyInvoke(method, args);
        }
    }

    private Object proxyInvoke(Method method, Object[] args) {
        Field field = null;
        List<GraphQLResponseField> fields = null;
        String entityClazzName;
        Type type = method.getGenericReturnType();
        if (type instanceof ParameterizedType) {
            Type[] parameterizedType = ((ParameterizedType) type).getActualTypeArguments();
            entityClazzName = parameterizedType[0].getTypeName();
        } else {
            entityClazzName = type.getTypeName();
        }
        List<Parameter> parameters = Arrays.stream(method.getParameters()).collect(Collectors.toList());

        if (!parameters.isEmpty()) {
            List<String> parameterNames = parameters.stream().map(Parameter::getName).collect(Collectors.toList());
            List<Object> arguments = Arrays.stream(args).collect(Collectors.toList());
            request.getInput().putAll(JavaCollectionUtils.listToMap(parameterNames, arguments));
        }
        // TODO remove reflect
        try {
            field = projection.getClass().getSuperclass().getDeclaredField("fields");
            field.setAccessible(true);
            fields = (List<GraphQLResponseField>) field.get(projection);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        } finally {
            if (field != null) {
                field.setAccessible(false);
            }
        }

        //if fields not null, use it directly, because user want to select fields
        if (projection != null && (fields == null || fields.isEmpty())) {
            projection = projection.all$(maxDepth);
        }

        return executeHttp(entityClazzName, request, projection);
    }
}