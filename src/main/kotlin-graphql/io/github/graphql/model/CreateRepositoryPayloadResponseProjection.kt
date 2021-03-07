package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CreateRepositoryPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class CreateRepositoryPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): CreateRepositoryPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): CreateRepositoryPayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("CreateRepositoryPayloadResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields["CreateRepositoryPayloadResponseProjection.RepositoryResponseProjection.repository"] = projectionDepthOnFields.getOrDefault("CreateRepositoryPayloadResponseProjection.RepositoryResponseProjection.repository", 0) + 1
            this.repository(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CreateRepositoryPayloadResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): CreateRepositoryPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): CreateRepositoryPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun repository(subProjection: RepositoryResponseProjection): CreateRepositoryPayloadResponseProjection = repository(null, subProjection)

    fun repository(alias: String?, subProjection: RepositoryResponseProjection): CreateRepositoryPayloadResponseProjection {
        fields.add(GraphQLResponseField("repository").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): CreateRepositoryPayloadResponseProjection = typename(null)

    fun typename(alias: String?): CreateRepositoryPayloadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
