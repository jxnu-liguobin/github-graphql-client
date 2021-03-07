package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for LinkRepositoryToProjectPayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class LinkRepositoryToProjectPayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): LinkRepositoryToProjectPayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): LinkRepositoryToProjectPayloadResponseProjection = {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("LinkRepositoryToProjectPayloadResponseProjection.ProjectResponseProjection.project", 0) <= maxDepth) {
            projectionDepthOnFields.put("LinkRepositoryToProjectPayloadResponseProjection.ProjectResponseProjection.project", projectionDepthOnFields.getOrDefault("LinkRepositoryToProjectPayloadResponseProjection.ProjectResponseProjection.project", 0) + 1)
            this.project(new ProjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LinkRepositoryToProjectPayloadResponseProjection.ProjectResponseProjection.project", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("LinkRepositoryToProjectPayloadResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("LinkRepositoryToProjectPayloadResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("LinkRepositoryToProjectPayloadResponseProjection.RepositoryResponseProjection.repository", 0) + 1)
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LinkRepositoryToProjectPayloadResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.typename()
        this
    }

    def clientMutationId(): LinkRepositoryToProjectPayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): LinkRepositoryToProjectPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def project(subProjection: ProjectResponseProjection): LinkRepositoryToProjectPayloadResponseProjection = {
        project(null.asInstanceOf[String], subProjection)
    }

    def project(alias: String, subProjection: ProjectResponseProjection): LinkRepositoryToProjectPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("project").alias(alias).projection(subProjection))
        this
    }

    def repository(subProjection: RepositoryResponseProjection): LinkRepositoryToProjectPayloadResponseProjection = {
        repository(null.asInstanceOf[String], subProjection)
    }

    def repository(alias: String, subProjection: RepositoryResponseProjection): LinkRepositoryToProjectPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection))
        this
    }

    def typename(): LinkRepositoryToProjectPayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): LinkRepositoryToProjectPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
