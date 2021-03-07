package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class MarketplaceCategoriesQueryResponse : GraphQLResult<MutableMap<String, List<MarketplaceCategoryTO>>>() {

    companion object {
        const val OPERATION_NAME: String = "marketplaceCategories"
    }

    fun marketplaceCategories(): List<MarketplaceCategoryTO> {
        val data: MutableMap<String, List<MarketplaceCategoryTO>> = super.getData()
        return data.getValue(OPERATION_NAME)
    }
}
