package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Reactable
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class ReactableResponseProjection extends GraphQLResponseProjection {

    override def all$(): ReactableResponseProjection = all$(3)

    override def all$(maxDepth: Int): ReactableResponseProjection = {
        this.databaseId()
        this.id()
        if (projectionDepthOnFields.getOrDefault("ReactableResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReactableResponseProjection.ReactionGroupResponseProjection.reactionGroups", projectionDepthOnFields.getOrDefault("ReactableResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0) + 1)
            this.reactionGroups(new ReactionGroupResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReactableResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ReactableResponseProjection.ReactionConnectionResponseProjection.reactions", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReactableResponseProjection.ReactionConnectionResponseProjection.reactions", projectionDepthOnFields.getOrDefault("ReactableResponseProjection.ReactionConnectionResponseProjection.reactions", 0) + 1)
            this.reactions(new ReactionConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReactableResponseProjection.ReactionConnectionResponseProjection.reactions", 0)))
        }
        this.viewerCanReact()
        this.typename()
        this
    }

    def databaseId(): ReactableResponseProjection = {
        databaseId(null.asInstanceOf[String])
    }

    def databaseId(alias: String): ReactableResponseProjection = {
        fields.add(new GraphQLResponseField("databaseId").alias(alias))
        this
    }

    def id(): ReactableResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): ReactableResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def reactionGroups(subProjection: ReactionGroupResponseProjection): ReactableResponseProjection = {
        reactionGroups(null.asInstanceOf[String], subProjection)
    }

    def reactionGroups(alias: String, subProjection: ReactionGroupResponseProjection): ReactableResponseProjection = {
        fields.add(new GraphQLResponseField("reactionGroups").alias(alias).projection(subProjection))
        this
    }

    def reactions(subProjection: ReactionConnectionResponseProjection): ReactableResponseProjection = {
        reactions(null.asInstanceOf[String], subProjection)
    }

    def reactions(alias: String, subProjection: ReactionConnectionResponseProjection): ReactableResponseProjection = {
        fields.add(new GraphQLResponseField("reactions").alias(alias).projection(subProjection))
        this
    }

    def reactions(input: ReactableReactionsParametrizedInput,subProjection: ReactionConnectionResponseProjection): ReactableResponseProjection = {
        reactions(null.asInstanceOf[String], input, subProjection)
    }

    def reactions(alias: String, input: ReactableReactionsParametrizedInput , subProjection: ReactionConnectionResponseProjection): ReactableResponseProjection = {
        fields.add(new GraphQLResponseField("reactions").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def viewerCanReact(): ReactableResponseProjection = {
        viewerCanReact(null.asInstanceOf[String])
    }

    def viewerCanReact(alias: String): ReactableResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanReact").alias(alias))
        this
    }

    def onPullRequestReviewComment(subProjection: PullRequestReviewCommentResponseProjection): ReactableResponseProjection = {
        onPullRequestReviewComment(null.asInstanceOf[String], subProjection)
    }

    def onPullRequestReviewComment(alias: String, subProjection: PullRequestReviewCommentResponseProjection): ReactableResponseProjection = {
        fields.add(new GraphQLResponseField("...on PullRequestReviewComment").alias(alias).projection(subProjection))
        this
    }

    def onIssue(subProjection: IssueResponseProjection): ReactableResponseProjection = {
        onIssue(null.asInstanceOf[String], subProjection)
    }

    def onIssue(alias: String, subProjection: IssueResponseProjection): ReactableResponseProjection = {
        fields.add(new GraphQLResponseField("...on Issue").alias(alias).projection(subProjection))
        this
    }

    def onPullRequestReview(subProjection: PullRequestReviewResponseProjection): ReactableResponseProjection = {
        onPullRequestReview(null.asInstanceOf[String], subProjection)
    }

    def onPullRequestReview(alias: String, subProjection: PullRequestReviewResponseProjection): ReactableResponseProjection = {
        fields.add(new GraphQLResponseField("...on PullRequestReview").alias(alias).projection(subProjection))
        this
    }

    def onPullRequest(subProjection: PullRequestResponseProjection): ReactableResponseProjection = {
        onPullRequest(null.asInstanceOf[String], subProjection)
    }

    def onPullRequest(alias: String, subProjection: PullRequestResponseProjection): ReactableResponseProjection = {
        fields.add(new GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection))
        this
    }

    def onCommitComment(subProjection: CommitCommentResponseProjection): ReactableResponseProjection = {
        onCommitComment(null.asInstanceOf[String], subProjection)
    }

    def onCommitComment(alias: String, subProjection: CommitCommentResponseProjection): ReactableResponseProjection = {
        fields.add(new GraphQLResponseField("...on CommitComment").alias(alias).projection(subProjection))
        this
    }

    def onIssueComment(subProjection: IssueCommentResponseProjection): ReactableResponseProjection = {
        onIssueComment(null.asInstanceOf[String], subProjection)
    }

    def onIssueComment(alias: String, subProjection: IssueCommentResponseProjection): ReactableResponseProjection = {
        fields.add(new GraphQLResponseField("...on IssueComment").alias(alias).projection(subProjection))
        this
    }

    def typename(): ReactableResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ReactableResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
