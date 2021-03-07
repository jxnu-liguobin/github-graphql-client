package io.github.graphql.kotlin.resolver

import io.github.graphql.kotlin.model.*

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
interface GitHubQueryResolver {

    @Throws(Exception::class)
    fun codeOfConduct(key: String): CodeOfConductTO?

    @Throws(Exception::class)
    fun codesOfConduct(): List<CodeOfConductTO?>?

    @Throws(Exception::class)
    fun license(key: String): LicenseTO?

    @Throws(Exception::class)
    fun licenses(): List<LicenseTO?>

    @Throws(Exception::class)
    fun marketplaceCategories(excludeEmpty: Boolean?, excludeSubcategories: Boolean?, includeCategories: List<String>?): List<MarketplaceCategoryTO>

    @Throws(Exception::class)
    fun marketplaceCategory(slug: String, useTopicAliases: Boolean?): MarketplaceCategoryTO?

    @Throws(Exception::class)
    fun marketplaceListing(slug: String): MarketplaceListingTO?

    @Throws(Exception::class)
    fun marketplaceListings(adminId: String?, after: String?, allStates: Boolean?, before: String?, categorySlug: String?, first: Int?, last: Int?, organizationId: String?, primaryCategoryOnly: Boolean?, slugs: List<String?>?, useTopicAliases: Boolean?, viewerCanAdmin: Boolean?, withFreeTrialsOnly: Boolean?): MarketplaceListingConnectionTO

    @Throws(Exception::class)
    fun meta(): GitHubMetadataTO

    @Throws(Exception::class)
    fun node(id: String): NodeTO?

    @Throws(Exception::class)
    fun nodes(ids: List<String>): List<NodeTO?>

    @Throws(Exception::class)
    fun organization(login: String): OrganizationTO?

    @Throws(Exception::class)
    fun rateLimit(dryRun: Boolean?): RateLimitTO?

    @Throws(Exception::class)
    fun relay(): QueryTO

    @Throws(Exception::class)
    fun repository(name: String, owner: String): RepositoryTO?

    @Throws(Exception::class)
    fun repositoryOwner(login: String): RepositoryOwnerTO?

    @Throws(Exception::class)
    fun resource(url: String): UniformResourceLocatableTO?

    @Throws(Exception::class)
    fun search(after: String?, before: String?, first: Int?, last: Int?, query: String, type: SearchTypeTO): SearchResultItemConnectionTO

    @Throws(Exception::class)
    fun securityAdvisories(after: String?, before: String?, first: Int?, identifier: SecurityAdvisoryIdentifierFilterTO?, last: Int?, orderBy: SecurityAdvisoryOrderTO?, publishedSince: String?, updatedSince: String?): SecurityAdvisoryConnectionTO

    @Throws(Exception::class)
    fun securityAdvisory(ghsaId: String): SecurityAdvisoryTO?

    @Throws(Exception::class)
    fun securityVulnerabilities(after: String?, before: String?, ecosystem: SecurityAdvisoryEcosystemTO?, first: Int?, last: Int?, orderBy: SecurityVulnerabilityOrderTO?, `package`: String?, severities: List<SecurityAdvisorySeverityTO>?): SecurityVulnerabilityConnectionTO

    @Throws(Exception::class)
    fun sponsorsListing(slug: String): SponsorsListingTO?

    @Throws(Exception::class)
    fun topic(name: String): TopicTO?

    @Throws(Exception::class)
    fun user(login: String): UserTO?

    @Throws(Exception::class)
    fun viewer(): UserTO

}
