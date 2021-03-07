package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class RemoveReactionPayloadTO implements java.io.Serializable {

    private String clientMutationId;
    private ReactionTO reaction;
    private ReactableTO subject;

    public RemoveReactionPayloadTO() {
    }

    public RemoveReactionPayloadTO(String clientMutationId, ReactionTO reaction, ReactableTO subject) {
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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final RemoveReactionPayloadTO that = (RemoveReactionPayloadTO) obj;
        return Objects.equals(clientMutationId, that.clientMutationId)
            && Objects.equals(reaction, that.reaction)
            && Objects.equals(subject, that.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientMutationId, reaction, subject);
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

    public static RemoveReactionPayloadTO.Builder builder() {
        return new RemoveReactionPayloadTO.Builder();
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


        public RemoveReactionPayloadTO build() {
            return new RemoveReactionPayloadTO(clientMutationId, reaction, subject);
        }

    }
}
