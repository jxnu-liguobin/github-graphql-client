package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class MergeBranchPayloadTO implements java.io.Serializable {

    private String clientMutationId;
    private CommitTO mergeCommit;

    public MergeBranchPayloadTO() {
    }

    public MergeBranchPayloadTO(String clientMutationId, CommitTO mergeCommit) {
        this.clientMutationId = clientMutationId;
        this.mergeCommit = mergeCommit;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public CommitTO getMergeCommit() {
        return mergeCommit;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final MergeBranchPayloadTO that = (MergeBranchPayloadTO) obj;
        return Objects.equals(clientMutationId, that.clientMutationId)
            && Objects.equals(mergeCommit, that.mergeCommit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientMutationId, mergeCommit);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (mergeCommit != null) {
            joiner.add("mergeCommit: " + GraphQLRequestSerializer.getEntry(mergeCommit));
        }
        return joiner.toString();
    }

    public static MergeBranchPayloadTO.Builder builder() {
        return new MergeBranchPayloadTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private CommitTO mergeCommit;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setMergeCommit(CommitTO mergeCommit) {
            this.mergeCommit = mergeCommit;
            return this;
        }


        public MergeBranchPayloadTO build() {
            return new MergeBranchPayloadTO(clientMutationId, mergeCommit);
        }

    }
}
