package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final DeleteProjectPayloadTO that = (DeleteProjectPayloadTO) obj;
        return Objects.equals(clientMutationId, that.clientMutationId)
            && Objects.equals(owner, that.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientMutationId, owner);
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
