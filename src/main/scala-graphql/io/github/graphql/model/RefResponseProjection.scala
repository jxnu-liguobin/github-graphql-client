package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Ref
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class RefResponseProjection extends GraphQLResponseProjection {

    override def all$(): RefResponseProjection = all$(3)

    override def all$(maxDepth: Int): RefResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("RefResponseProjection.PullRequestConnectionResponseProjection.associatedPullRequests", 0) <= maxDepth) {
            projectionDepthOnFields.put("RefResponseProjection.PullRequestConnectionResponseProjection.associatedPullRequests", projectionDepthOnFields.getOrDefault("RefResponseProjection.PullRequestConnectionResponseProjection.associatedPullRequests", 0) + 1)
            this.associatedPullRequests(new PullRequestConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RefResponseProjection.PullRequestConnectionResponseProjection.associatedPullRequests", 0)))
        }
        this.id()
        this.name()
        this.prefix()
        if (projectionDepthOnFields.getOrDefault("RefResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("RefResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("RefResponseProjection.RepositoryResponseProjection.repository", 0) + 1)
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RefResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RefResponseProjection.GitObjectResponseProjection.target", 0) <= maxDepth) {
            projectionDepthOnFields.put("RefResponseProjection.GitObjectResponseProjection.target", projectionDepthOnFields.getOrDefault("RefResponseProjection.GitObjectResponseProjection.target", 0) + 1)
            this.target(new GitObjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RefResponseProjection.GitObjectResponseProjection.target", 0)))
        }
        this.typename()
        this
    }

    def associatedPullRequests(subProjection: PullRequestConnectionResponseProjection): RefResponseProjection = {
        associatedPullRequests(null.asInstanceOf[String], subProjection)
    }

    def associatedPullRequests(alias: String, subProjection: PullRequestConnectionResponseProjection): RefResponseProjection = {
        fields.add(new GraphQLResponseField("associatedPullRequests").alias(alias).projection(subProjection))
        this
    }

    def associatedPullRequests(input: RefAssociatedPullRequestsParametrizedInput,subProjection: PullRequestConnectionResponseProjection): RefResponseProjection = {
        associatedPullRequests(null.asInstanceOf[String], input, subProjection)
    }

    def associatedPullRequests(alias: String, input: RefAssociatedPullRequestsParametrizedInput , subProjection: PullRequestConnectionResponseProjection): RefResponseProjection = {
        fields.add(new GraphQLResponseField("associatedPullRequests").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def id(): RefResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): RefResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def name(): RefResponseProjection = {
        name(null.asInstanceOf[String])
    }

    def name(alias: String): RefResponseProjection = {
        fields.add(new GraphQLResponseField("name").alias(alias))
        this
    }

    def prefix(): RefResponseProjection = {
        prefix(null.asInstanceOf[String])
    }

    def prefix(alias: String): RefResponseProjection = {
        fields.add(new GraphQLResponseField("prefix").alias(alias))
        this
    }

    def repository(subProjection: RepositoryResponseProjection): RefResponseProjection = {
        repository(null.asInstanceOf[String], subProjection)
    }

    def repository(alias: String, subProjection: RepositoryResponseProjection): RefResponseProjection = {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection))
        this
    }

    def target(subProjection: GitObjectResponseProjection): RefResponseProjection = {
        target(null.asInstanceOf[String], subProjection)
    }

    def target(alias: String, subProjection: GitObjectResponseProjection): RefResponseProjection = {
        fields.add(new GraphQLResponseField("target").alias(alias).projection(subProjection))
        this
    }

    def typename(): RefResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): RefResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
