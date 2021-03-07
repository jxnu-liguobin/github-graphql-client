package io.github.graphql.kotlin.resolver

import io.github.graphql.kotlin.model.*

/**
 * Resolver for Sponsorable
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
interface SponsorableResolver {

    @Throws(Exception::class)
    fun sponsorshipsAsMaintainer(sponsorableTO: SponsorableTO, after: String?, before: String?, first: Int?, includePrivate: Boolean?, last: Int?, orderBy: SponsorshipOrderTO?): SponsorshipConnectionTO

    @Throws(Exception::class)
    fun sponsorshipsAsSponsor(sponsorableTO: SponsorableTO, after: String?, before: String?, first: Int?, last: Int?, orderBy: SponsorshipOrderTO?): SponsorshipConnectionTO

}
