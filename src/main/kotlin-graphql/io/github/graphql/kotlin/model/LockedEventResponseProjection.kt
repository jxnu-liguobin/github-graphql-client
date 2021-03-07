package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for LockedEvent
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class LockedEventResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): LockedEventResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): LockedEventResponseProjection {
        if (projectionDepthOnFields.getOrDefault("LockedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields["LockedEventResponseProjection.ActorResponseProjection.actor"] = projectionDepthOnFields.getOrDefault("LockedEventResponseProjection.ActorResponseProjection.actor", 0) + 1
            this.actor(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("LockedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.id()
        this.lockReason()
        if (projectionDepthOnFields.getOrDefault("LockedEventResponseProjection.LockableResponseProjection.lockable", 0) <= maxDepth) {
            projectionDepthOnFields["LockedEventResponseProjection.LockableResponseProjection.lockable"] = projectionDepthOnFields.getOrDefault("LockedEventResponseProjection.LockableResponseProjection.lockable", 0) + 1
            this.lockable(LockableResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("LockedEventResponseProjection.LockableResponseProjection.lockable", 0)))
        }
        this.typename()
        return this
    }

    fun actor(subProjection: ActorResponseProjection): LockedEventResponseProjection = actor(null, subProjection)

    fun actor(alias: String?, subProjection: ActorResponseProjection): LockedEventResponseProjection {
        fields.add(GraphQLResponseField("actor").alias(alias).projection(subProjection))
        return this
    }

    fun createdAt(): LockedEventResponseProjection = createdAt(null)

    fun createdAt(alias: String?): LockedEventResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun id(): LockedEventResponseProjection = id(null)

    fun id(alias: String?): LockedEventResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun lockReason(): LockedEventResponseProjection = lockReason(null)

    fun lockReason(alias: String?): LockedEventResponseProjection {
        fields.add(GraphQLResponseField("lockReason").alias(alias))
        return this
    }

    fun lockable(subProjection: LockableResponseProjection): LockedEventResponseProjection = lockable(null, subProjection)

    fun lockable(alias: String?, subProjection: LockableResponseProjection): LockedEventResponseProjection {
        fields.add(GraphQLResponseField("lockable").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): LockedEventResponseProjection = typename(null)

    fun typename(alias: String?): LockedEventResponseProjection {
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
        val that = other as LockedEventResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
