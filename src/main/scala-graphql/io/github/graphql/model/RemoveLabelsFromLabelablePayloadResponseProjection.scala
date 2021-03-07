package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RemoveLabelsFromLabelablePayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class RemoveLabelsFromLabelablePayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): RemoveLabelsFromLabelablePayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): RemoveLabelsFromLabelablePayloadResponseProjection = {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("RemoveLabelsFromLabelablePayloadResponseProjection.LabelableResponseProjection.labelable", 0) <= maxDepth) {
            projectionDepthOnFields.put("RemoveLabelsFromLabelablePayloadResponseProjection.LabelableResponseProjection.labelable", projectionDepthOnFields.getOrDefault("RemoveLabelsFromLabelablePayloadResponseProjection.LabelableResponseProjection.labelable", 0) + 1)
            this.labelable(new LabelableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RemoveLabelsFromLabelablePayloadResponseProjection.LabelableResponseProjection.labelable", 0)))
        }
        this.typename()
        this
    }

    def clientMutationId(): RemoveLabelsFromLabelablePayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): RemoveLabelsFromLabelablePayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def labelable(subProjection: LabelableResponseProjection): RemoveLabelsFromLabelablePayloadResponseProjection = {
        labelable(null.asInstanceOf[String], subProjection)
    }

    def labelable(alias: String, subProjection: LabelableResponseProjection): RemoveLabelsFromLabelablePayloadResponseProjection = {
        fields.add(new GraphQLResponseField("labelable").alias(alias).projection(subProjection))
        this
    }

    def typename(): RemoveLabelsFromLabelablePayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): RemoveLabelsFromLabelablePayloadResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
