package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for IssueEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class IssueEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): IssueEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): IssueEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("IssueEdgeResponseProjection.IssueResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["IssueEdgeResponseProjection.IssueResponseProjection.node"] = projectionDepthOnFields.getOrDefault("IssueEdgeResponseProjection.IssueResponseProjection.node", 0) + 1
            this.node(IssueResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("IssueEdgeResponseProjection.IssueResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): IssueEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): IssueEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: IssueResponseProjection): IssueEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: IssueResponseProjection): IssueEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): IssueEdgeResponseProjection = typename(null)

    fun typename(alias: String?): IssueEdgeResponseProjection {
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
        val that = other as IssueEdgeResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
