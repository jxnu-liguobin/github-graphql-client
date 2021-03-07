package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class ClosedEventTO implements java.io.Serializable, IssueTimelineItemsTO, PullRequestTimelineItemsTO, IssueTimelineItemTO, PullRequestTimelineItemTO, UniformResourceLocatableTO, NodeTO {

    private ActorTO actor;
    @javax.validation.constraints.NotNull
    private ClosableTO closable;
    private CloserTO closer;
    @javax.validation.constraints.NotNull
    private String createdAt;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    @javax.validation.constraints.NotNull
    private String url;

    public ClosedEventTO() {
    }

    public ClosedEventTO(ActorTO actor, ClosableTO closable, CloserTO closer, String createdAt, String id, String resourcePath, String url) {
        this.actor = actor;
        this.closable = closable;
        this.closer = closer;
        this.createdAt = createdAt;
        this.id = id;
        this.resourcePath = resourcePath;
        this.url = url;
    }

    public ActorTO getActor() {
        return actor;
    }

    public ClosableTO getClosable() {
        return closable;
    }

    public CloserTO getCloser() {
        return closer;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getId() {
        return id;
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
        if (closable != null) {
            joiner.add("closable: " + GraphQLRequestSerializer.getEntry(closable));
        }
        if (closer != null) {
            joiner.add("closer: " + GraphQLRequestSerializer.getEntry(closer));
        }
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (resourcePath != null) {
            joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath));
        }
        if (url != null) {
            joiner.add("url: " + GraphQLRequestSerializer.getEntry(url));
        }
        return joiner.toString();
    }

    public static ClosedEventTO.Builder builder() {
        return new ClosedEventTO.Builder();
    }

    public static class Builder {

        private ActorTO actor;
        private ClosableTO closable;
        private CloserTO closer;
        private String createdAt;
        private String id;
        private String resourcePath;
        private String url;

        public Builder() {
        }

        public Builder setActor(ActorTO actor) {
            this.actor = actor;
            return this;
        }

        public Builder setClosable(ClosableTO closable) {
            this.closable = closable;
            return this;
        }

        public Builder setCloser(CloserTO closer) {
            this.closer = closer;
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

        public Builder setResourcePath(String resourcePath) {
            this.resourcePath = resourcePath;
            return this;
        }

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }


        public ClosedEventTO build() {
            return new ClosedEventTO(actor, closable, closer, createdAt, id, resourcePath, url);
        }

    }
}
