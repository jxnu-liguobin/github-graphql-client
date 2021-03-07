package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class RemoveOutsideCollaboratorInputTO implements java.io.Serializable {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String organizationId;
    @javax.validation.constraints.NotNull
    private String userId;

    public RemoveOutsideCollaboratorInputTO() {
    }

    public RemoveOutsideCollaboratorInputTO(String clientMutationId, String organizationId, String userId) {
        this.clientMutationId = clientMutationId;
        this.organizationId = organizationId;
        this.userId = userId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public String getUserId() {
        return userId;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (organizationId != null) {
            joiner.add("organizationId: " + GraphQLRequestSerializer.getEntry(organizationId));
        }
        if (userId != null) {
            joiner.add("userId: " + GraphQLRequestSerializer.getEntry(userId));
        }
        return joiner.toString();
    }

    public static RemoveOutsideCollaboratorInputTO.Builder builder() {
        return new RemoveOutsideCollaboratorInputTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private String organizationId;
        private String userId;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }

        public Builder setUserId(String userId) {
            this.userId = userId;
            return this;
        }


        public RemoveOutsideCollaboratorInputTO build() {
            return new RemoveOutsideCollaboratorInputTO(clientMutationId, organizationId, userId);
        }

    }
}
