package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RemoveLabelsFromLabelablePayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class RemoveLabelsFromLabelablePayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): RemoveLabelsFromLabelablePayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): RemoveLabelsFromLabelablePayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("RemoveLabelsFromLabelablePayloadResponseProjection.LabelableResponseProjection.labelable", 0) <= maxDepth) {
            projectionDepthOnFields["RemoveLabelsFromLabelablePayloadResponseProjection.LabelableResponseProjection.labelable"] = projectionDepthOnFields.getOrDefault("RemoveLabelsFromLabelablePayloadResponseProjection.LabelableResponseProjection.labelable", 0) + 1
            this.labelable(LabelableResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RemoveLabelsFromLabelablePayloadResponseProjection.LabelableResponseProjection.labelable", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): RemoveLabelsFromLabelablePayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): RemoveLabelsFromLabelablePayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun labelable(subProjection: LabelableResponseProjection): RemoveLabelsFromLabelablePayloadResponseProjection = labelable(null, subProjection)

    fun labelable(alias: String?, subProjection: LabelableResponseProjection): RemoveLabelsFromLabelablePayloadResponseProjection {
        fields.add(GraphQLResponseField("labelable").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): RemoveLabelsFromLabelablePayloadResponseProjection = typename(null)

    fun typename(alias: String?): RemoveLabelsFromLabelablePayloadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
