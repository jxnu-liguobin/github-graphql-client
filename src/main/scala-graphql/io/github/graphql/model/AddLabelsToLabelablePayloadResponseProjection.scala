package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for AddLabelsToLabelablePayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class AddLabelsToLabelablePayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): AddLabelsToLabelablePayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): AddLabelsToLabelablePayloadResponseProjection = {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("AddLabelsToLabelablePayloadResponseProjection.LabelableResponseProjection.labelable", 0) <= maxDepth) {
            projectionDepthOnFields.put("AddLabelsToLabelablePayloadResponseProjection.LabelableResponseProjection.labelable", projectionDepthOnFields.getOrDefault("AddLabelsToLabelablePayloadResponseProjection.LabelableResponseProjection.labelable", 0) + 1)
            this.labelable(new LabelableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AddLabelsToLabelablePayloadResponseProjection.LabelableResponseProjection.labelable", 0)))
        }
        this.typename()
        this
    }

    def clientMutationId(): AddLabelsToLabelablePayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): AddLabelsToLabelablePayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def labelable(subProjection: LabelableResponseProjection): AddLabelsToLabelablePayloadResponseProjection = {
        labelable(null.asInstanceOf[String], subProjection)
    }

    def labelable(alias: String, subProjection: LabelableResponseProjection): AddLabelsToLabelablePayloadResponseProjection = {
        fields.add(new GraphQLResponseField("labelable").alias(alias).projection(subProjection))
        this
    }

    def typename(): AddLabelsToLabelablePayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): AddLabelsToLabelablePayloadResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
