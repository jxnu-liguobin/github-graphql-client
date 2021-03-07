package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for JoinedGitHubContribution
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as JoinedGitHubContributionResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
