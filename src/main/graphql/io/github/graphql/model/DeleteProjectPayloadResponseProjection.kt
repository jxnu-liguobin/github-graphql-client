package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for DeleteProjectPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class DeleteProjectPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): DeleteProjectPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): DeleteProjectPayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("DeleteProjectPayloadResponseProjection.ProjectOwnerResponseProjection.owner", 0) <= maxDepth) {
            projectionDepthOnFields["DeleteProjectPayloadResponseProjection.ProjectOwnerResponseProjection.owner"] = projectionDepthOnFields.getOrDefault("DeleteProjectPayloadResponseProjection.ProjectOwnerResponseProjection.owner", 0) + 1
            this.owner(ProjectOwnerResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("DeleteProjectPayloadResponseProjection.ProjectOwnerResponseProjection.owner", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): DeleteProjectPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): DeleteProjectPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun owner(subProjection: ProjectOwnerResponseProjection): DeleteProjectPayloadResponseProjection = owner(null, subProjection)

    fun owner(alias: String?, subProjection: ProjectOwnerResponseProjection): DeleteProjectPayloadResponseProjection {
        fields.add(GraphQLResponseField("owner").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): DeleteProjectPayloadResponseProjection = typename(null)

    fun typename(alias: String?): DeleteProjectPayloadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
