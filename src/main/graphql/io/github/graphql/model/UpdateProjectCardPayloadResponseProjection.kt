package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for UpdateProjectCardPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class UpdateProjectCardPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): UpdateProjectCardPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): UpdateProjectCardPayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("UpdateProjectCardPayloadResponseProjection.ProjectCardResponseProjection.projectCard", 0) <= maxDepth) {
            projectionDepthOnFields["UpdateProjectCardPayloadResponseProjection.ProjectCardResponseProjection.projectCard"] = projectionDepthOnFields.getOrDefault("UpdateProjectCardPayloadResponseProjection.ProjectCardResponseProjection.projectCard", 0) + 1
            this.projectCard(ProjectCardResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UpdateProjectCardPayloadResponseProjection.ProjectCardResponseProjection.projectCard", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): UpdateProjectCardPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): UpdateProjectCardPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun projectCard(subProjection: ProjectCardResponseProjection): UpdateProjectCardPayloadResponseProjection = projectCard(null, subProjection)

    fun projectCard(alias: String?, subProjection: ProjectCardResponseProjection): UpdateProjectCardPayloadResponseProjection {
        fields.add(GraphQLResponseField("projectCard").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): UpdateProjectCardPayloadResponseProjection = typename(null)

    fun typename(alias: String?): UpdateProjectCardPayloadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
