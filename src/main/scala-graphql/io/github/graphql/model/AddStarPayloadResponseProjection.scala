package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for AddStarPayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class AddStarPayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): AddStarPayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): AddStarPayloadResponseProjection = {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("AddStarPayloadResponseProjection.StarrableResponseProjection.starrable", 0) <= maxDepth) {
            projectionDepthOnFields.put("AddStarPayloadResponseProjection.StarrableResponseProjection.starrable", projectionDepthOnFields.getOrDefault("AddStarPayloadResponseProjection.StarrableResponseProjection.starrable", 0) + 1)
            this.starrable(new StarrableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AddStarPayloadResponseProjection.StarrableResponseProjection.starrable", 0)))
        }
        this.typename()
        this
    }

    def clientMutationId(): AddStarPayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): AddStarPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def starrable(subProjection: StarrableResponseProjection): AddStarPayloadResponseProjection = {
        starrable(null.asInstanceOf[String], subProjection)
    }

    def starrable(alias: String, subProjection: StarrableResponseProjection): AddStarPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("starrable").alias(alias).projection(subProjection))
        this
    }

    def typename(): AddStarPayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): AddStarPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
