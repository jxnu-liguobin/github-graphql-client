package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class AddPullRequestReviewMutationResponse extends GraphQLResult<Map<String, AddPullRequestReviewPayloadTO>> {

    private static final String OPERATION_NAME = "addPullRequestReview";

    public AddPullRequestReviewMutationResponse() {
    }

    public AddPullRequestReviewPayloadTO addPullRequestReview() {
        Map<String, AddPullRequestReviewPayloadTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
