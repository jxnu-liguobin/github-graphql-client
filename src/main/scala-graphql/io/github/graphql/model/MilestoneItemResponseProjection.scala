package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for MilestoneItem
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class MilestoneItemResponseProjection extends GraphQLResponseProjection {

    override def all$(): MilestoneItemResponseProjection = all$(3)

    override def all$(maxDepth: Int): MilestoneItemResponseProjection = {
        this.typename()
        this
    }

    def onIssue(subProjection: IssueResponseProjection): MilestoneItemResponseProjection = {
        onIssue(null.asInstanceOf[String], subProjection)
    }

    def onIssue(alias: String, subProjection: IssueResponseProjection): MilestoneItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on Issue").alias(alias).projection(subProjection))
        this
    }

    def onPullRequest(subProjection: PullRequestResponseProjection): MilestoneItemResponseProjection = {
        onPullRequest(null.asInstanceOf[String], subProjection)
    }

    def onPullRequest(alias: String, subProjection: PullRequestResponseProjection): MilestoneItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection))
        this
    }

    def typename(): MilestoneItemResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): MilestoneItemResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
