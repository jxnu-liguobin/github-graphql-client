package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for AddStarPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class AddStarPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): AddStarPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): AddStarPayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("AddStarPayloadResponseProjection.StarrableResponseProjection.starrable", 0) <= maxDepth) {
            projectionDepthOnFields["AddStarPayloadResponseProjection.StarrableResponseProjection.starrable"] = projectionDepthOnFields.getOrDefault("AddStarPayloadResponseProjection.StarrableResponseProjection.starrable", 0) + 1
            this.starrable(StarrableResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("AddStarPayloadResponseProjection.StarrableResponseProjection.starrable", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): AddStarPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): AddStarPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun starrable(subProjection: StarrableResponseProjection): AddStarPayloadResponseProjection = starrable(null, subProjection)

    fun starrable(alias: String?, subProjection: StarrableResponseProjection): AddStarPayloadResponseProjection {
        fields.add(GraphQLResponseField("starrable").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): AddStarPayloadResponseProjection = typename(null)

    fun typename(alias: String?): AddStarPayloadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
