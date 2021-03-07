package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CrossReferencedEvent
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class CrossReferencedEventResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): CrossReferencedEventResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): CrossReferencedEventResponseProjection {
        if (projectionDepthOnFields.getOrDefault("CrossReferencedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields["CrossReferencedEventResponseProjection.ActorResponseProjection.actor"] = projectionDepthOnFields.getOrDefault("CrossReferencedEventResponseProjection.ActorResponseProjection.actor", 0) + 1
            this.actor(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CrossReferencedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.id()
        this.isCrossRepository()
        this.referencedAt()
        this.resourcePath()
        if (projectionDepthOnFields.getOrDefault("CrossReferencedEventResponseProjection.ReferencedSubjectResponseProjection.source", 0) <= maxDepth) {
            projectionDepthOnFields["CrossReferencedEventResponseProjection.ReferencedSubjectResponseProjection.source"] = projectionDepthOnFields.getOrDefault("CrossReferencedEventResponseProjection.ReferencedSubjectResponseProjection.source", 0) + 1
            this.source(ReferencedSubjectResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CrossReferencedEventResponseProjection.ReferencedSubjectResponseProjection.source", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CrossReferencedEventResponseProjection.ReferencedSubjectResponseProjection.target", 0) <= maxDepth) {
            projectionDepthOnFields["CrossReferencedEventResponseProjection.ReferencedSubjectResponseProjection.target"] = projectionDepthOnFields.getOrDefault("CrossReferencedEventResponseProjection.ReferencedSubjectResponseProjection.target", 0) + 1
            this.target(ReferencedSubjectResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CrossReferencedEventResponseProjection.ReferencedSubjectResponseProjection.target", 0)))
        }
        this.url()
        this.willCloseTarget()
        this.typename()
        return this
    }

    fun actor(subProjection: ActorResponseProjection): CrossReferencedEventResponseProjection = actor(null, subProjection)

    fun actor(alias: String?, subProjection: ActorResponseProjection): CrossReferencedEventResponseProjection {
        fields.add(GraphQLResponseField("actor").alias(alias).projection(subProjection))
        return this
    }

    fun createdAt(): CrossReferencedEventResponseProjection = createdAt(null)

    fun createdAt(alias: String?): CrossReferencedEventResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun id(): CrossReferencedEventResponseProjection = id(null)

    fun id(alias: String?): CrossReferencedEventResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun isCrossRepository(): CrossReferencedEventResponseProjection = isCrossRepository(null)

    fun isCrossRepository(alias: String?): CrossReferencedEventResponseProjection {
        fields.add(GraphQLResponseField("isCrossRepository").alias(alias))
        return this
    }

    fun referencedAt(): CrossReferencedEventResponseProjection = referencedAt(null)

    fun referencedAt(alias: String?): CrossReferencedEventResponseProjection {
        fields.add(GraphQLResponseField("referencedAt").alias(alias))
        return this
    }

    fun resourcePath(): CrossReferencedEventResponseProjection = resourcePath(null)

    fun resourcePath(alias: String?): CrossReferencedEventResponseProjection {
        fields.add(GraphQLResponseField("resourcePath").alias(alias))
        return this
    }

    fun source(subProjection: ReferencedSubjectResponseProjection): CrossReferencedEventResponseProjection = source(null, subProjection)

    fun source(alias: String?, subProjection: ReferencedSubjectResponseProjection): CrossReferencedEventResponseProjection {
        fields.add(GraphQLResponseField("source").alias(alias).projection(subProjection))
        return this
    }

    fun target(subProjection: ReferencedSubjectResponseProjection): CrossReferencedEventResponseProjection = target(null, subProjection)

    fun target(alias: String?, subProjection: ReferencedSubjectResponseProjection): CrossReferencedEventResponseProjection {
        fields.add(GraphQLResponseField("target").alias(alias).projection(subProjection))
        return this
    }

    fun url(): CrossReferencedEventResponseProjection = url(null)

    fun url(alias: String?): CrossReferencedEventResponseProjection {
        fields.add(GraphQLResponseField("url").alias(alias))
        return this
    }

    fun willCloseTarget(): CrossReferencedEventResponseProjection = willCloseTarget(null)

    fun willCloseTarget(alias: String?): CrossReferencedEventResponseProjection {
        fields.add(GraphQLResponseField("willCloseTarget").alias(alias))
        return this
    }

    fun typename(): CrossReferencedEventResponseProjection = typename(null)

    fun typename(alias: String?): CrossReferencedEventResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
