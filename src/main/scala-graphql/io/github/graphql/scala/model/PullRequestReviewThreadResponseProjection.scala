package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for PullRequestReviewThread
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class PullRequestReviewThreadResponseProjection extends GraphQLResponseProjection {

    override def all$(): PullRequestReviewThreadResponseProjection = all$(3)

    override def all$(maxDepth: Int): PullRequestReviewThreadResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewThreadResponseProjection.PullRequestReviewCommentConnectionResponseProjection.comments", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewThreadResponseProjection.PullRequestReviewCommentConnectionResponseProjection.comments", projectionDepthOnFields.getOrDefault("PullRequestReviewThreadResponseProjection.PullRequestReviewCommentConnectionResponseProjection.comments", 0) + 1)
            this.comments(new PullRequestReviewCommentConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewThreadResponseProjection.PullRequestReviewCommentConnectionResponseProjection.comments", 0)))
        }
        this.id()
        this.isResolved()
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewThreadResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewThreadResponseProjection.PullRequestResponseProjection.pullRequest", projectionDepthOnFields.getOrDefault("PullRequestReviewThreadResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1)
            this.pullRequest(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewThreadResponseProjection.PullRequestResponseProjection.pullRequest", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewThreadResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewThreadResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("PullRequestReviewThreadResponseProjection.RepositoryResponseProjection.repository", 0) + 1)
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewThreadResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewThreadResponseProjection.UserResponseProjection.resolvedBy", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewThreadResponseProjection.UserResponseProjection.resolvedBy", projectionDepthOnFields.getOrDefault("PullRequestReviewThreadResponseProjection.UserResponseProjection.resolvedBy", 0) + 1)
            this.resolvedBy(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewThreadResponseProjection.UserResponseProjection.resolvedBy", 0)))
        }
        this.viewerCanResolve()
        this.viewerCanUnresolve()
        this.typename()
        this
    }

    def comments(subProjection: PullRequestReviewCommentConnectionResponseProjection): PullRequestReviewThreadResponseProjection = {
        comments(null.asInstanceOf[String], subProjection)
    }

    def comments(alias: String, subProjection: PullRequestReviewCommentConnectionResponseProjection): PullRequestReviewThreadResponseProjection = {
        fields.add(new GraphQLResponseField("comments").alias(alias).projection(subProjection))
        this
    }

    def comments(input: PullRequestReviewThreadCommentsParametrizedInput,subProjection: PullRequestReviewCommentConnectionResponseProjection): PullRequestReviewThreadResponseProjection = {
        comments(null.asInstanceOf[String], input, subProjection)
    }

    def comments(alias: String, input: PullRequestReviewThreadCommentsParametrizedInput , subProjection: PullRequestReviewCommentConnectionResponseProjection): PullRequestReviewThreadResponseProjection = {
        fields.add(new GraphQLResponseField("comments").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def id(): PullRequestReviewThreadResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): PullRequestReviewThreadResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def isResolved(): PullRequestReviewThreadResponseProjection = {
        isResolved(null.asInstanceOf[String])
    }

    def isResolved(alias: String): PullRequestReviewThreadResponseProjection = {
        fields.add(new GraphQLResponseField("isResolved").alias(alias))
        this
    }

    def pullRequest(subProjection: PullRequestResponseProjection): PullRequestReviewThreadResponseProjection = {
        pullRequest(null.asInstanceOf[String], subProjection)
    }

    def pullRequest(alias: String, subProjection: PullRequestResponseProjection): PullRequestReviewThreadResponseProjection = {
        fields.add(new GraphQLResponseField("pullRequest").alias(alias).projection(subProjection))
        this
    }

    def repository(subProjection: RepositoryResponseProjection): PullRequestReviewThreadResponseProjection = {
        repository(null.asInstanceOf[String], subProjection)
    }

    def repository(alias: String, subProjection: RepositoryResponseProjection): PullRequestReviewThreadResponseProjection = {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection))
        this
    }

    def resolvedBy(subProjection: UserResponseProjection): PullRequestReviewThreadResponseProjection = {
        resolvedBy(null.asInstanceOf[String], subProjection)
    }

    def resolvedBy(alias: String, subProjection: UserResponseProjection): PullRequestReviewThreadResponseProjection = {
        fields.add(new GraphQLResponseField("resolvedBy").alias(alias).projection(subProjection))
        this
    }

    def viewerCanResolve(): PullRequestReviewThreadResponseProjection = {
        viewerCanResolve(null.asInstanceOf[String])
    }

    def viewerCanResolve(alias: String): PullRequestReviewThreadResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanResolve").alias(alias))
        this
    }

    def viewerCanUnresolve(): PullRequestReviewThreadResponseProjection = {
        viewerCanUnresolve(null.asInstanceOf[String])
    }

    def viewerCanUnresolve(alias: String): PullRequestReviewThreadResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanUnresolve").alias(alias))
        this
    }

    def typename(): PullRequestReviewThreadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): PullRequestReviewThreadResponseProjection = {
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
        val that = obj.asInstanceOf[PullRequestReviewThreadResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
