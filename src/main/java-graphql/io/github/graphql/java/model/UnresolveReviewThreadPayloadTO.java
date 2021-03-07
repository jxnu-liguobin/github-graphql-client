package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class UnresolveReviewThreadPayloadTO implements java.io.Serializable {

    private String clientMutationId;
    private PullRequestReviewThreadTO thread;

    public UnresolveReviewThreadPayloadTO() {
    }

    public UnresolveReviewThreadPayloadTO(String clientMutationId, PullRequestReviewThreadTO thread) {
        this.clientMutationId = clientMutationId;
        this.thread = thread;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public PullRequestReviewThreadTO getThread() {
        return thread;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final UnresolveReviewThreadPayloadTO that = (UnresolveReviewThreadPayloadTO) obj;
        return Objects.equals(clientMutationId, that.clientMutationId)
            && Objects.equals(thread, that.thread);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientMutationId, thread);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (thread != null) {
            joiner.add("thread: " + GraphQLRequestSerializer.getEntry(thread));
        }
        return joiner.toString();
    }

    public static UnresolveReviewThreadPayloadTO.Builder builder() {
        return new UnresolveReviewThreadPayloadTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private PullRequestReviewThreadTO thread;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setThread(PullRequestReviewThreadTO thread) {
            this.thread = thread;
            return this;
        }


        public UnresolveReviewThreadPayloadTO build() {
            return new UnresolveReviewThreadPayloadTO(clientMutationId, thread);
        }

    }
}
