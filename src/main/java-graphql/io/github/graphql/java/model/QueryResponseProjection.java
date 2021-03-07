package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for Query
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class QueryResponseProjection extends GraphQLResponseProjection {

    public QueryResponseProjection() {
    }

    @Override
    public QueryResponseProjection all$() {
        return all$(3);
    }

    @Override
    public QueryResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.CodeOfConductResponseProjection.codeOfConduct", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.CodeOfConductResponseProjection.codeOfConduct", projectionDepthOnFields.getOrDefault("QueryResponseProjection.CodeOfConductResponseProjection.codeOfConduct", 0) + 1);
            this.codeOfConduct(new CodeOfConductResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.CodeOfConductResponseProjection.codeOfConduct", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.CodeOfConductResponseProjection.codesOfConduct", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.CodeOfConductResponseProjection.codesOfConduct", projectionDepthOnFields.getOrDefault("QueryResponseProjection.CodeOfConductResponseProjection.codesOfConduct", 0) + 1);
            this.codesOfConduct(new CodeOfConductResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.CodeOfConductResponseProjection.codesOfConduct", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.LicenseResponseProjection.license", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.LicenseResponseProjection.license", projectionDepthOnFields.getOrDefault("QueryResponseProjection.LicenseResponseProjection.license", 0) + 1);
            this.license(new LicenseResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.LicenseResponseProjection.license", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.LicenseResponseProjection.licenses", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.LicenseResponseProjection.licenses", projectionDepthOnFields.getOrDefault("QueryResponseProjection.LicenseResponseProjection.licenses", 0) + 1);
            this.licenses(new LicenseResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.LicenseResponseProjection.licenses", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.MarketplaceCategoryResponseProjection.marketplaceCategories", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.MarketplaceCategoryResponseProjection.marketplaceCategories", projectionDepthOnFields.getOrDefault("QueryResponseProjection.MarketplaceCategoryResponseProjection.marketplaceCategories", 0) + 1);
            this.marketplaceCategories(new MarketplaceCategoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.MarketplaceCategoryResponseProjection.marketplaceCategories", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.MarketplaceCategoryResponseProjection.marketplaceCategory", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.MarketplaceCategoryResponseProjection.marketplaceCategory", projectionDepthOnFields.getOrDefault("QueryResponseProjection.MarketplaceCategoryResponseProjection.marketplaceCategory", 0) + 1);
            this.marketplaceCategory(new MarketplaceCategoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.MarketplaceCategoryResponseProjection.marketplaceCategory", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.MarketplaceListingResponseProjection.marketplaceListing", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.MarketplaceListingResponseProjection.marketplaceListing", projectionDepthOnFields.getOrDefault("QueryResponseProjection.MarketplaceListingResponseProjection.marketplaceListing", 0) + 1);
            this.marketplaceListing(new MarketplaceListingResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.MarketplaceListingResponseProjection.marketplaceListing", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.MarketplaceListingConnectionResponseProjection.marketplaceListings", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.MarketplaceListingConnectionResponseProjection.marketplaceListings", projectionDepthOnFields.getOrDefault("QueryResponseProjection.MarketplaceListingConnectionResponseProjection.marketplaceListings", 0) + 1);
            this.marketplaceListings(new MarketplaceListingConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.MarketplaceListingConnectionResponseProjection.marketplaceListings", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.GitHubMetadataResponseProjection.meta", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.GitHubMetadataResponseProjection.meta", projectionDepthOnFields.getOrDefault("QueryResponseProjection.GitHubMetadataResponseProjection.meta", 0) + 1);
            this.meta(new GitHubMetadataResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.GitHubMetadataResponseProjection.meta", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.NodeResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.NodeResponseProjection.node", projectionDepthOnFields.getOrDefault("QueryResponseProjection.NodeResponseProjection.node", 0) + 1);
            this.node(new NodeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.NodeResponseProjection.node", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.NodeResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.NodeResponseProjection.nodes", projectionDepthOnFields.getOrDefault("QueryResponseProjection.NodeResponseProjection.nodes", 0) + 1);
            this.nodes(new NodeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.NodeResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.OrganizationResponseProjection.organization", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.OrganizationResponseProjection.organization", projectionDepthOnFields.getOrDefault("QueryResponseProjection.OrganizationResponseProjection.organization", 0) + 1);
            this.organization(new OrganizationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.OrganizationResponseProjection.organization", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.RateLimitResponseProjection.rateLimit", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.RateLimitResponseProjection.rateLimit", projectionDepthOnFields.getOrDefault("QueryResponseProjection.RateLimitResponseProjection.rateLimit", 0) + 1);
            this.rateLimit(new RateLimitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.RateLimitResponseProjection.rateLimit", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.QueryResponseProjection.relay", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.QueryResponseProjection.relay", projectionDepthOnFields.getOrDefault("QueryResponseProjection.QueryResponseProjection.relay", 0) + 1);
            this.relay(new QueryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.QueryResponseProjection.relay", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("QueryResponseProjection.RepositoryResponseProjection.repository", 0) + 1);
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.RepositoryResponseProjection.repository", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.RepositoryOwnerResponseProjection.repositoryOwner", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.RepositoryOwnerResponseProjection.repositoryOwner", projectionDepthOnFields.getOrDefault("QueryResponseProjection.RepositoryOwnerResponseProjection.repositoryOwner", 0) + 1);
            this.repositoryOwner(new RepositoryOwnerResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.RepositoryOwnerResponseProjection.repositoryOwner", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.UniformResourceLocatableResponseProjection.resource", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.UniformResourceLocatableResponseProjection.resource", projectionDepthOnFields.getOrDefault("QueryResponseProjection.UniformResourceLocatableResponseProjection.resource", 0) + 1);
            this.resource(new UniformResourceLocatableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.UniformResourceLocatableResponseProjection.resource", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.SearchResultItemConnectionResponseProjection.search", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.SearchResultItemConnectionResponseProjection.search", projectionDepthOnFields.getOrDefault("QueryResponseProjection.SearchResultItemConnectionResponseProjection.search", 0) + 1);
            this.search(new SearchResultItemConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.SearchResultItemConnectionResponseProjection.search", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.SecurityAdvisoryConnectionResponseProjection.securityAdvisories", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.SecurityAdvisoryConnectionResponseProjection.securityAdvisories", projectionDepthOnFields.getOrDefault("QueryResponseProjection.SecurityAdvisoryConnectionResponseProjection.securityAdvisories", 0) + 1);
            this.securityAdvisories(new SecurityAdvisoryConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.SecurityAdvisoryConnectionResponseProjection.securityAdvisories", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.SecurityAdvisoryResponseProjection.securityAdvisory", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.SecurityAdvisoryResponseProjection.securityAdvisory", projectionDepthOnFields.getOrDefault("QueryResponseProjection.SecurityAdvisoryResponseProjection.securityAdvisory", 0) + 1);
            this.securityAdvisory(new SecurityAdvisoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.SecurityAdvisoryResponseProjection.securityAdvisory", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.SecurityVulnerabilityConnectionResponseProjection.securityVulnerabilities", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.SecurityVulnerabilityConnectionResponseProjection.securityVulnerabilities", projectionDepthOnFields.getOrDefault("QueryResponseProjection.SecurityVulnerabilityConnectionResponseProjection.securityVulnerabilities", 0) + 1);
            this.securityVulnerabilities(new SecurityVulnerabilityConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.SecurityVulnerabilityConnectionResponseProjection.securityVulnerabilities", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.SponsorsListingResponseProjection.sponsorsListing", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.SponsorsListingResponseProjection.sponsorsListing", projectionDepthOnFields.getOrDefault("QueryResponseProjection.SponsorsListingResponseProjection.sponsorsListing", 0) + 1);
            this.sponsorsListing(new SponsorsListingResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.SponsorsListingResponseProjection.sponsorsListing", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.TopicResponseProjection.topic", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.TopicResponseProjection.topic", projectionDepthOnFields.getOrDefault("QueryResponseProjection.TopicResponseProjection.topic", 0) + 1);
            this.topic(new TopicResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.TopicResponseProjection.topic", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.UserResponseProjection.user", projectionDepthOnFields.getOrDefault("QueryResponseProjection.UserResponseProjection.user", 0) + 1);
            this.user(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.UserResponseProjection.user", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("QueryResponseProjection.UserResponseProjection.viewer", 0) <= maxDepth) {
            projectionDepthOnFields.put("QueryResponseProjection.UserResponseProjection.viewer", projectionDepthOnFields.getOrDefault("QueryResponseProjection.UserResponseProjection.viewer", 0) + 1);
            this.viewer(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("QueryResponseProjection.UserResponseProjection.viewer", 0)));
        }
        this.typename();
        return this;
    }

    public QueryResponseProjection codeOfConduct(CodeOfConductResponseProjection subProjection) {
        return codeOfConduct((String)null, subProjection);
    }

    public QueryResponseProjection codeOfConduct(String alias, CodeOfConductResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("codeOfConduct").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection codeOfConduct(QueryCodeOfConductParametrizedInput input, CodeOfConductResponseProjection subProjection) {
        return codeOfConduct(null, input, subProjection);
    }

    public QueryResponseProjection codeOfConduct(String alias, QueryCodeOfConductParametrizedInput input, CodeOfConductResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("codeOfConduct").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection codesOfConduct(CodeOfConductResponseProjection subProjection) {
        return codesOfConduct(null, subProjection);
    }

    public QueryResponseProjection codesOfConduct(String alias, CodeOfConductResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("codesOfConduct").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection license(LicenseResponseProjection subProjection) {
        return license((String)null, subProjection);
    }

    public QueryResponseProjection license(String alias, LicenseResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("license").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection license(QueryLicenseParametrizedInput input, LicenseResponseProjection subProjection) {
        return license(null, input, subProjection);
    }

    public QueryResponseProjection license(String alias, QueryLicenseParametrizedInput input, LicenseResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("license").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection licenses(LicenseResponseProjection subProjection) {
        return licenses(null, subProjection);
    }

    public QueryResponseProjection licenses(String alias, LicenseResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("licenses").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection marketplaceCategories(MarketplaceCategoryResponseProjection subProjection) {
        return marketplaceCategories((String)null, subProjection);
    }

    public QueryResponseProjection marketplaceCategories(String alias, MarketplaceCategoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("marketplaceCategories").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection marketplaceCategories(QueryMarketplaceCategoriesParametrizedInput input, MarketplaceCategoryResponseProjection subProjection) {
        return marketplaceCategories(null, input, subProjection);
    }

    public QueryResponseProjection marketplaceCategories(String alias, QueryMarketplaceCategoriesParametrizedInput input, MarketplaceCategoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("marketplaceCategories").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection marketplaceCategory(MarketplaceCategoryResponseProjection subProjection) {
        return marketplaceCategory((String)null, subProjection);
    }

    public QueryResponseProjection marketplaceCategory(String alias, MarketplaceCategoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("marketplaceCategory").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection marketplaceCategory(QueryMarketplaceCategoryParametrizedInput input, MarketplaceCategoryResponseProjection subProjection) {
        return marketplaceCategory(null, input, subProjection);
    }

    public QueryResponseProjection marketplaceCategory(String alias, QueryMarketplaceCategoryParametrizedInput input, MarketplaceCategoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("marketplaceCategory").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection marketplaceListing(MarketplaceListingResponseProjection subProjection) {
        return marketplaceListing((String)null, subProjection);
    }

    public QueryResponseProjection marketplaceListing(String alias, MarketplaceListingResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("marketplaceListing").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection marketplaceListing(QueryMarketplaceListingParametrizedInput input, MarketplaceListingResponseProjection subProjection) {
        return marketplaceListing(null, input, subProjection);
    }

    public QueryResponseProjection marketplaceListing(String alias, QueryMarketplaceListingParametrizedInput input, MarketplaceListingResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("marketplaceListing").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection marketplaceListings(MarketplaceListingConnectionResponseProjection subProjection) {
        return marketplaceListings((String)null, subProjection);
    }

    public QueryResponseProjection marketplaceListings(String alias, MarketplaceListingConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("marketplaceListings").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection marketplaceListings(QueryMarketplaceListingsParametrizedInput input, MarketplaceListingConnectionResponseProjection subProjection) {
        return marketplaceListings(null, input, subProjection);
    }

    public QueryResponseProjection marketplaceListings(String alias, QueryMarketplaceListingsParametrizedInput input, MarketplaceListingConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("marketplaceListings").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection meta(GitHubMetadataResponseProjection subProjection) {
        return meta(null, subProjection);
    }

    public QueryResponseProjection meta(String alias, GitHubMetadataResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("meta").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection node(NodeResponseProjection subProjection) {
        return node((String)null, subProjection);
    }

    public QueryResponseProjection node(String alias, NodeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection node(QueryNodeParametrizedInput input, NodeResponseProjection subProjection) {
        return node(null, input, subProjection);
    }

    public QueryResponseProjection node(String alias, QueryNodeParametrizedInput input, NodeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection nodes(NodeResponseProjection subProjection) {
        return nodes((String)null, subProjection);
    }

    public QueryResponseProjection nodes(String alias, NodeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection nodes(QueryNodesParametrizedInput input, NodeResponseProjection subProjection) {
        return nodes(null, input, subProjection);
    }

    public QueryResponseProjection nodes(String alias, QueryNodesParametrizedInput input, NodeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection organization(OrganizationResponseProjection subProjection) {
        return organization((String)null, subProjection);
    }

    public QueryResponseProjection organization(String alias, OrganizationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("organization").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection organization(QueryOrganizationParametrizedInput input, OrganizationResponseProjection subProjection) {
        return organization(null, input, subProjection);
    }

    public QueryResponseProjection organization(String alias, QueryOrganizationParametrizedInput input, OrganizationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("organization").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection rateLimit(RateLimitResponseProjection subProjection) {
        return rateLimit((String)null, subProjection);
    }

    public QueryResponseProjection rateLimit(String alias, RateLimitResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("rateLimit").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection rateLimit(QueryRateLimitParametrizedInput input, RateLimitResponseProjection subProjection) {
        return rateLimit(null, input, subProjection);
    }

    public QueryResponseProjection rateLimit(String alias, QueryRateLimitParametrizedInput input, RateLimitResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("rateLimit").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection relay(QueryResponseProjection subProjection) {
        return relay(null, subProjection);
    }

    public QueryResponseProjection relay(String alias, QueryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("relay").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection repository(RepositoryResponseProjection subProjection) {
        return repository((String)null, subProjection);
    }

    public QueryResponseProjection repository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection repository(QueryRepositoryParametrizedInput input, RepositoryResponseProjection subProjection) {
        return repository(null, input, subProjection);
    }

    public QueryResponseProjection repository(String alias, QueryRepositoryParametrizedInput input, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repository").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection repositoryOwner(RepositoryOwnerResponseProjection subProjection) {
        return repositoryOwner((String)null, subProjection);
    }

    public QueryResponseProjection repositoryOwner(String alias, RepositoryOwnerResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repositoryOwner").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection repositoryOwner(QueryRepositoryOwnerParametrizedInput input, RepositoryOwnerResponseProjection subProjection) {
        return repositoryOwner(null, input, subProjection);
    }

    public QueryResponseProjection repositoryOwner(String alias, QueryRepositoryOwnerParametrizedInput input, RepositoryOwnerResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repositoryOwner").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection resource(UniformResourceLocatableResponseProjection subProjection) {
        return resource((String)null, subProjection);
    }

    public QueryResponseProjection resource(String alias, UniformResourceLocatableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("resource").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection resource(QueryResourceParametrizedInput input, UniformResourceLocatableResponseProjection subProjection) {
        return resource(null, input, subProjection);
    }

    public QueryResponseProjection resource(String alias, QueryResourceParametrizedInput input, UniformResourceLocatableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("resource").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection search(SearchResultItemConnectionResponseProjection subProjection) {
        return search((String)null, subProjection);
    }

    public QueryResponseProjection search(String alias, SearchResultItemConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("search").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection search(QuerySearchParametrizedInput input, SearchResultItemConnectionResponseProjection subProjection) {
        return search(null, input, subProjection);
    }

    public QueryResponseProjection search(String alias, QuerySearchParametrizedInput input, SearchResultItemConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("search").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection securityAdvisories(SecurityAdvisoryConnectionResponseProjection subProjection) {
        return securityAdvisories((String)null, subProjection);
    }

    public QueryResponseProjection securityAdvisories(String alias, SecurityAdvisoryConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("securityAdvisories").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection securityAdvisories(QuerySecurityAdvisoriesParametrizedInput input, SecurityAdvisoryConnectionResponseProjection subProjection) {
        return securityAdvisories(null, input, subProjection);
    }

    public QueryResponseProjection securityAdvisories(String alias, QuerySecurityAdvisoriesParametrizedInput input, SecurityAdvisoryConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("securityAdvisories").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection securityAdvisory(SecurityAdvisoryResponseProjection subProjection) {
        return securityAdvisory((String)null, subProjection);
    }

    public QueryResponseProjection securityAdvisory(String alias, SecurityAdvisoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("securityAdvisory").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection securityAdvisory(QuerySecurityAdvisoryParametrizedInput input, SecurityAdvisoryResponseProjection subProjection) {
        return securityAdvisory(null, input, subProjection);
    }

    public QueryResponseProjection securityAdvisory(String alias, QuerySecurityAdvisoryParametrizedInput input, SecurityAdvisoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("securityAdvisory").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection securityVulnerabilities(SecurityVulnerabilityConnectionResponseProjection subProjection) {
        return securityVulnerabilities((String)null, subProjection);
    }

    public QueryResponseProjection securityVulnerabilities(String alias, SecurityVulnerabilityConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("securityVulnerabilities").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection securityVulnerabilities(QuerySecurityVulnerabilitiesParametrizedInput input, SecurityVulnerabilityConnectionResponseProjection subProjection) {
        return securityVulnerabilities(null, input, subProjection);
    }

    public QueryResponseProjection securityVulnerabilities(String alias, QuerySecurityVulnerabilitiesParametrizedInput input, SecurityVulnerabilityConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("securityVulnerabilities").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection sponsorsListing(SponsorsListingResponseProjection subProjection) {
        return sponsorsListing((String)null, subProjection);
    }

    public QueryResponseProjection sponsorsListing(String alias, SponsorsListingResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("sponsorsListing").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection sponsorsListing(QuerySponsorsListingParametrizedInput input, SponsorsListingResponseProjection subProjection) {
        return sponsorsListing(null, input, subProjection);
    }

    public QueryResponseProjection sponsorsListing(String alias, QuerySponsorsListingParametrizedInput input, SponsorsListingResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("sponsorsListing").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection topic(TopicResponseProjection subProjection) {
        return topic((String)null, subProjection);
    }

    public QueryResponseProjection topic(String alias, TopicResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("topic").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection topic(QueryTopicParametrizedInput input, TopicResponseProjection subProjection) {
        return topic(null, input, subProjection);
    }

    public QueryResponseProjection topic(String alias, QueryTopicParametrizedInput input, TopicResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("topic").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection user(UserResponseProjection subProjection) {
        return user((String)null, subProjection);
    }

    public QueryResponseProjection user(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("user").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection user(QueryUserParametrizedInput input, UserResponseProjection subProjection) {
        return user(null, input, subProjection);
    }

    public QueryResponseProjection user(String alias, QueryUserParametrizedInput input, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("user").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public QueryResponseProjection viewer(UserResponseProjection subProjection) {
        return viewer(null, subProjection);
    }

    public QueryResponseProjection viewer(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("viewer").alias(alias).projection(subProjection));
        return this;
    }

    public QueryResponseProjection typename() {
        return typename(null);
    }

    public QueryResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final QueryResponseProjection that = (QueryResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
