package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class UpdateTopicsInputTO implements java.io.Serializable {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String repositoryId;
    @javax.validation.constraints.NotNull
    private java.util.List<String> topicNames;

    public UpdateTopicsInputTO() {
    }

    public UpdateTopicsInputTO(String clientMutationId, String repositoryId, java.util.List<String> topicNames) {
        this.clientMutationId = clientMutationId;
        this.repositoryId = repositoryId;
        this.topicNames = topicNames;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public String getRepositoryId() {
        return repositoryId;
    }

    public java.util.List<String> getTopicNames() {
        return topicNames;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (repositoryId != null) {
            joiner.add("repositoryId: " + GraphQLRequestSerializer.getEntry(repositoryId));
        }
        if (topicNames != null) {
            joiner.add("topicNames: " + GraphQLRequestSerializer.getEntry(topicNames));
        }
        return joiner.toString();
    }

    public static UpdateTopicsInputTO.Builder builder() {
        return new UpdateTopicsInputTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private String repositoryId;
        private java.util.List<String> topicNames;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setRepositoryId(String repositoryId) {
            this.repositoryId = repositoryId;
            return this;
        }

        public Builder setTopicNames(java.util.List<String> topicNames) {
            this.topicNames = topicNames;
            return this;
        }


        public UpdateTopicsInputTO build() {
            return new UpdateTopicsInputTO(clientMutationId, repositoryId, topicNames);
        }

    }
}
