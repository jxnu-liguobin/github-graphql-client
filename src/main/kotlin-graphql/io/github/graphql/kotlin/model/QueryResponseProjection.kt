package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for Query
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class QueryResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): QueryResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): QueryResponseProjection {
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.CodeOfConductResponseProjection.codeOfConduct", 0) <= maxDepth) {
            projectionDepthOnFields["QueryResponseProjection.CodeOfConductResponseProjection.codeOfConduct"] = projectionDepthOnFields.getOrDefault("QueryResponseProjection.CodeOfConductResponseProjection.codeOfConduct", 0) + 1
            this.codeOfConduct(CodeOfConductResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.CodeOfConductResponseProjection.codeOfConduct", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.CodeOfConductResponseProjection.codesOfConduct", 0) <= maxDepth) {
            projectionDepthOnFields["QueryResponseProjection.CodeOfConductResponseProjection.codesOfConduct"] = projectionDepthOnFields.getOrDefault("QueryResponseProjection.CodeOfConductResponseProjection.codesOfConduct", 0) + 1
            this.codesOfConduct(CodeOfConductResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.CodeOfConductResponseProjection.codesOfConduct", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.LicenseResponseProjection.license", 0) <= maxDepth) {
            projectionDepthOnFields["QueryResponseProjection.LicenseResponseProjection.license"] = projectionDepthOnFields.getOrDefault("QueryResponseProjection.LicenseResponseProjection.license", 0) + 1
            this.license(LicenseResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.LicenseResponseProjection.license", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.LicenseResponseProjection.licenses", 0) <= maxDepth) {
            projectionDepthOnFields["QueryResponseProjection.LicenseResponseProjection.licenses"] = projectionDepthOnFields.getOrDefault("QueryResponseProjection.LicenseResponseProjection.licenses", 0) + 1
            this.licenses(LicenseResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.LicenseResponseProjection.licenses", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.MarketplaceCategoryResponseProjection.marketplaceCategories", 0) <= maxDepth) {
            projectionDepthOnFields["QueryResponseProjection.MarketplaceCategoryResponseProjection.marketplaceCategories"] = projectionDepthOnFields.getOrDefault("QueryResponseProjection.MarketplaceCategoryResponseProjection.marketplaceCategories", 0) + 1
            this.marketplaceCategories(MarketplaceCategoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.MarketplaceCategoryResponseProjection.marketplaceCategories", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.MarketplaceCategoryResponseProjection.marketplaceCategory", 0) <= maxDepth) {
            projectionDepthOnFields["QueryResponseProjection.MarketplaceCategoryResponseProjection.marketplaceCategory"] = projectionDepthOnFields.getOrDefault("QueryResponseProjection.MarketplaceCategoryResponseProjection.marketplaceCategory", 0) + 1
            this.marketplaceCategory(MarketplaceCategoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.MarketplaceCategoryResponseProjection.marketplaceCategory", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.MarketplaceListingResponseProjection.marketplaceListing", 0) <= maxDepth) {
            projectionDepthOnFields["QueryResponseProjection.MarketplaceListingResponseProjection.marketplaceListing"] = projectionDepthOnFields.getOrDefault("QueryResponseProjection.MarketplaceListingResponseProjection.marketplaceListing", 0) + 1
            this.marketplaceListing(MarketplaceListingResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.MarketplaceListingResponseProjection.marketplaceListing", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.MarketplaceListingConnectionResponseProjection.marketplaceListings", 0) <= maxDepth) {
            projectionDepthOnFields["QueryResponseProjection.MarketplaceListingConnectionResponseProjection.marketplaceListings"] = projectionDepthOnFields.getOrDefault("QueryResponseProjection.MarketplaceListingConnectionResponseProjection.marketplaceListings", 0) + 1
            this.marketplaceListings(MarketplaceListingConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.MarketplaceListingConnectionResponseProjection.marketplaceListings", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.GitHubMetadataResponseProjection.meta", 0) <= maxDepth) {
            projectionDepthOnFields["QueryResponseProjection.GitHubMetadataResponseProjection.meta"] = projectionDepthOnFields.getOrDefault("QueryResponseProjection.GitHubMetadataResponseProjection.meta", 0) + 1
            this.meta(GitHubMetadataResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.GitHubMetadataResponseProjection.meta", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.NodeResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["QueryResponseProjection.NodeResponseProjection.node"] = projectionDepthOnFields.getOrDefault("QueryResponseProjection.NodeResponseProjection.node", 0) + 1
            this.node(NodeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.NodeResponseProjection.node", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.NodeResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["QueryResponseProjection.NodeResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("QueryResponseProjection.NodeResponseProjection.nodes", 0) + 1
            this.nodes(NodeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.NodeResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.OrganizationResponseProjection.organization", 0) <= maxDepth) {
            projectionDepthOnFields["QueryResponseProjection.OrganizationResponseProjection.organization"] = projectionDepthOnFields.getOrDefault("QueryResponseProjection.OrganizationResponseProjection.organization", 0) + 1
            this.organization(OrganizationResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.OrganizationResponseProjection.organization", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.RateLimitResponseProjection.rateLimit", 0) <= maxDepth) {
            projectionDepthOnFields["QueryResponseProjection.RateLimitResponseProjection.rateLimit"] = projectionDepthOnFields.getOrDefault("QueryResponseProjection.RateLimitResponseProjection.rateLimit", 0) + 1
            this.rateLimit(RateLimitResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.RateLimitResponseProjection.rateLimit", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.QueryResponseProjection.relay", 0) <= maxDepth) {
            projectionDepthOnFields["QueryResponseProjection.QueryResponseProjection.relay"] = projectionDepthOnFields.getOrDefault("QueryResponseProjection.QueryResponseProjection.relay", 0) + 1
            this.relay(QueryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.QueryResponseProjection.relay", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields["QueryResponseProjection.RepositoryResponseProjection.repository"] = projectionDepthOnFields.getOrDefault("QueryResponseProjection.RepositoryResponseProjection.repository", 0) + 1
            this.repository(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.RepositoryOwnerResponseProjection.repositoryOwner", 0) <= maxDepth) {
            projectionDepthOnFields["QueryResponseProjection.RepositoryOwnerResponseProjection.repositoryOwner"] = projectionDepthOnFields.getOrDefault("QueryResponseProjection.RepositoryOwnerResponseProjection.repositoryOwner", 0) + 1
            this.repositoryOwner(RepositoryOwnerResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.RepositoryOwnerResponseProjection.repositoryOwner", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.UniformResourceLocatableResponseProjection.resource", 0) <= maxDepth) {
            projectionDepthOnFields["QueryResponseProjection.UniformResourceLocatableResponseProjection.resource"] = projectionDepthOnFields.getOrDefault("QueryResponseProjection.UniformResourceLocatableResponseProjection.resource", 0) + 1
            this.resource(UniformResourceLocatableResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.UniformResourceLocatableResponseProjection.resource", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.SearchResultItemConnectionResponseProjection.search", 0) <= maxDepth) {
            projectionDepthOnFields["QueryResponseProjection.SearchResultItemConnectionResponseProjection.search"] = projectionDepthOnFields.getOrDefault("QueryResponseProjection.SearchResultItemConnectionResponseProjection.search", 0) + 1
            this.search(SearchResultItemConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.SearchResultItemConnectionResponseProjection.search", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.SecurityAdvisoryConnectionResponseProjection.securityAdvisories", 0) <= maxDepth) {
            projectionDepthOnFields["QueryResponseProjection.SecurityAdvisoryConnectionResponseProjection.securityAdvisories"] = projectionDepthOnFields.getOrDefault("QueryResponseProjection.SecurityAdvisoryConnectionResponseProjection.securityAdvisories", 0) + 1
            this.securityAdvisories(SecurityAdvisoryConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.SecurityAdvisoryConnectionResponseProjection.securityAdvisories", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.SecurityAdvisoryResponseProjection.securityAdvisory", 0) <= maxDepth) {
            projectionDepthOnFields["QueryResponseProjection.SecurityAdvisoryResponseProjection.securityAdvisory"] = projectionDepthOnFields.getOrDefault("QueryResponseProjection.SecurityAdvisoryResponseProjection.securityAdvisory", 0) + 1
            this.securityAdvisory(SecurityAdvisoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.SecurityAdvisoryResponseProjection.securityAdvisory", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.SecurityVulnerabilityConnectionResponseProjection.securityVulnerabilities", 0) <= maxDepth) {
            projectionDepthOnFields["QueryResponseProjection.SecurityVulnerabilityConnectionResponseProjection.securityVulnerabilities"] = projectionDepthOnFields.getOrDefault("QueryResponseProjection.SecurityVulnerabilityConnectionResponseProjection.securityVulnerabilities", 0) + 1
            this.securityVulnerabilities(SecurityVulnerabilityConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.SecurityVulnerabilityConnectionResponseProjection.securityVulnerabilities", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.SponsorsListingResponseProjection.sponsorsListing", 0) <= maxDepth) {
            projectionDepthOnFields["QueryResponseProjection.SponsorsListingResponseProjection.sponsorsListing"] = projectionDepthOnFields.getOrDefault("QueryResponseProjection.SponsorsListingResponseProjection.sponsorsListing", 0) + 1
            this.sponsorsListing(SponsorsListingResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.SponsorsListingResponseProjection.sponsorsListing", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.TopicResponseProjection.topic", 0) <= maxDepth) {
            projectionDepthOnFields["QueryResponseProjection.TopicResponseProjection.topic"] = projectionDepthOnFields.getOrDefault("QueryResponseProjection.TopicResponseProjection.topic", 0) + 1
            this.topic(TopicResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.TopicResponseProjection.topic", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields["QueryResponseProjection.UserResponseProjection.user"] = projectionDepthOnFields.getOrDefault("QueryResponseProjection.UserResponseProjection.user", 0) + 1
            this.user(UserResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.UserResponseProjection.user", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.UserResponseProjection.viewer", 0) <= maxDepth) {
            projectionDepthOnFields["QueryResponseProjection.UserResponseProjection.viewer"] = projectionDepthOnFields.getOrDefault("QueryResponseProjection.UserResponseProjection.viewer", 0) + 1
            this.viewer(UserResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.UserResponseProjection.viewer", 0)))
        }
        this.typename()
        return this
    }

    fun codeOfConduct(subProjection: CodeOfConductResponseProjection): QueryResponseProjection = codeOfConduct(null, subProjection)

    fun codeOfConduct(alias: String?, subProjection: CodeOfConductResponseProjection): QueryResponseProjection {
        fields.add(GraphQLResponseField("codeOfConduct").alias(alias).projection(subProjection))
        return this
    }

    fun codeOfConduct(input: QueryCodeOfConductParametrizedInput, subProjection: CodeOfConductResponseProjection): QueryResponseProjection = codeOfConduct(null, input, subProjection)

    fun codeOfConduct(alias: String?, input: QueryCodeOfConductParametrizedInput, subProjection: CodeOfConductResponseProjection): QueryResponseProjection {
        fields.add(GraphQLResponseField("codeOfConduct").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun codesOfConduct(subProjection: CodeOfConductResponseProjection): QueryResponseProjection = codesOfConduct(null, subProjection)

    fun codesOfConduct(alias: String?, subProjection: CodeOfConductResponseProjection): QueryResponseProjection {
        fields.add(GraphQLResponseField("codesOfConduct").alias(alias).projection(subProjection))
        return this
    }

    fun license(subProjection: LicenseResponseProjection): QueryResponseProjection = license(null, subProjection)

    fun license(alias: String?, subProjection: LicenseResponseProjection): QueryResponseProjection {
        fields.add(GraphQLResponseField("license").alias(alias).projection(subProjection))
        return this
    }

    fun license(input: QueryLicenseParametrizedInput, subProjection: LicenseResponseProjection): QueryResponseProjection = license(null, input, subProjection)

    fun license(alias: String?, input: QueryLicenseParametrizedInput, subProjection: LicenseResponseProjection): QueryResponseProjection {
        fields.add(GraphQLResponseField("license").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun licenses(subProjection: LicenseResponseProjection): QueryResponseProjection = licenses(null, subProjection)

    fun licenses(alias: String?, subProjection: LicenseResponseProjection): QueryResponseProjection {
        fields.add(GraphQLResponseField("licenses").alias(alias).projection(subProjection))
        return this
    }

    fun marketplaceCategories(subProjection: MarketplaceCategoryResponseProjection): QueryResponseProjection = marketplaceCategories(null, subProjection)

    fun marketplaceCategories(alias: String?, subProjection: MarketplaceCategoryResponseProjection): QueryResponseProjection {
        fields.add(GraphQLResponseField("marketplaceCategories").alias(alias).projection(subProjection))
        return this
    }

    fun marketplaceCategories(input: QueryMarketplaceCategoriesParametrizedInput, subProjection: MarketplaceCategoryResponseProjection): QueryResponseProjection = marketplaceCategories(null, input, subProjection)

    fun marketplaceCategories(alias: String?, input: QueryMarketplaceCategoriesParametrizedInput, subProjection: MarketplaceCategoryResponseProjection): QueryResponseProjection {
        fields.add(GraphQLResponseField("marketplaceCategories").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun marketplaceCategory(subProjection: MarketplaceCategoryResponseProjection): QueryResponseProjection = marketplaceCategory(null, subProjection)

    fun marketplaceCategory(alias: String?, subProjection: MarketplaceCategoryResponseProjection): QueryResponseProjection {
        fields.add(GraphQLResponseField("marketplaceCategory").alias(alias).projection(subProjection))
        return this
    }

    fun marketplaceCategory(input: QueryMarketplaceCategoryParametrizedInput, subProjection: MarketplaceCategoryResponseProjection): QueryResponseProjection = marketplaceCategory(null, input, subProjection)

    fun marketplaceCategory(alias: String?, input: QueryMarketplaceCategoryParametrizedInput, subProjection: MarketplaceCategoryResponseProjection): QueryResponseProjection {
        fields.add(GraphQLResponseField("marketplaceCategory").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun marketplaceListing(subProjection: MarketplaceListingResponseProjection): QueryResponseProjection = marketplaceListing(null, subProjection)

    fun marketplaceListing(alias: String?, subProjection: MarketplaceListingResponseProjection): QueryResponseProjection {
        fields.add(GraphQLResponseField("marketplaceListing").alias(alias).projection(subProjection))
        return this
    }

    fun marketplaceListing(input: QueryMarketplaceListingParametrizedInput, subProjection: MarketplaceListingResponseProjection): QueryResponseProjection = marketplaceListing(null, input, subProjection)

    fun marketplaceListing(alias: String?, input: QueryMarketplaceListingParametrizedInput, subProjection: MarketplaceListingResponseProjection): QueryResponseProjection {
        fields.add(GraphQLResponseField("marketplaceListing").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun marketplaceListings(subProjection: MarketplaceListingConnectionResponseProjection): QueryResponseProjection = marketplaceListings(null, subProjection)

    fun marketplaceListings(alias: String?, subProjection: MarketplaceListingConnectionResponseProjection): QueryResponseProjection {
        fields.add(GraphQLResponseField("marketplaceListings").alias(alias).projection(subProjection))
        return this
    }

    fun marketplaceListings(input: QueryMarketplaceListingsParametrizedInput, subProjection: MarketplaceListingConnectionResponseProjection): QueryResponseProjection = marketplaceListings(null, input, subProjection)

    fun marketplaceListings(alias: String?, input: QueryMarketplaceListingsParametrizedInput, subProjection: MarketplaceListingConnectionResponseProjection): QueryResponseProjection {
        fields.add(GraphQLResponseField("marketplaceListings").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun meta(subProjection: GitHubMetadataResponseProjection): QueryResponseProjection = meta(null, subProjection)

    fun meta(alias: String?, subProjection: GitHubMetadataResponseProjection): QueryResponseProjection {
        fields.add(GraphQLResponseField("meta").alias(alias).projection(subProjection))
        return this
    }

    fun node(subProjection: NodeResponseProjection): QueryResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: NodeResponseProjection): QueryResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun node(input: QueryNodeParametrizedInput, subProjection: NodeResponseProjection): QueryResponseProjection = node(null, input, subProjection)

    fun node(alias: String?, input: QueryNodeParametrizedInput, subProjection: NodeResponseProjection): QueryResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun nodes(subProjection: NodeResponseProjection): QueryResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: NodeResponseProjection): QueryResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(input: QueryNodesParametrizedInput, subProjection: NodeResponseProjection): QueryResponseProjection = nodes(null, input, subProjection)

    fun nodes(alias: String?, input: QueryNodesParametrizedInput, subProjection: NodeResponseProjection): QueryResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun organization(subProjection: OrganizationResponseProjection): QueryResponseProjection = organization(null, subProjection)

    fun organization(alias: String?, subProjection: OrganizationResponseProjection): QueryResponseProjection {
        fields.add(GraphQLResponseField("organization").alias(alias).projection(subProjection))
        return this
    }

    fun organization(input: QueryOrganizationParametrizedInput, subProjection: OrganizationResponseProjection): QueryResponseProjection = organization(null, input, subProjection)

    fun organization(alias: String?, input: QueryOrganizationParametrizedInput, subProjection: OrganizationResponseProjection): QueryResponseProjection {
        fields.add(GraphQLResponseField("organization").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun rateLimit(subProjection: RateLimitResponseProjection): QueryResponseProjection = rateLimit(null, subProjection)

    fun rateLimit(alias: String?, subProjection: RateLimitResponseProjection): QueryResponseProjection {
        fields.add(GraphQLResponseField("rateLimit").alias(alias).projection(subProjection))
        return this
    }

    fun rateLimit(input: QueryRateLimitParametrizedInput, subProjection: RateLimitResponseProjection): QueryResponseProjection = rateLimit(null, input, subProjection)

    fun rateLimit(alias: String?, input: QueryRateLimitParametrizedInput, subProjection: RateLimitResponseProjection): QueryResponseProjection {
        fields.add(GraphQLResponseField("rateLimit").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun relay(subProjection: QueryResponseProjection): QueryResponseProjection = relay(null, subProjection)

    fun relay(alias: String?, subProjection: QueryResponseProjection): QueryResponseProjection {
        fields.add(GraphQLResponseField("relay").alias(alias).projection(subProjection))
        return this
    }

    fun repository(subProjection: RepositoryResponseProjection): QueryResponseProjection = repository(null, subProjection)

    fun repository(alias: String?, subProjection: RepositoryResponseProjection): QueryResponseProjection {
        fields.add(GraphQLResponseField("repository").alias(alias).projection(subProjection))
        return this
    }

    fun repository(input: QueryRepositoryParametrizedInput, subProjection: RepositoryResponseProjection): QueryResponseProjection = repository(null, input, subProjection)

    fun repository(alias: String?, input: QueryRepositoryParametrizedInput, subProjection: RepositoryResponseProjection): QueryResponseProjection {
        fields.add(GraphQLResponseField("repository").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun repositoryOwner(subProjection: RepositoryOwnerResponseProjection): QueryResponseProjection = repositoryOwner(null, subProjection)

    fun repositoryOwner(alias: String?, subProjection: RepositoryOwnerResponseProjection): QueryResponseProjection {
        fields.add(GraphQLResponseField("repositoryOwner").alias(alias).projection(subProjection))
        return this
    }

    fun repositoryOwner(input: QueryRepositoryOwnerParametrizedInput, subProjection: RepositoryOwnerResponseProjection): QueryResponseProjection = repositoryOwner(null, input, subProjection)

    fun repositoryOwner(alias: String?, input: QueryRepositoryOwnerParametrizedInput, subProjection: RepositoryOwnerResponseProjection): QueryResponseProjection {
        fields.add(GraphQLResponseField("repositoryOwner").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun resource(subProjection: UniformResourceLocatableResponseProjection): QueryResponseProjection = resource(null, subProjection)

    fun resource(alias: String?, subProjection: UniformResourceLocatableResponseProjection): QueryResponseProjection {
        fields.add(GraphQLResponseField("resource").alias(alias).projection(subProjection))
        return this
    }

    fun resource(input: QueryResourceParametrizedInput, subProjection: UniformResourceLocatableResponseProjection): QueryResponseProjection = resource(null, input, subProjection)

    fun resource(alias: String?, input: QueryResourceParametrizedInput, subProjection: UniformResourceLocatableResponseProjection): QueryResponseProjection {
        fields.add(GraphQLResponseField("resource").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun search(subProjection: SearchResultItemConnectionResponseProjection): QueryResponseProjection = search(null, subProjection)

    fun search(alias: String?, subProjection: SearchResultItemConnectionResponseProjection): QueryResponseProjection {
        fields.add(GraphQLResponseField("search").alias(alias).projection(subProjection))
        return this
    }

    fun search(input: QuerySearchParametrizedInput, subProjection: SearchResultItemConnectionResponseProjection): QueryResponseProjection = search(null, input, subProjection)

    fun search(alias: String?, input: QuerySearchParametrizedInput, subProjection: SearchResultItemConnectionResponseProjection): QueryResponseProjection {
        fields.add(GraphQLResponseField("search").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun securityAdvisories(subProjection: SecurityAdvisoryConnectionResponseProjection): QueryResponseProjection = securityAdvisories(null, subProjection)

    fun securityAdvisories(alias: String?, subProjection: SecurityAdvisoryConnectionResponseProjection): QueryResponseProjection {
        fields.add(GraphQLResponseField("securityAdvisories").alias(alias).projection(subProjection))
        return this
    }

    fun securityAdvisories(input: QuerySecurityAdvisoriesParametrizedInput, subProjection: SecurityAdvisoryConnectionResponseProjection): QueryResponseProjection = securityAdvisories(null, input, subProjection)

    fun securityAdvisories(alias: String?, input: QuerySecurityAdvisoriesParametrizedInput, subProjection: SecurityAdvisoryConnectionResponseProjection): QueryResponseProjection {
        fields.add(GraphQLResponseField("securityAdvisories").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun securityAdvisory(subProjection: SecurityAdvisoryResponseProjection): QueryResponseProjection = securityAdvisory(null, subProjection)

    fun securityAdvisory(alias: String?, subProjection: SecurityAdvisoryResponseProjection): QueryResponseProjection {
        fields.add(GraphQLResponseField("securityAdvisory").alias(alias).projection(subProjection))
        return this
    }

    fun securityAdvisory(input: QuerySecurityAdvisoryParametrizedInput, subProjection: SecurityAdvisoryResponseProjection): QueryResponseProjection = securityAdvisory(null, input, subProjection)

    fun securityAdvisory(alias: String?, input: QuerySecurityAdvisoryParametrizedInput, subProjection: SecurityAdvisoryResponseProjection): QueryResponseProjection {
        fields.add(GraphQLResponseField("securityAdvisory").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun securityVulnerabilities(subProjection: SecurityVulnerabilityConnectionResponseProjection): QueryResponseProjection = securityVulnerabilities(null, subProjection)

    fun securityVulnerabilities(alias: String?, subProjection: SecurityVulnerabilityConnectionResponseProjection): QueryResponseProjection {
        fields.add(GraphQLResponseField("securityVulnerabilities").alias(alias).projection(subProjection))
        return this
    }

    fun securityVulnerabilities(input: QuerySecurityVulnerabilitiesParametrizedInput, subProjection: SecurityVulnerabilityConnectionResponseProjection): QueryResponseProjection = securityVulnerabilities(null, input, subProjection)

    fun securityVulnerabilities(alias: String?, input: QuerySecurityVulnerabilitiesParametrizedInput, subProjection: SecurityVulnerabilityConnectionResponseProjection): QueryResponseProjection {
        fields.add(GraphQLResponseField("securityVulnerabilities").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun sponsorsListing(subProjection: SponsorsListingResponseProjection): QueryResponseProjection = sponsorsListing(null, subProjection)

    fun sponsorsListing(alias: String?, subProjection: SponsorsListingResponseProjection): QueryResponseProjection {
        fields.add(GraphQLResponseField("sponsorsListing").alias(alias).projection(subProjection))
        return this
    }

    fun sponsorsListing(input: QuerySponsorsListingParametrizedInput, subProjection: SponsorsListingResponseProjection): QueryResponseProjection = sponsorsListing(null, input, subProjection)

    fun sponsorsListing(alias: String?, input: QuerySponsorsListingParametrizedInput, subProjection: SponsorsListingResponseProjection): QueryResponseProjection {
        fields.add(GraphQLResponseField("sponsorsListing").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun topic(subProjection: TopicResponseProjection): QueryResponseProjection = topic(null, subProjection)

    fun topic(alias: String?, subProjection: TopicResponseProjection): QueryResponseProjection {
        fields.add(GraphQLResponseField("topic").alias(alias).projection(subProjection))
        return this
    }

    fun topic(input: QueryTopicParametrizedInput, subProjection: TopicResponseProjection): QueryResponseProjection = topic(null, input, subProjection)

    fun topic(alias: String?, input: QueryTopicParametrizedInput, subProjection: TopicResponseProjection): QueryResponseProjection {
        fields.add(GraphQLResponseField("topic").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun user(subProjection: UserResponseProjection): QueryResponseProjection = user(null, subProjection)

    fun user(alias: String?, subProjection: UserResponseProjection): QueryResponseProjection {
        fields.add(GraphQLResponseField("user").alias(alias).projection(subProjection))
        return this
    }

    fun user(input: QueryUserParametrizedInput, subProjection: UserResponseProjection): QueryResponseProjection = user(null, input, subProjection)

    fun user(alias: String?, input: QueryUserParametrizedInput, subProjection: UserResponseProjection): QueryResponseProjection {
        fields.add(GraphQLResponseField("user").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun viewer(subProjection: UserResponseProjection): QueryResponseProjection = viewer(null, subProjection)

    fun viewer(alias: String?, subProjection: UserResponseProjection): QueryResponseProjection {
        fields.add(GraphQLResponseField("viewer").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): QueryResponseProjection = typename(null)

    fun typename(alias: String?): QueryResponseProjection {
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
        val that = other as QueryResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
