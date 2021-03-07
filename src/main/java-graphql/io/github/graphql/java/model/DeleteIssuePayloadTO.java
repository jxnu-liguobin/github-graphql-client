package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class DeleteIssuePayloadTO implements java.io.Serializable {

    private String clientMutationId;
    private RepositoryTO repository;

    public DeleteIssuePayloadTO() {
    }

    public DeleteIssuePayloadTO(String clientMutationId, RepositoryTO repository) {
        this.clientMutationId = clientMutationId;
        this.repository = repository;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public RepositoryTO getRepository() {
        return repository;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final DeleteIssuePayloadTO that = (DeleteIssuePayloadTO) obj;
        return Objects.equals(clientMutationId, that.clientMutationId)
            && Objects.equals(repository, that.repository);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientMutationId, repository);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (repository != null) {
            joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository));
        }
        return joiner.toString();
    }

    public static DeleteIssuePayloadTO.Builder builder() {
        return new DeleteIssuePayloadTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private RepositoryTO repository;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setRepository(RepositoryTO repository) {
            this.repository = repository;
            return this;
        }


        public DeleteIssuePayloadTO build() {
            return new DeleteIssuePayloadTO(clientMutationId, repository);
        }

    }
}
