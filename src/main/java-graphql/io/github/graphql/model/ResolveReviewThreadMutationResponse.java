package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class ResolveReviewThreadMutationResponse extends GraphQLResult<Map<String, ResolveReviewThreadPayloadTO>> {

    private static final String OPERATION_NAME = "resolveReviewThread";

    public ResolveReviewThreadMutationResponse() {
    }

    public ResolveReviewThreadPayloadTO resolveReviewThread() {
        Map<String, ResolveReviewThreadPayloadTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
