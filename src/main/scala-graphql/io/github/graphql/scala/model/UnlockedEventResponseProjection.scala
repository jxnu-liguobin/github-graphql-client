package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for UnlockedEvent
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class UnlockedEventResponseProjection extends GraphQLResponseProjection {

    override def all$(): UnlockedEventResponseProjection = all$(3)

    override def all$(maxDepth: Int): UnlockedEventResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("UnlockedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("UnlockedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("UnlockedEventResponseProjection.ActorResponseProjection.actor", 0) + 1)
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UnlockedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.id()
        if (projectionDepthOnFields.getOrDefault("UnlockedEventResponseProjection.LockableResponseProjection.lockable", 0) <= maxDepth) {
            projectionDepthOnFields.put("UnlockedEventResponseProjection.LockableResponseProjection.lockable", projectionDepthOnFields.getOrDefault("UnlockedEventResponseProjection.LockableResponseProjection.lockable", 0) + 1)
            this.lockable(new LockableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UnlockedEventResponseProjection.LockableResponseProjection.lockable", 0)))
        }
        this.typename()
        this
    }

    def actor(subProjection: ActorResponseProjection): UnlockedEventResponseProjection = {
        actor(null.asInstanceOf[String], subProjection)
    }

    def actor(alias: String, subProjection: ActorResponseProjection): UnlockedEventResponseProjection = {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection))
        this
    }

    def createdAt(): UnlockedEventResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): UnlockedEventResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def id(): UnlockedEventResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): UnlockedEventResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def lockable(subProjection: LockableResponseProjection): UnlockedEventResponseProjection = {
        lockable(null.asInstanceOf[String], subProjection)
    }

    def lockable(alias: String, subProjection: LockableResponseProjection): UnlockedEventResponseProjection = {
        fields.add(new GraphQLResponseField("lockable").alias(alias).projection(subProjection))
        this
    }

    def typename(): UnlockedEventResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): UnlockedEventResponseProjection = {
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
        val that = obj.asInstanceOf[UnlockedEventResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
