package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for UpdateProjectColumnPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class UpdateProjectColumnPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): UpdateProjectColumnPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): UpdateProjectColumnPayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("UpdateProjectColumnPayloadResponseProjection.ProjectColumnResponseProjection.projectColumn", 0) <= maxDepth) {
            projectionDepthOnFields["UpdateProjectColumnPayloadResponseProjection.ProjectColumnResponseProjection.projectColumn"] = projectionDepthOnFields.getOrDefault("UpdateProjectColumnPayloadResponseProjection.ProjectColumnResponseProjection.projectColumn", 0) + 1
            this.projectColumn(ProjectColumnResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UpdateProjectColumnPayloadResponseProjection.ProjectColumnResponseProjection.projectColumn", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): UpdateProjectColumnPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): UpdateProjectColumnPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun projectColumn(subProjection: ProjectColumnResponseProjection): UpdateProjectColumnPayloadResponseProjection = projectColumn(null, subProjection)

    fun projectColumn(alias: String?, subProjection: ProjectColumnResponseProjection): UpdateProjectColumnPayloadResponseProjection {
        fields.add(GraphQLResponseField("projectColumn").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): UpdateProjectColumnPayloadResponseProjection = typename(null)

    fun typename(alias: String?): UpdateProjectColumnPayloadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
