package io.github.graphql.resolver

import io.github.graphql.model.*

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
interface MarketplaceCategoriesQueryResolver {

    @Throws(Exception::class)
    fun marketplaceCategories(excludeEmpty: Boolean?, excludeSubcategories: Boolean?, includeCategories: List<String>?): List<MarketplaceCategoryTO>

}
