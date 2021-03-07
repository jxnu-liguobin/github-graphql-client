package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for LabeledEvent
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class LabeledEventResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): LabeledEventResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): LabeledEventResponseProjection {
        if (projectionDepthOnFields.getOrDefault("LabeledEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields["LabeledEventResponseProjection.ActorResponseProjection.actor"] = projectionDepthOnFields.getOrDefault("LabeledEventResponseProjection.ActorResponseProjection.actor", 0) + 1
            this.actor(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("LabeledEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.id()
        if (projectionDepthOnFields.getOrDefault("LabeledEventResponseProjection.LabelResponseProjection.label", 0) <= maxDepth) {
            projectionDepthOnFields["LabeledEventResponseProjection.LabelResponseProjection.label"] = projectionDepthOnFields.getOrDefault("LabeledEventResponseProjection.LabelResponseProjection.label", 0) + 1
            this.label(LabelResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("LabeledEventResponseProjection.LabelResponseProjection.label", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("LabeledEventResponseProjection.LabelableResponseProjection.labelable", 0) <= maxDepth) {
            projectionDepthOnFields["LabeledEventResponseProjection.LabelableResponseProjection.labelable"] = projectionDepthOnFields.getOrDefault("LabeledEventResponseProjection.LabelableResponseProjection.labelable", 0) + 1
            this.labelable(LabelableResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("LabeledEventResponseProjection.LabelableResponseProjection.labelable", 0)))
        }
        this.typename()
        return this
    }

    fun actor(subProjection: ActorResponseProjection): LabeledEventResponseProjection = actor(null, subProjection)

    fun actor(alias: String?, subProjection: ActorResponseProjection): LabeledEventResponseProjection {
        fields.add(GraphQLResponseField("actor").alias(alias).projection(subProjection))
        return this
    }

    fun createdAt(): LabeledEventResponseProjection = createdAt(null)

    fun createdAt(alias: String?): LabeledEventResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun id(): LabeledEventResponseProjection = id(null)

    fun id(alias: String?): LabeledEventResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun label(subProjection: LabelResponseProjection): LabeledEventResponseProjection = label(null, subProjection)

    fun label(alias: String?, subProjection: LabelResponseProjection): LabeledEventResponseProjection {
        fields.add(GraphQLResponseField("label").alias(alias).projection(subProjection))
        return this
    }

    fun labelable(subProjection: LabelableResponseProjection): LabeledEventResponseProjection = labelable(null, subProjection)

    fun labelable(alias: String?, subProjection: LabelableResponseProjection): LabeledEventResponseProjection {
        fields.add(GraphQLResponseField("labelable").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): LabeledEventResponseProjection = typename(null)

    fun typename(alias: String?): LabeledEventResponseProjection {
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
        val that = other as LabeledEventResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
