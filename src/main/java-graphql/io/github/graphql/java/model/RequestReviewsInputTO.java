package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class RequestReviewsInputTO implements java.io.Serializable {

    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String pullRequestId;
    @javax.validation.constraints.NotNull
    private java.util.List<String> teamIds;
    private Boolean union;
    @javax.validation.constraints.NotNull
    private java.util.List<String> userIds;

    public RequestReviewsInputTO() {
    }

    public RequestReviewsInputTO(String clientMutationId, String pullRequestId, java.util.List<String> teamIds, Boolean union, java.util.List<String> userIds) {
        this.clientMutationId = clientMutationId;
        this.pullRequestId = pullRequestId;
        this.teamIds = teamIds;
        this.union = union;
        this.userIds = userIds;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public String getPullRequestId() {
        return pullRequestId;
    }

    public java.util.List<String> getTeamIds() {
        return teamIds;
    }

    public Boolean getUnion() {
        return union;
    }

    public java.util.List<String> getUserIds() {
        return userIds;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final RequestReviewsInputTO that = (RequestReviewsInputTO) obj;
        return Objects.equals(clientMutationId, that.clientMutationId)
            && Objects.equals(pullRequestId, that.pullRequestId)
            && Objects.equals(teamIds, that.teamIds)
            && Objects.equals(union, that.union)
            && Objects.equals(userIds, that.userIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientMutationId, pullRequestId, teamIds, union, userIds);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (pullRequestId != null) {
            joiner.add("pullRequestId: " + GraphQLRequestSerializer.getEntry(pullRequestId));
        }
        if (teamIds != null) {
            joiner.add("teamIds: " + GraphQLRequestSerializer.getEntry(teamIds));
        }
        if (union != null) {
            joiner.add("union: " + GraphQLRequestSerializer.getEntry(union));
        }
        if (userIds != null) {
            joiner.add("userIds: " + GraphQLRequestSerializer.getEntry(userIds));
        }
        return joiner.toString();
    }

    public static RequestReviewsInputTO.Builder builder() {
        return new RequestReviewsInputTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private String pullRequestId;
        private java.util.List<String> teamIds;
        private Boolean union;
        private java.util.List<String> userIds;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setPullRequestId(String pullRequestId) {
            this.pullRequestId = pullRequestId;
            return this;
        }

        public Builder setTeamIds(java.util.List<String> teamIds) {
            this.teamIds = teamIds;
            return this;
        }

        public Builder setUnion(Boolean union) {
            this.union = union;
            return this;
        }

        public Builder setUserIds(java.util.List<String> userIds) {
            this.userIds = userIds;
            return this;
        }


        public RequestReviewsInputTO build() {
            return new RequestReviewsInputTO(clientMutationId, pullRequestId, teamIds, union, userIds);
        }

    }
}
