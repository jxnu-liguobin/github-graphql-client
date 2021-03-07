package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for CommitContributionsByRepository
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class CommitContributionsByRepositoryResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): CommitContributionsByRepositoryResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): CommitContributionsByRepositoryResponseProjection {
        if (projectionDepthOnFields.getOrDefault("CommitContributionsByRepositoryResponseProjection.CreatedCommitContributionConnectionResponseProjection.contributions", 0) <= maxDepth) {
            projectionDepthOnFields["CommitContributionsByRepositoryResponseProjection.CreatedCommitContributionConnectionResponseProjection.contributions"] = projectionDepthOnFields.getOrDefault("CommitContributionsByRepositoryResponseProjection.CreatedCommitContributionConnectionResponseProjection.contributions", 0) + 1
            this.contributions(CreatedCommitContributionConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CommitContributionsByRepositoryResponseProjection.CreatedCommitContributionConnectionResponseProjection.contributions", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CommitContributionsByRepositoryResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields["CommitContributionsByRepositoryResponseProjection.RepositoryResponseProjection.repository"] = projectionDepthOnFields.getOrDefault("CommitContributionsByRepositoryResponseProjection.RepositoryResponseProjection.repository", 0) + 1
            this.repository(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CommitContributionsByRepositoryResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.resourcePath()
        this.url()
        this.typename()
        return this
    }

    fun contributions(subProjection: CreatedCommitContributionConnectionResponseProjection): CommitContributionsByRepositoryResponseProjection = contributions(null, subProjection)

    fun contributions(alias: String?, subProjection: CreatedCommitContributionConnectionResponseProjection): CommitContributionsByRepositoryResponseProjection {
        fields.add(GraphQLResponseField("contributions").alias(alias).projection(subProjection))
        return this
    }

    fun contributions(input: CommitContributionsByRepositoryContributionsParametrizedInput, subProjection: CreatedCommitContributionConnectionResponseProjection): CommitContributionsByRepositoryResponseProjection = contributions(null, input, subProjection)

    fun contributions(alias: String?, input: CommitContributionsByRepositoryContributionsParametrizedInput, subProjection: CreatedCommitContributionConnectionResponseProjection): CommitContributionsByRepositoryResponseProjection {
        fields.add(GraphQLResponseField("contributions").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun repository(subProjection: RepositoryResponseProjection): CommitContributionsByRepositoryResponseProjection = repository(null, subProjection)

    fun repository(alias: String?, subProjection: RepositoryResponseProjection): CommitContributionsByRepositoryResponseProjection {
        fields.add(GraphQLResponseField("repository").alias(alias).projection(subProjection))
        return this
    }

    fun resourcePath(): CommitContributionsByRepositoryResponseProjection = resourcePath(null)

    fun resourcePath(alias: String?): CommitContributionsByRepositoryResponseProjection {
        fields.add(GraphQLResponseField("resourcePath").alias(alias))
        return this
    }

    fun url(): CommitContributionsByRepositoryResponseProjection = url(null)

    fun url(alias: String?): CommitContributionsByRepositoryResponseProjection {
        fields.add(GraphQLResponseField("url").alias(alias))
        return this
    }

    fun typename(): CommitContributionsByRepositoryResponseProjection = typename(null)

    fun typename(alias: String?): CommitContributionsByRepositoryResponseProjection {
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
        val that = other as CommitContributionsByRepositoryResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
