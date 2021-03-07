package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class StatusContextTO implements java.io.Serializable, NodeTO {

    private CommitTO commit;
    @javax.validation.constraints.NotNull
    private String context;
    @javax.validation.constraints.NotNull
    private String createdAt;
    private ActorTO creator;
    private String description;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private StatusStateTO state;
    private String targetUrl;

    public StatusContextTO() {
    }

    public StatusContextTO(CommitTO commit, String context, String createdAt, ActorTO creator, String description, String id, StatusStateTO state, String targetUrl) {
        this.commit = commit;
        this.context = context;
        this.createdAt = createdAt;
        this.creator = creator;
        this.description = description;
        this.id = id;
        this.state = state;
        this.targetUrl = targetUrl;
    }

    public CommitTO getCommit() {
        return commit;
    }

    public String getContext() {
        return context;
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

    public String getId() {
        return id;
    }

    public StatusStateTO getState() {
        return state;
    }

    public String getTargetUrl() {
        return targetUrl;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (commit != null) {
            joiner.add("commit: " + GraphQLRequestSerializer.getEntry(commit));
        }
        if (context != null) {
            joiner.add("context: " + GraphQLRequestSerializer.getEntry(context));
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
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (state != null) {
            joiner.add("state: " + GraphQLRequestSerializer.getEntry(state));
        }
        if (targetUrl != null) {
            joiner.add("targetUrl: " + GraphQLRequestSerializer.getEntry(targetUrl));
        }
        return joiner.toString();
    }

    public static StatusContextTO.Builder builder() {
        return new StatusContextTO.Builder();
    }

    public static class Builder {

        private CommitTO commit;
        private String context;
        private String createdAt;
        private ActorTO creator;
        private String description;
        private String id;
        private StatusStateTO state;
        private String targetUrl;

        public Builder() {
        }

        public Builder setCommit(CommitTO commit) {
            this.commit = commit;
            return this;
        }

        public Builder setContext(String context) {
            this.context = context;
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

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setState(StatusStateTO state) {
            this.state = state;
            return this;
        }

        public Builder setTargetUrl(String targetUrl) {
            this.targetUrl = targetUrl;
            return this;
        }


        public StatusContextTO build() {
            return new StatusContextTO(commit, context, createdAt, creator, description, id, state, targetUrl);
        }

    }
}
