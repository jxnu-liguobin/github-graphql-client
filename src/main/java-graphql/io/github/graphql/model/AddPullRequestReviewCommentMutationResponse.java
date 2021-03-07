package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class AddPullRequestReviewCommentMutationResponse extends GraphQLResult<Map<String, AddPullRequestReviewCommentPayloadTO>> {

    private static final String OPERATION_NAME = "addPullRequestReviewComment";

    public AddPullRequestReviewCommentMutationResponse() {
    }

    public AddPullRequestReviewCommentPayloadTO addPullRequestReviewComment() {
        Map<String, AddPullRequestReviewCommentPayloadTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
