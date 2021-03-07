package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class AcceptTopicSuggestionInputTO implements java.io.Serializable {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String repositoryId;

    public AcceptTopicSuggestionInputTO() {
    }

    public AcceptTopicSuggestionInputTO(String clientMutationId, String name, String repositoryId) {
        this.clientMutationId = clientMutationId;
        this.name = name;
        this.repositoryId = repositoryId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public String getName() {
        return name;
    }

    public String getRepositoryId() {
        return repositoryId;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (repositoryId != null) {
            joiner.add("repositoryId: " + GraphQLRequestSerializer.getEntry(repositoryId));
        }
        return joiner.toString();
    }

    public static AcceptTopicSuggestionInputTO.Builder builder() {
        return new AcceptTopicSuggestionInputTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private String name;
        private String repositoryId;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setRepositoryId(String repositoryId) {
            this.repositoryId = repositoryId;
            return this;
        }


        public AcceptTopicSuggestionInputTO build() {
            return new AcceptTopicSuggestionInputTO(clientMutationId, name, repositoryId);
        }

    }
}
