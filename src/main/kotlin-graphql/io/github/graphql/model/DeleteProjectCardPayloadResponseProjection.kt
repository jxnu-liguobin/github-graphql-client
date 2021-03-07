package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for DeleteProjectCardPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class DeleteProjectCardPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): DeleteProjectCardPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): DeleteProjectCardPayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("DeleteProjectCardPayloadResponseProjection.ProjectColumnResponseProjection.column", 0) <= maxDepth) {
            projectionDepthOnFields["DeleteProjectCardPayloadResponseProjection.ProjectColumnResponseProjection.column"] = projectionDepthOnFields.getOrDefault("DeleteProjectCardPayloadResponseProjection.ProjectColumnResponseProjection.column", 0) + 1
            this.column(ProjectColumnResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("DeleteProjectCardPayloadResponseProjection.ProjectColumnResponseProjection.column", 0)))
        }
        this.deletedCardId()
        this.typename()
        return this
    }

    fun clientMutationId(): DeleteProjectCardPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): DeleteProjectCardPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun column(subProjection: ProjectColumnResponseProjection): DeleteProjectCardPayloadResponseProjection = column(null, subProjection)

    fun column(alias: String?, subProjection: ProjectColumnResponseProjection): DeleteProjectCardPayloadResponseProjection {
        fields.add(GraphQLResponseField("column").alias(alias).projection(subProjection))
        return this
    }

    fun deletedCardId(): DeleteProjectCardPayloadResponseProjection = deletedCardId(null)

    fun deletedCardId(alias: String?): DeleteProjectCardPayloadResponseProjection {
        fields.add(GraphQLResponseField("deletedCardId").alias(alias))
        return this
    }

    fun typename(): DeleteProjectCardPayloadResponseProjection = typename(null)

    fun typename(alias: String?): DeleteProjectCardPayloadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
