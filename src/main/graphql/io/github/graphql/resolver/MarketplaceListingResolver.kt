package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for MarketplaceListing
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
interface MarketplaceListingResolver {

    @Throws(Exception::class)
    fun logoUrl(marketplaceListingTO: MarketplaceListingTO, size: Int?): String?

}
