package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class GistTO implements java.io.Serializable, PinnableItemTO, StarrableTO, UniformResourceLocatableTO, NodeTO {

    @javax.validation.constraints.NotNull
    private String createdAt;
    private String description;
    @javax.validation.constraints.NotNull
    private String id;
    private boolean isFork;
    private boolean isPublic;
    @javax.validation.constraints.NotNull
    private String name;
    private RepositoryOwnerTO owner;
    private String pushedAt;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    @javax.validation.constraints.NotNull
    private String updatedAt;
    @javax.validation.constraints.NotNull
    private String url;
    private boolean viewerHasStarred;

    public GistTO() {
    }

    public GistTO(String createdAt, String description, String id, boolean isFork, boolean isPublic, String name, RepositoryOwnerTO owner, String pushedAt, String resourcePath, String updatedAt, String url, boolean viewerHasStarred) {
        this.createdAt = createdAt;
        this.description = description;
        this.id = id;
        this.isFork = isFork;
        this.isPublic = isPublic;
        this.name = name;
        this.owner = owner;
        this.pushedAt = pushedAt;
        this.resourcePath = resourcePath;
        this.updatedAt = updatedAt;
        this.url = url;
        this.viewerHasStarred = viewerHasStarred;
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

    public boolean getIsFork() {
        return isFork;
    }

    public boolean getIsPublic() {
        return isPublic;
    }

    public String getName() {
        return name;
    }

    public RepositoryOwnerTO getOwner() {
        return owner;
    }

    public String getPushedAt() {
        return pushedAt;
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

    public boolean getViewerHasStarred() {
        return viewerHasStarred;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final GistTO that = (GistTO) obj;
        return Objects.equals(createdAt, that.createdAt)
            && Objects.equals(description, that.description)
            && Objects.equals(id, that.id)
            && Objects.equals(isFork, that.isFork)
            && Objects.equals(isPublic, that.isPublic)
            && Objects.equals(name, that.name)
            && Objects.equals(owner, that.owner)
            && Objects.equals(pushedAt, that.pushedAt)
            && Objects.equals(resourcePath, that.resourcePath)
            && Objects.equals(updatedAt, that.updatedAt)
            && Objects.equals(url, that.url)
            && Objects.equals(viewerHasStarred, that.viewerHasStarred);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdAt, description, id, isFork, isPublic, name, owner, pushedAt, resourcePath, updatedAt, url, viewerHasStarred);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        joiner.add("isFork: " + GraphQLRequestSerializer.getEntry(isFork));
        joiner.add("isPublic: " + GraphQLRequestSerializer.getEntry(isPublic));
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (owner != null) {
            joiner.add("owner: " + GraphQLRequestSerializer.getEntry(owner));
        }
        if (pushedAt != null) {
            joiner.add("pushedAt: " + GraphQLRequestSerializer.getEntry(pushedAt));
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
        joiner.add("viewerHasStarred: " + GraphQLRequestSerializer.getEntry(viewerHasStarred));
        return joiner.toString();
    }

    public static GistTO.Builder builder() {
        return new GistTO.Builder();
    }

    public static class Builder {

        private String createdAt;
        private String description;
        private String id;
        private boolean isFork;
        private boolean isPublic;
        private String name;
        private RepositoryOwnerTO owner;
        private String pushedAt;
        private String resourcePath;
        private String updatedAt;
        private String url;
        private boolean viewerHasStarred;

        public Builder() {
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

        public Builder setIsFork(boolean isFork) {
            this.isFork = isFork;
            return this;
        }

        public Builder setIsPublic(boolean isPublic) {
            this.isPublic = isPublic;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setOwner(RepositoryOwnerTO owner) {
            this.owner = owner;
            return this;
        }

        public Builder setPushedAt(String pushedAt) {
            this.pushedAt = pushedAt;
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

        public Builder setViewerHasStarred(boolean viewerHasStarred) {
            this.viewerHasStarred = viewerHasStarred;
            return this;
        }


        public GistTO build() {
            return new GistTO(createdAt, description, id, isFork, isPublic, name, owner, pushedAt, resourcePath, updatedAt, url, viewerHasStarred);
        }

    }
}
