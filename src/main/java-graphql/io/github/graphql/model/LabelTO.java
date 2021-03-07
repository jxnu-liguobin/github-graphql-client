package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class LabelTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String color;
    private String createdAt;
    private String description;
    @javax.validation.constraints.NotNull
    private String id;
    private boolean isDefault;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private RepositoryTO repository;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    private String updatedAt;
    @javax.validation.constraints.NotNull
    private String url;

    public LabelTO() {
    }

    public LabelTO(String color, String createdAt, String description, String id, boolean isDefault, String name, RepositoryTO repository, String resourcePath, String updatedAt, String url) {
        this.color = color;
        this.createdAt = createdAt;
        this.description = description;
        this.id = id;
        this.isDefault = isDefault;
        this.name = name;
        this.repository = repository;
        this.resourcePath = resourcePath;
        this.updatedAt = updatedAt;
        this.url = url;
    }

    public String getColor() {
        return color;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
    }

    public boolean getIsDefault() {
        return isDefault;
    }

    public String getName() {
        return name;
    }

    public RepositoryTO getRepository() {
        return repository;
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
        if (color != null) {
            joiner.add("color: " + GraphQLRequestSerializer.getEntry(color));
        }
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        joiner.add("isDefault: " + GraphQLRequestSerializer.getEntry(isDefault));
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (repository != null) {
            joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository));
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

    public static LabelTO.Builder builder() {
        return new LabelTO.Builder();
    }

    public static class Builder {

        private String color;
        private String createdAt;
        private String description;
        private String id;
        private boolean isDefault;
        private String name;
        private RepositoryTO repository;
        private String resourcePath;
        private String updatedAt;
        private String url;

        public Builder() {
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setIsDefault(boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setRepository(RepositoryTO repository) {
            this.repository = repository;
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


        public LabelTO build() {
            return new LabelTO(color, createdAt, description, id, isDefault, name, repository, resourcePath, updatedAt, url);
        }

    }
}
