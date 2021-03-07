package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for Subscribable
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class SubscribableResponseProjection extends GraphQLResponseProjection {

    override def all$(): SubscribableResponseProjection = all$(3)

    override def all$(maxDepth: Int): SubscribableResponseProjection = {
        this.id()
        this.viewerCanSubscribe()
        this.viewerSubscription()
        this.typename()
        this
    }

    def id(): SubscribableResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): SubscribableResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def viewerCanSubscribe(): SubscribableResponseProjection = {
        viewerCanSubscribe(null.asInstanceOf[String])
    }

    def viewerCanSubscribe(alias: String): SubscribableResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanSubscribe").alias(alias))
        this
    }

    def viewerSubscription(): SubscribableResponseProjection = {
        viewerSubscription(null.asInstanceOf[String])
    }

    def viewerSubscription(alias: String): SubscribableResponseProjection = {
        fields.add(new GraphQLResponseField("viewerSubscription").alias(alias))
        this
    }

    def onRepository(subProjection: RepositoryResponseProjection): SubscribableResponseProjection = {
        onRepository(null.asInstanceOf[String], subProjection)
    }

    def onRepository(alias: String, subProjection: RepositoryResponseProjection): SubscribableResponseProjection = {
        fields.add(new GraphQLResponseField("...on Repository").alias(alias).projection(subProjection))
        this
    }

    def onIssue(subProjection: IssueResponseProjection): SubscribableResponseProjection = {
        onIssue(null.asInstanceOf[String], subProjection)
    }

    def onIssue(alias: String, subProjection: IssueResponseProjection): SubscribableResponseProjection = {
        fields.add(new GraphQLResponseField("...on Issue").alias(alias).projection(subProjection))
        this
    }

    def onCommit(subProjection: CommitResponseProjection): SubscribableResponseProjection = {
        onCommit(null.asInstanceOf[String], subProjection)
    }

    def onCommit(alias: String, subProjection: CommitResponseProjection): SubscribableResponseProjection = {
        fields.add(new GraphQLResponseField("...on Commit").alias(alias).projection(subProjection))
        this
    }

    def onPullRequest(subProjection: PullRequestResponseProjection): SubscribableResponseProjection = {
        onPullRequest(null.asInstanceOf[String], subProjection)
    }

    def onPullRequest(alias: String, subProjection: PullRequestResponseProjection): SubscribableResponseProjection = {
        fields.add(new GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection))
        this
    }

    def onTeam(subProjection: TeamResponseProjection): SubscribableResponseProjection = {
        onTeam(null.asInstanceOf[String], subProjection)
    }

    def onTeam(alias: String, subProjection: TeamResponseProjection): SubscribableResponseProjection = {
        fields.add(new GraphQLResponseField("...on Team").alias(alias).projection(subProjection))
        this
    }

    def typename(): SubscribableResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): SubscribableResponseProjection = {
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
        val that = obj.asInstanceOf[SubscribableResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
