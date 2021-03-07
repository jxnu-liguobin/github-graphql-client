package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class ReopenPullRequestInputTO implements java.io.Serializable {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String pullRequestId;

    public ReopenPullRequestInputTO() {
    }

    public ReopenPullRequestInputTO(String clientMutationId, String pullRequestId) {
        this.clientMutationId = clientMutationId;
        this.pullRequestId = pullRequestId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public String getPullRequestId() {
        return pullRequestId;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (pullRequestId != null) {
            joiner.add("pullRequestId: " + GraphQLRequestSerializer.getEntry(pullRequestId));
        }
        return joiner.toString();
    }

    public static ReopenPullRequestInputTO.Builder builder() {
        return new ReopenPullRequestInputTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private String pullRequestId;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setPullRequestId(String pullRequestId) {
            this.pullRequestId = pullRequestId;
            return this;
        }


        public ReopenPullRequestInputTO build() {
            return new ReopenPullRequestInputTO(clientMutationId, pullRequestId);
        }

    }
}
