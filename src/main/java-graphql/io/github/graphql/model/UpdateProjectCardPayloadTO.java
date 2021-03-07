package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class UpdateProjectCardPayloadTO implements java.io.Serializable {

    private String clientMutationId;
    private ProjectCardTO projectCard;

    public UpdateProjectCardPayloadTO() {
    }

    public UpdateProjectCardPayloadTO(String clientMutationId, ProjectCardTO projectCard) {
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

    public static UpdateProjectCardPayloadTO.Builder builder() {
        return new UpdateProjectCardPayloadTO.Builder();
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


        public UpdateProjectCardPayloadTO build() {
            return new UpdateProjectCardPayloadTO(clientMutationId, projectCard);
        }

    }
}
