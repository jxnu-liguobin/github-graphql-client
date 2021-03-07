package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CreateRefPayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class CreateRefPayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): CreateRefPayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): CreateRefPayloadResponseProjection = {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("CreateRefPayloadResponseProjection.RefResponseProjection.ref", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreateRefPayloadResponseProjection.RefResponseProjection.ref", projectionDepthOnFields.getOrDefault("CreateRefPayloadResponseProjection.RefResponseProjection.ref", 0) + 1)
            this.ref(new RefResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreateRefPayloadResponseProjection.RefResponseProjection.ref", 0)))
        }
        this.typename()
        this
    }

    def clientMutationId(): CreateRefPayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): CreateRefPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def ref(subProjection: RefResponseProjection): CreateRefPayloadResponseProjection = {
        ref(null.asInstanceOf[String], subProjection)
    }

    def ref(alias: String, subProjection: RefResponseProjection): CreateRefPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("ref").alias(alias).projection(subProjection))
        this
    }

    def typename(): CreateRefPayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): CreateRefPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
