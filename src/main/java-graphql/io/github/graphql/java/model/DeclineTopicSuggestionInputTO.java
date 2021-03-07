package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class DeclineTopicSuggestionInputTO implements java.io.Serializable {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private TopicSuggestionDeclineReasonTO reason;
    @javax.validation.constraints.NotNull
    private String repositoryId;

    public DeclineTopicSuggestionInputTO() {
    }

    public DeclineTopicSuggestionInputTO(String clientMutationId, String name, TopicSuggestionDeclineReasonTO reason, String repositoryId) {
        this.clientMutationId = clientMutationId;
        this.name = name;
        this.reason = reason;
        this.repositoryId = repositoryId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public String getName() {
        return name;
    }

    public TopicSuggestionDeclineReasonTO getReason() {
        return reason;
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
        final DeclineTopicSuggestionInputTO that = (DeclineTopicSuggestionInputTO) obj;
        return Objects.equals(clientMutationId, that.clientMutationId)
            && Objects.equals(name, that.name)
            && Objects.equals(reason, that.reason)
            && Objects.equals(repositoryId, that.repositoryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientMutationId, name, reason, repositoryId);
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
        if (reason != null) {
            joiner.add("reason: " + GraphQLRequestSerializer.getEntry(reason));
        }
        if (repositoryId != null) {
            joiner.add("repositoryId: " + GraphQLRequestSerializer.getEntry(repositoryId));
        }
        return joiner.toString();
    }

    public static DeclineTopicSuggestionInputTO.Builder builder() {
        return new DeclineTopicSuggestionInputTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private String name;
        private TopicSuggestionDeclineReasonTO reason;
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

        public Builder setReason(TopicSuggestionDeclineReasonTO reason) {
            this.reason = reason;
            return this;
        }

        public Builder setRepositoryId(String repositoryId) {
            this.repositoryId = repositoryId;
            return this;
        }


        public DeclineTopicSuggestionInputTO build() {
            return new DeclineTopicSuggestionInputTO(clientMutationId, name, reason, repositoryId);
        }

    }
}
