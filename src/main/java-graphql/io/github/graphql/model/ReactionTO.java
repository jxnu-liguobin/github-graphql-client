package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class ReactionTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private ReactionContentTO content;
    @javax.validation.constraints.NotNull
    private String createdAt;
    private Integer databaseId;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private ReactableTO reactable;
    private UserTO user;

    public ReactionTO() {
    }

    public ReactionTO(ReactionContentTO content, String createdAt, Integer databaseId, String id, ReactableTO reactable, UserTO user) {
        this.content = content;
        this.createdAt = createdAt;
        this.databaseId = databaseId;
        this.id = id;
        this.reactable = reactable;
        this.user = user;
    }

    public ReactionContentTO getContent() {
        return content;
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

    public ReactableTO getReactable() {
        return reactable;
    }

    public UserTO getUser() {
        return user;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (content != null) {
            joiner.add("content: " + GraphQLRequestSerializer.getEntry(content));
        }
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        if (databaseId != null) {
            joiner.add("databaseId: " + GraphQLRequestSerializer.getEntry(databaseId));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (reactable != null) {
            joiner.add("reactable: " + GraphQLRequestSerializer.getEntry(reactable));
        }
        if (user != null) {
            joiner.add("user: " + GraphQLRequestSerializer.getEntry(user));
        }
        return joiner.toString();
    }

    public static ReactionTO.Builder builder() {
        return new ReactionTO.Builder();
    }

    public static class Builder {

        private ReactionContentTO content;
        private String createdAt;
        private Integer databaseId;
        private String id;
        private ReactableTO reactable;
        private UserTO user;

        public Builder() {
        }

        public Builder setContent(ReactionContentTO content) {
            this.content = content;
            return this;
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

        public Builder setReactable(ReactableTO reactable) {
            this.reactable = reactable;
            return this;
        }

        public Builder setUser(UserTO user) {
            this.user = user;
            return this;
        }


        public ReactionTO build() {
            return new ReactionTO(content, createdAt, databaseId, id, reactable, user);
        }

    }
}
