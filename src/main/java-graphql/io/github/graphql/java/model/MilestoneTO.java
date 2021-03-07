package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class MilestoneTO implements java.io.Serializable, UniformResourceLocatableTO, ClosableTO, NodeTO {

    private boolean closed;
    private String closedAt;
    @javax.validation.constraints.NotNull
    private String createdAt;
    private ActorTO creator;
    private String description;
    private String dueOn;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String issuePrioritiesDebug;
    private int number;
    @javax.validation.constraints.NotNull
    private RepositoryTO repository;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    @javax.validation.constraints.NotNull
    private MilestoneStateTO state;
    @javax.validation.constraints.NotNull
    private String title;
    @javax.validation.constraints.NotNull
    private String updatedAt;
    @javax.validation.constraints.NotNull
    private String url;

    public MilestoneTO() {
    }

    public MilestoneTO(boolean closed, String closedAt, String createdAt, ActorTO creator, String description, String dueOn, String id, String issuePrioritiesDebug, int number, RepositoryTO repository, String resourcePath, MilestoneStateTO state, String title, String updatedAt, String url) {
        this.closed = closed;
        this.closedAt = closedAt;
        this.createdAt = createdAt;
        this.creator = creator;
        this.description = description;
        this.dueOn = dueOn;
        this.id = id;
        this.issuePrioritiesDebug = issuePrioritiesDebug;
        this.number = number;
        this.repository = repository;
        this.resourcePath = resourcePath;
        this.state = state;
        this.title = title;
        this.updatedAt = updatedAt;
        this.url = url;
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

    public String getDescription() {
        return description;
    }

    public String getDueOn() {
        return dueOn;
    }

    public String getId() {
        return id;
    }

    public String getIssuePrioritiesDebug() {
        return issuePrioritiesDebug;
    }

    public int getNumber() {
        return number;
    }

    public RepositoryTO getRepository() {
        return repository;
    }

    public String getResourcePath() {
        return resourcePath;
    }

    public MilestoneStateTO getState() {
        return state;
    }

    public String getTitle() {
        return title;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final MilestoneTO that = (MilestoneTO) obj;
        return Objects.equals(closed, that.closed)
            && Objects.equals(closedAt, that.closedAt)
            && Objects.equals(createdAt, that.createdAt)
            && Objects.equals(creator, that.creator)
            && Objects.equals(description, that.description)
            && Objects.equals(dueOn, that.dueOn)
            && Objects.equals(id, that.id)
            && Objects.equals(issuePrioritiesDebug, that.issuePrioritiesDebug)
            && Objects.equals(number, that.number)
            && Objects.equals(repository, that.repository)
            && Objects.equals(resourcePath, that.resourcePath)
            && Objects.equals(state, that.state)
            && Objects.equals(title, that.title)
            && Objects.equals(updatedAt, that.updatedAt)
            && Objects.equals(url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(closed, closedAt, createdAt, creator, description, dueOn, id, issuePrioritiesDebug, number, repository, resourcePath, state, title, updatedAt, url);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
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
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (dueOn != null) {
            joiner.add("dueOn: " + GraphQLRequestSerializer.getEntry(dueOn));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (issuePrioritiesDebug != null) {
            joiner.add("issuePrioritiesDebug: " + GraphQLRequestSerializer.getEntry(issuePrioritiesDebug));
        }
        joiner.add("number: " + GraphQLRequestSerializer.getEntry(number));
        if (repository != null) {
            joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository));
        }
        if (resourcePath != null) {
            joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath));
        }
        if (state != null) {
            joiner.add("state: " + GraphQLRequestSerializer.getEntry(state));
        }
        if (title != null) {
            joiner.add("title: " + GraphQLRequestSerializer.getEntry(title));
        }
        if (updatedAt != null) {
            joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt));
        }
        if (url != null) {
            joiner.add("url: " + GraphQLRequestSerializer.getEntry(url));
        }
        return joiner.toString();
    }

    public static MilestoneTO.Builder builder() {
        return new MilestoneTO.Builder();
    }

    public static class Builder {

        private boolean closed;
        private String closedAt;
        private String createdAt;
        private ActorTO creator;
        private String description;
        private String dueOn;
        private String id;
        private String issuePrioritiesDebug;
        private int number;
        private RepositoryTO repository;
        private String resourcePath;
        private MilestoneStateTO state;
        private String title;
        private String updatedAt;
        private String url;

        public Builder() {
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

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setDueOn(String dueOn) {
            this.dueOn = dueOn;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setIssuePrioritiesDebug(String issuePrioritiesDebug) {
            this.issuePrioritiesDebug = issuePrioritiesDebug;
            return this;
        }

        public Builder setNumber(int number) {
            this.number = number;
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

        public Builder setState(MilestoneStateTO state) {
            this.state = state;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
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


        public MilestoneTO build() {
            return new MilestoneTO(closed, closedAt, createdAt, creator, description, dueOn, id, issuePrioritiesDebug, number, repository, resourcePath, state, title, updatedAt, url);
        }

    }
}
