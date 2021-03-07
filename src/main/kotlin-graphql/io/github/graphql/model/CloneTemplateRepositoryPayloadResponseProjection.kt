package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CloneTemplateRepositoryPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class CloneTemplateRepositoryPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): CloneTemplateRepositoryPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): CloneTemplateRepositoryPayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("CloneTemplateRepositoryPayloadResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields["CloneTemplateRepositoryPayloadResponseProjection.RepositoryResponseProjection.repository"] = projectionDepthOnFields.getOrDefault("CloneTemplateRepositoryPayloadResponseProjection.RepositoryResponseProjection.repository", 0) + 1
            this.repository(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CloneTemplateRepositoryPayloadResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): CloneTemplateRepositoryPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): CloneTemplateRepositoryPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun repository(subProjection: RepositoryResponseProjection): CloneTemplateRepositoryPayloadResponseProjection = repository(null, subProjection)

    fun repository(alias: String?, subProjection: RepositoryResponseProjection): CloneTemplateRepositoryPayloadResponseProjection {
        fields.add(GraphQLResponseField("repository").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): CloneTemplateRepositoryPayloadResponseProjection = typename(null)

    fun typename(alias: String?): CloneTemplateRepositoryPayloadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
