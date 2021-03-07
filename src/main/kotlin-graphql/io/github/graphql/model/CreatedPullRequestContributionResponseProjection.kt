package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CreatedPullRequestContribution
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class CreatedPullRequestContributionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): CreatedPullRequestContributionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): CreatedPullRequestContributionResponseProjection {
        this.isRestricted()
        this.occurredAt()
        if (projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields["CreatedPullRequestContributionResponseProjection.PullRequestResponseProjection.pullRequest"] = projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1
            this.pullRequest(PullRequestResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionResponseProjection.PullRequestResponseProjection.pullRequest", 0)))
        }
        this.resourcePath()
        this.url()
        if (projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields["CreatedPullRequestContributionResponseProjection.UserResponseProjection.user"] = projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionResponseProjection.UserResponseProjection.user", 0) + 1
            this.user(UserResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionResponseProjection.UserResponseProjection.user", 0)))
        }
        this.typename()
        return this
    }

    fun isRestricted(): CreatedPullRequestContributionResponseProjection = isRestricted(null)

    fun isRestricted(alias: String?): CreatedPullRequestContributionResponseProjection {
        fields.add(GraphQLResponseField("isRestricted").alias(alias))
        return this
    }

    fun occurredAt(): CreatedPullRequestContributionResponseProjection = occurredAt(null)

    fun occurredAt(alias: String?): CreatedPullRequestContributionResponseProjection {
        fields.add(GraphQLResponseField("occurredAt").alias(alias))
        return this
    }

    fun pullRequest(subProjection: PullRequestResponseProjection): CreatedPullRequestContributionResponseProjection = pullRequest(null, subProjection)

    fun pullRequest(alias: String?, subProjection: PullRequestResponseProjection): CreatedPullRequestContributionResponseProjection {
        fields.add(GraphQLResponseField("pullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun resourcePath(): CreatedPullRequestContributionResponseProjection = resourcePath(null)

    fun resourcePath(alias: String?): CreatedPullRequestContributionResponseProjection {
        fields.add(GraphQLResponseField("resourcePath").alias(alias))
        return this
    }

    fun url(): CreatedPullRequestContributionResponseProjection = url(null)

    fun url(alias: String?): CreatedPullRequestContributionResponseProjection {
        fields.add(GraphQLResponseField("url").alias(alias))
        return this
    }

    fun user(subProjection: UserResponseProjection): CreatedPullRequestContributionResponseProjection = user(null, subProjection)

    fun user(alias: String?, subProjection: UserResponseProjection): CreatedPullRequestContributionResponseProjection {
        fields.add(GraphQLResponseField("user").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): CreatedPullRequestContributionResponseProjection = typename(null)

    fun typename(alias: String?): CreatedPullRequestContributionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
