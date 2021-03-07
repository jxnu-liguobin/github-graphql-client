package io.github.graphql.resolver

import io.github.graphql.model._

/**
 * Resolver for MarketplaceListing
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
trait MarketplaceListingResolver {

    @throws[Exception]
    def logoUrl(marketplaceListingTO: MarketplaceListingTO, size: Option[Int]): String

}
