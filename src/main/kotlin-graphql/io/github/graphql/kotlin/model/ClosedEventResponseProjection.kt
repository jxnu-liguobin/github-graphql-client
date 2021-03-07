package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for ClosedEvent
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class ClosedEventResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ClosedEventResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ClosedEventResponseProjection {
        if (projectionDepthOnFields.getOrDefault("ClosedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields["ClosedEventResponseProjection.ActorResponseProjection.actor"] = projectionDepthOnFields.getOrDefault("ClosedEventResponseProjection.ActorResponseProjection.actor", 0) + 1
            this.actor(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ClosedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ClosedEventResponseProjection.ClosableResponseProjection.closable", 0) <= maxDepth) {
            projectionDepthOnFields["ClosedEventResponseProjection.ClosableResponseProjection.closable"] = projectionDepthOnFields.getOrDefault("ClosedEventResponseProjection.ClosableResponseProjection.closable", 0) + 1
            this.closable(ClosableResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ClosedEventResponseProjection.ClosableResponseProjection.closable", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ClosedEventResponseProjection.CloserResponseProjection.closer", 0) <= maxDepth) {
            projectionDepthOnFields["ClosedEventResponseProjection.CloserResponseProjection.closer"] = projectionDepthOnFields.getOrDefault("ClosedEventResponseProjection.CloserResponseProjection.closer", 0) + 1
            this.closer(CloserResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ClosedEventResponseProjection.CloserResponseProjection.closer", 0)))
        }
        this.createdAt()
        this.id()
        this.resourcePath()
        this.url()
        this.typename()
        return this
    }

    fun actor(subProjection: ActorResponseProjection): ClosedEventResponseProjection = actor(null, subProjection)

    fun actor(alias: String?, subProjection: ActorResponseProjection): ClosedEventResponseProjection {
        fields.add(GraphQLResponseField("actor").alias(alias).projection(subProjection))
        return this
    }

    fun closable(subProjection: ClosableResponseProjection): ClosedEventResponseProjection = closable(null, subProjection)

    fun closable(alias: String?, subProjection: ClosableResponseProjection): ClosedEventResponseProjection {
        fields.add(GraphQLResponseField("closable").alias(alias).projection(subProjection))
        return this
    }

    fun closer(subProjection: CloserResponseProjection): ClosedEventResponseProjection = closer(null, subProjection)

    fun closer(alias: String?, subProjection: CloserResponseProjection): ClosedEventResponseProjection {
        fields.add(GraphQLResponseField("closer").alias(alias).projection(subProjection))
        return this
    }

    fun createdAt(): ClosedEventResponseProjection = createdAt(null)

    fun createdAt(alias: String?): ClosedEventResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun id(): ClosedEventResponseProjection = id(null)

    fun id(alias: String?): ClosedEventResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun resourcePath(): ClosedEventResponseProjection = resourcePath(null)

    fun resourcePath(alias: String?): ClosedEventResponseProjection {
        fields.add(GraphQLResponseField("resourcePath").alias(alias))
        return this
    }

    fun url(): ClosedEventResponseProjection = url(null)

    fun url(alias: String?): ClosedEventResponseProjection {
        fields.add(GraphQLResponseField("url").alias(alias))
        return this
    }

    fun typename(): ClosedEventResponseProjection = typename(null)

    fun typename(alias: String?): ClosedEventResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as ClosedEventResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
