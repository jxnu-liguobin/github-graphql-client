package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for IssueOrPullRequest
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class IssueOrPullRequestResponseProjection extends GraphQLResponseProjection {

    override def all$(): IssueOrPullRequestResponseProjection = all$(3)

    override def all$(maxDepth: Int): IssueOrPullRequestResponseProjection = {
        this.typename()
        this
    }

    def onIssue(subProjection: IssueResponseProjection): IssueOrPullRequestResponseProjection = {
        onIssue(null.asInstanceOf[String], subProjection)
    }

    def onIssue(alias: String, subProjection: IssueResponseProjection): IssueOrPullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("...on Issue").alias(alias).projection(subProjection))
        this
    }

    def onPullRequest(subProjection: PullRequestResponseProjection): IssueOrPullRequestResponseProjection = {
        onPullRequest(null.asInstanceOf[String], subProjection)
    }

    def onPullRequest(alias: String, subProjection: PullRequestResponseProjection): IssueOrPullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection))
        this
    }

    def typename(): IssueOrPullRequestResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): IssueOrPullRequestResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
