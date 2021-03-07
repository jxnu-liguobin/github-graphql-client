package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class DeclineTopicSuggestionPayloadTO implements java.io.Serializable {

    private String clientMutationId;
    private TopicTO topic;

    public DeclineTopicSuggestionPayloadTO() {
    }

    public DeclineTopicSuggestionPayloadTO(String clientMutationId, TopicTO topic) {
        this.clientMutationId = clientMutationId;
        this.topic = topic;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public TopicTO getTopic() {
        return topic;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final DeclineTopicSuggestionPayloadTO that = (DeclineTopicSuggestionPayloadTO) obj;
        return Objects.equals(clientMutationId, that.clientMutationId)
            && Objects.equals(topic, that.topic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientMutationId, topic);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (topic != null) {
            joiner.add("topic: " + GraphQLRequestSerializer.getEntry(topic));
        }
        return joiner.toString();
    }

    public static DeclineTopicSuggestionPayloadTO.Builder builder() {
        return new DeclineTopicSuggestionPayloadTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private TopicTO topic;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setTopic(TopicTO topic) {
            this.topic = topic;
            return this;
        }


        public DeclineTopicSuggestionPayloadTO build() {
            return new DeclineTopicSuggestionPayloadTO(clientMutationId, topic);
        }

    }
}
