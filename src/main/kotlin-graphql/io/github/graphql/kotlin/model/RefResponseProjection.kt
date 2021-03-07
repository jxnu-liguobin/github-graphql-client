package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for Ref
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class RefResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): RefResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): RefResponseProjection {
        if (projectionDepthOnFields.getOrDefault("RefResponseProjection.PullRequestConnectionResponseProjection.associatedPullRequests", 0) <= maxDepth) {
            projectionDepthOnFields["RefResponseProjection.PullRequestConnectionResponseProjection.associatedPullRequests"] = projectionDepthOnFields.getOrDefault("RefResponseProjection.PullRequestConnectionResponseProjection.associatedPullRequests", 0) + 1
            this.associatedPullRequests(PullRequestConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RefResponseProjection.PullRequestConnectionResponseProjection.associatedPullRequests", 0)))
        }
        this.id()
        this.name()
        this.prefix()
        if (projectionDepthOnFields.getOrDefault("RefResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields["RefResponseProjection.RepositoryResponseProjection.repository"] = projectionDepthOnFields.getOrDefault("RefResponseProjection.RepositoryResponseProjection.repository", 0) + 1
            this.repository(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RefResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RefResponseProjection.GitObjectResponseProjection.target", 0) <= maxDepth) {
            projectionDepthOnFields["RefResponseProjection.GitObjectResponseProjection.target"] = projectionDepthOnFields.getOrDefault("RefResponseProjection.GitObjectResponseProjection.target", 0) + 1
            this.target(GitObjectResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RefResponseProjection.GitObjectResponseProjection.target", 0)))
        }
        this.typename()
        return this
    }

    fun associatedPullRequests(subProjection: PullRequestConnectionResponseProjection): RefResponseProjection = associatedPullRequests(null, subProjection)

    fun associatedPullRequests(alias: String?, subProjection: PullRequestConnectionResponseProjection): RefResponseProjection {
        fields.add(GraphQLResponseField("associatedPullRequests").alias(alias).projection(subProjection))
        return this
    }

    fun associatedPullRequests(input: RefAssociatedPullRequestsParametrizedInput, subProjection: PullRequestConnectionResponseProjection): RefResponseProjection = associatedPullRequests(null, input, subProjection)

    fun associatedPullRequests(alias: String?, input: RefAssociatedPullRequestsParametrizedInput, subProjection: PullRequestConnectionResponseProjection): RefResponseProjection {
        fields.add(GraphQLResponseField("associatedPullRequests").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun id(): RefResponseProjection = id(null)

    fun id(alias: String?): RefResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun name(): RefResponseProjection = name(null)

    fun name(alias: String?): RefResponseProjection {
        fields.add(GraphQLResponseField("name").alias(alias))
        return this
    }

    fun prefix(): RefResponseProjection = prefix(null)

    fun prefix(alias: String?): RefResponseProjection {
        fields.add(GraphQLResponseField("prefix").alias(alias))
        return this
    }

    fun repository(subProjection: RepositoryResponseProjection): RefResponseProjection = repository(null, subProjection)

    fun repository(alias: String?, subProjection: RepositoryResponseProjection): RefResponseProjection {
        fields.add(GraphQLResponseField("repository").alias(alias).projection(subProjection))
        return this
    }

    fun target(subProjection: GitObjectResponseProjection): RefResponseProjection = target(null, subProjection)

    fun target(alias: String?, subProjection: GitObjectResponseProjection): RefResponseProjection {
        fields.add(GraphQLResponseField("target").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): RefResponseProjection = typename(null)

    fun typename(alias: String?): RefResponseProjection {
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
        val that = other as RefResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
