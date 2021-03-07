package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for CreateRefPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class CreateRefPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): CreateRefPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): CreateRefPayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("CreateRefPayloadResponseProjection.RefResponseProjection.ref", 0) <= maxDepth) {
            projectionDepthOnFields["CreateRefPayloadResponseProjection.RefResponseProjection.ref"] = projectionDepthOnFields.getOrDefault("CreateRefPayloadResponseProjection.RefResponseProjection.ref", 0) + 1
            this.ref(RefResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CreateRefPayloadResponseProjection.RefResponseProjection.ref", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): CreateRefPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): CreateRefPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun ref(subProjection: RefResponseProjection): CreateRefPayloadResponseProjection = ref(null, subProjection)

    fun ref(alias: String?, subProjection: RefResponseProjection): CreateRefPayloadResponseProjection {
        fields.add(GraphQLResponseField("ref").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): CreateRefPayloadResponseProjection = typename(null)

    fun typename(alias: String?): CreateRefPayloadResponseProjection {
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
        val that = other as CreateRefPayloadResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
