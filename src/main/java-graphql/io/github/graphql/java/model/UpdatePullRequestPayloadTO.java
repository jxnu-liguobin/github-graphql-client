package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class UpdatePullRequestPayloadTO implements java.io.Serializable {

    private String clientMutationId;
    private PullRequestTO pullRequest;

    public UpdatePullRequestPayloadTO() {
    }

    public UpdatePullRequestPayloadTO(String clientMutationId, PullRequestTO pullRequest) {
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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final UpdatePullRequestPayloadTO that = (UpdatePullRequestPayloadTO) obj;
        return Objects.equals(clientMutationId, that.clientMutationId)
            && Objects.equals(pullRequest, that.pullRequest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientMutationId, pullRequest);
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

    public static UpdatePullRequestPayloadTO.Builder builder() {
        return new UpdatePullRequestPayloadTO.Builder();
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


        public UpdatePullRequestPayloadTO build() {
            return new UpdatePullRequestPayloadTO(clientMutationId, pullRequest);
        }

    }
}
