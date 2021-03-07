package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class MergeBranchInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String base;
    private String clientMutationId;
    private String commitMessage;
    @javax.validation.constraints.NotNull
    private String head;
    @javax.validation.constraints.NotNull
    private String repositoryId;

    public MergeBranchInputTO() {
    }

    public MergeBranchInputTO(String base, String clientMutationId, String commitMessage, String head, String repositoryId) {
        this.base = base;
        this.clientMutationId = clientMutationId;
        this.commitMessage = commitMessage;
        this.head = head;
        this.repositoryId = repositoryId;
    }

    public String getBase() {
        return base;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public String getCommitMessage() {
        return commitMessage;
    }

    public String getHead() {
        return head;
    }

    public String getRepositoryId() {
        return repositoryId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final MergeBranchInputTO that = (MergeBranchInputTO) obj;
        return Objects.equals(base, that.base)
            && Objects.equals(clientMutationId, that.clientMutationId)
            && Objects.equals(commitMessage, that.commitMessage)
            && Objects.equals(head, that.head)
            && Objects.equals(repositoryId, that.repositoryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(base, clientMutationId, commitMessage, head, repositoryId);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (base != null) {
            joiner.add("base: " + GraphQLRequestSerializer.getEntry(base));
        }
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (commitMessage != null) {
            joiner.add("commitMessage: " + GraphQLRequestSerializer.getEntry(commitMessage));
        }
        if (head != null) {
            joiner.add("head: " + GraphQLRequestSerializer.getEntry(head));
        }
        if (repositoryId != null) {
            joiner.add("repositoryId: " + GraphQLRequestSerializer.getEntry(repositoryId));
        }
        return joiner.toString();
    }

    public static MergeBranchInputTO.Builder builder() {
        return new MergeBranchInputTO.Builder();
    }

    public static class Builder {

        private String base;
        private String clientMutationId;
        private String commitMessage;
        private String head;
        private String repositoryId;

        public Builder() {
        }

        public Builder setBase(String base) {
            this.base = base;
            return this;
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setCommitMessage(String commitMessage) {
            this.commitMessage = commitMessage;
            return this;
        }

        public Builder setHead(String head) {
            this.head = head;
            return this;
        }

        public Builder setRepositoryId(String repositoryId) {
            this.repositoryId = repositoryId;
            return this;
        }


        public MergeBranchInputTO build() {
            return new MergeBranchInputTO(base, clientMutationId, commitMessage, head, repositoryId);
        }

    }
}
