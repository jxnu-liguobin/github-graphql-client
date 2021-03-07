package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RenamedTitleSubject
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class RenamedTitleSubjectResponseProjection extends GraphQLResponseProjection {

    override def all$(): RenamedTitleSubjectResponseProjection = all$(3)

    override def all$(maxDepth: Int): RenamedTitleSubjectResponseProjection = {
        this.typename()
        this
    }

    def onIssue(subProjection: IssueResponseProjection): RenamedTitleSubjectResponseProjection = {
        onIssue(null.asInstanceOf[String], subProjection)
    }

    def onIssue(alias: String, subProjection: IssueResponseProjection): RenamedTitleSubjectResponseProjection = {
        fields.add(new GraphQLResponseField("...on Issue").alias(alias).projection(subProjection))
        this
    }

    def onPullRequest(subProjection: PullRequestResponseProjection): RenamedTitleSubjectResponseProjection = {
        onPullRequest(null.asInstanceOf[String], subProjection)
    }

    def onPullRequest(alias: String, subProjection: PullRequestResponseProjection): RenamedTitleSubjectResponseProjection = {
        fields.add(new GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection))
        this
    }

    def typename(): RenamedTitleSubjectResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): RenamedTitleSubjectResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
