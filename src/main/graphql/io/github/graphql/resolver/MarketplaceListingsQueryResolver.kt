package io.github.graphql.resolver

import io.github.graphql.model.*

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
interface MarketplaceListingsQueryResolver {

    @Throws(Exception::class)
    fun marketplaceListings(adminId: String?, after: String?, allStates: Boolean?, before: String?, categorySlug: String?, first: Int?, last: Int?, organizationId: String?, primaryCategoryOnly: Boolean?, slugs: List<String?>?, useTopicAliases: Boolean?, viewerCanAdmin: Boolean?, withFreeTrialsOnly: Boolean?): MarketplaceListingConnectionTO

}
