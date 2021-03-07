package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for LockedEvent
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class LockedEventResponseProjection extends GraphQLResponseProjection {

    override def all$(): LockedEventResponseProjection = all$(3)

    override def all$(maxDepth: Int): LockedEventResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("LockedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("LockedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("LockedEventResponseProjection.ActorResponseProjection.actor", 0) + 1)
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LockedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.id()
        this.lockReason()
        if (projectionDepthOnFields.getOrDefault("LockedEventResponseProjection.LockableResponseProjection.lockable", 0) <= maxDepth) {
            projectionDepthOnFields.put("LockedEventResponseProjection.LockableResponseProjection.lockable", projectionDepthOnFields.getOrDefault("LockedEventResponseProjection.LockableResponseProjection.lockable", 0) + 1)
            this.lockable(new LockableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LockedEventResponseProjection.LockableResponseProjection.lockable", 0)))
        }
        this.typename()
        this
    }

    def actor(subProjection: ActorResponseProjection): LockedEventResponseProjection = {
        actor(null.asInstanceOf[String], subProjection)
    }

    def actor(alias: String, subProjection: ActorResponseProjection): LockedEventResponseProjection = {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection))
        this
    }

    def createdAt(): LockedEventResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): LockedEventResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def id(): LockedEventResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): LockedEventResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def lockReason(): LockedEventResponseProjection = {
        lockReason(null.asInstanceOf[String])
    }

    def lockReason(alias: String): LockedEventResponseProjection = {
        fields.add(new GraphQLResponseField("lockReason").alias(alias))
        this
    }

    def lockable(subProjection: LockableResponseProjection): LockedEventResponseProjection = {
        lockable(null.asInstanceOf[String], subProjection)
    }

    def lockable(alias: String, subProjection: LockableResponseProjection): LockedEventResponseProjection = {
        fields.add(new GraphQLResponseField("lockable").alias(alias).projection(subProjection))
        this
    }

    def typename(): LockedEventResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): LockedEventResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[LockedEventResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
