package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ReferencedEvent
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class ReferencedEventResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ReferencedEventResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ReferencedEventResponseProjection {
        if (projectionDepthOnFields.getOrDefault("ReferencedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields["ReferencedEventResponseProjection.ActorResponseProjection.actor"] = projectionDepthOnFields.getOrDefault("ReferencedEventResponseProjection.ActorResponseProjection.actor", 0) + 1
            this.actor(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReferencedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ReferencedEventResponseProjection.CommitResponseProjection.commit", 0) <= maxDepth) {
            projectionDepthOnFields["ReferencedEventResponseProjection.CommitResponseProjection.commit"] = projectionDepthOnFields.getOrDefault("ReferencedEventResponseProjection.CommitResponseProjection.commit", 0) + 1
            this.commit(CommitResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReferencedEventResponseProjection.CommitResponseProjection.commit", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ReferencedEventResponseProjection.RepositoryResponseProjection.commitRepository", 0) <= maxDepth) {
            projectionDepthOnFields["ReferencedEventResponseProjection.RepositoryResponseProjection.commitRepository"] = projectionDepthOnFields.getOrDefault("ReferencedEventResponseProjection.RepositoryResponseProjection.commitRepository", 0) + 1
            this.commitRepository(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReferencedEventResponseProjection.RepositoryResponseProjection.commitRepository", 0)))
        }
        this.createdAt()
        this.id()
        this.isCrossRepository()
        this.isDirectReference()
        if (projectionDepthOnFields.getOrDefault("ReferencedEventResponseProjection.ReferencedSubjectResponseProjection.subject", 0) <= maxDepth) {
            projectionDepthOnFields["ReferencedEventResponseProjection.ReferencedSubjectResponseProjection.subject"] = projectionDepthOnFields.getOrDefault("ReferencedEventResponseProjection.ReferencedSubjectResponseProjection.subject", 0) + 1
            this.subject(ReferencedSubjectResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReferencedEventResponseProjection.ReferencedSubjectResponseProjection.subject", 0)))
        }
        this.typename()
        return this
    }

    fun actor(subProjection: ActorResponseProjection): ReferencedEventResponseProjection = actor(null, subProjection)

    fun actor(alias: String?, subProjection: ActorResponseProjection): ReferencedEventResponseProjection {
        fields.add(GraphQLResponseField("actor").alias(alias).projection(subProjection))
        return this
    }

    fun commit(subProjection: CommitResponseProjection): ReferencedEventResponseProjection = commit(null, subProjection)

    fun commit(alias: String?, subProjection: CommitResponseProjection): ReferencedEventResponseProjection {
        fields.add(GraphQLResponseField("commit").alias(alias).projection(subProjection))
        return this
    }

    fun commitRepository(subProjection: RepositoryResponseProjection): ReferencedEventResponseProjection = commitRepository(null, subProjection)

    fun commitRepository(alias: String?, subProjection: RepositoryResponseProjection): ReferencedEventResponseProjection {
        fields.add(GraphQLResponseField("commitRepository").alias(alias).projection(subProjection))
        return this
    }

    fun createdAt(): ReferencedEventResponseProjection = createdAt(null)

    fun createdAt(alias: String?): ReferencedEventResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun id(): ReferencedEventResponseProjection = id(null)

    fun id(alias: String?): ReferencedEventResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun isCrossRepository(): ReferencedEventResponseProjection = isCrossRepository(null)

    fun isCrossRepository(alias: String?): ReferencedEventResponseProjection {
        fields.add(GraphQLResponseField("isCrossRepository").alias(alias))
        return this
    }

    fun isDirectReference(): ReferencedEventResponseProjection = isDirectReference(null)

    fun isDirectReference(alias: String?): ReferencedEventResponseProjection {
        fields.add(GraphQLResponseField("isDirectReference").alias(alias))
        return this
    }

    fun subject(subProjection: ReferencedSubjectResponseProjection): ReferencedEventResponseProjection = subject(null, subProjection)

    fun subject(alias: String?, subProjection: ReferencedSubjectResponseProjection): ReferencedEventResponseProjection {
        fields.add(GraphQLResponseField("subject").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): ReferencedEventResponseProjection = typename(null)

    fun typename(alias: String?): ReferencedEventResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
