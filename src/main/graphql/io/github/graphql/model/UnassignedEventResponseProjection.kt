package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for UnassignedEvent
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class UnassignedEventResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): UnassignedEventResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): UnassignedEventResponseProjection {
        if (projectionDepthOnFields.getOrDefault("UnassignedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields["UnassignedEventResponseProjection.ActorResponseProjection.actor"] = projectionDepthOnFields.getOrDefault("UnassignedEventResponseProjection.ActorResponseProjection.actor", 0) + 1
            this.actor(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UnassignedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UnassignedEventResponseProjection.AssignableResponseProjection.assignable", 0) <= maxDepth) {
            projectionDepthOnFields["UnassignedEventResponseProjection.AssignableResponseProjection.assignable"] = projectionDepthOnFields.getOrDefault("UnassignedEventResponseProjection.AssignableResponseProjection.assignable", 0) + 1
            this.assignable(AssignableResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UnassignedEventResponseProjection.AssignableResponseProjection.assignable", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UnassignedEventResponseProjection.AssigneeResponseProjection.assignee", 0) <= maxDepth) {
            projectionDepthOnFields["UnassignedEventResponseProjection.AssigneeResponseProjection.assignee"] = projectionDepthOnFields.getOrDefault("UnassignedEventResponseProjection.AssigneeResponseProjection.assignee", 0) + 1
            this.assignee(AssigneeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UnassignedEventResponseProjection.AssigneeResponseProjection.assignee", 0)))
        }
        this.createdAt()
        this.id()
        if (projectionDepthOnFields.getOrDefault("UnassignedEventResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields["UnassignedEventResponseProjection.UserResponseProjection.user"] = projectionDepthOnFields.getOrDefault("UnassignedEventResponseProjection.UserResponseProjection.user", 0) + 1
            this.user(UserResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UnassignedEventResponseProjection.UserResponseProjection.user", 0)))
        }
        this.typename()
        return this
    }

    fun actor(subProjection: ActorResponseProjection): UnassignedEventResponseProjection = actor(null, subProjection)

    fun actor(alias: String?, subProjection: ActorResponseProjection): UnassignedEventResponseProjection {
        fields.add(GraphQLResponseField("actor").alias(alias).projection(subProjection))
        return this
    }

    fun assignable(subProjection: AssignableResponseProjection): UnassignedEventResponseProjection = assignable(null, subProjection)

    fun assignable(alias: String?, subProjection: AssignableResponseProjection): UnassignedEventResponseProjection {
        fields.add(GraphQLResponseField("assignable").alias(alias).projection(subProjection))
        return this
    }

    fun assignee(subProjection: AssigneeResponseProjection): UnassignedEventResponseProjection = assignee(null, subProjection)

    fun assignee(alias: String?, subProjection: AssigneeResponseProjection): UnassignedEventResponseProjection {
        fields.add(GraphQLResponseField("assignee").alias(alias).projection(subProjection))
        return this
    }

    fun createdAt(): UnassignedEventResponseProjection = createdAt(null)

    fun createdAt(alias: String?): UnassignedEventResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun id(): UnassignedEventResponseProjection = id(null)

    fun id(alias: String?): UnassignedEventResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    @Deprecated(message = "Assignees can now be mannequins. Use the `assignee` field instead. Removal on 2020-01-01 UTC.")
    fun user(subProjection: UserResponseProjection): UnassignedEventResponseProjection = user(null, subProjection)

    fun user(alias: String?, subProjection: UserResponseProjection): UnassignedEventResponseProjection {
        fields.add(GraphQLResponseField("user").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): UnassignedEventResponseProjection = typename(null)

    fun typename(alias: String?): UnassignedEventResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
