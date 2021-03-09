package io.github.graphql.deserializer;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequest;
import okhttp3.Response;
import scala.Function1;
import scala.Function4;
import scala.Tuple4;

public interface JavaDeserializerAdapter extends JavaDeserializer {

    default Function4<Response, Object, GraphQLRequest, String, Object> buildFunction4() {
        Function4<Response, Object, GraphQLRequest, String, Object> fun = new Function4<Response, Object, GraphQLRequest, String, Object>() {
            @Override
            public Object apply(Response v1, Object v2, GraphQLRequest v3, String v4) {
                return extractData(v1, (Boolean) v2, v3, v4);
            }

            @Override
            public Function1<Response, Function1<Object, Function1<GraphQLRequest, Function1<String, Object>>>> curried() {
                return null;
            }

            @Override
            public Function1<Tuple4<Response, Object, GraphQLRequest, String>, Object> tupled() {
                return null;
            }
        };
        return fun;
    }
}
