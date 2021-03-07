package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CreateProjectPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class CreateProjectPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): CreateProjectPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): CreateProjectPayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("CreateProjectPayloadResponseProjection.ProjectResponseProjection.project", 0) <= maxDepth) {
            projectionDepthOnFields["CreateProjectPayloadResponseProjection.ProjectResponseProjection.project"] = projectionDepthOnFields.getOrDefault("CreateProjectPayloadResponseProjection.ProjectResponseProjection.project", 0) + 1
            this.project(ProjectResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CreateProjectPayloadResponseProjection.ProjectResponseProjection.project", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): CreateProjectPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): CreateProjectPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun project(subProjection: ProjectResponseProjection): CreateProjectPayloadResponseProjection = project(null, subProjection)

    fun project(alias: String?, subProjection: ProjectResponseProjection): CreateProjectPayloadResponseProjection {
        fields.add(GraphQLResponseField("project").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): CreateProjectPayloadResponseProjection = typename(null)

    fun typename(alias: String?): CreateProjectPayloadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
