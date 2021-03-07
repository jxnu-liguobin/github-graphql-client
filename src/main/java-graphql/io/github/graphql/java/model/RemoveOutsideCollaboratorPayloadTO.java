package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class RemoveOutsideCollaboratorPayloadTO implements java.io.Serializable {

    private String clientMutationId;
    private UserTO removedUser;

    public RemoveOutsideCollaboratorPayloadTO() {
    }

    public RemoveOutsideCollaboratorPayloadTO(String clientMutationId, UserTO removedUser) {
        this.clientMutationId = clientMutationId;
        this.removedUser = removedUser;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public UserTO getRemovedUser() {
        return removedUser;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final RemoveOutsideCollaboratorPayloadTO that = (RemoveOutsideCollaboratorPayloadTO) obj;
        return Objects.equals(clientMutationId, that.clientMutationId)
            && Objects.equals(removedUser, that.removedUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientMutationId, removedUser);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (removedUser != null) {
            joiner.add("removedUser: " + GraphQLRequestSerializer.getEntry(removedUser));
        }
        return joiner.toString();
    }

    public static RemoveOutsideCollaboratorPayloadTO.Builder builder() {
        return new RemoveOutsideCollaboratorPayloadTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private UserTO removedUser;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setRemovedUser(UserTO removedUser) {
            this.removedUser = removedUser;
            return this;
        }


        public RemoveOutsideCollaboratorPayloadTO build() {
            return new RemoveOutsideCollaboratorPayloadTO(clientMutationId, removedUser);
        }

    }
}
