package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for UnlinkRepositoryFromProjectPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class UnlinkRepositoryFromProjectPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): UnlinkRepositoryFromProjectPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): UnlinkRepositoryFromProjectPayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("UnlinkRepositoryFromProjectPayloadResponseProjection.ProjectResponseProjection.project", 0) <= maxDepth) {
            projectionDepthOnFields["UnlinkRepositoryFromProjectPayloadResponseProjection.ProjectResponseProjection.project"] = projectionDepthOnFields.getOrDefault("UnlinkRepositoryFromProjectPayloadResponseProjection.ProjectResponseProjection.project", 0) + 1
            this.project(ProjectResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UnlinkRepositoryFromProjectPayloadResponseProjection.ProjectResponseProjection.project", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("UnlinkRepositoryFromProjectPayloadResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields["UnlinkRepositoryFromProjectPayloadResponseProjection.RepositoryResponseProjection.repository"] = projectionDepthOnFields.getOrDefault("UnlinkRepositoryFromProjectPayloadResponseProjection.RepositoryResponseProjection.repository", 0) + 1
            this.repository(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UnlinkRepositoryFromProjectPayloadResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): UnlinkRepositoryFromProjectPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): UnlinkRepositoryFromProjectPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun project(subProjection: ProjectResponseProjection): UnlinkRepositoryFromProjectPayloadResponseProjection = project(null, subProjection)

    fun project(alias: String?, subProjection: ProjectResponseProjection): UnlinkRepositoryFromProjectPayloadResponseProjection {
        fields.add(GraphQLResponseField("project").alias(alias).projection(subProjection))
        return this
    }

    fun repository(subProjection: RepositoryResponseProjection): UnlinkRepositoryFromProjectPayloadResponseProjection = repository(null, subProjection)

    fun repository(alias: String?, subProjection: RepositoryResponseProjection): UnlinkRepositoryFromProjectPayloadResponseProjection {
        fields.add(GraphQLResponseField("repository").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): UnlinkRepositoryFromProjectPayloadResponseProjection = typename(null)

    fun typename(alias: String?): UnlinkRepositoryFromProjectPayloadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
