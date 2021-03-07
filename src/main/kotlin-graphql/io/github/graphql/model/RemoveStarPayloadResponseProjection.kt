package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RemoveStarPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class RemoveStarPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): RemoveStarPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): RemoveStarPayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("RemoveStarPayloadResponseProjection.StarrableResponseProjection.starrable", 0) <= maxDepth) {
            projectionDepthOnFields["RemoveStarPayloadResponseProjection.StarrableResponseProjection.starrable"] = projectionDepthOnFields.getOrDefault("RemoveStarPayloadResponseProjection.StarrableResponseProjection.starrable", 0) + 1
            this.starrable(StarrableResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RemoveStarPayloadResponseProjection.StarrableResponseProjection.starrable", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): RemoveStarPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): RemoveStarPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun starrable(subProjection: StarrableResponseProjection): RemoveStarPayloadResponseProjection = starrable(null, subProjection)

    fun starrable(alias: String?, subProjection: StarrableResponseProjection): RemoveStarPayloadResponseProjection {
        fields.add(GraphQLResponseField("starrable").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): RemoveStarPayloadResponseProjection = typename(null)

    fun typename(alias: String?): RemoveStarPayloadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
