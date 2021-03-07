package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for SearchResultItem
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class SearchResultItemResponseProjection extends GraphQLResponseProjection {

    override def all$(): SearchResultItemResponseProjection = all$(3)

    override def all$(maxDepth: Int): SearchResultItemResponseProjection = {
        this.typename()
        this
    }

    def onApp(subProjection: AppResponseProjection): SearchResultItemResponseProjection = {
        onApp(null.asInstanceOf[String], subProjection)
    }

    def onApp(alias: String, subProjection: AppResponseProjection): SearchResultItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on App").alias(alias).projection(subProjection))
        this
    }

    def onRepository(subProjection: RepositoryResponseProjection): SearchResultItemResponseProjection = {
        onRepository(null.asInstanceOf[String], subProjection)
    }

    def onRepository(alias: String, subProjection: RepositoryResponseProjection): SearchResultItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on Repository").alias(alias).projection(subProjection))
        this
    }

    def onIssue(subProjection: IssueResponseProjection): SearchResultItemResponseProjection = {
        onIssue(null.asInstanceOf[String], subProjection)
    }

    def onIssue(alias: String, subProjection: IssueResponseProjection): SearchResultItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on Issue").alias(alias).projection(subProjection))
        this
    }

    def onOrganization(subProjection: OrganizationResponseProjection): SearchResultItemResponseProjection = {
        onOrganization(null.asInstanceOf[String], subProjection)
    }

    def onOrganization(alias: String, subProjection: OrganizationResponseProjection): SearchResultItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on Organization").alias(alias).projection(subProjection))
        this
    }

    def onUser(subProjection: UserResponseProjection): SearchResultItemResponseProjection = {
        onUser(null.asInstanceOf[String], subProjection)
    }

    def onUser(alias: String, subProjection: UserResponseProjection): SearchResultItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on User").alias(alias).projection(subProjection))
        this
    }

    def onMarketplaceListing(subProjection: MarketplaceListingResponseProjection): SearchResultItemResponseProjection = {
        onMarketplaceListing(null.asInstanceOf[String], subProjection)
    }

    def onMarketplaceListing(alias: String, subProjection: MarketplaceListingResponseProjection): SearchResultItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on MarketplaceListing").alias(alias).projection(subProjection))
        this
    }

    def onPullRequest(subProjection: PullRequestResponseProjection): SearchResultItemResponseProjection = {
        onPullRequest(null.asInstanceOf[String], subProjection)
    }

    def onPullRequest(alias: String, subProjection: PullRequestResponseProjection): SearchResultItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection))
        this
    }

    def typename(): SearchResultItemResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): SearchResultItemResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
