package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class UpdatePullRequestReviewInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String body;
    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String pullRequestReviewId;

    public UpdatePullRequestReviewInputTO() {
    }

    public UpdatePullRequestReviewInputTO(String body, String clientMutationId, String pullRequestReviewId) {
        this.body = body;
        this.clientMutationId = clientMutationId;
        this.pullRequestReviewId = pullRequestReviewId;
    }

    public String getBody() {
        return body;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public String getPullRequestReviewId() {
        return pullRequestReviewId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final UpdatePullRequestReviewInputTO that = (UpdatePullRequestReviewInputTO) obj;
        return Objects.equals(body, that.body)
            && Objects.equals(clientMutationId, that.clientMutationId)
            && Objects.equals(pullRequestReviewId, that.pullRequestReviewId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body, clientMutationId, pullRequestReviewId);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (body != null) {
            joiner.add("body: " + GraphQLRequestSerializer.getEntry(body));
        }
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (pullRequestReviewId != null) {
            joiner.add("pullRequestReviewId: " + GraphQLRequestSerializer.getEntry(pullRequestReviewId));
        }
        return joiner.toString();
    }

    public static UpdatePullRequestReviewInputTO.Builder builder() {
        return new UpdatePullRequestReviewInputTO.Builder();
    }

    public static class Builder {

        private String body;
        private String clientMutationId;
        private String pullRequestReviewId;

        public Builder() {
        }

        public Builder setBody(String body) {
            this.body = body;
            return this;
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setPullRequestReviewId(String pullRequestReviewId) {
            this.pullRequestReviewId = pullRequestReviewId;
            return this;
        }


        public UpdatePullRequestReviewInputTO build() {
            return new UpdatePullRequestReviewInputTO(body, clientMutationId, pullRequestReviewId);
        }

    }
}
