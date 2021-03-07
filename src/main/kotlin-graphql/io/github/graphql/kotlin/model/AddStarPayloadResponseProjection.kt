package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for AddStarPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as AddStarPayloadResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
