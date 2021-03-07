package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CloneProjectPayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class CloneProjectPayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): CloneProjectPayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): CloneProjectPayloadResponseProjection = {
        this.clientMutationId()
        this.jobStatusId()
        if (projectionDepthOnFields.getOrDefault("CloneProjectPayloadResponseProjection.ProjectResponseProjection.project", 0) <= maxDepth) {
            projectionDepthOnFields.put("CloneProjectPayloadResponseProjection.ProjectResponseProjection.project", projectionDepthOnFields.getOrDefault("CloneProjectPayloadResponseProjection.ProjectResponseProjection.project", 0) + 1)
            this.project(new ProjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CloneProjectPayloadResponseProjection.ProjectResponseProjection.project", 0)))
        }
        this.typename()
        this
    }

    def clientMutationId(): CloneProjectPayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): CloneProjectPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def jobStatusId(): CloneProjectPayloadResponseProjection = {
        jobStatusId(null.asInstanceOf[String])
    }

    def jobStatusId(alias: String): CloneProjectPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("jobStatusId").alias(alias))
        this
    }

    def project(subProjection: ProjectResponseProjection): CloneProjectPayloadResponseProjection = {
        project(null.asInstanceOf[String], subProjection)
    }

    def project(alias: String, subProjection: ProjectResponseProjection): CloneProjectPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("project").alias(alias).projection(subProjection))
        this
    }

    def typename(): CloneProjectPayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): CloneProjectPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
