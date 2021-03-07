package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for UpdateRepositoryPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class UpdateRepositoryPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): UpdateRepositoryPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): UpdateRepositoryPayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("UpdateRepositoryPayloadResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields["UpdateRepositoryPayloadResponseProjection.RepositoryResponseProjection.repository"] = projectionDepthOnFields.getOrDefault("UpdateRepositoryPayloadResponseProjection.RepositoryResponseProjection.repository", 0) + 1
            this.repository(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UpdateRepositoryPayloadResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): UpdateRepositoryPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): UpdateRepositoryPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun repository(subProjection: RepositoryResponseProjection): UpdateRepositoryPayloadResponseProjection = repository(null, subProjection)

    fun repository(alias: String?, subProjection: RepositoryResponseProjection): UpdateRepositoryPayloadResponseProjection {
        fields.add(GraphQLResponseField("repository").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): UpdateRepositoryPayloadResponseProjection = typename(null)

    fun typename(alias: String?): UpdateRepositoryPayloadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
