package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class RemoveReactionMutationResponse extends GraphQLResult<Map<String, RemoveReactionPayloadTO>> {

    private static final String OPERATION_NAME = "removeReaction";

    public RemoveReactionMutationResponse() {
    }

    public RemoveReactionPayloadTO removeReaction() {
        Map<String, RemoveReactionPayloadTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
