package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for RemoveStarPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as RemoveStarPayloadResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
