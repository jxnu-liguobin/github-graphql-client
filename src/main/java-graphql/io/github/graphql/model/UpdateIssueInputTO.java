package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class UpdateIssueInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private java.util.List<String> assigneeIds;
    private String body;
    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private java.util.List<String> labelIds;
    private String milestoneId;
    @javax.validation.constraints.NotNull
    private java.util.List<String> projectIds;
    private IssueStateTO state;
    private String title;

    public UpdateIssueInputTO() {
    }

    public UpdateIssueInputTO(java.util.List<String> assigneeIds, String body, String clientMutationId, String id, java.util.List<String> labelIds, String milestoneId, java.util.List<String> projectIds, IssueStateTO state, String title) {
        this.assigneeIds = assigneeIds;
        this.body = body;
        this.clientMutationId = clientMutationId;
        this.id = id;
        this.labelIds = labelIds;
        this.milestoneId = milestoneId;
        this.projectIds = projectIds;
        this.state = state;
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

    public String getId() {
        return id;
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

    public IssueStateTO getState() {
        return state;
    }

    public String getTitle() {
        return title;
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
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
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
        if (state != null) {
            joiner.add("state: " + GraphQLRequestSerializer.getEntry(state));
        }
        if (title != null) {
            joiner.add("title: " + GraphQLRequestSerializer.getEntry(title));
        }
        return joiner.toString();
    }

    public static UpdateIssueInputTO.Builder builder() {
        return new UpdateIssueInputTO.Builder();
    }

    public static class Builder {

        private java.util.List<String> assigneeIds;
        private String body;
        private String clientMutationId;
        private String id;
        private java.util.List<String> labelIds;
        private String milestoneId;
        private java.util.List<String> projectIds;
        private IssueStateTO state;
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

        public Builder setId(String id) {
            this.id = id;
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

        public Builder setState(IssueStateTO state) {
            this.state = state;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }


        public UpdateIssueInputTO build() {
            return new UpdateIssueInputTO(assigneeIds, body, clientMutationId, id, labelIds, milestoneId, projectIds, state, title);
        }

    }
}
