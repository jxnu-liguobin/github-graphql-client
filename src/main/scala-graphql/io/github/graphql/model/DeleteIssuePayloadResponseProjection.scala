package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for DeleteIssuePayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class DeleteIssuePayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): DeleteIssuePayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): DeleteIssuePayloadResponseProjection = {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("DeleteIssuePayloadResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeleteIssuePayloadResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("DeleteIssuePayloadResponseProjection.RepositoryResponseProjection.repository", 0) + 1)
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeleteIssuePayloadResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.typename()
        this
    }

    def clientMutationId(): DeleteIssuePayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): DeleteIssuePayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def repository(subProjection: RepositoryResponseProjection): DeleteIssuePayloadResponseProjection = {
        repository(null.asInstanceOf[String], subProjection)
    }

    def repository(alias: String, subProjection: RepositoryResponseProjection): DeleteIssuePayloadResponseProjection = {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection))
        this
    }

    def typename(): DeleteIssuePayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): DeleteIssuePayloadResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
