package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class UpdatePullRequestMutationResponse extends GraphQLResult<Map<String, UpdatePullRequestPayloadTO>> {

    private static final String OPERATION_NAME = "updatePullRequest";

    public UpdatePullRequestMutationResponse() {
    }

    public UpdatePullRequestPayloadTO updatePullRequest() {
        Map<String, UpdatePullRequestPayloadTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
