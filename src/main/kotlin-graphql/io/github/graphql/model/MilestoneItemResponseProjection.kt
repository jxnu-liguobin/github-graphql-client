package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for MilestoneItem
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class MilestoneItemResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): MilestoneItemResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): MilestoneItemResponseProjection {
        this.typename()
        return this
    }

    fun onIssue(subProjection: IssueResponseProjection): MilestoneItemResponseProjection = onIssue(null, subProjection)

    fun onIssue(alias: String?, subProjection: IssueResponseProjection): MilestoneItemResponseProjection {
        fields.add(GraphQLResponseField("...on Issue").alias(alias).projection(subProjection))
        return this
    }

    fun onPullRequest(subProjection: PullRequestResponseProjection): MilestoneItemResponseProjection = onPullRequest(null, subProjection)

    fun onPullRequest(alias: String?, subProjection: PullRequestResponseProjection): MilestoneItemResponseProjection {
        fields.add(GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): MilestoneItemResponseProjection = typename(null)

    fun typename(alias: String?): MilestoneItemResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
