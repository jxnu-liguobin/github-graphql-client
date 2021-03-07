package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
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
