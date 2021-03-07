package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class DeletePullRequestReviewInputTO implements java.io.Serializable {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String pullRequestReviewId;

    public DeletePullRequestReviewInputTO() {
    }

    public DeletePullRequestReviewInputTO(String clientMutationId, String pullRequestReviewId) {
        this.clientMutationId = clientMutationId;
        this.pullRequestReviewId = pullRequestReviewId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public String getPullRequestReviewId() {
        return pullRequestReviewId;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (pullRequestReviewId != null) {
            joiner.add("pullRequestReviewId: " + GraphQLRequestSerializer.getEntry(pullRequestReviewId));
        }
        return joiner.toString();
    }

    public static DeletePullRequestReviewInputTO.Builder builder() {
        return new DeletePullRequestReviewInputTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private String pullRequestReviewId;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setPullRequestReviewId(String pullRequestReviewId) {
            this.pullRequestReviewId = pullRequestReviewId;
            return this;
        }


        public DeletePullRequestReviewInputTO build() {
            return new DeletePullRequestReviewInputTO(clientMutationId, pullRequestReviewId);
        }

    }
}
