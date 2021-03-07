package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ReviewDismissedEvent
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class ReviewDismissedEventResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ReviewDismissedEventResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ReviewDismissedEventResponseProjection {
        if (projectionDepthOnFields.getOrDefault("ReviewDismissedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields["ReviewDismissedEventResponseProjection.ActorResponseProjection.actor"] = projectionDepthOnFields.getOrDefault("ReviewDismissedEventResponseProjection.ActorResponseProjection.actor", 0) + 1
            this.actor(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReviewDismissedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.databaseId()
        this.dismissalMessage()
        this.dismissalMessageHTML()
        this.id()
        this.previousReviewState()
        if (projectionDepthOnFields.getOrDefault("ReviewDismissedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields["ReviewDismissedEventResponseProjection.PullRequestResponseProjection.pullRequest"] = projectionDepthOnFields.getOrDefault("ReviewDismissedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1
            this.pullRequest(PullRequestResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReviewDismissedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ReviewDismissedEventResponseProjection.PullRequestCommitResponseProjection.pullRequestCommit", 0) <= maxDepth) {
            projectionDepthOnFields["ReviewDismissedEventResponseProjection.PullRequestCommitResponseProjection.pullRequestCommit"] = projectionDepthOnFields.getOrDefault("ReviewDismissedEventResponseProjection.PullRequestCommitResponseProjection.pullRequestCommit", 0) + 1
            this.pullRequestCommit(PullRequestCommitResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReviewDismissedEventResponseProjection.PullRequestCommitResponseProjection.pullRequestCommit", 0)))
        }
        this.resourcePath()
        if (projectionDepthOnFields.getOrDefault("ReviewDismissedEventResponseProjection.PullRequestReviewResponseProjection.review", 0) <= maxDepth) {
            projectionDepthOnFields["ReviewDismissedEventResponseProjection.PullRequestReviewResponseProjection.review"] = projectionDepthOnFields.getOrDefault("ReviewDismissedEventResponseProjection.PullRequestReviewResponseProjection.review", 0) + 1
            this.review(PullRequestReviewResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReviewDismissedEventResponseProjection.PullRequestReviewResponseProjection.review", 0)))
        }
        this.url()
        this.typename()
        return this
    }

    fun actor(subProjection: ActorResponseProjection): ReviewDismissedEventResponseProjection = actor(null, subProjection)

    fun actor(alias: String?, subProjection: ActorResponseProjection): ReviewDismissedEventResponseProjection {
        fields.add(GraphQLResponseField("actor").alias(alias).projection(subProjection))
        return this
    }

    fun createdAt(): ReviewDismissedEventResponseProjection = createdAt(null)

    fun createdAt(alias: String?): ReviewDismissedEventResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun databaseId(): ReviewDismissedEventResponseProjection = databaseId(null)

    fun databaseId(alias: String?): ReviewDismissedEventResponseProjection {
        fields.add(GraphQLResponseField("databaseId").alias(alias))
        return this
    }

    fun dismissalMessage(): ReviewDismissedEventResponseProjection = dismissalMessage(null)

    fun dismissalMessage(alias: String?): ReviewDismissedEventResponseProjection {
        fields.add(GraphQLResponseField("dismissalMessage").alias(alias))
        return this
    }

    fun dismissalMessageHTML(): ReviewDismissedEventResponseProjection = dismissalMessageHTML(null)

    fun dismissalMessageHTML(alias: String?): ReviewDismissedEventResponseProjection {
        fields.add(GraphQLResponseField("dismissalMessageHTML").alias(alias))
        return this
    }

    fun id(): ReviewDismissedEventResponseProjection = id(null)

    fun id(alias: String?): ReviewDismissedEventResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun previousReviewState(): ReviewDismissedEventResponseProjection = previousReviewState(null)

    fun previousReviewState(alias: String?): ReviewDismissedEventResponseProjection {
        fields.add(GraphQLResponseField("previousReviewState").alias(alias))
        return this
    }

    fun pullRequest(subProjection: PullRequestResponseProjection): ReviewDismissedEventResponseProjection = pullRequest(null, subProjection)

    fun pullRequest(alias: String?, subProjection: PullRequestResponseProjection): ReviewDismissedEventResponseProjection {
        fields.add(GraphQLResponseField("pullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun pullRequestCommit(subProjection: PullRequestCommitResponseProjection): ReviewDismissedEventResponseProjection = pullRequestCommit(null, subProjection)

    fun pullRequestCommit(alias: String?, subProjection: PullRequestCommitResponseProjection): ReviewDismissedEventResponseProjection {
        fields.add(GraphQLResponseField("pullRequestCommit").alias(alias).projection(subProjection))
        return this
    }

    fun resourcePath(): ReviewDismissedEventResponseProjection = resourcePath(null)

    fun resourcePath(alias: String?): ReviewDismissedEventResponseProjection {
        fields.add(GraphQLResponseField("resourcePath").alias(alias))
        return this
    }

    fun review(subProjection: PullRequestReviewResponseProjection): ReviewDismissedEventResponseProjection = review(null, subProjection)

    fun review(alias: String?, subProjection: PullRequestReviewResponseProjection): ReviewDismissedEventResponseProjection {
        fields.add(GraphQLResponseField("review").alias(alias).projection(subProjection))
        return this
    }

    fun url(): ReviewDismissedEventResponseProjection = url(null)

    fun url(alias: String?): ReviewDismissedEventResponseProjection {
        fields.add(GraphQLResponseField("url").alias(alias))
        return this
    }

    fun typename(): ReviewDismissedEventResponseProjection = typename(null)

    fun typename(alias: String?): ReviewDismissedEventResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
