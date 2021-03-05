package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for SearchResultItem
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class SearchResultItemResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): SearchResultItemResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): SearchResultItemResponseProjection {
        this.typename()
        return this
    }

    fun onApp(subProjection: AppResponseProjection): SearchResultItemResponseProjection = onApp(null, subProjection)

    fun onApp(alias: String?, subProjection: AppResponseProjection): SearchResultItemResponseProjection {
        fields.add(GraphQLResponseField("...on App").alias(alias).projection(subProjection))
        return this
    }

    fun onRepository(subProjection: RepositoryResponseProjection): SearchResultItemResponseProjection = onRepository(null, subProjection)

    fun onRepository(alias: String?, subProjection: RepositoryResponseProjection): SearchResultItemResponseProjection {
        fields.add(GraphQLResponseField("...on Repository").alias(alias).projection(subProjection))
        return this
    }

    fun onIssue(subProjection: IssueResponseProjection): SearchResultItemResponseProjection = onIssue(null, subProjection)

    fun onIssue(alias: String?, subProjection: IssueResponseProjection): SearchResultItemResponseProjection {
        fields.add(GraphQLResponseField("...on Issue").alias(alias).projection(subProjection))
        return this
    }

    fun onOrganization(subProjection: OrganizationResponseProjection): SearchResultItemResponseProjection = onOrganization(null, subProjection)

    fun onOrganization(alias: String?, subProjection: OrganizationResponseProjection): SearchResultItemResponseProjection {
        fields.add(GraphQLResponseField("...on Organization").alias(alias).projection(subProjection))
        return this
    }

    fun onUser(subProjection: UserResponseProjection): SearchResultItemResponseProjection = onUser(null, subProjection)

    fun onUser(alias: String?, subProjection: UserResponseProjection): SearchResultItemResponseProjection {
        fields.add(GraphQLResponseField("...on User").alias(alias).projection(subProjection))
        return this
    }

    fun onMarketplaceListing(subProjection: MarketplaceListingResponseProjection): SearchResultItemResponseProjection = onMarketplaceListing(null, subProjection)

    fun onMarketplaceListing(alias: String?, subProjection: MarketplaceListingResponseProjection): SearchResultItemResponseProjection {
        fields.add(GraphQLResponseField("...on MarketplaceListing").alias(alias).projection(subProjection))
        return this
    }

    fun onPullRequest(subProjection: PullRequestResponseProjection): SearchResultItemResponseProjection = onPullRequest(null, subProjection)

    fun onPullRequest(alias: String?, subProjection: PullRequestResponseProjection): SearchResultItemResponseProjection {
        fields.add(GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): SearchResultItemResponseProjection = typename(null)

    fun typename(alias: String?): SearchResultItemResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
