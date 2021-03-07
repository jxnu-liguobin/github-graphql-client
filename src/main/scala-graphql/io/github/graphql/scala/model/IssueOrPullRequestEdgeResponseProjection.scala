package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for IssueOrPullRequestEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class IssueOrPullRequestEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): IssueOrPullRequestEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): IssueOrPullRequestEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("IssueOrPullRequestEdgeResponseProjection.IssueOrPullRequestResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueOrPullRequestEdgeResponseProjection.IssueOrPullRequestResponseProjection.node", projectionDepthOnFields.getOrDefault("IssueOrPullRequestEdgeResponseProjection.IssueOrPullRequestResponseProjection.node", 0) + 1)
            this.node(new IssueOrPullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueOrPullRequestEdgeResponseProjection.IssueOrPullRequestResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): IssueOrPullRequestEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): IssueOrPullRequestEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: IssueOrPullRequestResponseProjection): IssueOrPullRequestEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: IssueOrPullRequestResponseProjection): IssueOrPullRequestEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): IssueOrPullRequestEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): IssueOrPullRequestEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[IssueOrPullRequestEdgeResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
