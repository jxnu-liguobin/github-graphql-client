package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for CloneProjectPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as CloneProjectPayloadResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
