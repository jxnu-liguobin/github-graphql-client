package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class AcceptTopicSuggestionMutationResponse extends GraphQLResult<Map<String, AcceptTopicSuggestionPayloadTO>> {

    private static final String OPERATION_NAME = "acceptTopicSuggestion";

    public AcceptTopicSuggestionMutationResponse() {
    }

    public AcceptTopicSuggestionPayloadTO acceptTopicSuggestion() {
        Map<String, AcceptTopicSuggestionPayloadTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
