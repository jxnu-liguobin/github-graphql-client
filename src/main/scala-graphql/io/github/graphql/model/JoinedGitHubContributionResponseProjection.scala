package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for JoinedGitHubContribution
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class JoinedGitHubContributionResponseProjection extends GraphQLResponseProjection {

    override def all$(): JoinedGitHubContributionResponseProjection = all$(3)

    override def all$(maxDepth: Int): JoinedGitHubContributionResponseProjection = {
        this.isRestricted()
        this.occurredAt()
        this.resourcePath()
        this.url()
        if (projectionDepthOnFields.getOrDefault("JoinedGitHubContributionResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields.put("JoinedGitHubContributionResponseProjection.UserResponseProjection.user", projectionDepthOnFields.getOrDefault("JoinedGitHubContributionResponseProjection.UserResponseProjection.user", 0) + 1)
            this.user(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("JoinedGitHubContributionResponseProjection.UserResponseProjection.user", 0)))
        }
        this.typename()
        this
    }

    def isRestricted(): JoinedGitHubContributionResponseProjection = {
        isRestricted(null.asInstanceOf[String])
    }

    def isRestricted(alias: String): JoinedGitHubContributionResponseProjection = {
        fields.add(new GraphQLResponseField("isRestricted").alias(alias))
        this
    }

    def occurredAt(): JoinedGitHubContributionResponseProjection = {
        occurredAt(null.asInstanceOf[String])
    }

    def occurredAt(alias: String): JoinedGitHubContributionResponseProjection = {
        fields.add(new GraphQLResponseField("occurredAt").alias(alias))
        this
    }

    def resourcePath(): JoinedGitHubContributionResponseProjection = {
        resourcePath(null.asInstanceOf[String])
    }

    def resourcePath(alias: String): JoinedGitHubContributionResponseProjection = {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias))
        this
    }

    def url(): JoinedGitHubContributionResponseProjection = {
        url(null.asInstanceOf[String])
    }

    def url(alias: String): JoinedGitHubContributionResponseProjection = {
        fields.add(new GraphQLResponseField("url").alias(alias))
        this
    }

    def user(subProjection: UserResponseProjection): JoinedGitHubContributionResponseProjection = {
        user(null.asInstanceOf[String], subProjection)
    }

    def user(alias: String, subProjection: UserResponseProjection): JoinedGitHubContributionResponseProjection = {
        fields.add(new GraphQLResponseField("user").alias(alias).projection(subProjection))
        this
    }

    def typename(): JoinedGitHubContributionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): JoinedGitHubContributionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
