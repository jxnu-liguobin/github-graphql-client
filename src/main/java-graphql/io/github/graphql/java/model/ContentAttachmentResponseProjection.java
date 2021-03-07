package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for ContentAttachment
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ContentAttachmentResponseProjection extends GraphQLResponseProjection {

    public ContentAttachmentResponseProjection() {
    }

    @Override
    public ContentAttachmentResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ContentAttachmentResponseProjection all$(int maxDepth) {
        this.body();
        if (projectionDepthOnFields.getOrDefault("ContentAttachmentResponseProjection.ContentReferenceResponseProjection.contentReference", 0) <= maxDepth) {
            projectionDepthOnFields.put("ContentAttachmentResponseProjection.ContentReferenceResponseProjection.contentReference", projectionDepthOnFields.getOrDefault("ContentAttachmentResponseProjection.ContentReferenceResponseProjection.contentReference", 0) + 1);
            this.contentReference(new ContentReferenceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ContentAttachmentResponseProjection.ContentReferenceResponseProjection.contentReference", 0)));
        }
        this.databaseId();
        this.id();
        this.title();
        this.typename();
        return this;
    }

    public ContentAttachmentResponseProjection body() {
        return body(null);
    }

    public ContentAttachmentResponseProjection body(String alias) {
        fields.add(new GraphQLResponseField("body").alias(alias));
        return this;
    }

    public ContentAttachmentResponseProjection contentReference(ContentReferenceResponseProjection subProjection) {
        return contentReference(null, subProjection);
    }

    public ContentAttachmentResponseProjection contentReference(String alias, ContentReferenceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("contentReference").alias(alias).projection(subProjection));
        return this;
    }

    public ContentAttachmentResponseProjection databaseId() {
        return databaseId(null);
    }

    public ContentAttachmentResponseProjection databaseId(String alias) {
        fields.add(new GraphQLResponseField("databaseId").alias(alias));
        return this;
    }

    public ContentAttachmentResponseProjection id() {
        return id(null);
    }

    public ContentAttachmentResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ContentAttachmentResponseProjection title() {
        return title(null);
    }

    public ContentAttachmentResponseProjection title(String alias) {
        fields.add(new GraphQLResponseField("title").alias(alias));
        return this;
    }

    public ContentAttachmentResponseProjection typename() {
        return typename(null);
    }

    public ContentAttachmentResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final ContentAttachmentResponseProjection that = (ContentAttachmentResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
