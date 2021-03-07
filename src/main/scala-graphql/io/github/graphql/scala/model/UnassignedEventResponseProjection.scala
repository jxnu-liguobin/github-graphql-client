package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for UnassignedEvent
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class UnassignedEventResponseProjection extends GraphQLResponseProjection {

    override def all$(): UnassignedEventResponseProjection = all$(3)

    override def all$(maxDepth: Int): UnassignedEventResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("UnassignedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("UnassignedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("UnassignedEventResponseProjection.ActorResponseProjection.actor", 0) + 1)
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UnassignedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UnassignedEventResponseProjection.AssignableResponseProjection.assignable", 0) <= maxDepth) {
            projectionDepthOnFields.put("UnassignedEventResponseProjection.AssignableResponseProjection.assignable", projectionDepthOnFields.getOrDefault("UnassignedEventResponseProjection.AssignableResponseProjection.assignable", 0) + 1)
            this.assignable(new AssignableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UnassignedEventResponseProjection.AssignableResponseProjection.assignable", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UnassignedEventResponseProjection.AssigneeResponseProjection.assignee", 0) <= maxDepth) {
            projectionDepthOnFields.put("UnassignedEventResponseProjection.AssigneeResponseProjection.assignee", projectionDepthOnFields.getOrDefault("UnassignedEventResponseProjection.AssigneeResponseProjection.assignee", 0) + 1)
            this.assignee(new AssigneeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UnassignedEventResponseProjection.AssigneeResponseProjection.assignee", 0)))
        }
        this.createdAt()
        this.id()
        if (projectionDepthOnFields.getOrDefault("UnassignedEventResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields.put("UnassignedEventResponseProjection.UserResponseProjection.user", projectionDepthOnFields.getOrDefault("UnassignedEventResponseProjection.UserResponseProjection.user", 0) + 1)
            this.user(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UnassignedEventResponseProjection.UserResponseProjection.user", 0)))
        }
        this.typename()
        this
    }

    def actor(subProjection: ActorResponseProjection): UnassignedEventResponseProjection = {
        actor(null.asInstanceOf[String], subProjection)
    }

    def actor(alias: String, subProjection: ActorResponseProjection): UnassignedEventResponseProjection = {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection))
        this
    }

    def assignable(subProjection: AssignableResponseProjection): UnassignedEventResponseProjection = {
        assignable(null.asInstanceOf[String], subProjection)
    }

    def assignable(alias: String, subProjection: AssignableResponseProjection): UnassignedEventResponseProjection = {
        fields.add(new GraphQLResponseField("assignable").alias(alias).projection(subProjection))
        this
    }

    def assignee(subProjection: AssigneeResponseProjection): UnassignedEventResponseProjection = {
        assignee(null.asInstanceOf[String], subProjection)
    }

    def assignee(alias: String, subProjection: AssigneeResponseProjection): UnassignedEventResponseProjection = {
        fields.add(new GraphQLResponseField("assignee").alias(alias).projection(subProjection))
        this
    }

    def createdAt(): UnassignedEventResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): UnassignedEventResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def id(): UnassignedEventResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): UnassignedEventResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    @deprecated(message = "Assignees can now be mannequins. Use the `assignee` field instead. Removal on 2020-01-01 UTC.")
    def user(subProjection: UserResponseProjection): UnassignedEventResponseProjection = {
        user(null.asInstanceOf[String], subProjection)
    }

    def user(alias: String, subProjection: UserResponseProjection): UnassignedEventResponseProjection = {
        fields.add(new GraphQLResponseField("user").alias(alias).projection(subProjection))
        this
    }

    def typename(): UnassignedEventResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): UnassignedEventResponseProjection = {
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
        val that = obj.asInstanceOf[UnassignedEventResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
