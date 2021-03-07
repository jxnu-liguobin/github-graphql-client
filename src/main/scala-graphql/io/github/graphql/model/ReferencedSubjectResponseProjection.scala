package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ReferencedSubject
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class ReferencedSubjectResponseProjection extends GraphQLResponseProjection {

    override def all$(): ReferencedSubjectResponseProjection = all$(3)

    override def all$(maxDepth: Int): ReferencedSubjectResponseProjection = {
        this.typename()
        this
    }

    def onIssue(subProjection: IssueResponseProjection): ReferencedSubjectResponseProjection = {
        onIssue(null.asInstanceOf[String], subProjection)
    }

    def onIssue(alias: String, subProjection: IssueResponseProjection): ReferencedSubjectResponseProjection = {
        fields.add(new GraphQLResponseField("...on Issue").alias(alias).projection(subProjection))
        this
    }

    def onPullRequest(subProjection: PullRequestResponseProjection): ReferencedSubjectResponseProjection = {
        onPullRequest(null.asInstanceOf[String], subProjection)
    }

    def onPullRequest(alias: String, subProjection: PullRequestResponseProjection): ReferencedSubjectResponseProjection = {
        fields.add(new GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection))
        this
    }

    def typename(): ReferencedSubjectResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ReferencedSubjectResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
