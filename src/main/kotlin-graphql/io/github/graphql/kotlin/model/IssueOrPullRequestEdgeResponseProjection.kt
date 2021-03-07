package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for IssueOrPullRequestEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class IssueOrPullRequestEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): IssueOrPullRequestEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): IssueOrPullRequestEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("IssueOrPullRequestEdgeResponseProjection.IssueOrPullRequestResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["IssueOrPullRequestEdgeResponseProjection.IssueOrPullRequestResponseProjection.node"] = projectionDepthOnFields.getOrDefault("IssueOrPullRequestEdgeResponseProjection.IssueOrPullRequestResponseProjection.node", 0) + 1
            this.node(IssueOrPullRequestResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("IssueOrPullRequestEdgeResponseProjection.IssueOrPullRequestResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): IssueOrPullRequestEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): IssueOrPullRequestEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: IssueOrPullRequestResponseProjection): IssueOrPullRequestEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: IssueOrPullRequestResponseProjection): IssueOrPullRequestEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): IssueOrPullRequestEdgeResponseProjection = typename(null)

    fun typename(alias: String?): IssueOrPullRequestEdgeResponseProjection {
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
        val that = other as IssueOrPullRequestEdgeResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
