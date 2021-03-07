package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class MarketplaceListingsQueryResponse extends GraphQLResult[JMap[String, MarketplaceListingConnectionTO]] {

    def marketplaceListings(): MarketplaceListingConnectionTO = {
        val data: JMap[String, MarketplaceListingConnectionTO] = getData
        if (data != null) data.get(MarketplaceListingsQueryResponse.OPERATION_NAME) else null
    }

}

object MarketplaceListingsQueryResponse {

    private final val OPERATION_NAME: String = "marketplaceListings"

}
