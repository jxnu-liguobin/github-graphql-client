package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for DeleteProjectPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as DeleteProjectPayloadResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
