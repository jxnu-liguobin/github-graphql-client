package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class AddReactionPayloadTO implements java.io.Serializable {

    private String clientMutationId;
    private ReactionTO reaction;
    private ReactableTO subject;

    public AddReactionPayloadTO() {
    }

    public AddReactionPayloadTO(String clientMutationId, ReactionTO reaction, ReactableTO subject) {
        this.clientMutationId = clientMutationId;
        this.reaction = reaction;
        this.subject = subject;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public ReactionTO getReaction() {
        return reaction;
    }

    public ReactableTO getSubject() {
        return subject;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (reaction != null) {
            joiner.add("reaction: " + GraphQLRequestSerializer.getEntry(reaction));
        }
        if (subject != null) {
            joiner.add("subject: " + GraphQLRequestSerializer.getEntry(subject));
        }
        return joiner.toString();
    }

    public static AddReactionPayloadTO.Builder builder() {
        return new AddReactionPayloadTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private ReactionTO reaction;
        private ReactableTO subject;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setReaction(ReactionTO reaction) {
            this.reaction = reaction;
            return this;
        }

        public Builder setSubject(ReactableTO subject) {
            this.subject = subject;
            return this;
        }


        public AddReactionPayloadTO build() {
            return new AddReactionPayloadTO(clientMutationId, reaction, subject);
        }

    }
}
