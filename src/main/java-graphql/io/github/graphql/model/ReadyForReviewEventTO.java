package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class ReadyForReviewEventTO implements java.io.Serializable, PullRequestTimelineItemsTO, UniformResourceLocatableTO, NodeTO {

    private ActorTO actor;
    @javax.validation.constraints.NotNull
    private String createdAt;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private PullRequestTO pullRequest;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    @javax.validation.constraints.NotNull
    private String url;

    public ReadyForReviewEventTO() {
    }

    public ReadyForReviewEventTO(ActorTO actor, String createdAt, String id, PullRequestTO pullRequest, String resourcePath, String url) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.id = id;
        this.pullRequest = pullRequest;
        this.resourcePath = resourcePath;
        this.url = url;
    }

    public ActorTO getActor() {
        return actor;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getId() {
        return id;
    }

    public PullRequestTO getPullRequest() {
        return pullRequest;
    }

    public String getResourcePath() {
        return resourcePath;
    }

    public String getUrl() {
        return url;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (actor != null) {
            joiner.add("actor: " + GraphQLRequestSerializer.getEntry(actor));
        }
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (pullRequest != null) {
            joiner.add("pullRequest: " + GraphQLRequestSerializer.getEntry(pullRequest));
        }
        if (resourcePath != null) {
            joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath));
        }
        if (url != null) {
            joiner.add("url: " + GraphQLRequestSerializer.getEntry(url));
        }
        return joiner.toString();
    }

    public static ReadyForReviewEventTO.Builder builder() {
        return new ReadyForReviewEventTO.Builder();
    }

    public static class Builder {

        private ActorTO actor;
        private String createdAt;
        private String id;
        private PullRequestTO pullRequest;
        private String resourcePath;
        private String url;

        public Builder() {
        }

        public Builder setActor(ActorTO actor) {
            this.actor = actor;
            return this;
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setPullRequest(PullRequestTO pullRequest) {
            this.pullRequest = pullRequest;
            return this;
        }

        public Builder setResourcePath(String resourcePath) {
            this.resourcePath = resourcePath;
            return this;
        }

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }


        public ReadyForReviewEventTO build() {
            return new ReadyForReviewEventTO(actor, createdAt, id, pullRequest, resourcePath, url);
        }

    }
}
