package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CommitContributionsByRepository
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class CommitContributionsByRepositoryResponseProjection extends GraphQLResponseProjection {

    override def all$(): CommitContributionsByRepositoryResponseProjection = all$(3)

    override def all$(maxDepth: Int): CommitContributionsByRepositoryResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("CommitContributionsByRepositoryResponseProjection.CreatedCommitContributionConnectionResponseProjection.contributions", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitContributionsByRepositoryResponseProjection.CreatedCommitContributionConnectionResponseProjection.contributions", projectionDepthOnFields.getOrDefault("CommitContributionsByRepositoryResponseProjection.CreatedCommitContributionConnectionResponseProjection.contributions", 0) + 1)
            this.contributions(new CreatedCommitContributionConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitContributionsByRepositoryResponseProjection.CreatedCommitContributionConnectionResponseProjection.contributions", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CommitContributionsByRepositoryResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitContributionsByRepositoryResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("CommitContributionsByRepositoryResponseProjection.RepositoryResponseProjection.repository", 0) + 1)
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitContributionsByRepositoryResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.resourcePath()
        this.url()
        this.typename()
        this
    }

    def contributions(subProjection: CreatedCommitContributionConnectionResponseProjection): CommitContributionsByRepositoryResponseProjection = {
        contributions(null.asInstanceOf[String], subProjection)
    }

    def contributions(alias: String, subProjection: CreatedCommitContributionConnectionResponseProjection): CommitContributionsByRepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("contributions").alias(alias).projection(subProjection))
        this
    }

    def contributions(input: CommitContributionsByRepositoryContributionsParametrizedInput,subProjection: CreatedCommitContributionConnectionResponseProjection): CommitContributionsByRepositoryResponseProjection = {
        contributions(null.asInstanceOf[String], input, subProjection)
    }

    def contributions(alias: String, input: CommitContributionsByRepositoryContributionsParametrizedInput , subProjection: CreatedCommitContributionConnectionResponseProjection): CommitContributionsByRepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("contributions").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def repository(subProjection: RepositoryResponseProjection): CommitContributionsByRepositoryResponseProjection = {
        repository(null.asInstanceOf[String], subProjection)
    }

    def repository(alias: String, subProjection: RepositoryResponseProjection): CommitContributionsByRepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection))
        this
    }

    def resourcePath(): CommitContributionsByRepositoryResponseProjection = {
        resourcePath(null.asInstanceOf[String])
    }

    def resourcePath(alias: String): CommitContributionsByRepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias))
        this
    }

    def url(): CommitContributionsByRepositoryResponseProjection = {
        url(null.asInstanceOf[String])
    }

    def url(alias: String): CommitContributionsByRepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("url").alias(alias))
        this
    }

    def typename(): CommitContributionsByRepositoryResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): CommitContributionsByRepositoryResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
