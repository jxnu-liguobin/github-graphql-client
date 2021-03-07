package io.github.graphql.scala.resolver

import io.github.graphql.scala.model._
import SearchTypeTO._
import SecurityAdvisoryEcosystemTO._
import Seq[SecurityAdvisorySeverityTO]._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
trait GitHubQueryResolver {

    @throws[Exception]
    def codeOfConduct(key: String): CodeOfConductTO

    @throws[Exception]
    def codesOfConduct(): Seq[CodeOfConductTO]

    @throws[Exception]
    def license(key: String): LicenseTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def licenses(): Seq[LicenseTO]

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def marketplaceCategories(excludeEmpty: Option[Boolean], excludeSubcategories: Option[Boolean], includeCategories: Seq[String]): Seq[MarketplaceCategoryTO]

    @throws[Exception]
    def marketplaceCategory(slug: String, useTopicAliases: Option[Boolean]): MarketplaceCategoryTO

    @throws[Exception]
    def marketplaceListing(slug: String): MarketplaceListingTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def marketplaceListings(adminId: String, after: String, allStates: Option[Boolean], before: String, categorySlug: String, first: Option[Int], last: Option[Int], organizationId: String, primaryCategoryOnly: Option[Boolean], slugs: Seq[String], useTopicAliases: Option[Boolean], viewerCanAdmin: Option[Boolean], withFreeTrialsOnly: Option[Boolean]): MarketplaceListingConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def meta(): GitHubMetadataTO

    @throws[Exception]
    def node(id: String): NodeTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def nodes(ids: Seq[String]): Seq[NodeTO]

    @throws[Exception]
    def organization(login: String): OrganizationTO

    @throws[Exception]
    def rateLimit(dryRun: Option[Boolean]): RateLimitTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def relay(): QueryTO

    @throws[Exception]
    def repository(name: String, owner: String): RepositoryTO

    @throws[Exception]
    def repositoryOwner(login: String): RepositoryOwnerTO

    @throws[Exception]
    def resource(url: String): UniformResourceLocatableTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def search(after: String, before: String, first: Option[Int], last: Option[Int], query: String, `type`: SearchTypeTO): SearchResultItemConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def securityAdvisories(after: String, before: String, first: Option[Int], identifier: SecurityAdvisoryIdentifierFilterTO, last: Option[Int], orderBy: SecurityAdvisoryOrderTO, publishedSince: String, updatedSince: String): SecurityAdvisoryConnectionTO

    @throws[Exception]
    def securityAdvisory(ghsaId: String): SecurityAdvisoryTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def securityVulnerabilities(after: String, before: String, ecosystem: SecurityAdvisoryEcosystemTO, first: Option[Int], last: Option[Int], orderBy: SecurityVulnerabilityOrderTO, `package`: String, severities: Seq[SecurityAdvisorySeverityTO]): SecurityVulnerabilityConnectionTO

    @throws[Exception]
    def sponsorsListing(slug: String): SponsorsListingTO

    @throws[Exception]
    def topic(name: String): TopicTO

    @throws[Exception]
    def user(login: String): UserTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def viewer(): UserTO

}
