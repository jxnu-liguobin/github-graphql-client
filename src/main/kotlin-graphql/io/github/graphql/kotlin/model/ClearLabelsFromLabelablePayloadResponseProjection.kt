package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for ClearLabelsFromLabelablePayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class ClearLabelsFromLabelablePayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ClearLabelsFromLabelablePayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ClearLabelsFromLabelablePayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("ClearLabelsFromLabelablePayloadResponseProjection.LabelableResponseProjection.labelable", 0) <= maxDepth) {
            projectionDepthOnFields["ClearLabelsFromLabelablePayloadResponseProjection.LabelableResponseProjection.labelable"] = projectionDepthOnFields.getOrDefault("ClearLabelsFromLabelablePayloadResponseProjection.LabelableResponseProjection.labelable", 0) + 1
            this.labelable(LabelableResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ClearLabelsFromLabelablePayloadResponseProjection.LabelableResponseProjection.labelable", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): ClearLabelsFromLabelablePayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): ClearLabelsFromLabelablePayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun labelable(subProjection: LabelableResponseProjection): ClearLabelsFromLabelablePayloadResponseProjection = labelable(null, subProjection)

    fun labelable(alias: String?, subProjection: LabelableResponseProjection): ClearLabelsFromLabelablePayloadResponseProjection {
        fields.add(GraphQLResponseField("labelable").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): ClearLabelsFromLabelablePayloadResponseProjection = typename(null)

    fun typename(alias: String?): ClearLabelsFromLabelablePayloadResponseProjection {
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
        val that = other as ClearLabelsFromLabelablePayloadResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
