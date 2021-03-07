package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class RepositoryInvitationTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private UserTO invitee;
    @javax.validation.constraints.NotNull
    private UserTO inviter;
    @javax.validation.constraints.NotNull
    private RepositoryPermissionTO permission;
    private RepositoryInfoTO repository;

    public RepositoryInvitationTO() {
    }

    public RepositoryInvitationTO(String id, UserTO invitee, UserTO inviter, RepositoryPermissionTO permission, RepositoryInfoTO repository) {
        this.id = id;
        this.invitee = invitee;
        this.inviter = inviter;
        this.permission = permission;
        this.repository = repository;
    }

    public String getId() {
        return id;
    }

    public UserTO getInvitee() {
        return invitee;
    }

    public UserTO getInviter() {
        return inviter;
    }

    public RepositoryPermissionTO getPermission() {
        return permission;
    }

    public RepositoryInfoTO getRepository() {
        return repository;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (invitee != null) {
            joiner.add("invitee: " + GraphQLRequestSerializer.getEntry(invitee));
        }
        if (inviter != null) {
            joiner.add("inviter: " + GraphQLRequestSerializer.getEntry(inviter));
        }
        if (permission != null) {
            joiner.add("permission: " + GraphQLRequestSerializer.getEntry(permission));
        }
        if (repository != null) {
            joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository));
        }
        return joiner.toString();
    }

    public static RepositoryInvitationTO.Builder builder() {
        return new RepositoryInvitationTO.Builder();
    }

    public static class Builder {

        private String id;
        private UserTO invitee;
        private UserTO inviter;
        private RepositoryPermissionTO permission;
        private RepositoryInfoTO repository;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setInvitee(UserTO invitee) {
            this.invitee = invitee;
            return this;
        }

        public Builder setInviter(UserTO inviter) {
            this.inviter = inviter;
            return this;
        }

        public Builder setPermission(RepositoryPermissionTO permission) {
            this.permission = permission;
            return this;
        }

        public Builder setRepository(RepositoryInfoTO repository) {
            this.repository = repository;
            return this;
        }


        public RepositoryInvitationTO build() {
            return new RepositoryInvitationTO(id, invitee, inviter, permission, repository);
        }

    }
}
