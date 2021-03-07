package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Closable
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class ClosableResponseProjection extends GraphQLResponseProjection {

    override def all$(): ClosableResponseProjection = all$(3)

    override def all$(maxDepth: Int): ClosableResponseProjection = {
        this.closed()
        this.closedAt()
        this.typename()
        this
    }

    def closed(): ClosableResponseProjection = {
        closed(null.asInstanceOf[String])
    }

    def closed(alias: String): ClosableResponseProjection = {
        fields.add(new GraphQLResponseField("closed").alias(alias))
        this
    }

    def closedAt(): ClosableResponseProjection = {
        closedAt(null.asInstanceOf[String])
    }

    def closedAt(alias: String): ClosableResponseProjection = {
        fields.add(new GraphQLResponseField("closedAt").alias(alias))
        this
    }

    def onProject(subProjection: ProjectResponseProjection): ClosableResponseProjection = {
        onProject(null.asInstanceOf[String], subProjection)
    }

    def onProject(alias: String, subProjection: ProjectResponseProjection): ClosableResponseProjection = {
        fields.add(new GraphQLResponseField("...on Project").alias(alias).projection(subProjection))
        this
    }

    def onIssue(subProjection: IssueResponseProjection): ClosableResponseProjection = {
        onIssue(null.asInstanceOf[String], subProjection)
    }

    def onIssue(alias: String, subProjection: IssueResponseProjection): ClosableResponseProjection = {
        fields.add(new GraphQLResponseField("...on Issue").alias(alias).projection(subProjection))
        this
    }

    def onMilestone(subProjection: MilestoneResponseProjection): ClosableResponseProjection = {
        onMilestone(null.asInstanceOf[String], subProjection)
    }

    def onMilestone(alias: String, subProjection: MilestoneResponseProjection): ClosableResponseProjection = {
        fields.add(new GraphQLResponseField("...on Milestone").alias(alias).projection(subProjection))
        this
    }

    def onPullRequest(subProjection: PullRequestResponseProjection): ClosableResponseProjection = {
        onPullRequest(null.asInstanceOf[String], subProjection)
    }

    def onPullRequest(alias: String, subProjection: PullRequestResponseProjection): ClosableResponseProjection = {
        fields.add(new GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection))
        this
    }

    def typename(): ClosableResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ClosableResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
