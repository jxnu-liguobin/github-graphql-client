package io.github.graphql.scala.resolver

import io.github.graphql.scala.model._

/**
 * Resolver for Sponsorable
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
trait SponsorableResolver {

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def sponsorshipsAsMaintainer(sponsorableTO: SponsorableTO, after: String, before: String, first: Option[Int], includePrivate: Option[Boolean], last: Option[Int], orderBy: SponsorshipOrderTO): SponsorshipConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def sponsorshipsAsSponsor(sponsorableTO: SponsorableTO, after: String, before: String, first: Option[Int], last: Option[Int], orderBy: SponsorshipOrderTO): SponsorshipConnectionTO

}
