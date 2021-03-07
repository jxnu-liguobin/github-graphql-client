package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class ResolveReviewThreadPayloadTO implements java.io.Serializable {

    private String clientMutationId;
    private PullRequestReviewThreadTO thread;

    public ResolveReviewThreadPayloadTO() {
    }

    public ResolveReviewThreadPayloadTO(String clientMutationId, PullRequestReviewThreadTO thread) {
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

    public static ResolveReviewThreadPayloadTO.Builder builder() {
        return new ResolveReviewThreadPayloadTO.Builder();
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


        public ResolveReviewThreadPayloadTO build() {
            return new ResolveReviewThreadPayloadTO(clientMutationId, thread);
        }

    }
}
