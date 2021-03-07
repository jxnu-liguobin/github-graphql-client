package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ResolveReviewThreadInputTO implements java.io.Serializable {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String threadId;

    public ResolveReviewThreadInputTO() {
    }

    public ResolveReviewThreadInputTO(String clientMutationId, String threadId) {
        this.clientMutationId = clientMutationId;
        this.threadId = threadId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public String getThreadId() {
        return threadId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final ResolveReviewThreadInputTO that = (ResolveReviewThreadInputTO) obj;
        return Objects.equals(clientMutationId, that.clientMutationId)
            && Objects.equals(threadId, that.threadId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientMutationId, threadId);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (threadId != null) {
            joiner.add("threadId: " + GraphQLRequestSerializer.getEntry(threadId));
        }
        return joiner.toString();
    }

    public static ResolveReviewThreadInputTO.Builder builder() {
        return new ResolveReviewThreadInputTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private String threadId;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setThreadId(String threadId) {
            this.threadId = threadId;
            return this;
        }


        public ResolveReviewThreadInputTO build() {
            return new ResolveReviewThreadInputTO(clientMutationId, threadId);
        }

    }
}
