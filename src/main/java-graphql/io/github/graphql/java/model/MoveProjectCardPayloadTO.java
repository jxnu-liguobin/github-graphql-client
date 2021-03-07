package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class MoveProjectCardPayloadTO implements java.io.Serializable {

    private ProjectCardEdgeTO cardEdge;
    private String clientMutationId;

    public MoveProjectCardPayloadTO() {
    }

    public MoveProjectCardPayloadTO(ProjectCardEdgeTO cardEdge, String clientMutationId) {
        this.cardEdge = cardEdge;
        this.clientMutationId = clientMutationId;
    }

    public ProjectCardEdgeTO getCardEdge() {
        return cardEdge;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final MoveProjectCardPayloadTO that = (MoveProjectCardPayloadTO) obj;
        return Objects.equals(cardEdge, that.cardEdge)
            && Objects.equals(clientMutationId, that.clientMutationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardEdge, clientMutationId);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (cardEdge != null) {
            joiner.add("cardEdge: " + GraphQLRequestSerializer.getEntry(cardEdge));
        }
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        return joiner.toString();
    }

    public static MoveProjectCardPayloadTO.Builder builder() {
        return new MoveProjectCardPayloadTO.Builder();
    }

    public static class Builder {

        private ProjectCardEdgeTO cardEdge;
        private String clientMutationId;

        public Builder() {
        }

        public Builder setCardEdge(ProjectCardEdgeTO cardEdge) {
            this.cardEdge = cardEdge;
            return this;
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }


        public MoveProjectCardPayloadTO build() {
            return new MoveProjectCardPayloadTO(cardEdge, clientMutationId);
        }

    }
}
