package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for IssueOrPullRequest
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class IssueOrPullRequestResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): IssueOrPullRequestResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): IssueOrPullRequestResponseProjection {
        this.typename()
        return this
    }

    fun onIssue(subProjection: IssueResponseProjection): IssueOrPullRequestResponseProjection = onIssue(null, subProjection)

    fun onIssue(alias: String?, subProjection: IssueResponseProjection): IssueOrPullRequestResponseProjection {
        fields.add(GraphQLResponseField("...on Issue").alias(alias).projection(subProjection))
        return this
    }

    fun onPullRequest(subProjection: PullRequestResponseProjection): IssueOrPullRequestResponseProjection = onPullRequest(null, subProjection)

    fun onPullRequest(alias: String?, subProjection: PullRequestResponseProjection): IssueOrPullRequestResponseProjection {
        fields.add(GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): IssueOrPullRequestResponseProjection = typename(null)

    fun typename(alias: String?): IssueOrPullRequestResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
