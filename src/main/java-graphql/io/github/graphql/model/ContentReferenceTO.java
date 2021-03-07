package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class ContentReferenceTO implements java.io.Serializable {

    private int databaseId;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String reference;

    public ContentReferenceTO() {
    }

    public ContentReferenceTO(int databaseId, String id, String reference) {
        this.databaseId = databaseId;
        this.id = id;
        this.reference = reference;
    }

    public int getDatabaseId() {
        return databaseId;
    }

    public String getId() {
        return id;
    }

    public String getReference() {
        return reference;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("databaseId: " + GraphQLRequestSerializer.getEntry(databaseId));
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (reference != null) {
            joiner.add("reference: " + GraphQLRequestSerializer.getEntry(reference));
        }
        return joiner.toString();
    }

    public static ContentReferenceTO.Builder builder() {
        return new ContentReferenceTO.Builder();
    }

    public static class Builder {

        private int databaseId;
        private String id;
        private String reference;

        public Builder() {
        }

        public Builder setDatabaseId(int databaseId) {
            this.databaseId = databaseId;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setReference(String reference) {
            this.reference = reference;
            return this;
        }


        public ContentReferenceTO build() {
            return new ContentReferenceTO(databaseId, id, reference);
        }

    }
}
