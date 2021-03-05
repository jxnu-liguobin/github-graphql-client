package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ContentAttachment
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class ContentAttachmentResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ContentAttachmentResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ContentAttachmentResponseProjection {
        this.body()
        if (projectionDepthOnFields.getOrDefault("ContentAttachmentResponseProjection.ContentReferenceResponseProjection.contentReference", 0) <= maxDepth) {
            projectionDepthOnFields["ContentAttachmentResponseProjection.ContentReferenceResponseProjection.contentReference"] = projectionDepthOnFields.getOrDefault("ContentAttachmentResponseProjection.ContentReferenceResponseProjection.contentReference", 0) + 1
            this.contentReference(ContentReferenceResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ContentAttachmentResponseProjection.ContentReferenceResponseProjection.contentReference", 0)))
        }
        this.databaseId()
        this.id()
        this.title()
        this.typename()
        return this
    }

    fun body(): ContentAttachmentResponseProjection = body(null)

    fun body(alias: String?): ContentAttachmentResponseProjection {
        fields.add(GraphQLResponseField("body").alias(alias))
        return this
    }

    fun contentReference(subProjection: ContentReferenceResponseProjection): ContentAttachmentResponseProjection = contentReference(null, subProjection)

    fun contentReference(alias: String?, subProjection: ContentReferenceResponseProjection): ContentAttachmentResponseProjection {
        fields.add(GraphQLResponseField("contentReference").alias(alias).projection(subProjection))
        return this
    }

    fun databaseId(): ContentAttachmentResponseProjection = databaseId(null)

    fun databaseId(alias: String?): ContentAttachmentResponseProjection {
        fields.add(GraphQLResponseField("databaseId").alias(alias))
        return this
    }

    fun id(): ContentAttachmentResponseProjection = id(null)

    fun id(alias: String?): ContentAttachmentResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun title(): ContentAttachmentResponseProjection = title(null)

    fun title(alias: String?): ContentAttachmentResponseProjection {
        fields.add(GraphQLResponseField("title").alias(alias))
        return this
    }

    fun typename(): ContentAttachmentResponseProjection = typename(null)

    fun typename(alias: String?): ContentAttachmentResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
