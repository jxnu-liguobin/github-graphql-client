package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class DismissPullRequestReviewInputTO implements java.io.Serializable {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String message;
    @javax.validation.constraints.NotNull
    private String pullRequestReviewId;

    public DismissPullRequestReviewInputTO() {
    }

    public DismissPullRequestReviewInputTO(String clientMutationId, String message, String pullRequestReviewId) {
        this.clientMutationId = clientMutationId;
        this.message = message;
        this.pullRequestReviewId = pullRequestReviewId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public String getMessage() {
        return message;
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
        if (message != null) {
            joiner.add("message: " + GraphQLRequestSerializer.getEntry(message));
        }
        if (pullRequestReviewId != null) {
            joiner.add("pullRequestReviewId: " + GraphQLRequestSerializer.getEntry(pullRequestReviewId));
        }
        return joiner.toString();
    }

    public static DismissPullRequestReviewInputTO.Builder builder() {
        return new DismissPullRequestReviewInputTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private String message;
        private String pullRequestReviewId;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }

        public Builder setPullRequestReviewId(String pullRequestReviewId) {
            this.pullRequestReviewId = pullRequestReviewId;
            return this;
        }


        public DismissPullRequestReviewInputTO build() {
            return new DismissPullRequestReviewInputTO(clientMutationId, message, pullRequestReviewId);
        }

    }
}
