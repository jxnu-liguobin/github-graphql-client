package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class MergePullRequestPayloadTO implements java.io.Serializable {

    private String clientMutationId;
    private PullRequestTO pullRequest;

    public MergePullRequestPayloadTO() {
    }

    public MergePullRequestPayloadTO(String clientMutationId, PullRequestTO pullRequest) {
        this.clientMutationId = clientMutationId;
        this.pullRequest = pullRequest;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public PullRequestTO getPullRequest() {
        return pullRequest;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (pullRequest != null) {
            joiner.add("pullRequest: " + GraphQLRequestSerializer.getEntry(pullRequest));
        }
        return joiner.toString();
    }

    public static MergePullRequestPayloadTO.Builder builder() {
        return new MergePullRequestPayloadTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private PullRequestTO pullRequest;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setPullRequest(PullRequestTO pullRequest) {
            this.pullRequest = pullRequest;
            return this;
        }


        public MergePullRequestPayloadTO build() {
            return new MergePullRequestPayloadTO(clientMutationId, pullRequest);
        }

    }
}
