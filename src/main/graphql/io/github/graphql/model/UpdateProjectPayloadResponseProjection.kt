package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for UpdateProjectPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class UpdateProjectPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): UpdateProjectPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): UpdateProjectPayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("UpdateProjectPayloadResponseProjection.ProjectResponseProjection.project", 0) <= maxDepth) {
            projectionDepthOnFields["UpdateProjectPayloadResponseProjection.ProjectResponseProjection.project"] = projectionDepthOnFields.getOrDefault("UpdateProjectPayloadResponseProjection.ProjectResponseProjection.project", 0) + 1
            this.project(ProjectResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UpdateProjectPayloadResponseProjection.ProjectResponseProjection.project", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): UpdateProjectPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): UpdateProjectPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun project(subProjection: ProjectResponseProjection): UpdateProjectPayloadResponseProjection = project(null, subProjection)

    fun project(alias: String?, subProjection: ProjectResponseProjection): UpdateProjectPayloadResponseProjection {
        fields.add(GraphQLResponseField("project").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): UpdateProjectPayloadResponseProjection = typename(null)

    fun typename(alias: String?): UpdateProjectPayloadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
