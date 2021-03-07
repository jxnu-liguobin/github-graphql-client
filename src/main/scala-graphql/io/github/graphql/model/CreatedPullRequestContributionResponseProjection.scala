package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CreatedPullRequestContribution
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class CreatedPullRequestContributionResponseProjection extends GraphQLResponseProjection {

    override def all$(): CreatedPullRequestContributionResponseProjection = all$(3)

    override def all$(maxDepth: Int): CreatedPullRequestContributionResponseProjection = {
        this.isRestricted()
        this.occurredAt()
        if (projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedPullRequestContributionResponseProjection.PullRequestResponseProjection.pullRequest", projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1)
            this.pullRequest(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionResponseProjection.PullRequestResponseProjection.pullRequest", 0)))
        }
        this.resourcePath()
        this.url()
        if (projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedPullRequestContributionResponseProjection.UserResponseProjection.user", projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionResponseProjection.UserResponseProjection.user", 0) + 1)
            this.user(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionResponseProjection.UserResponseProjection.user", 0)))
        }
        this.typename()
        this
    }

    def isRestricted(): CreatedPullRequestContributionResponseProjection = {
        isRestricted(null.asInstanceOf[String])
    }

    def isRestricted(alias: String): CreatedPullRequestContributionResponseProjection = {
        fields.add(new GraphQLResponseField("isRestricted").alias(alias))
        this
    }

    def occurredAt(): CreatedPullRequestContributionResponseProjection = {
        occurredAt(null.asInstanceOf[String])
    }

    def occurredAt(alias: String): CreatedPullRequestContributionResponseProjection = {
        fields.add(new GraphQLResponseField("occurredAt").alias(alias))
        this
    }

    def pullRequest(subProjection: PullRequestResponseProjection): CreatedPullRequestContributionResponseProjection = {
        pullRequest(null.asInstanceOf[String], subProjection)
    }

    def pullRequest(alias: String, subProjection: PullRequestResponseProjection): CreatedPullRequestContributionResponseProjection = {
        fields.add(new GraphQLResponseField("pullRequest").alias(alias).projection(subProjection))
        this
    }

    def resourcePath(): CreatedPullRequestContributionResponseProjection = {
        resourcePath(null.asInstanceOf[String])
    }

    def resourcePath(alias: String): CreatedPullRequestContributionResponseProjection = {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias))
        this
    }

    def url(): CreatedPullRequestContributionResponseProjection = {
        url(null.asInstanceOf[String])
    }

    def url(alias: String): CreatedPullRequestContributionResponseProjection = {
        fields.add(new GraphQLResponseField("url").alias(alias))
        this
    }

    def user(subProjection: UserResponseProjection): CreatedPullRequestContributionResponseProjection = {
        user(null.asInstanceOf[String], subProjection)
    }

    def user(alias: String, subProjection: UserResponseProjection): CreatedPullRequestContributionResponseProjection = {
        fields.add(new GraphQLResponseField("user").alias(alias).projection(subProjection))
        this
    }

    def typename(): CreatedPullRequestContributionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): CreatedPullRequestContributionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
