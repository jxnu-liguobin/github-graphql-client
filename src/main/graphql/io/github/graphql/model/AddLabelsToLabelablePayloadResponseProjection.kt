package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for AddLabelsToLabelablePayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
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


}
