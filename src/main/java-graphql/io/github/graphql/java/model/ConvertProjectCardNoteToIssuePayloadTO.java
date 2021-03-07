package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ConvertProjectCardNoteToIssuePayloadTO implements java.io.Serializable {

    private String clientMutationId;
    private ProjectCardTO projectCard;

    public ConvertProjectCardNoteToIssuePayloadTO() {
    }

    public ConvertProjectCardNoteToIssuePayloadTO(String clientMutationId, ProjectCardTO projectCard) {
        this.clientMutationId = clientMutationId;
        this.projectCard = projectCard;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public ProjectCardTO getProjectCard() {
        return projectCard;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final ConvertProjectCardNoteToIssuePayloadTO that = (ConvertProjectCardNoteToIssuePayloadTO) obj;
        return Objects.equals(clientMutationId, that.clientMutationId)
            && Objects.equals(projectCard, that.projectCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientMutationId, projectCard);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (projectCard != null) {
            joiner.add("projectCard: " + GraphQLRequestSerializer.getEntry(projectCard));
        }
        return joiner.toString();
    }

    public static ConvertProjectCardNoteToIssuePayloadTO.Builder builder() {
        return new ConvertProjectCardNoteToIssuePayloadTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private ProjectCardTO projectCard;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setProjectCard(ProjectCardTO projectCard) {
            this.projectCard = projectCard;
            return this;
        }


        public ConvertProjectCardNoteToIssuePayloadTO build() {
            return new ConvertProjectCardNoteToIssuePayloadTO(clientMutationId, projectCard);
        }

    }
}
