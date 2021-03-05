package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CloneProjectPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class CloneProjectPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): CloneProjectPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): CloneProjectPayloadResponseProjection {
        this.clientMutationId()
        this.jobStatusId()
        if (projectionDepthOnFields.getOrDefault("CloneProjectPayloadResponseProjection.ProjectResponseProjection.project", 0) <= maxDepth) {
            projectionDepthOnFields["CloneProjectPayloadResponseProjection.ProjectResponseProjection.project"] = projectionDepthOnFields.getOrDefault("CloneProjectPayloadResponseProjection.ProjectResponseProjection.project", 0) + 1
            this.project(ProjectResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CloneProjectPayloadResponseProjection.ProjectResponseProjection.project", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): CloneProjectPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): CloneProjectPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun jobStatusId(): CloneProjectPayloadResponseProjection = jobStatusId(null)

    fun jobStatusId(alias: String?): CloneProjectPayloadResponseProjection {
        fields.add(GraphQLResponseField("jobStatusId").alias(alias))
        return this
    }

    fun project(subProjection: ProjectResponseProjection): CloneProjectPayloadResponseProjection = project(null, subProjection)

    fun project(alias: String?, subProjection: ProjectResponseProjection): CloneProjectPayloadResponseProjection {
        fields.add(GraphQLResponseField("project").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): CloneProjectPayloadResponseProjection = typename(null)

    fun typename(alias: String?): CloneProjectPayloadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
