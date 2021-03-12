package io.github.graphql.deserializer;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequest;
import okhttp3.Response;
import scala.Function1;
import scala.Function3;
import scala.Tuple3;

public interface JavaDeserializerAdapter extends JavaDeserializer {

    default Function3<Response, GraphQLRequest, Class<?>, Object> buildFunction3() {

        return new Function3<Response, GraphQLRequest, Class<?>, Object>() {

            @Override
            public Object apply(Response v1, GraphQLRequest v2, Class<?> v3) {
                return extractData(v1, v2, v3);
            }

            @Override
            public Function1<Tuple3<Response, GraphQLRequest, Class<?>>, Object> tupled() {
                return null;
            }

        };
    }
}
