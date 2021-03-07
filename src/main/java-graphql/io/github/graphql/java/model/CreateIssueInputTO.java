package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class CreateIssueInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private java.util.List<String> assigneeIds;
    private String body;
    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private java.util.List<String> labelIds;
    private String milestoneId;
    @javax.validation.constraints.NotNull
    private java.util.List<String> projectIds;
    @javax.validation.constraints.NotNull
    private String repositoryId;
    @javax.validation.constraints.NotNull
    private String title;

    public CreateIssueInputTO() {
    }

    public CreateIssueInputTO(java.util.List<String> assigneeIds, String body, String clientMutationId, java.util.List<String> labelIds, String milestoneId, java.util.List<String> projectIds, String repositoryId, String title) {
        this.assigneeIds = assigneeIds;
        this.body = body;
        this.clientMutationId = clientMutationId;
        this.labelIds = labelIds;
        this.milestoneId = milestoneId;
        this.projectIds = projectIds;
        this.repositoryId = repositoryId;
        this.title = title;
    }

    public java.util.List<String> getAssigneeIds() {
        return assigneeIds;
    }

    public String getBody() {
        return body;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public java.util.List<String> getLabelIds() {
        return labelIds;
    }

    public String getMilestoneId() {
        return milestoneId;
    }

    public java.util.List<String> getProjectIds() {
        return projectIds;
    }

    public String getRepositoryId() {
        return repositoryId;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final CreateIssueInputTO that = (CreateIssueInputTO) obj;
        return Objects.equals(assigneeIds, that.assigneeIds)
            && Objects.equals(body, that.body)
            && Objects.equals(clientMutationId, that.clientMutationId)
            && Objects.equals(labelIds, that.labelIds)
            && Objects.equals(milestoneId, that.milestoneId)
            && Objects.equals(projectIds, that.projectIds)
            && Objects.equals(repositoryId, that.repositoryId)
            && Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assigneeIds, body, clientMutationId, labelIds, milestoneId, projectIds, repositoryId, title);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (assigneeIds != null) {
            joiner.add("assigneeIds: " + GraphQLRequestSerializer.getEntry(assigneeIds));
        }
        if (body != null) {
            joiner.add("body: " + GraphQLRequestSerializer.getEntry(body));
        }
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (labelIds != null) {
            joiner.add("labelIds: " + GraphQLRequestSerializer.getEntry(labelIds));
        }
        if (milestoneId != null) {
            joiner.add("milestoneId: " + GraphQLRequestSerializer.getEntry(milestoneId));
        }
        if (projectIds != null) {
            joiner.add("projectIds: " + GraphQLRequestSerializer.getEntry(projectIds));
        }
        if (repositoryId != null) {
            joiner.add("repositoryId: " + GraphQLRequestSerializer.getEntry(repositoryId));
        }
        if (title != null) {
            joiner.add("title: " + GraphQLRequestSerializer.getEntry(title));
        }
        return joiner.toString();
    }

    public static CreateIssueInputTO.Builder builder() {
        return new CreateIssueInputTO.Builder();
    }

    public static class Builder {

        private java.util.List<String> assigneeIds;
        private String body;
        private String clientMutationId;
        private java.util.List<String> labelIds;
        private String milestoneId;
        private java.util.List<String> projectIds;
        private String repositoryId;
        private String title;

        public Builder() {
        }

        public Builder setAssigneeIds(java.util.List<String> assigneeIds) {
            this.assigneeIds = assigneeIds;
            return this;
        }

        public Builder setBody(String body) {
            this.body = body;
            return this;
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setLabelIds(java.util.List<String> labelIds) {
            this.labelIds = labelIds;
            return this;
        }

        public Builder setMilestoneId(String milestoneId) {
            this.milestoneId = milestoneId;
            return this;
        }

        public Builder setProjectIds(java.util.List<String> projectIds) {
            this.projectIds = projectIds;
            return this;
        }

        public Builder setRepositoryId(String repositoryId) {
            this.repositoryId = repositoryId;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }


        public CreateIssueInputTO build() {
            return new CreateIssueInputTO(assigneeIds, body, clientMutationId, labelIds, milestoneId, projectIds, repositoryId, title);
        }

    }
}
