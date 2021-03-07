package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for UpdateRefPayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class UpdateRefPayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): UpdateRefPayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): UpdateRefPayloadResponseProjection = {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("UpdateRefPayloadResponseProjection.RefResponseProjection.ref", 0) <= maxDepth) {
            projectionDepthOnFields.put("UpdateRefPayloadResponseProjection.RefResponseProjection.ref", projectionDepthOnFields.getOrDefault("UpdateRefPayloadResponseProjection.RefResponseProjection.ref", 0) + 1)
            this.ref(new RefResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UpdateRefPayloadResponseProjection.RefResponseProjection.ref", 0)))
        }
        this.typename()
        this
    }

    def clientMutationId(): UpdateRefPayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): UpdateRefPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def ref(subProjection: RefResponseProjection): UpdateRefPayloadResponseProjection = {
        ref(null.asInstanceOf[String], subProjection)
    }

    def ref(alias: String, subProjection: RefResponseProjection): UpdateRefPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("ref").alias(alias).projection(subProjection))
        this
    }

    def typename(): UpdateRefPayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): UpdateRefPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
