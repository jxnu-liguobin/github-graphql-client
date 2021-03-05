package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CreatedRepositoryContribution
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class CreatedRepositoryContributionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): CreatedRepositoryContributionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): CreatedRepositoryContributionResponseProjection {
        this.isRestricted()
        this.occurredAt()
        if (projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields["CreatedRepositoryContributionResponseProjection.RepositoryResponseProjection.repository"] = projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionResponseProjection.RepositoryResponseProjection.repository", 0) + 1
            this.repository(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.resourcePath()
        this.url()
        if (projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields["CreatedRepositoryContributionResponseProjection.UserResponseProjection.user"] = projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionResponseProjection.UserResponseProjection.user", 0) + 1
            this.user(UserResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionResponseProjection.UserResponseProjection.user", 0)))
        }
        this.typename()
        return this
    }

    fun isRestricted(): CreatedRepositoryContributionResponseProjection = isRestricted(null)

    fun isRestricted(alias: String?): CreatedRepositoryContributionResponseProjection {
        fields.add(GraphQLResponseField("isRestricted").alias(alias))
        return this
    }

    fun occurredAt(): CreatedRepositoryContributionResponseProjection = occurredAt(null)

    fun occurredAt(alias: String?): CreatedRepositoryContributionResponseProjection {
        fields.add(GraphQLResponseField("occurredAt").alias(alias))
        return this
    }

    fun repository(subProjection: RepositoryResponseProjection): CreatedRepositoryContributionResponseProjection = repository(null, subProjection)

    fun repository(alias: String?, subProjection: RepositoryResponseProjection): CreatedRepositoryContributionResponseProjection {
        fields.add(GraphQLResponseField("repository").alias(alias).projection(subProjection))
        return this
    }

    fun resourcePath(): CreatedRepositoryContributionResponseProjection = resourcePath(null)

    fun resourcePath(alias: String?): CreatedRepositoryContributionResponseProjection {
        fields.add(GraphQLResponseField("resourcePath").alias(alias))
        return this
    }

    fun url(): CreatedRepositoryContributionResponseProjection = url(null)

    fun url(alias: String?): CreatedRepositoryContributionResponseProjection {
        fields.add(GraphQLResponseField("url").alias(alias))
        return this
    }

    fun user(subProjection: UserResponseProjection): CreatedRepositoryContributionResponseProjection = user(null, subProjection)

    fun user(alias: String?, subProjection: UserResponseProjection): CreatedRepositoryContributionResponseProjection {
        fields.add(GraphQLResponseField("user").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): CreatedRepositoryContributionResponseProjection = typename(null)

    fun typename(alias: String?): CreatedRepositoryContributionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
