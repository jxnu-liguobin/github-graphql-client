package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ContentAttachment
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class ContentAttachmentResponseProjection extends GraphQLResponseProjection {

    override def all$(): ContentAttachmentResponseProjection = all$(3)

    override def all$(maxDepth: Int): ContentAttachmentResponseProjection = {
        this.body()
        if (projectionDepthOnFields.getOrDefault("ContentAttachmentResponseProjection.ContentReferenceResponseProjection.contentReference", 0) <= maxDepth) {
            projectionDepthOnFields.put("ContentAttachmentResponseProjection.ContentReferenceResponseProjection.contentReference", projectionDepthOnFields.getOrDefault("ContentAttachmentResponseProjection.ContentReferenceResponseProjection.contentReference", 0) + 1)
            this.contentReference(new ContentReferenceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ContentAttachmentResponseProjection.ContentReferenceResponseProjection.contentReference", 0)))
        }
        this.databaseId()
        this.id()
        this.title()
        this.typename()
        this
    }

    def body(): ContentAttachmentResponseProjection = {
        body(null.asInstanceOf[String])
    }

    def body(alias: String): ContentAttachmentResponseProjection = {
        fields.add(new GraphQLResponseField("body").alias(alias))
        this
    }

    def contentReference(subProjection: ContentReferenceResponseProjection): ContentAttachmentResponseProjection = {
        contentReference(null.asInstanceOf[String], subProjection)
    }

    def contentReference(alias: String, subProjection: ContentReferenceResponseProjection): ContentAttachmentResponseProjection = {
        fields.add(new GraphQLResponseField("contentReference").alias(alias).projection(subProjection))
        this
    }

    def databaseId(): ContentAttachmentResponseProjection = {
        databaseId(null.asInstanceOf[String])
    }

    def databaseId(alias: String): ContentAttachmentResponseProjection = {
        fields.add(new GraphQLResponseField("databaseId").alias(alias))
        this
    }

    def id(): ContentAttachmentResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): ContentAttachmentResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def title(): ContentAttachmentResponseProjection = {
        title(null.asInstanceOf[String])
    }

    def title(alias: String): ContentAttachmentResponseProjection = {
        fields.add(new GraphQLResponseField("title").alias(alias))
        this
    }

    def typename(): ContentAttachmentResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ContentAttachmentResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
