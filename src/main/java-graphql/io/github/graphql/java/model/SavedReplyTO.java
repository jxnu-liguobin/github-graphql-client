package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class SavedReplyTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String body;
    @javax.validation.constraints.NotNull
    private String bodyHTML;
    private Integer databaseId;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String title;
    private ActorTO user;

    public SavedReplyTO() {
    }

    public SavedReplyTO(String body, String bodyHTML, Integer databaseId, String id, String title, ActorTO user) {
        this.body = body;
        this.bodyHTML = bodyHTML;
        this.databaseId = databaseId;
        this.id = id;
        this.title = title;
        this.user = user;
    }

    public String getBody() {
        return body;
    }

    public String getBodyHTML() {
        return bodyHTML;
    }

    public Integer getDatabaseId() {
        return databaseId;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public ActorTO getUser() {
        return user;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final SavedReplyTO that = (SavedReplyTO) obj;
        return Objects.equals(body, that.body)
            && Objects.equals(bodyHTML, that.bodyHTML)
            && Objects.equals(databaseId, that.databaseId)
            && Objects.equals(id, that.id)
            && Objects.equals(title, that.title)
            && Objects.equals(user, that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body, bodyHTML, databaseId, id, title, user);
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
        if (databaseId != null) {
            joiner.add("databaseId: " + GraphQLRequestSerializer.getEntry(databaseId));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (title != null) {
            joiner.add("title: " + GraphQLRequestSerializer.getEntry(title));
        }
        if (user != null) {
            joiner.add("user: " + GraphQLRequestSerializer.getEntry(user));
        }
        return joiner.toString();
    }

    public static SavedReplyTO.Builder builder() {
        return new SavedReplyTO.Builder();
    }

    public static class Builder {

        private String body;
        private String bodyHTML;
        private Integer databaseId;
        private String id;
        private String title;
        private ActorTO user;

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

        public Builder setDatabaseId(Integer databaseId) {
            this.databaseId = databaseId;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setUser(ActorTO user) {
            this.user = user;
            return this;
        }


        public SavedReplyTO build() {
            return new SavedReplyTO(body, bodyHTML, databaseId, id, title, user);
        }

    }
}
