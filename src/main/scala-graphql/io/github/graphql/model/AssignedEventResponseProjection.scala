package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for AssignedEvent
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class AssignedEventResponseProjection extends GraphQLResponseProjection {

    override def all$(): AssignedEventResponseProjection = all$(3)

    override def all$(maxDepth: Int): AssignedEventResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("AssignedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("AssignedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("AssignedEventResponseProjection.ActorResponseProjection.actor", 0) + 1)
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AssignedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("AssignedEventResponseProjection.AssignableResponseProjection.assignable", 0) <= maxDepth) {
            projectionDepthOnFields.put("AssignedEventResponseProjection.AssignableResponseProjection.assignable", projectionDepthOnFields.getOrDefault("AssignedEventResponseProjection.AssignableResponseProjection.assignable", 0) + 1)
            this.assignable(new AssignableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AssignedEventResponseProjection.AssignableResponseProjection.assignable", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("AssignedEventResponseProjection.AssigneeResponseProjection.assignee", 0) <= maxDepth) {
            projectionDepthOnFields.put("AssignedEventResponseProjection.AssigneeResponseProjection.assignee", projectionDepthOnFields.getOrDefault("AssignedEventResponseProjection.AssigneeResponseProjection.assignee", 0) + 1)
            this.assignee(new AssigneeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AssignedEventResponseProjection.AssigneeResponseProjection.assignee", 0)))
        }
        this.createdAt()
        this.id()
        if (projectionDepthOnFields.getOrDefault("AssignedEventResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields.put("AssignedEventResponseProjection.UserResponseProjection.user", projectionDepthOnFields.getOrDefault("AssignedEventResponseProjection.UserResponseProjection.user", 0) + 1)
            this.user(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AssignedEventResponseProjection.UserResponseProjection.user", 0)))
        }
        this.typename()
        this
    }

    def actor(subProjection: ActorResponseProjection): AssignedEventResponseProjection = {
        actor(null.asInstanceOf[String], subProjection)
    }

    def actor(alias: String, subProjection: ActorResponseProjection): AssignedEventResponseProjection = {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection))
        this
    }

    def assignable(subProjection: AssignableResponseProjection): AssignedEventResponseProjection = {
        assignable(null.asInstanceOf[String], subProjection)
    }

    def assignable(alias: String, subProjection: AssignableResponseProjection): AssignedEventResponseProjection = {
        fields.add(new GraphQLResponseField("assignable").alias(alias).projection(subProjection))
        this
    }

    def assignee(subProjection: AssigneeResponseProjection): AssignedEventResponseProjection = {
        assignee(null.asInstanceOf[String], subProjection)
    }

    def assignee(alias: String, subProjection: AssigneeResponseProjection): AssignedEventResponseProjection = {
        fields.add(new GraphQLResponseField("assignee").alias(alias).projection(subProjection))
        this
    }

    def createdAt(): AssignedEventResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): AssignedEventResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def id(): AssignedEventResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): AssignedEventResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    @deprecated(message = "Assignees can now be mannequins. Use the `assignee` field instead. Removal on 2020-01-01 UTC.")
    def user(subProjection: UserResponseProjection): AssignedEventResponseProjection = {
        user(null.asInstanceOf[String], subProjection)
    }

    def user(alias: String, subProjection: UserResponseProjection): AssignedEventResponseProjection = {
        fields.add(new GraphQLResponseField("user").alias(alias).projection(subProjection))
        this
    }

    def typename(): AssignedEventResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): AssignedEventResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
