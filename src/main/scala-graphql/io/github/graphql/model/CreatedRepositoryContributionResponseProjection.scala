package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CreatedRepositoryContribution
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class CreatedRepositoryContributionResponseProjection extends GraphQLResponseProjection {

    override def all$(): CreatedRepositoryContributionResponseProjection = all$(3)

    override def all$(maxDepth: Int): CreatedRepositoryContributionResponseProjection = {
        this.isRestricted()
        this.occurredAt()
        if (projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedRepositoryContributionResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionResponseProjection.RepositoryResponseProjection.repository", 0) + 1)
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.resourcePath()
        this.url()
        if (projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedRepositoryContributionResponseProjection.UserResponseProjection.user", projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionResponseProjection.UserResponseProjection.user", 0) + 1)
            this.user(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionResponseProjection.UserResponseProjection.user", 0)))
        }
        this.typename()
        this
    }

    def isRestricted(): CreatedRepositoryContributionResponseProjection = {
        isRestricted(null.asInstanceOf[String])
    }

    def isRestricted(alias: String): CreatedRepositoryContributionResponseProjection = {
        fields.add(new GraphQLResponseField("isRestricted").alias(alias))
        this
    }

    def occurredAt(): CreatedRepositoryContributionResponseProjection = {
        occurredAt(null.asInstanceOf[String])
    }

    def occurredAt(alias: String): CreatedRepositoryContributionResponseProjection = {
        fields.add(new GraphQLResponseField("occurredAt").alias(alias))
        this
    }

    def repository(subProjection: RepositoryResponseProjection): CreatedRepositoryContributionResponseProjection = {
        repository(null.asInstanceOf[String], subProjection)
    }

    def repository(alias: String, subProjection: RepositoryResponseProjection): CreatedRepositoryContributionResponseProjection = {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection))
        this
    }

    def resourcePath(): CreatedRepositoryContributionResponseProjection = {
        resourcePath(null.asInstanceOf[String])
    }

    def resourcePath(alias: String): CreatedRepositoryContributionResponseProjection = {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias))
        this
    }

    def url(): CreatedRepositoryContributionResponseProjection = {
        url(null.asInstanceOf[String])
    }

    def url(alias: String): CreatedRepositoryContributionResponseProjection = {
        fields.add(new GraphQLResponseField("url").alias(alias))
        this
    }

    def user(subProjection: UserResponseProjection): CreatedRepositoryContributionResponseProjection = {
        user(null.asInstanceOf[String], subProjection)
    }

    def user(alias: String, subProjection: UserResponseProjection): CreatedRepositoryContributionResponseProjection = {
        fields.add(new GraphQLResponseField("user").alias(alias).projection(subProjection))
        this
    }

    def typename(): CreatedRepositoryContributionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): CreatedRepositoryContributionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
