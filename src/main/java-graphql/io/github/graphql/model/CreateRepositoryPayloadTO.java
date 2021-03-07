package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class CreateRepositoryPayloadTO implements java.io.Serializable {

    private String clientMutationId;
    private RepositoryTO repository;

    public CreateRepositoryPayloadTO() {
    }

    public CreateRepositoryPayloadTO(String clientMutationId, RepositoryTO repository) {
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

    public static CreateRepositoryPayloadTO.Builder builder() {
        return new CreateRepositoryPayloadTO.Builder();
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


        public CreateRepositoryPayloadTO build() {
            return new CreateRepositoryPayloadTO(clientMutationId, repository);
        }

    }
}