package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for IssueContributionsByRepository
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class IssueContributionsByRepositoryResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): IssueContributionsByRepositoryResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): IssueContributionsByRepositoryResponseProjection {
        if (projectionDepthOnFields.getOrDefault("IssueContributionsByRepositoryResponseProjection.CreatedIssueContributionConnectionResponseProjection.contributions", 0) <= maxDepth) {
            projectionDepthOnFields["IssueContributionsByRepositoryResponseProjection.CreatedIssueContributionConnectionResponseProjection.contributions"] = projectionDepthOnFields.getOrDefault("IssueContributionsByRepositoryResponseProjection.CreatedIssueContributionConnectionResponseProjection.contributions", 0) + 1
            this.contributions(CreatedIssueContributionConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("IssueContributionsByRepositoryResponseProjection.CreatedIssueContributionConnectionResponseProjection.contributions", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("IssueContributionsByRepositoryResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields["IssueContributionsByRepositoryResponseProjection.RepositoryResponseProjection.repository"] = projectionDepthOnFields.getOrDefault("IssueContributionsByRepositoryResponseProjection.RepositoryResponseProjection.repository", 0) + 1
            this.repository(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("IssueContributionsByRepositoryResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.typename()
        return this
    }

    fun contributions(subProjection: CreatedIssueContributionConnectionResponseProjection): IssueContributionsByRepositoryResponseProjection = contributions(null, subProjection)

    fun contributions(alias: String?, subProjection: CreatedIssueContributionConnectionResponseProjection): IssueContributionsByRepositoryResponseProjection {
        fields.add(GraphQLResponseField("contributions").alias(alias).projection(subProjection))
        return this
    }

    fun contributions(input: IssueContributionsByRepositoryContributionsParametrizedInput, subProjection: CreatedIssueContributionConnectionResponseProjection): IssueContributionsByRepositoryResponseProjection = contributions(null, input, subProjection)

    fun contributions(alias: String?, input: IssueContributionsByRepositoryContributionsParametrizedInput, subProjection: CreatedIssueContributionConnectionResponseProjection): IssueContributionsByRepositoryResponseProjection {
        fields.add(GraphQLResponseField("contributions").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun repository(subProjection: RepositoryResponseProjection): IssueContributionsByRepositoryResponseProjection = repository(null, subProjection)

    fun repository(alias: String?, subProjection: RepositoryResponseProjection): IssueContributionsByRepositoryResponseProjection {
        fields.add(GraphQLResponseField("repository").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): IssueContributionsByRepositoryResponseProjection = typename(null)

    fun typename(alias: String?): IssueContributionsByRepositoryResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
