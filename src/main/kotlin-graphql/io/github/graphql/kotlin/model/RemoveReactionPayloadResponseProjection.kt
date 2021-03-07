package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for RemoveReactionPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class RemoveReactionPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): RemoveReactionPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): RemoveReactionPayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("RemoveReactionPayloadResponseProjection.ReactionResponseProjection.reaction", 0) <= maxDepth) {
            projectionDepthOnFields["RemoveReactionPayloadResponseProjection.ReactionResponseProjection.reaction"] = projectionDepthOnFields.getOrDefault("RemoveReactionPayloadResponseProjection.ReactionResponseProjection.reaction", 0) + 1
            this.reaction(ReactionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RemoveReactionPayloadResponseProjection.ReactionResponseProjection.reaction", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RemoveReactionPayloadResponseProjection.ReactableResponseProjection.subject", 0) <= maxDepth) {
            projectionDepthOnFields["RemoveReactionPayloadResponseProjection.ReactableResponseProjection.subject"] = projectionDepthOnFields.getOrDefault("RemoveReactionPayloadResponseProjection.ReactableResponseProjection.subject", 0) + 1
            this.subject(ReactableResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RemoveReactionPayloadResponseProjection.ReactableResponseProjection.subject", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): RemoveReactionPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): RemoveReactionPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun reaction(subProjection: ReactionResponseProjection): RemoveReactionPayloadResponseProjection = reaction(null, subProjection)

    fun reaction(alias: String?, subProjection: ReactionResponseProjection): RemoveReactionPayloadResponseProjection {
        fields.add(GraphQLResponseField("reaction").alias(alias).projection(subProjection))
        return this
    }

    fun subject(subProjection: ReactableResponseProjection): RemoveReactionPayloadResponseProjection = subject(null, subProjection)

    fun subject(alias: String?, subProjection: ReactableResponseProjection): RemoveReactionPayloadResponseProjection {
        fields.add(GraphQLResponseField("subject").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): RemoveReactionPayloadResponseProjection = typename(null)

    fun typename(alias: String?): RemoveReactionPayloadResponseProjection {
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
        val that = other as RemoveReactionPayloadResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
