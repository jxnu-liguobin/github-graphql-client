package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for CreatedCommitContribution
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class CreatedCommitContributionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): CreatedCommitContributionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): CreatedCommitContributionResponseProjection {
        this.commitCount()
        this.isRestricted()
        this.occurredAt()
        if (projectionDepthOnFields.getOrDefault("CreatedCommitContributionResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields["CreatedCommitContributionResponseProjection.RepositoryResponseProjection.repository"] = projectionDepthOnFields.getOrDefault("CreatedCommitContributionResponseProjection.RepositoryResponseProjection.repository", 0) + 1
            this.repository(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CreatedCommitContributionResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.resourcePath()
        this.url()
        if (projectionDepthOnFields.getOrDefault("CreatedCommitContributionResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields["CreatedCommitContributionResponseProjection.UserResponseProjection.user"] = projectionDepthOnFields.getOrDefault("CreatedCommitContributionResponseProjection.UserResponseProjection.user", 0) + 1
            this.user(UserResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CreatedCommitContributionResponseProjection.UserResponseProjection.user", 0)))
        }
        this.typename()
        return this
    }

    fun commitCount(): CreatedCommitContributionResponseProjection = commitCount(null)

    fun commitCount(alias: String?): CreatedCommitContributionResponseProjection {
        fields.add(GraphQLResponseField("commitCount").alias(alias))
        return this
    }

    fun isRestricted(): CreatedCommitContributionResponseProjection = isRestricted(null)

    fun isRestricted(alias: String?): CreatedCommitContributionResponseProjection {
        fields.add(GraphQLResponseField("isRestricted").alias(alias))
        return this
    }

    fun occurredAt(): CreatedCommitContributionResponseProjection = occurredAt(null)

    fun occurredAt(alias: String?): CreatedCommitContributionResponseProjection {
        fields.add(GraphQLResponseField("occurredAt").alias(alias))
        return this
    }

    fun repository(subProjection: RepositoryResponseProjection): CreatedCommitContributionResponseProjection = repository(null, subProjection)

    fun repository(alias: String?, subProjection: RepositoryResponseProjection): CreatedCommitContributionResponseProjection {
        fields.add(GraphQLResponseField("repository").alias(alias).projection(subProjection))
        return this
    }

    fun resourcePath(): CreatedCommitContributionResponseProjection = resourcePath(null)

    fun resourcePath(alias: String?): CreatedCommitContributionResponseProjection {
        fields.add(GraphQLResponseField("resourcePath").alias(alias))
        return this
    }

    fun url(): CreatedCommitContributionResponseProjection = url(null)

    fun url(alias: String?): CreatedCommitContributionResponseProjection {
        fields.add(GraphQLResponseField("url").alias(alias))
        return this
    }

    fun user(subProjection: UserResponseProjection): CreatedCommitContributionResponseProjection = user(null, subProjection)

    fun user(alias: String?, subProjection: UserResponseProjection): CreatedCommitContributionResponseProjection {
        fields.add(GraphQLResponseField("user").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): CreatedCommitContributionResponseProjection = typename(null)

    fun typename(alias: String?): CreatedCommitContributionResponseProjection {
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
        val that = other as CreatedCommitContributionResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
