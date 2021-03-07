package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class SubmitPullRequestReviewMutationResponse extends GraphQLResult<Map<String, SubmitPullRequestReviewPayloadTO>> {

    private static final String OPERATION_NAME = "submitPullRequestReview";

    public SubmitPullRequestReviewMutationResponse() {
    }

    public SubmitPullRequestReviewPayloadTO submitPullRequestReview() {
        Map<String, SubmitPullRequestReviewPayloadTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
