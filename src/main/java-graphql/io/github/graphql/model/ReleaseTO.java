package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class ReleaseTO implements java.io.Serializable, UniformResourceLocatableTO, NodeTO {

    private UserTO author;
    @javax.validation.constraints.NotNull
    private String createdAt;
    private String description;
    @javax.validation.constraints.NotNull
    private String id;
    private boolean isDraft;
    private boolean isPrerelease;
    private String name;
    private String publishedAt;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    private RefTO tag;
    @javax.validation.constraints.NotNull
    private String tagName;
    @javax.validation.constraints.NotNull
    private String updatedAt;
    @javax.validation.constraints.NotNull
    private String url;

    public ReleaseTO() {
    }

    public ReleaseTO(UserTO author, String createdAt, String description, String id, boolean isDraft, boolean isPrerelease, String name, String publishedAt, String resourcePath, RefTO tag, String tagName, String updatedAt, String url) {
        this.author = author;
        this.createdAt = createdAt;
        this.description = description;
        this.id = id;
        this.isDraft = isDraft;
        this.isPrerelease = isPrerelease;
        this.name = name;
        this.publishedAt = publishedAt;
        this.resourcePath = resourcePath;
        this.tag = tag;
        this.tagName = tagName;
        this.updatedAt = updatedAt;
        this.url = url;
    }

    public UserTO getAuthor() {
        return author;
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

    public boolean getIsDraft() {
        return isDraft;
    }

    public boolean getIsPrerelease() {
        return isPrerelease;
    }

    public String getName() {
        return name;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public String getResourcePath() {
        return resourcePath;
    }

    public RefTO getTag() {
        return tag;
    }

    public String getTagName() {
        return tagName;
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
        if (author != null) {
            joiner.add("author: " + GraphQLRequestSerializer.getEntry(author));
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
        joiner.add("isDraft: " + GraphQLRequestSerializer.getEntry(isDraft));
        joiner.add("isPrerelease: " + GraphQLRequestSerializer.getEntry(isPrerelease));
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (publishedAt != null) {
            joiner.add("publishedAt: " + GraphQLRequestSerializer.getEntry(publishedAt));
        }
        if (resourcePath != null) {
            joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath));
        }
        if (tag != null) {
            joiner.add("tag: " + GraphQLRequestSerializer.getEntry(tag));
        }
        if (tagName != null) {
            joiner.add("tagName: " + GraphQLRequestSerializer.getEntry(tagName));
        }
        if (updatedAt != null) {
            joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt));
        }
        if (url != null) {
            joiner.add("url: " + GraphQLRequestSerializer.getEntry(url));
        }
        return joiner.toString();
    }

    public static ReleaseTO.Builder builder() {
        return new ReleaseTO.Builder();
    }

    public static class Builder {

        private UserTO author;
        private String createdAt;
        private String description;
        private String id;
        private boolean isDraft;
        private boolean isPrerelease;
        private String name;
        private String publishedAt;
        private String resourcePath;
        private RefTO tag;
        private String tagName;
        private String updatedAt;
        private String url;

        public Builder() {
        }

        public Builder setAuthor(UserTO author) {
            this.author = author;
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

        public Builder setIsDraft(boolean isDraft) {
            this.isDraft = isDraft;
            return this;
        }

        public Builder setIsPrerelease(boolean isPrerelease) {
            this.isPrerelease = isPrerelease;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
            return this;
        }

        public Builder setResourcePath(String resourcePath) {
            this.resourcePath = resourcePath;
            return this;
        }

        public Builder setTag(RefTO tag) {
            this.tag = tag;
            return this;
        }

        public Builder setTagName(String tagName) {
            this.tagName = tagName;
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


        public ReleaseTO build() {
            return new ReleaseTO(author, createdAt, description, id, isDraft, isPrerelease, name, publishedAt, resourcePath, tag, tagName, updatedAt, url);
        }

    }
}
