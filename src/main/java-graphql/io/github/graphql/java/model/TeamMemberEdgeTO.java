package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class TeamMemberEdgeTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String cursor;
    @javax.validation.constraints.NotNull
    private String memberAccessResourcePath;
    @javax.validation.constraints.NotNull
    private String memberAccessUrl;
    @javax.validation.constraints.NotNull
    private UserTO node;
    @javax.validation.constraints.NotNull
    private TeamMemberRoleTO role;

    public TeamMemberEdgeTO() {
    }

    public TeamMemberEdgeTO(String cursor, String memberAccessResourcePath, String memberAccessUrl, UserTO node, TeamMemberRoleTO role) {
        this.cursor = cursor;
        this.memberAccessResourcePath = memberAccessResourcePath;
        this.memberAccessUrl = memberAccessUrl;
        this.node = node;
        this.role = role;
    }

    public String getCursor() {
        return cursor;
    }

    public String getMemberAccessResourcePath() {
        return memberAccessResourcePath;
    }

    public String getMemberAccessUrl() {
        return memberAccessUrl;
    }

    public UserTO getNode() {
        return node;
    }

    public TeamMemberRoleTO getRole() {
        return role;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final TeamMemberEdgeTO that = (TeamMemberEdgeTO) obj;
        return Objects.equals(cursor, that.cursor)
            && Objects.equals(memberAccessResourcePath, that.memberAccessResourcePath)
            && Objects.equals(memberAccessUrl, that.memberAccessUrl)
            && Objects.equals(node, that.node)
            && Objects.equals(role, that.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cursor, memberAccessResourcePath, memberAccessUrl, node, role);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (cursor != null) {
            joiner.add("cursor: " + GraphQLRequestSerializer.getEntry(cursor));
        }
        if (memberAccessResourcePath != null) {
            joiner.add("memberAccessResourcePath: " + GraphQLRequestSerializer.getEntry(memberAccessResourcePath));
        }
        if (memberAccessUrl != null) {
            joiner.add("memberAccessUrl: " + GraphQLRequestSerializer.getEntry(memberAccessUrl));
        }
        if (node != null) {
            joiner.add("node: " + GraphQLRequestSerializer.getEntry(node));
        }
        if (role != null) {
            joiner.add("role: " + GraphQLRequestSerializer.getEntry(role));
        }
        return joiner.toString();
    }

    public static TeamMemberEdgeTO.Builder builder() {
        return new TeamMemberEdgeTO.Builder();
    }

    public static class Builder {

        private String cursor;
        private String memberAccessResourcePath;
        private String memberAccessUrl;
        private UserTO node;
        private TeamMemberRoleTO role;

        public Builder() {
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder setMemberAccessResourcePath(String memberAccessResourcePath) {
            this.memberAccessResourcePath = memberAccessResourcePath;
            return this;
        }

        public Builder setMemberAccessUrl(String memberAccessUrl) {
            this.memberAccessUrl = memberAccessUrl;
            return this;
        }

        public Builder setNode(UserTO node) {
            this.node = node;
            return this;
        }

        public Builder setRole(TeamMemberRoleTO role) {
            this.role = role;
            return this;
        }


        public TeamMemberEdgeTO build() {
            return new TeamMemberEdgeTO(cursor, memberAccessResourcePath, memberAccessUrl, node, role);
        }

    }
}
