package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class ProjectCardTO implements java.io.Serializable, NodeTO {

    private ProjectColumnTO column;
    private ProjectCardItemTO content;
    @javax.validation.constraints.NotNull
    private String createdAt;
    private ActorTO creator;
    private Integer databaseId;
    @javax.validation.constraints.NotNull
    private String id;
    private boolean isArchived;
    private String note;
    @javax.validation.constraints.NotNull
    private ProjectTO project;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    private ProjectCardStateTO state;
    @javax.validation.constraints.NotNull
    private String updatedAt;
    @javax.validation.constraints.NotNull
    private String url;

    public ProjectCardTO() {
    }

    public ProjectCardTO(ProjectColumnTO column, ProjectCardItemTO content, String createdAt, ActorTO creator, Integer databaseId, String id, boolean isArchived, String note, ProjectTO project, String resourcePath, ProjectCardStateTO state, String updatedAt, String url) {
        this.column = column;
        this.content = content;
        this.createdAt = createdAt;
        this.creator = creator;
        this.databaseId = databaseId;
        this.id = id;
        this.isArchived = isArchived;
        this.note = note;
        this.project = project;
        this.resourcePath = resourcePath;
        this.state = state;
        this.updatedAt = updatedAt;
        this.url = url;
    }

    public ProjectColumnTO getColumn() {
        return column;
    }

    public ProjectCardItemTO getContent() {
        return content;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public ActorTO getCreator() {
        return creator;
    }

    public Integer getDatabaseId() {
        return databaseId;
    }

    public String getId() {
        return id;
    }

    public boolean getIsArchived() {
        return isArchived;
    }

    public String getNote() {
        return note;
    }

    public ProjectTO getProject() {
        return project;
    }

    public String getResourcePath() {
        return resourcePath;
    }

    public ProjectCardStateTO getState() {
        return state;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getUrl() {
        return url;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (column != null) {
            joiner.add("column: " + GraphQLRequestSerializer.getEntry(column));
        }
        if (content != null) {
            joiner.add("content: " + GraphQLRequestSerializer.getEntry(content));
        }
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        if (creator != null) {
            joiner.add("creator: " + GraphQLRequestSerializer.getEntry(creator));
        }
        if (databaseId != null) {
            joiner.add("databaseId: " + GraphQLRequestSerializer.getEntry(databaseId));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        joiner.add("isArchived: " + GraphQLRequestSerializer.getEntry(isArchived));
        if (note != null) {
            joiner.add("note: " + GraphQLRequestSerializer.getEntry(note));
        }
        if (project != null) {
            joiner.add("project: " + GraphQLRequestSerializer.getEntry(project));
        }
        if (resourcePath != null) {
            joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath));
        }
        if (state != null) {
            joiner.add("state: " + GraphQLRequestSerializer.getEntry(state));
        }
        if (updatedAt != null) {
            joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt));
        }
        if (url != null) {
            joiner.add("url: " + GraphQLRequestSerializer.getEntry(url));
        }
        return joiner.toString();
    }

    public static ProjectCardTO.Builder builder() {
        return new ProjectCardTO.Builder();
    }

    public static class Builder {

        private ProjectColumnTO column;
        private ProjectCardItemTO content;
        private String createdAt;
        private ActorTO creator;
        private Integer databaseId;
        private String id;
        private boolean isArchived;
        private String note;
        private ProjectTO project;
        private String resourcePath;
        private ProjectCardStateTO state;
        private String updatedAt;
        private String url;

        public Builder() {
        }

        public Builder setColumn(ProjectColumnTO column) {
            this.column = column;
            return this;
        }

        public Builder setContent(ProjectCardItemTO content) {
            this.content = content;
            return this;
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setCreator(ActorTO creator) {
            this.creator = creator;
            return this;
        }

        public Builder setDatabaseId(Integer databaseId) {
            this.databaseId = databaseId;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setIsArchived(boolean isArchived) {
            this.isArchived = isArchived;
            return this;
        }

        public Builder setNote(String note) {
            this.note = note;
            return this;
        }

        public Builder setProject(ProjectTO project) {
            this.project = project;
            return this;
        }

        public Builder setResourcePath(String resourcePath) {
            this.resourcePath = resourcePath;
            return this;
        }

        public Builder setState(ProjectCardStateTO state) {
            this.state = state;
            return this;
        }

        public Builder setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }


        public ProjectCardTO build() {
            return new ProjectCardTO(column, content, createdAt, creator, databaseId, id, isArchived, note, project, resourcePath, state, updatedAt, url);
        }

    }
}
