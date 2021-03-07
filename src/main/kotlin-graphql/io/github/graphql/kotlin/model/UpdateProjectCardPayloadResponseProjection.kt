package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for UpdateProjectCardPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as UpdateProjectCardPayloadResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
