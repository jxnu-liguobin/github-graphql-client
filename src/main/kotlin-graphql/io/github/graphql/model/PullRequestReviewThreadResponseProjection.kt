package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PullRequestReviewThread
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class PullRequestReviewThreadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): PullRequestReviewThreadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): PullRequestReviewThreadResponseProjection {
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewThreadResponseProjection.PullRequestReviewCommentConnectionResponseProjection.comments", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestReviewThreadResponseProjection.PullRequestReviewCommentConnectionResponseProjection.comments"] = projectionDepthOnFields.getOrDefault("PullRequestReviewThreadResponseProjection.PullRequestReviewCommentConnectionResponseProjection.comments", 0) + 1
            this.comments(PullRequestReviewCommentConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewThreadResponseProjection.PullRequestReviewCommentConnectionResponseProjection.comments", 0)))
        }
        this.id()
        this.isResolved()
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewThreadResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestReviewThreadResponseProjection.PullRequestResponseProjection.pullRequest"] = projectionDepthOnFields.getOrDefault("PullRequestReviewThreadResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1
            this.pullRequest(PullRequestResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewThreadResponseProjection.PullRequestResponseProjection.pullRequest", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewThreadResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestReviewThreadResponseProjection.RepositoryResponseProjection.repository"] = projectionDepthOnFields.getOrDefault("PullRequestReviewThreadResponseProjection.RepositoryResponseProjection.repository", 0) + 1
            this.repository(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewThreadResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewThreadResponseProjection.UserResponseProjection.resolvedBy", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestReviewThreadResponseProjection.UserResponseProjection.resolvedBy"] = projectionDepthOnFields.getOrDefault("PullRequestReviewThreadResponseProjection.UserResponseProjection.resolvedBy", 0) + 1
            this.resolvedBy(UserResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewThreadResponseProjection.UserResponseProjection.resolvedBy", 0)))
        }
        this.viewerCanResolve()
        this.viewerCanUnresolve()
        this.typename()
        return this
    }

    fun comments(subProjection: PullRequestReviewCommentConnectionResponseProjection): PullRequestReviewThreadResponseProjection = comments(null, subProjection)

    fun comments(alias: String?, subProjection: PullRequestReviewCommentConnectionResponseProjection): PullRequestReviewThreadResponseProjection {
        fields.add(GraphQLResponseField("comments").alias(alias).projection(subProjection))
        return this
    }

    fun comments(input: PullRequestReviewThreadCommentsParametrizedInput, subProjection: PullRequestReviewCommentConnectionResponseProjection): PullRequestReviewThreadResponseProjection = comments(null, input, subProjection)

    fun comments(alias: String?, input: PullRequestReviewThreadCommentsParametrizedInput, subProjection: PullRequestReviewCommentConnectionResponseProjection): PullRequestReviewThreadResponseProjection {
        fields.add(GraphQLResponseField("comments").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun id(): PullRequestReviewThreadResponseProjection = id(null)

    fun id(alias: String?): PullRequestReviewThreadResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun isResolved(): PullRequestReviewThreadResponseProjection = isResolved(null)

    fun isResolved(alias: String?): PullRequestReviewThreadResponseProjection {
        fields.add(GraphQLResponseField("isResolved").alias(alias))
        return this
    }

    fun pullRequest(subProjection: PullRequestResponseProjection): PullRequestReviewThreadResponseProjection = pullRequest(null, subProjection)

    fun pullRequest(alias: String?, subProjection: PullRequestResponseProjection): PullRequestReviewThreadResponseProjection {
        fields.add(GraphQLResponseField("pullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun repository(subProjection: RepositoryResponseProjection): PullRequestReviewThreadResponseProjection = repository(null, subProjection)

    fun repository(alias: String?, subProjection: RepositoryResponseProjection): PullRequestReviewThreadResponseProjection {
        fields.add(GraphQLResponseField("repository").alias(alias).projection(subProjection))
        return this
    }

    fun resolvedBy(subProjection: UserResponseProjection): PullRequestReviewThreadResponseProjection = resolvedBy(null, subProjection)

    fun resolvedBy(alias: String?, subProjection: UserResponseProjection): PullRequestReviewThreadResponseProjection {
        fields.add(GraphQLResponseField("resolvedBy").alias(alias).projection(subProjection))
        return this
    }

    fun viewerCanResolve(): PullRequestReviewThreadResponseProjection = viewerCanResolve(null)

    fun viewerCanResolve(alias: String?): PullRequestReviewThreadResponseProjection {
        fields.add(GraphQLResponseField("viewerCanResolve").alias(alias))
        return this
    }

    fun viewerCanUnresolve(): PullRequestReviewThreadResponseProjection = viewerCanUnresolve(null)

    fun viewerCanUnresolve(alias: String?): PullRequestReviewThreadResponseProjection {
        fields.add(GraphQLResponseField("viewerCanUnresolve").alias(alias))
        return this
    }

    fun typename(): PullRequestReviewThreadResponseProjection = typename(null)

    fun typename(alias: String?): PullRequestReviewThreadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
