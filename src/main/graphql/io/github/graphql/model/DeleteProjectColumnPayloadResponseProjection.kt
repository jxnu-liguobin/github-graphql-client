package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for DeleteProjectColumnPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class DeleteProjectColumnPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): DeleteProjectColumnPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): DeleteProjectColumnPayloadResponseProjection {
        this.clientMutationId()
        this.deletedColumnId()
        if (projectionDepthOnFields.getOrDefault("DeleteProjectColumnPayloadResponseProjection.ProjectResponseProjection.project", 0) <= maxDepth) {
            projectionDepthOnFields["DeleteProjectColumnPayloadResponseProjection.ProjectResponseProjection.project"] = projectionDepthOnFields.getOrDefault("DeleteProjectColumnPayloadResponseProjection.ProjectResponseProjection.project", 0) + 1
            this.project(ProjectResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("DeleteProjectColumnPayloadResponseProjection.ProjectResponseProjection.project", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): DeleteProjectColumnPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): DeleteProjectColumnPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun deletedColumnId(): DeleteProjectColumnPayloadResponseProjection = deletedColumnId(null)

    fun deletedColumnId(alias: String?): DeleteProjectColumnPayloadResponseProjection {
        fields.add(GraphQLResponseField("deletedColumnId").alias(alias))
        return this
    }

    fun project(subProjection: ProjectResponseProjection): DeleteProjectColumnPayloadResponseProjection = project(null, subProjection)

    fun project(alias: String?, subProjection: ProjectResponseProjection): DeleteProjectColumnPayloadResponseProjection {
        fields.add(GraphQLResponseField("project").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): DeleteProjectColumnPayloadResponseProjection = typename(null)

    fun typename(alias: String?): DeleteProjectColumnPayloadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
