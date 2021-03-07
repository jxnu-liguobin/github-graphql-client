package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for UnlabeledEvent
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class UnlabeledEventResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): UnlabeledEventResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): UnlabeledEventResponseProjection {
        if (projectionDepthOnFields.getOrDefault("UnlabeledEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields["UnlabeledEventResponseProjection.ActorResponseProjection.actor"] = projectionDepthOnFields.getOrDefault("UnlabeledEventResponseProjection.ActorResponseProjection.actor", 0) + 1
            this.actor(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UnlabeledEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.id()
        if (projectionDepthOnFields.getOrDefault("UnlabeledEventResponseProjection.LabelResponseProjection.label", 0) <= maxDepth) {
            projectionDepthOnFields["UnlabeledEventResponseProjection.LabelResponseProjection.label"] = projectionDepthOnFields.getOrDefault("UnlabeledEventResponseProjection.LabelResponseProjection.label", 0) + 1
            this.label(LabelResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UnlabeledEventResponseProjection.LabelResponseProjection.label", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UnlabeledEventResponseProjection.LabelableResponseProjection.labelable", 0) <= maxDepth) {
            projectionDepthOnFields["UnlabeledEventResponseProjection.LabelableResponseProjection.labelable"] = projectionDepthOnFields.getOrDefault("UnlabeledEventResponseProjection.LabelableResponseProjection.labelable", 0) + 1
            this.labelable(LabelableResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UnlabeledEventResponseProjection.LabelableResponseProjection.labelable", 0)))
        }
        this.typename()
        return this
    }

    fun actor(subProjection: ActorResponseProjection): UnlabeledEventResponseProjection = actor(null, subProjection)

    fun actor(alias: String?, subProjection: ActorResponseProjection): UnlabeledEventResponseProjection {
        fields.add(GraphQLResponseField("actor").alias(alias).projection(subProjection))
        return this
    }

    fun createdAt(): UnlabeledEventResponseProjection = createdAt(null)

    fun createdAt(alias: String?): UnlabeledEventResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun id(): UnlabeledEventResponseProjection = id(null)

    fun id(alias: String?): UnlabeledEventResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun label(subProjection: LabelResponseProjection): UnlabeledEventResponseProjection = label(null, subProjection)

    fun label(alias: String?, subProjection: LabelResponseProjection): UnlabeledEventResponseProjection {
        fields.add(GraphQLResponseField("label").alias(alias).projection(subProjection))
        return this
    }

    fun labelable(subProjection: LabelableResponseProjection): UnlabeledEventResponseProjection = labelable(null, subProjection)

    fun labelable(alias: String?, subProjection: LabelableResponseProjection): UnlabeledEventResponseProjection {
        fields.add(GraphQLResponseField("labelable").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): UnlabeledEventResponseProjection = typename(null)

    fun typename(alias: String?): UnlabeledEventResponseProjection {
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
        val that = other as UnlabeledEventResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
