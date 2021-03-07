package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ContentAttachmentTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String body;
    @javax.validation.constraints.NotNull
    private ContentReferenceTO contentReference;
    private int databaseId;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String title;

    public ContentAttachmentTO() {
    }

    public ContentAttachmentTO(String body, ContentReferenceTO contentReference, int databaseId, String id, String title) {
        this.body = body;
        this.contentReference = contentReference;
        this.databaseId = databaseId;
        this.id = id;
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public ContentReferenceTO getContentReference() {
        return contentReference;
    }

    public int getDatabaseId() {
        return databaseId;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final ContentAttachmentTO that = (ContentAttachmentTO) obj;
        return Objects.equals(body, that.body)
            && Objects.equals(contentReference, that.contentReference)
            && Objects.equals(databaseId, that.databaseId)
            && Objects.equals(id, that.id)
            && Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body, contentReference, databaseId, id, title);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (body != null) {
            joiner.add("body: " + GraphQLRequestSerializer.getEntry(body));
        }
        if (contentReference != null) {
            joiner.add("contentReference: " + GraphQLRequestSerializer.getEntry(contentReference));
        }
        joiner.add("databaseId: " + GraphQLRequestSerializer.getEntry(databaseId));
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (title != null) {
            joiner.add("title: " + GraphQLRequestSerializer.getEntry(title));
        }
        return joiner.toString();
    }

    public static ContentAttachmentTO.Builder builder() {
        return new ContentAttachmentTO.Builder();
    }

    public static class Builder {

        private String body;
        private ContentReferenceTO contentReference;
        private int databaseId;
        private String id;
        private String title;

        public Builder() {
        }

        public Builder setBody(String body) {
            this.body = body;
            return this;
        }

        public Builder setContentReference(ContentReferenceTO contentReference) {
            this.contentReference = contentReference;
            return this;
        }

        public Builder setDatabaseId(int databaseId) {
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


        public ContentAttachmentTO build() {
            return new ContentAttachmentTO(body, contentReference, databaseId, id, title);
        }

    }
}
