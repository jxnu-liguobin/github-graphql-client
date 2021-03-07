package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class AddProjectCardPayloadTO implements java.io.Serializable {

    private ProjectCardEdgeTO cardEdge;
    private String clientMutationId;
    private ProjectColumnTO projectColumn;

    public AddProjectCardPayloadTO() {
    }

    public AddProjectCardPayloadTO(ProjectCardEdgeTO cardEdge, String clientMutationId, ProjectColumnTO projectColumn) {
        this.cardEdge = cardEdge;
        this.clientMutationId = clientMutationId;
        this.projectColumn = projectColumn;
    }

    public ProjectCardEdgeTO getCardEdge() {
        return cardEdge;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public ProjectColumnTO getProjectColumn() {
        return projectColumn;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final AddProjectCardPayloadTO that = (AddProjectCardPayloadTO) obj;
        return Objects.equals(cardEdge, that.cardEdge)
            && Objects.equals(clientMutationId, that.clientMutationId)
            && Objects.equals(projectColumn, that.projectColumn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardEdge, clientMutationId, projectColumn);
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
        if (projectColumn != null) {
            joiner.add("projectColumn: " + GraphQLRequestSerializer.getEntry(projectColumn));
        }
        return joiner.toString();
    }

    public static AddProjectCardPayloadTO.Builder builder() {
        return new AddProjectCardPayloadTO.Builder();
    }

    public static class Builder {

        private ProjectCardEdgeTO cardEdge;
        private String clientMutationId;
        private ProjectColumnTO projectColumn;

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

        public Builder setProjectColumn(ProjectColumnTO projectColumn) {
            this.projectColumn = projectColumn;
            return this;
        }


        public AddProjectCardPayloadTO build() {
            return new AddProjectCardPayloadTO(cardEdge, clientMutationId, projectColumn);
        }

    }
}
