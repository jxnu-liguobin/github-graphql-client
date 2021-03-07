package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class UpdateTopicsPayloadTO implements java.io.Serializable {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private java.util.List<String> invalidTopicNames;
    private RepositoryTO repository;

    public UpdateTopicsPayloadTO() {
    }

    public UpdateTopicsPayloadTO(String clientMutationId, java.util.List<String> invalidTopicNames, RepositoryTO repository) {
        this.clientMutationId = clientMutationId;
        this.invalidTopicNames = invalidTopicNames;
        this.repository = repository;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public java.util.List<String> getInvalidTopicNames() {
        return invalidTopicNames;
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
        final UpdateTopicsPayloadTO that = (UpdateTopicsPayloadTO) obj;
        return Objects.equals(clientMutationId, that.clientMutationId)
            && Objects.equals(invalidTopicNames, that.invalidTopicNames)
            && Objects.equals(repository, that.repository);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientMutationId, invalidTopicNames, repository);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (invalidTopicNames != null) {
            joiner.add("invalidTopicNames: " + GraphQLRequestSerializer.getEntry(invalidTopicNames));
        }
        if (repository != null) {
            joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository));
        }
        return joiner.toString();
    }

    public static UpdateTopicsPayloadTO.Builder builder() {
        return new UpdateTopicsPayloadTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private java.util.List<String> invalidTopicNames;
        private RepositoryTO repository;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setInvalidTopicNames(java.util.List<String> invalidTopicNames) {
            this.invalidTopicNames = invalidTopicNames;
            return this;
        }

        public Builder setRepository(RepositoryTO repository) {
            this.repository = repository;
            return this;
        }


        public UpdateTopicsPayloadTO build() {
            return new UpdateTopicsPayloadTO(clientMutationId, invalidTopicNames, repository);
        }

    }
}
