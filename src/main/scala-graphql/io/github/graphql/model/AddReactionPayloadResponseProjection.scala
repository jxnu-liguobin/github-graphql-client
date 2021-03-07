package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for AddReactionPayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class AddReactionPayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): AddReactionPayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): AddReactionPayloadResponseProjection = {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("AddReactionPayloadResponseProjection.ReactionResponseProjection.reaction", 0) <= maxDepth) {
            projectionDepthOnFields.put("AddReactionPayloadResponseProjection.ReactionResponseProjection.reaction", projectionDepthOnFields.getOrDefault("AddReactionPayloadResponseProjection.ReactionResponseProjection.reaction", 0) + 1)
            this.reaction(new ReactionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AddReactionPayloadResponseProjection.ReactionResponseProjection.reaction", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("AddReactionPayloadResponseProjection.ReactableResponseProjection.subject", 0) <= maxDepth) {
            projectionDepthOnFields.put("AddReactionPayloadResponseProjection.ReactableResponseProjection.subject", projectionDepthOnFields.getOrDefault("AddReactionPayloadResponseProjection.ReactableResponseProjection.subject", 0) + 1)
            this.subject(new ReactableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AddReactionPayloadResponseProjection.ReactableResponseProjection.subject", 0)))
        }
        this.typename()
        this
    }

    def clientMutationId(): AddReactionPayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): AddReactionPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def reaction(subProjection: ReactionResponseProjection): AddReactionPayloadResponseProjection = {
        reaction(null.asInstanceOf[String], subProjection)
    }

    def reaction(alias: String, subProjection: ReactionResponseProjection): AddReactionPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("reaction").alias(alias).projection(subProjection))
        this
    }

    def subject(subProjection: ReactableResponseProjection): AddReactionPayloadResponseProjection = {
        subject(null.asInstanceOf[String], subProjection)
    }

    def subject(alias: String, subProjection: ReactableResponseProjection): AddReactionPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("subject").alias(alias).projection(subProjection))
        this
    }

    def typename(): AddReactionPayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): AddReactionPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
