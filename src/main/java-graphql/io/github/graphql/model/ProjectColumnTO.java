package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class ProjectColumnTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String createdAt;
    private Integer databaseId;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private ProjectTO project;
    private ProjectColumnPurposeTO purpose;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    @javax.validation.constraints.NotNull
    private String updatedAt;
    @javax.validation.constraints.NotNull
    private String url;

    public ProjectColumnTO() {
    }

    public ProjectColumnTO(String createdAt, Integer databaseId, String id, String name, ProjectTO project, ProjectColumnPurposeTO purpose, String resourcePath, String updatedAt, String url) {
        this.createdAt = createdAt;
        this.databaseId = databaseId;
        this.id = id;
        this.name = name;
        this.project = project;
        this.purpose = purpose;
        this.resourcePath = resourcePath;
        this.updatedAt = updatedAt;
        this.url = url;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public Integer getDatabaseId() {
        return databaseId;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ProjectTO getProject() {
        return project;
    }

    public ProjectColumnPurposeTO getPurpose() {
        return purpose;
    }

    public String getResourcePath() {
        return resourcePath;
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
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        if (databaseId != null) {
            joiner.add("databaseId: " + GraphQLRequestSerializer.getEntry(databaseId));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (project != null) {
            joiner.add("project: " + GraphQLRequestSerializer.getEntry(project));
        }
        if (purpose != null) {
            joiner.add("purpose: " + GraphQLRequestSerializer.getEntry(purpose));
        }
        if (resourcePath != null) {
            joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath));
        }
        if (updatedAt != null) {
            joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt));
        }
        if (url != null) {
            joiner.add("url: " + GraphQLRequestSerializer.getEntry(url));
        }
        return joiner.toString();
    }

    public static ProjectColumnTO.Builder builder() {
        return new ProjectColumnTO.Builder();
    }

    public static class Builder {

        private String createdAt;
        private Integer databaseId;
        private String id;
        private String name;
        private ProjectTO project;
        private ProjectColumnPurposeTO purpose;
        private String resourcePath;
        private String updatedAt;
        private String url;

        public Builder() {
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
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

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setProject(ProjectTO project) {
            this.project = project;
            return this;
        }

        public Builder setPurpose(ProjectColumnPurposeTO purpose) {
            this.purpose = purpose;
            return this;
        }

        public Builder setResourcePath(String resourcePath) {
            this.resourcePath = resourcePath;
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


        public ProjectColumnTO build() {
            return new ProjectColumnTO(createdAt, databaseId, id, name, project, purpose, resourcePath, updatedAt, url);
        }

    }
}
