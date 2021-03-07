package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for AddLabelsToLabelablePayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class AddLabelsToLabelablePayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): AddLabelsToLabelablePayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): AddLabelsToLabelablePayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("AddLabelsToLabelablePayloadResponseProjection.LabelableResponseProjection.labelable", 0) <= maxDepth) {
            projectionDepthOnFields["AddLabelsToLabelablePayloadResponseProjection.LabelableResponseProjection.labelable"] = projectionDepthOnFields.getOrDefault("AddLabelsToLabelablePayloadResponseProjection.LabelableResponseProjection.labelable", 0) + 1
            this.labelable(LabelableResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("AddLabelsToLabelablePayloadResponseProjection.LabelableResponseProjection.labelable", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): AddLabelsToLabelablePayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): AddLabelsToLabelablePayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun labelable(subProjection: LabelableResponseProjection): AddLabelsToLabelablePayloadResponseProjection = labelable(null, subProjection)

    fun labelable(alias: String?, subProjection: LabelableResponseProjection): AddLabelsToLabelablePayloadResponseProjection {
        fields.add(GraphQLResponseField("labelable").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): AddLabelsToLabelablePayloadResponseProjection = typename(null)

    fun typename(alias: String?): AddLabelsToLabelablePayloadResponseProjection {
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
        val that = other as AddLabelsToLabelablePayloadResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
