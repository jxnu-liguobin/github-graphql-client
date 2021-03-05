package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for Sponsorable
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
interface SponsorableResolver {

    @Throws(Exception::class)
    fun sponsorshipsAsMaintainer(sponsorableTO: SponsorableTO, after: String?, before: String?, first: Int?, includePrivate: Boolean?, last: Int?, orderBy: SponsorshipOrderTO?): SponsorshipConnectionTO

    @Throws(Exception::class)
    fun sponsorshipsAsSponsor(sponsorableTO: SponsorableTO, after: String?, before: String?, first: Int?, last: Int?, orderBy: SponsorshipOrderTO?): SponsorshipConnectionTO

}
