package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class MarketplaceListingsQueryResponse : GraphQLResult<MutableMap<String, MarketplaceListingConnectionTO>>() {

    companion object {
        const val OPERATION_NAME: String = "marketplaceListings"
    }

    fun marketplaceListings(): MarketplaceListingConnectionTO {
        val data: MutableMap<String, MarketplaceListingConnectionTO> = super.getData()
        return data.getValue(OPERATION_NAME)
    }
}
