package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for UnlockedEvent
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class UnlockedEventResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): UnlockedEventResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): UnlockedEventResponseProjection {
        if (projectionDepthOnFields.getOrDefault("UnlockedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields["UnlockedEventResponseProjection.ActorResponseProjection.actor"] = projectionDepthOnFields.getOrDefault("UnlockedEventResponseProjection.ActorResponseProjection.actor", 0) + 1
            this.actor(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UnlockedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.id()
        if (projectionDepthOnFields.getOrDefault("UnlockedEventResponseProjection.LockableResponseProjection.lockable", 0) <= maxDepth) {
            projectionDepthOnFields["UnlockedEventResponseProjection.LockableResponseProjection.lockable"] = projectionDepthOnFields.getOrDefault("UnlockedEventResponseProjection.LockableResponseProjection.lockable", 0) + 1
            this.lockable(LockableResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UnlockedEventResponseProjection.LockableResponseProjection.lockable", 0)))
        }
        this.typename()
        return this
    }

    fun actor(subProjection: ActorResponseProjection): UnlockedEventResponseProjection = actor(null, subProjection)

    fun actor(alias: String?, subProjection: ActorResponseProjection): UnlockedEventResponseProjection {
        fields.add(GraphQLResponseField("actor").alias(alias).projection(subProjection))
        return this
    }

    fun createdAt(): UnlockedEventResponseProjection = createdAt(null)

    fun createdAt(alias: String?): UnlockedEventResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun id(): UnlockedEventResponseProjection = id(null)

    fun id(alias: String?): UnlockedEventResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun lockable(subProjection: LockableResponseProjection): UnlockedEventResponseProjection = lockable(null, subProjection)

    fun lockable(alias: String?, subProjection: LockableResponseProjection): UnlockedEventResponseProjection {
        fields.add(GraphQLResponseField("lockable").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): UnlockedEventResponseProjection = typename(null)

    fun typename(alias: String?): UnlockedEventResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
