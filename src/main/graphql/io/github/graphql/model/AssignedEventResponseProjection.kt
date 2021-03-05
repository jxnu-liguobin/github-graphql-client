package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for AssignedEvent
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class AssignedEventResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): AssignedEventResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): AssignedEventResponseProjection {
        if (projectionDepthOnFields.getOrDefault("AssignedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields["AssignedEventResponseProjection.ActorResponseProjection.actor"] = projectionDepthOnFields.getOrDefault("AssignedEventResponseProjection.ActorResponseProjection.actor", 0) + 1
            this.actor(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("AssignedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("AssignedEventResponseProjection.AssignableResponseProjection.assignable", 0) <= maxDepth) {
            projectionDepthOnFields["AssignedEventResponseProjection.AssignableResponseProjection.assignable"] = projectionDepthOnFields.getOrDefault("AssignedEventResponseProjection.AssignableResponseProjection.assignable", 0) + 1
            this.assignable(AssignableResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("AssignedEventResponseProjection.AssignableResponseProjection.assignable", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("AssignedEventResponseProjection.AssigneeResponseProjection.assignee", 0) <= maxDepth) {
            projectionDepthOnFields["AssignedEventResponseProjection.AssigneeResponseProjection.assignee"] = projectionDepthOnFields.getOrDefault("AssignedEventResponseProjection.AssigneeResponseProjection.assignee", 0) + 1
            this.assignee(AssigneeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("AssignedEventResponseProjection.AssigneeResponseProjection.assignee", 0)))
        }
        this.createdAt()
        this.id()
        if (projectionDepthOnFields.getOrDefault("AssignedEventResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields["AssignedEventResponseProjection.UserResponseProjection.user"] = projectionDepthOnFields.getOrDefault("AssignedEventResponseProjection.UserResponseProjection.user", 0) + 1
            this.user(UserResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("AssignedEventResponseProjection.UserResponseProjection.user", 0)))
        }
        this.typename()
        return this
    }

    fun actor(subProjection: ActorResponseProjection): AssignedEventResponseProjection = actor(null, subProjection)

    fun actor(alias: String?, subProjection: ActorResponseProjection): AssignedEventResponseProjection {
        fields.add(GraphQLResponseField("actor").alias(alias).projection(subProjection))
        return this
    }

    fun assignable(subProjection: AssignableResponseProjection): AssignedEventResponseProjection = assignable(null, subProjection)

    fun assignable(alias: String?, subProjection: AssignableResponseProjection): AssignedEventResponseProjection {
        fields.add(GraphQLResponseField("assignable").alias(alias).projection(subProjection))
        return this
    }

    fun assignee(subProjection: AssigneeResponseProjection): AssignedEventResponseProjection = assignee(null, subProjection)

    fun assignee(alias: String?, subProjection: AssigneeResponseProjection): AssignedEventResponseProjection {
        fields.add(GraphQLResponseField("assignee").alias(alias).projection(subProjection))
        return this
    }

    fun createdAt(): AssignedEventResponseProjection = createdAt(null)

    fun createdAt(alias: String?): AssignedEventResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun id(): AssignedEventResponseProjection = id(null)

    fun id(alias: String?): AssignedEventResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    @Deprecated(message = "Assignees can now be mannequins. Use the `assignee` field instead. Removal on 2020-01-01 UTC.")
    fun user(subProjection: UserResponseProjection): AssignedEventResponseProjection = user(null, subProjection)

    fun user(alias: String?, subProjection: UserResponseProjection): AssignedEventResponseProjection {
        fields.add(GraphQLResponseField("user").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): AssignedEventResponseProjection = typename(null)

    fun typename(alias: String?): AssignedEventResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
