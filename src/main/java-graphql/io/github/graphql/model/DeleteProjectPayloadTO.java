package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class DeleteProjectPayloadTO implements java.io.Serializable {

    private String clientMutationId;
    private ProjectOwnerTO owner;

    public DeleteProjectPayloadTO() {
    }

    public DeleteProjectPayloadTO(String clientMutationId, ProjectOwnerTO owner) {
        this.clientMutationId = clientMutationId;
        this.owner = owner;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public ProjectOwnerTO getOwner() {
        return owner;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (owner != null) {
            joiner.add("owner: " + GraphQLRequestSerializer.getEntry(owner));
        }
        return joiner.toString();
    }

    public static DeleteProjectPayloadTO.Builder builder() {
        return new DeleteProjectPayloadTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private ProjectOwnerTO owner;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setOwner(ProjectOwnerTO owner) {
            this.owner = owner;
            return this;
        }


        public DeleteProjectPayloadTO build() {
            return new DeleteProjectPayloadTO(clientMutationId, owner);
        }

    }
}
