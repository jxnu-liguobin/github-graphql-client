package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for JoinedGitHubContribution
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class JoinedGitHubContributionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): JoinedGitHubContributionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): JoinedGitHubContributionResponseProjection {
        this.isRestricted()
        this.occurredAt()
        this.resourcePath()
        this.url()
        if (projectionDepthOnFields.getOrDefault("JoinedGitHubContributionResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields["JoinedGitHubContributionResponseProjection.UserResponseProjection.user"] = projectionDepthOnFields.getOrDefault("JoinedGitHubContributionResponseProjection.UserResponseProjection.user", 0) + 1
            this.user(UserResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("JoinedGitHubContributionResponseProjection.UserResponseProjection.user", 0)))
        }
        this.typename()
        return this
    }

    fun isRestricted(): JoinedGitHubContributionResponseProjection = isRestricted(null)

    fun isRestricted(alias: String?): JoinedGitHubContributionResponseProjection {
        fields.add(GraphQLResponseField("isRestricted").alias(alias))
        return this
    }

    fun occurredAt(): JoinedGitHubContributionResponseProjection = occurredAt(null)

    fun occurredAt(alias: String?): JoinedGitHubContributionResponseProjection {
        fields.add(GraphQLResponseField("occurredAt").alias(alias))
        return this
    }

    fun resourcePath(): JoinedGitHubContributionResponseProjection = resourcePath(null)

    fun resourcePath(alias: String?): JoinedGitHubContributionResponseProjection {
        fields.add(GraphQLResponseField("resourcePath").alias(alias))
        return this
    }

    fun url(): JoinedGitHubContributionResponseProjection = url(null)

    fun url(alias: String?): JoinedGitHubContributionResponseProjection {
        fields.add(GraphQLResponseField("url").alias(alias))
        return this
    }

    fun user(subProjection: UserResponseProjection): JoinedGitHubContributionResponseProjection = user(null, subProjection)

    fun user(alias: String?, subProjection: UserResponseProjection): JoinedGitHubContributionResponseProjection {
        fields.add(GraphQLResponseField("user").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): JoinedGitHubContributionResponseProjection = typename(null)

    fun typename(alias: String?): JoinedGitHubContributionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
