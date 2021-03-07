package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for AddReactionPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class AddReactionPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): AddReactionPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): AddReactionPayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("AddReactionPayloadResponseProjection.ReactionResponseProjection.reaction", 0) <= maxDepth) {
            projectionDepthOnFields["AddReactionPayloadResponseProjection.ReactionResponseProjection.reaction"] = projectionDepthOnFields.getOrDefault("AddReactionPayloadResponseProjection.ReactionResponseProjection.reaction", 0) + 1
            this.reaction(ReactionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("AddReactionPayloadResponseProjection.ReactionResponseProjection.reaction", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("AddReactionPayloadResponseProjection.ReactableResponseProjection.subject", 0) <= maxDepth) {
            projectionDepthOnFields["AddReactionPayloadResponseProjection.ReactableResponseProjection.subject"] = projectionDepthOnFields.getOrDefault("AddReactionPayloadResponseProjection.ReactableResponseProjection.subject", 0) + 1
            this.subject(ReactableResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("AddReactionPayloadResponseProjection.ReactableResponseProjection.subject", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): AddReactionPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): AddReactionPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun reaction(subProjection: ReactionResponseProjection): AddReactionPayloadResponseProjection = reaction(null, subProjection)

    fun reaction(alias: String?, subProjection: ReactionResponseProjection): AddReactionPayloadResponseProjection {
        fields.add(GraphQLResponseField("reaction").alias(alias).projection(subProjection))
        return this
    }

    fun subject(subProjection: ReactableResponseProjection): AddReactionPayloadResponseProjection = subject(null, subProjection)

    fun subject(alias: String?, subProjection: ReactableResponseProjection): AddReactionPayloadResponseProjection {
        fields.add(GraphQLResponseField("subject").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): AddReactionPayloadResponseProjection = typename(null)

    fun typename(alias: String?): AddReactionPayloadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
