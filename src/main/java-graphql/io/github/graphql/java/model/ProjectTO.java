package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ProjectTO implements java.io.Serializable, ClosableTO, NodeTO, UpdatableTO {

    private String body;
    @javax.validation.constraints.NotNull
    private String bodyHTML;
    private boolean closed;
    private String closedAt;
    @javax.validation.constraints.NotNull
    private String createdAt;
    private ActorTO creator;
    private Integer databaseId;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    private int number;
    @javax.validation.constraints.NotNull
    private ProjectOwnerTO owner;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    @javax.validation.constraints.NotNull
    private ProjectStateTO state;
    @javax.validation.constraints.NotNull
    private String updatedAt;
    @javax.validation.constraints.NotNull
    private String url;
    private boolean viewerCanUpdate;

    public ProjectTO() {
    }

    public ProjectTO(String body, String bodyHTML, boolean closed, String closedAt, String createdAt, ActorTO creator, Integer databaseId, String id, String name, int number, ProjectOwnerTO owner, String resourcePath, ProjectStateTO state, String updatedAt, String url, boolean viewerCanUpdate) {
        this.body = body;
        this.bodyHTML = bodyHTML;
        this.closed = closed;
        this.closedAt = closedAt;
        this.createdAt = createdAt;
        this.creator = creator;
        this.databaseId = databaseId;
        this.id = id;
        this.name = name;
        this.number = number;
        this.owner = owner;
        this.resourcePath = resourcePath;
        this.state = state;
        this.updatedAt = updatedAt;
        this.url = url;
        this.viewerCanUpdate = viewerCanUpdate;
    }

    public String getBody() {
        return body;
    }

    public String getBodyHTML() {
        return bodyHTML;
    }

    public boolean getClosed() {
        return closed;
    }

    public String getClosedAt() {
        return closedAt;
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

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public ProjectOwnerTO getOwner() {
        return owner;
    }

    public String getResourcePath() {
        return resourcePath;
    }

    public ProjectStateTO getState() {
        return state;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getUrl() {
        return url;
    }

    public boolean getViewerCanUpdate() {
        return viewerCanUpdate;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final ProjectTO that = (ProjectTO) obj;
        return Objects.equals(body, that.body)
            && Objects.equals(bodyHTML, that.bodyHTML)
            && Objects.equals(closed, that.closed)
            && Objects.equals(closedAt, that.closedAt)
            && Objects.equals(createdAt, that.createdAt)
            && Objects.equals(creator, that.creator)
            && Objects.equals(databaseId, that.databaseId)
            && Objects.equals(id, that.id)
            && Objects.equals(name, that.name)
            && Objects.equals(number, that.number)
            && Objects.equals(owner, that.owner)
            && Objects.equals(resourcePath, that.resourcePath)
            && Objects.equals(state, that.state)
            && Objects.equals(updatedAt, that.updatedAt)
            && Objects.equals(url, that.url)
            && Objects.equals(viewerCanUpdate, that.viewerCanUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body, bodyHTML, closed, closedAt, createdAt, creator, databaseId, id, name, number, owner, resourcePath, state, updatedAt, url, viewerCanUpdate);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (body != null) {
            joiner.add("body: " + GraphQLRequestSerializer.getEntry(body));
        }
        if (bodyHTML != null) {
            joiner.add("bodyHTML: " + GraphQLRequestSerializer.getEntry(bodyHTML));
        }
        joiner.add("closed: " + GraphQLRequestSerializer.getEntry(closed));
        if (closedAt != null) {
            joiner.add("closedAt: " + GraphQLRequestSerializer.getEntry(closedAt));
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
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        joiner.add("number: " + GraphQLRequestSerializer.getEntry(number));
        if (owner != null) {
            joiner.add("owner: " + GraphQLRequestSerializer.getEntry(owner));
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
        joiner.add("viewerCanUpdate: " + GraphQLRequestSerializer.getEntry(viewerCanUpdate));
        return joiner.toString();
    }

    public static ProjectTO.Builder builder() {
        return new ProjectTO.Builder();
    }

    public static class Builder {

        private String body;
        private String bodyHTML;
        private boolean closed;
        private String closedAt;
        private String createdAt;
        private ActorTO creator;
        private Integer databaseId;
        private String id;
        private String name;
        private int number;
        private ProjectOwnerTO owner;
        private String resourcePath;
        private ProjectStateTO state;
        private String updatedAt;
        private String url;
        private boolean viewerCanUpdate;

        public Builder() {
        }

        public Builder setBody(String body) {
            this.body = body;
            return this;
        }

        public Builder setBodyHTML(String bodyHTML) {
            this.bodyHTML = bodyHTML;
            return this;
        }

        public Builder setClosed(boolean closed) {
            this.closed = closed;
            return this;
        }

        public Builder setClosedAt(String closedAt) {
            this.closedAt = closedAt;
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

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setNumber(int number) {
            this.number = number;
            return this;
        }

        public Builder setOwner(ProjectOwnerTO owner) {
            this.owner = owner;
            return this;
        }

        public Builder setResourcePath(String resourcePath) {
            this.resourcePath = resourcePath;
            return this;
        }

        public Builder setState(ProjectStateTO state) {
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

        public Builder setViewerCanUpdate(boolean viewerCanUpdate) {
            this.viewerCanUpdate = viewerCanUpdate;
            return this;
        }


        public ProjectTO build() {
            return new ProjectTO(body, bodyHTML, closed, closedAt, createdAt, creator, databaseId, id, name, number, owner, resourcePath, state, updatedAt, url, viewerCanUpdate);
        }

    }
}
