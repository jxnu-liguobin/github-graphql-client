package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for UpdateRefPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class UpdateRefPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): UpdateRefPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): UpdateRefPayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("UpdateRefPayloadResponseProjection.RefResponseProjection.ref", 0) <= maxDepth) {
            projectionDepthOnFields["UpdateRefPayloadResponseProjection.RefResponseProjection.ref"] = projectionDepthOnFields.getOrDefault("UpdateRefPayloadResponseProjection.RefResponseProjection.ref", 0) + 1
            this.ref(RefResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UpdateRefPayloadResponseProjection.RefResponseProjection.ref", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): UpdateRefPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): UpdateRefPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun ref(subProjection: RefResponseProjection): UpdateRefPayloadResponseProjection = ref(null, subProjection)

    fun ref(alias: String?, subProjection: RefResponseProjection): UpdateRefPayloadResponseProjection {
        fields.add(GraphQLResponseField("ref").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): UpdateRefPayloadResponseProjection = typename(null)

    fun typename(alias: String?): UpdateRefPayloadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
