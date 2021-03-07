package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for Query
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class QueryResponseProjection extends GraphQLResponseProjection {

    override def all$(): QueryResponseProjection = all$(3)

    override def all$(maxDepth: Int): QueryResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.CodeOfConductResponseProjection.codeOfConduct", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.CodeOfConductResponseProjection.codeOfConduct", projectionDepthOnFields.getOrDefault("QueryResponseProjection.CodeOfConductResponseProjection.codeOfConduct", 0) + 1)
            this.codeOfConduct(new CodeOfConductResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.CodeOfConductResponseProjection.codeOfConduct", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.CodeOfConductResponseProjection.codesOfConduct", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.CodeOfConductResponseProjection.codesOfConduct", projectionDepthOnFields.getOrDefault("QueryResponseProjection.CodeOfConductResponseProjection.codesOfConduct", 0) + 1)
            this.codesOfConduct(new CodeOfConductResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.CodeOfConductResponseProjection.codesOfConduct", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.LicenseResponseProjection.license", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.LicenseResponseProjection.license", projectionDepthOnFields.getOrDefault("QueryResponseProjection.LicenseResponseProjection.license", 0) + 1)
            this.license(new LicenseResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.LicenseResponseProjection.license", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.LicenseResponseProjection.licenses", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.LicenseResponseProjection.licenses", projectionDepthOnFields.getOrDefault("QueryResponseProjection.LicenseResponseProjection.licenses", 0) + 1)
            this.licenses(new LicenseResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.LicenseResponseProjection.licenses", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.MarketplaceCategoryResponseProjection.marketplaceCategories", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.MarketplaceCategoryResponseProjection.marketplaceCategories", projectionDepthOnFields.getOrDefault("QueryResponseProjection.MarketplaceCategoryResponseProjection.marketplaceCategories", 0) + 1)
            this.marketplaceCategories(new MarketplaceCategoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.MarketplaceCategoryResponseProjection.marketplaceCategories", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.MarketplaceCategoryResponseProjection.marketplaceCategory", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.MarketplaceCategoryResponseProjection.marketplaceCategory", projectionDepthOnFields.getOrDefault("QueryResponseProjection.MarketplaceCategoryResponseProjection.marketplaceCategory", 0) + 1)
            this.marketplaceCategory(new MarketplaceCategoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.MarketplaceCategoryResponseProjection.marketplaceCategory", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.MarketplaceListingResponseProjection.marketplaceListing", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.MarketplaceListingResponseProjection.marketplaceListing", projectionDepthOnFields.getOrDefault("QueryResponseProjection.MarketplaceListingResponseProjection.marketplaceListing", 0) + 1)
            this.marketplaceListing(new MarketplaceListingResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.MarketplaceListingResponseProjection.marketplaceListing", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.MarketplaceListingConnectionResponseProjection.marketplaceListings", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.MarketplaceListingConnectionResponseProjection.marketplaceListings", projectionDepthOnFields.getOrDefault("QueryResponseProjection.MarketplaceListingConnectionResponseProjection.marketplaceListings", 0) + 1)
            this.marketplaceListings(new MarketplaceListingConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.MarketplaceListingConnectionResponseProjection.marketplaceListings", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.GitHubMetadataResponseProjection.meta", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.GitHubMetadataResponseProjection.meta", projectionDepthOnFields.getOrDefault("QueryResponseProjection.GitHubMetadataResponseProjection.meta", 0) + 1)
            this.meta(new GitHubMetadataResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.GitHubMetadataResponseProjection.meta", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.NodeResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.NodeResponseProjection.node", projectionDepthOnFields.getOrDefault("QueryResponseProjection.NodeResponseProjection.node", 0) + 1)
            this.node(new NodeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.NodeResponseProjection.node", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.NodeResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.NodeResponseProjection.nodes", projectionDepthOnFields.getOrDefault("QueryResponseProjection.NodeResponseProjection.nodes", 0) + 1)
            this.nodes(new NodeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.NodeResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.OrganizationResponseProjection.organization", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.OrganizationResponseProjection.organization", projectionDepthOnFields.getOrDefault("QueryResponseProjection.OrganizationResponseProjection.organization", 0) + 1)
            this.organization(new OrganizationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.OrganizationResponseProjection.organization", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.RateLimitResponseProjection.rateLimit", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.RateLimitResponseProjection.rateLimit", projectionDepthOnFields.getOrDefault("QueryResponseProjection.RateLimitResponseProjection.rateLimit", 0) + 1)
            this.rateLimit(new RateLimitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.RateLimitResponseProjection.rateLimit", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.QueryResponseProjection.relay", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.QueryResponseProjection.relay", projectionDepthOnFields.getOrDefault("QueryResponseProjection.QueryResponseProjection.relay", 0) + 1)
            this.relay(new QueryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.QueryResponseProjection.relay", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("QueryResponseProjection.RepositoryResponseProjection.repository", 0) + 1)
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.RepositoryOwnerResponseProjection.repositoryOwner", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.RepositoryOwnerResponseProjection.repositoryOwner", projectionDepthOnFields.getOrDefault("QueryResponseProjection.RepositoryOwnerResponseProjection.repositoryOwner", 0) + 1)
            this.repositoryOwner(new RepositoryOwnerResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.RepositoryOwnerResponseProjection.repositoryOwner", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.UniformResourceLocatableResponseProjection.resource", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.UniformResourceLocatableResponseProjection.resource", projectionDepthOnFields.getOrDefault("QueryResponseProjection.UniformResourceLocatableResponseProjection.resource", 0) + 1)
            this.resource(new UniformResourceLocatableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.UniformResourceLocatableResponseProjection.resource", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.SearchResultItemConnectionResponseProjection.search", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.SearchResultItemConnectionResponseProjection.search", projectionDepthOnFields.getOrDefault("QueryResponseProjection.SearchResultItemConnectionResponseProjection.search", 0) + 1)
            this.search(new SearchResultItemConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.SearchResultItemConnectionResponseProjection.search", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.SecurityAdvisoryConnectionResponseProjection.securityAdvisories", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.SecurityAdvisoryConnectionResponseProjection.securityAdvisories", projectionDepthOnFields.getOrDefault("QueryResponseProjection.SecurityAdvisoryConnectionResponseProjection.securityAdvisories", 0) + 1)
            this.securityAdvisories(new SecurityAdvisoryConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.SecurityAdvisoryConnectionResponseProjection.securityAdvisories", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.SecurityAdvisoryResponseProjection.securityAdvisory", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.SecurityAdvisoryResponseProjection.securityAdvisory", projectionDepthOnFields.getOrDefault("QueryResponseProjection.SecurityAdvisoryResponseProjection.securityAdvisory", 0) + 1)
            this.securityAdvisory(new SecurityAdvisoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.SecurityAdvisoryResponseProjection.securityAdvisory", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.SecurityVulnerabilityConnectionResponseProjection.securityVulnerabilities", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.SecurityVulnerabilityConnectionResponseProjection.securityVulnerabilities", projectionDepthOnFields.getOrDefault("QueryResponseProjection.SecurityVulnerabilityConnectionResponseProjection.securityVulnerabilities", 0) + 1)
            this.securityVulnerabilities(new SecurityVulnerabilityConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.SecurityVulnerabilityConnectionResponseProjection.securityVulnerabilities", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.SponsorsListingResponseProjection.sponsorsListing", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.SponsorsListingResponseProjection.sponsorsListing", projectionDepthOnFields.getOrDefault("QueryResponseProjection.SponsorsListingResponseProjection.sponsorsListing", 0) + 1)
            this.sponsorsListing(new SponsorsListingResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.SponsorsListingResponseProjection.sponsorsListing", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.TopicResponseProjection.topic", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.TopicResponseProjection.topic", projectionDepthOnFields.getOrDefault("QueryResponseProjection.TopicResponseProjection.topic", 0) + 1)
            this.topic(new TopicResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.TopicResponseProjection.topic", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.UserResponseProjection.user", projectionDepthOnFields.getOrDefault("QueryResponseProjection.UserResponseProjection.user", 0) + 1)
            this.user(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.UserResponseProjection.user", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.UserResponseProjection.viewer", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.UserResponseProjection.viewer", projectionDepthOnFields.getOrDefault("QueryResponseProjection.UserResponseProjection.viewer", 0) + 1)
            this.viewer(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.UserResponseProjection.viewer", 0)))
        }
        this.typename()
        this
    }

    def codeOfConduct(subProjection: CodeOfConductResponseProjection): QueryResponseProjection = {
        codeOfConduct(null.asInstanceOf[String], subProjection)
    }

    def codeOfConduct(alias: String, subProjection: CodeOfConductResponseProjection): QueryResponseProjection = {
        fields.add(new GraphQLResponseField("codeOfConduct").alias(alias).projection(subProjection))
        this
    }

    def codeOfConduct(input: QueryCodeOfConductParametrizedInput,subProjection: CodeOfConductResponseProjection): QueryResponseProjection = {
        codeOfConduct(null.asInstanceOf[String], input, subProjection)
    }

    def codeOfConduct(alias: String, input: QueryCodeOfConductParametrizedInput , subProjection: CodeOfConductResponseProjection): QueryResponseProjection = {
        fields.add(new GraphQLResponseField("codeOfConduct").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def codesOfConduct(subProjection: CodeOfConductResponseProjection): QueryResponseProjection = {
        codesOfConduct(null.asInstanceOf[String], subProjection)
    }

    def codesOfConduct(alias: String, subProjection: CodeOfConductResponseProjection): QueryResponseProjection = {
        fields.add(new GraphQLResponseField("codesOfConduct").alias(alias).projection(subProjection))
        this
    }

    def license(subProjection: LicenseResponseProjection): QueryResponseProjection = {
        license(null.asInstanceOf[String], subProjection)
    }

    def license(alias: String, subProjection: LicenseResponseProjection): QueryResponseProjection = {
        fields.add(new GraphQLResponseField("license").alias(alias).projection(subProjection))
        this
    }

    def license(input: QueryLicenseParametrizedInput,subProjection: LicenseResponseProjection): QueryResponseProjection = {
        license(null.asInstanceOf[String], input, subProjection)
    }

    def license(alias: String, input: QueryLicenseParametrizedInput , subProjection: LicenseResponseProjection): QueryResponseProjection = {
        fields.add(new GraphQLResponseField("license").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def licenses(subProjection: LicenseResponseProjection): QueryResponseProjection = {
        licenses(null.asInstanceOf[String], subProjection)
    }

    def licenses(alias: String, subProjection: LicenseResponseProjection): QueryResponseProjection = {
        fields.add(new GraphQLResponseField("licenses").alias(alias).projection(subProjection))
        this
    }

    def marketplaceCategories(subProjection: MarketplaceCategoryResponseProjection): QueryResponseProjection = {
        marketplaceCategories(null.asInstanceOf[String], subProjection)
    }

    def marketplaceCategories(alias: String, subProjection: MarketplaceCategoryResponseProjection): QueryResponseProjection = {
        fields.add(new GraphQLResponseField("marketplaceCategories").alias(alias).projection(subProjection))
        this
    }

    def marketplaceCategories(input: QueryMarketplaceCategoriesParametrizedInput,subProjection: MarketplaceCategoryResponseProjection): QueryResponseProjection = {
        marketplaceCategories(null.asInstanceOf[String], input, subProjection)
    }

    def marketplaceCategories(alias: String, input: QueryMarketplaceCategoriesParametrizedInput , subProjection: MarketplaceCategoryResponseProjection): QueryResponseProjection = {
        fields.add(new GraphQLResponseField("marketplaceCategories").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def marketplaceCategory(subProjection: MarketplaceCategoryResponseProjection): QueryResponseProjection = {
        marketplaceCategory(null.asInstanceOf[String], subProjection)
    }

    def marketplaceCategory(alias: String, subProjection: MarketplaceCategoryResponseProjection): QueryResponseProjection = {
        fields.add(new GraphQLResponseField("marketplaceCategory").alias(alias).projection(subProjection))
        this
    }

    def marketplaceCategory(input: QueryMarketplaceCategoryParametrizedInput,subProjection: MarketplaceCategoryResponseProjection): QueryResponseProjection = {
        marketplaceCategory(null.asInstanceOf[String], input, subProjection)
    }

    def marketplaceCategory(alias: String, input: QueryMarketplaceCategoryParametrizedInput , subProjection: MarketplaceCategoryResponseProjection): QueryResponseProjection = {
        fields.add(new GraphQLResponseField("marketplaceCategory").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def marketplaceListing(subProjection: MarketplaceListingResponseProjection): QueryResponseProjection = {
        marketplaceListing(null.asInstanceOf[String], subProjection)
    }

    def marketplaceListing(alias: String, subProjection: MarketplaceListingResponseProjection): QueryResponseProjection = {
        fields.add(new GraphQLResponseField("marketplaceListing").alias(alias).projection(subProjection))
        this
    }

    def marketplaceListing(input: QueryMarketplaceListingParametrizedInput,subProjection: MarketplaceListingResponseProjection): QueryResponseProjection = {
        marketplaceListing(null.asInstanceOf[String], input, subProjection)
    }

    def marketplaceListing(alias: String, input: QueryMarketplaceListingParametrizedInput , subProjection: MarketplaceListingResponseProjection): QueryResponseProjection = {
        fields.add(new GraphQLResponseField("marketplaceListing").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def marketplaceListings(subProjection: MarketplaceListingConnectionResponseProjection): QueryResponseProjection = {
        marketplaceListings(null.asInstanceOf[String], subProjection)
    }

    def marketplaceListings(alias: String, subProjection: MarketplaceListingConnectionResponseProjection): QueryResponseProjection = {
        fields.add(new GraphQLResponseField("marketplaceListings").alias(alias).projection(subProjection))
        this
    }

    def marketplaceListings(input: QueryMarketplaceListingsParametrizedInput,subProjection: MarketplaceListingConnectionResponseProjection): QueryResponseProjection = {
        marketplaceListings(null.asInstanceOf[String], input, subProjection)
    }

    def marketplaceListings(alias: String, input: QueryMarketplaceListingsParametrizedInput , subProjection: MarketplaceListingConnectionResponseProjection): QueryResponseProjection = {
        fields.add(new GraphQLResponseField("marketplaceListings").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def meta(subProjection: GitHubMetadataResponseProjection): QueryResponseProjection = {
        meta(null.asInstanceOf[String], subProjection)
    }

    def meta(alias: String, subProjection: GitHubMetadataResponseProjection): QueryResponseProjection = {
        fields.add(new GraphQLResponseField("meta").alias(alias).projection(subProjection))
        this
    }

    def node(subProjection: NodeResponseProjection): QueryResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: NodeResponseProjection): QueryResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def node(input: QueryNodeParametrizedInput,subProjection: NodeResponseProjection): QueryResponseProjection = {
        node(null.asInstanceOf[String], input, subProjection)
    }

    def node(alias: String, input: QueryNodeParametrizedInput , subProjection: NodeResponseProjection): QueryResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def nodes(subProjection: NodeResponseProjection): QueryResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: NodeResponseProjection): QueryResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def nodes(input: QueryNodesParametrizedInput,subProjection: NodeResponseProjection): QueryResponseProjection = {
        nodes(null.asInstanceOf[String], input, subProjection)
    }

    def nodes(alias: String, input: QueryNodesParametrizedInput , subProjection: NodeResponseProjection): QueryResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def organization(subProjection: OrganizationResponseProjection): QueryResponseProjection = {
        organization(null.asInstanceOf[String], subProjection)
    }

    def organization(alias: String, subProjection: OrganizationResponseProjection): QueryResponseProjection = {
        fields.add(new GraphQLResponseField("organization").alias(alias).projection(subProjection))
        this
    }

    def organization(input: QueryOrganizationParametrizedInput,subProjection: OrganizationResponseProjection): QueryResponseProjection = {
        organization(null.asInstanceOf[String], input, subProjection)
    }

    def organization(alias: String, input: QueryOrganizationParametrizedInput , subProjection: OrganizationResponseProjection): QueryResponseProjection = {
        fields.add(new GraphQLResponseField("organization").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def rateLimit(subProjection: RateLimitResponseProjection): QueryResponseProjection = {
        rateLimit(null.asInstanceOf[String], subProjection)
    }

    def rateLimit(alias: String, subProjection: RateLimitResponseProjection): QueryResponseProjection = {
        fields.add(new GraphQLResponseField("rateLimit").alias(alias).projection(subProjection))
        this
    }

    def rateLimit(input: QueryRateLimitParametrizedInput,subProjection: RateLimitResponseProjection): QueryResponseProjection = {
        rateLimit(null.asInstanceOf[String], input, subProjection)
    }

    def rateLimit(alias: String, input: QueryRateLimitParametrizedInput , subProjection: RateLimitResponseProjection): QueryResponseProjection = {
        fields.add(new GraphQLResponseField("rateLimit").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def relay(subProjection: QueryResponseProjection): QueryResponseProjection = {
        relay(null.asInstanceOf[String], subProjection)
    }

    def relay(alias: String, subProjection: QueryResponseProjection): QueryResponseProjection = {
        fields.add(new GraphQLResponseField("relay").alias(alias).projection(subProjection))
        this
    }

    def repository(subProjection: RepositoryResponseProjection): QueryResponseProjection = {
        repository(null.asInstanceOf[String], subProjection)
    }

    def repository(alias: String, subProjection: RepositoryResponseProjection): QueryResponseProjection = {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection))
        this
    }

    def repository(input: QueryRepositoryParametrizedInput,subProjection: RepositoryResponseProjection): QueryResponseProjection = {
        repository(null.asInstanceOf[String], input, subProjection)
    }

    def repository(alias: String, input: QueryRepositoryParametrizedInput , subProjection: RepositoryResponseProjection): QueryResponseProjection = {
        fields.add(new GraphQLResponseField("repository").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def repositoryOwner(subProjection: RepositoryOwnerResponseProjection): QueryResponseProjection = {
        repositoryOwner(null.asInstanceOf[String], subProjection)
    }

    def repositoryOwner(alias: String, subProjection: RepositoryOwnerResponseProjection): QueryResponseProjection = {
        fields.add(new GraphQLResponseField("repositoryOwner").alias(alias).projection(subProjection))
        this
    }

    def repositoryOwner(input: QueryRepositoryOwnerParametrizedInput,subProjection: RepositoryOwnerResponseProjection): QueryResponseProjection = {
        repositoryOwner(null.asInstanceOf[String], input, subProjection)
    }

    def repositoryOwner(alias: String, input: QueryRepositoryOwnerParametrizedInput , subProjection: RepositoryOwnerResponseProjection): QueryResponseProjection = {
        fields.add(new GraphQLResponseField("repositoryOwner").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def resource(subProjection: UniformResourceLocatableResponseProjection): QueryResponseProjection = {
        resource(null.asInstanceOf[String], subProjection)
    }

    def resource(alias: String, subProjection: UniformResourceLocatableResponseProjection): QueryResponseProjection = {
        fields.add(new GraphQLResponseField("resource").alias(alias).projection(subProjection))
        this
    }

    def resource(input: QueryResourceParametrizedInput,subProjection: UniformResourceLocatableResponseProjection): QueryResponseProjection = {
        resource(null.asInstanceOf[String], input, subProjection)
    }

    def resource(alias: String, input: QueryResourceParametrizedInput , subProjection: UniformResourceLocatableResponseProjection): QueryResponseProjection = {
        fields.add(new GraphQLResponseField("resource").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def search(subProjection: SearchResultItemConnectionResponseProjection): QueryResponseProjection = {
        search(null.asInstanceOf[String], subProjection)
    }

    def search(alias: String, subProjection: SearchResultItemConnectionResponseProjection): QueryResponseProjection = {
        fields.add(new GraphQLResponseField("search").alias(alias).projection(subProjection))
        this
    }

    def search(input: QuerySearchParametrizedInput,subProjection: SearchResultItemConnectionResponseProjection): QueryResponseProjection = {
        search(null.asInstanceOf[String], input, subProjection)
    }

    def search(alias: String, input: QuerySearchParametrizedInput , subProjection: SearchResultItemConnectionResponseProjection): QueryResponseProjection = {
        fields.add(new GraphQLResponseField("search").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def securityAdvisories(subProjection: SecurityAdvisoryConnectionResponseProjection): QueryResponseProjection = {
        securityAdvisories(null.asInstanceOf[String], subProjection)
    }

    def securityAdvisories(alias: String, subProjection: SecurityAdvisoryConnectionResponseProjection): QueryResponseProjection = {
        fields.add(new GraphQLResponseField("securityAdvisories").alias(alias).projection(subProjection))
        this
    }

    def securityAdvisories(input: QuerySecurityAdvisoriesParametrizedInput,subProjection: SecurityAdvisoryConnectionResponseProjection): QueryResponseProjection = {
        securityAdvisories(null.asInstanceOf[String], input, subProjection)
    }

    def securityAdvisories(alias: String, input: QuerySecurityAdvisoriesParametrizedInput , subProjection: SecurityAdvisoryConnectionResponseProjection): QueryResponseProjection = {
        fields.add(new GraphQLResponseField("securityAdvisories").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def securityAdvisory(subProjection: SecurityAdvisoryResponseProjection): QueryResponseProjection = {
        securityAdvisory(null.asInstanceOf[String], subProjection)
    }

    def securityAdvisory(alias: String, subProjection: SecurityAdvisoryResponseProjection): QueryResponseProjection = {
        fields.add(new GraphQLResponseField("securityAdvisory").alias(alias).projection(subProjection))
        this
    }

    def securityAdvisory(input: QuerySecurityAdvisoryParametrizedInput,subProjection: SecurityAdvisoryResponseProjection): QueryResponseProjection = {
        securityAdvisory(null.asInstanceOf[String], input, subProjection)
    }

    def securityAdvisory(alias: String, input: QuerySecurityAdvisoryParametrizedInput , subProjection: SecurityAdvisoryResponseProjection): QueryResponseProjection = {
        fields.add(new GraphQLResponseField("securityAdvisory").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def securityVulnerabilities(subProjection: SecurityVulnerabilityConnectionResponseProjection): QueryResponseProjection = {
        securityVulnerabilities(null.asInstanceOf[String], subProjection)
    }

    def securityVulnerabilities(alias: String, subProjection: SecurityVulnerabilityConnectionResponseProjection): QueryResponseProjection = {
        fields.add(new GraphQLResponseField("securityVulnerabilities").alias(alias).projection(subProjection))
        this
    }

    def securityVulnerabilities(input: QuerySecurityVulnerabilitiesParametrizedInput,subProjection: SecurityVulnerabilityConnectionResponseProjection): QueryResponseProjection = {
        securityVulnerabilities(null.asInstanceOf[String], input, subProjection)
    }

    def securityVulnerabilities(alias: String, input: QuerySecurityVulnerabilitiesParametrizedInput , subProjection: SecurityVulnerabilityConnectionResponseProjection): QueryResponseProjection = {
        fields.add(new GraphQLResponseField("securityVulnerabilities").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def sponsorsListing(subProjection: SponsorsListingResponseProjection): QueryResponseProjection = {
        sponsorsListing(null.asInstanceOf[String], subProjection)
    }

    def sponsorsListing(alias: String, subProjection: SponsorsListingResponseProjection): QueryResponseProjection = {
        fields.add(new GraphQLResponseField("sponsorsListing").alias(alias).projection(subProjection))
        this
    }

    def sponsorsListing(input: QuerySponsorsListingParametrizedInput,subProjection: SponsorsListingResponseProjection): QueryResponseProjection = {
        sponsorsListing(null.asInstanceOf[String], input, subProjection)
    }

    def sponsorsListing(alias: String, input: QuerySponsorsListingParametrizedInput , subProjection: SponsorsListingResponseProjection): QueryResponseProjection = {
        fields.add(new GraphQLResponseField("sponsorsListing").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def topic(subProjection: TopicResponseProjection): QueryResponseProjection = {
        topic(null.asInstanceOf[String], subProjection)
    }

    def topic(alias: String, subProjection: TopicResponseProjection): QueryResponseProjection = {
        fields.add(new GraphQLResponseField("topic").alias(alias).projection(subProjection))
        this
    }

    def topic(input: QueryTopicParametrizedInput,subProjection: TopicResponseProjection): QueryResponseProjection = {
        topic(null.asInstanceOf[String], input, subProjection)
    }

    def topic(alias: String, input: QueryTopicParametrizedInput , subProjection: TopicResponseProjection): QueryResponseProjection = {
        fields.add(new GraphQLResponseField("topic").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def user(subProjection: UserResponseProjection): QueryResponseProjection = {
        user(null.asInstanceOf[String], subProjection)
    }

    def user(alias: String, subProjection: UserResponseProjection): QueryResponseProjection = {
        fields.add(new GraphQLResponseField("user").alias(alias).projection(subProjection))
        this
    }

    def user(input: QueryUserParametrizedInput,subProjection: UserResponseProjection): QueryResponseProjection = {
        user(null.asInstanceOf[String], input, subProjection)
    }

    def user(alias: String, input: QueryUserParametrizedInput , subProjection: UserResponseProjection): QueryResponseProjection = {
        fields.add(new GraphQLResponseField("user").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def viewer(subProjection: UserResponseProjection): QueryResponseProjection = {
        viewer(null.asInstanceOf[String], subProjection)
    }

    def viewer(alias: String, subProjection: UserResponseProjection): QueryResponseProjection = {
        fields.add(new GraphQLResponseField("viewer").alias(alias).projection(subProjection))
        this
    }

    def typename(): QueryResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): QueryResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[QueryResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
