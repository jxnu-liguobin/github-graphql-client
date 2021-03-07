package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ProjectCardItem
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class ProjectCardItemResponseProjection extends GraphQLResponseProjection {

    override def all$(): ProjectCardItemResponseProjection = all$(3)

    override def all$(maxDepth: Int): ProjectCardItemResponseProjection = {
        this.typename()
        this
    }

    def onIssue(subProjection: IssueResponseProjection): ProjectCardItemResponseProjection = {
        onIssue(null.asInstanceOf[String], subProjection)
    }

    def onIssue(alias: String, subProjection: IssueResponseProjection): ProjectCardItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on Issue").alias(alias).projection(subProjection))
        this
    }

    def onPullRequest(subProjection: PullRequestResponseProjection): ProjectCardItemResponseProjection = {
        onPullRequest(null.asInstanceOf[String], subProjection)
    }

    def onPullRequest(alias: String, subProjection: PullRequestResponseProjection): ProjectCardItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection))
        this
    }

    def typename(): ProjectCardItemResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ProjectCardItemResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
