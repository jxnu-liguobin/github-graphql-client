package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class NodesQueryResponse extends GraphQLResult<Map<String, java.util.List<NodeTO>>> {

    private static final String OPERATION_NAME = "nodes";

    public NodesQueryResponse() {
    }

    public java.util.List<NodeTO> nodes() {
        Map<String, java.util.List<NodeTO>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
