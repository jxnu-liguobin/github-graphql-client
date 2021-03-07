package io.github.graphql.resolver;

import io.github.graphql.model.*;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public interface QueryResolver {

    CodeOfConductTO codeOfConduct(String key) throws Exception;

    java.util.List<CodeOfConductTO> codesOfConduct() throws Exception;

    LicenseTO license(String key) throws Exception;

    @javax.validation.constraints.NotNull
    java.util.List<LicenseTO> licenses() throws Exception;

    @javax.validation.constraints.NotNull
    java.util.List<MarketplaceCategoryTO> marketplaceCategories(Boolean excludeEmpty, Boolean excludeSubcategories, java.util.List<String> includeCategories) throws Exception;

    MarketplaceCategoryTO marketplaceCategory(String slug, Boolean useTopicAliases) throws Exception;

    MarketplaceListingTO marketplaceListing(String slug) throws Exception;

    @javax.validation.constraints.NotNull
    MarketplaceListingConnectionTO marketplaceListings(String adminId, String after, Boolean allStates, String before, String categorySlug, Integer first, Integer last, String organizationId, Boolean primaryCategoryOnly, java.util.List<String> slugs, Boolean useTopicAliases, Boolean viewerCanAdmin, Boolean withFreeTrialsOnly) throws Exception;

    @javax.validation.constraints.NotNull
    GitHubMetadataTO meta() throws Exception;

    NodeTO node(String id) throws Exception;

    @javax.validation.constraints.NotNull
    java.util.List<NodeTO> nodes(java.util.List<String> ids) throws Exception;

    OrganizationTO organization(String login) throws Exception;

    RateLimitTO rateLimit(Boolean dryRun) throws Exception;

    @javax.validation.constraints.NotNull
    QueryTO relay() throws Exception;

    RepositoryTO repository(String name, String owner) throws Exception;

    RepositoryOwnerTO repositoryOwner(String login) throws Exception;

    UniformResourceLocatableTO resource(String url) throws Exception;

    @javax.validation.constraints.NotNull
    SearchResultItemConnectionTO search(String after, String before, Integer first, Integer last, String query, SearchTypeTO type) throws Exception;

    @javax.validation.constraints.NotNull
    SecurityAdvisoryConnectionTO securityAdvisories(String after, String before, Integer first, SecurityAdvisoryIdentifierFilterTO identifier, Integer last, SecurityAdvisoryOrderTO orderBy, String publishedSince, String updatedSince) throws Exception;

    SecurityAdvisoryTO securityAdvisory(String ghsaId) throws Exception;

    @javax.validation.constraints.NotNull
    SecurityVulnerabilityConnectionTO securityVulnerabilities(String after, String before, SecurityAdvisoryEcosystemTO ecosystem, Integer first, Integer last, SecurityVulnerabilityOrderTO orderBy, String Package, java.util.List<SecurityAdvisorySeverityTO> severities) throws Exception;

    SponsorsListingTO sponsorsListing(String slug) throws Exception;

    TopicTO topic(String name) throws Exception;

    UserTO user(String login) throws Exception;

    @javax.validation.constraints.NotNull
    UserTO viewer() throws Exception;

}
