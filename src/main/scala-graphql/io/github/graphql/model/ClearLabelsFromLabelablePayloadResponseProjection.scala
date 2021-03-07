package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ClearLabelsFromLabelablePayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class ClearLabelsFromLabelablePayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): ClearLabelsFromLabelablePayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): ClearLabelsFromLabelablePayloadResponseProjection = {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("ClearLabelsFromLabelablePayloadResponseProjection.LabelableResponseProjection.labelable", 0) <= maxDepth) {
            projectionDepthOnFields.put("ClearLabelsFromLabelablePayloadResponseProjection.LabelableResponseProjection.labelable", projectionDepthOnFields.getOrDefault("ClearLabelsFromLabelablePayloadResponseProjection.LabelableResponseProjection.labelable", 0) + 1)
            this.labelable(new LabelableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ClearLabelsFromLabelablePayloadResponseProjection.LabelableResponseProjection.labelable", 0)))
        }
        this.typename()
        this
    }

    def clientMutationId(): ClearLabelsFromLabelablePayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): ClearLabelsFromLabelablePayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def labelable(subProjection: LabelableResponseProjection): ClearLabelsFromLabelablePayloadResponseProjection = {
        labelable(null.asInstanceOf[String], subProjection)
    }

    def labelable(alias: String, subProjection: LabelableResponseProjection): ClearLabelsFromLabelablePayloadResponseProjection = {
        fields.add(new GraphQLResponseField("labelable").alias(alias).projection(subProjection))
        this
    }

    def typename(): ClearLabelsFromLabelablePayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ClearLabelsFromLabelablePayloadResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
