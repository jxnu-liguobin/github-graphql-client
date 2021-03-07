package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class MarketplaceListingQueryResponse extends GraphQLResult[JMap[String, MarketplaceListingTO]] {

    def marketplaceListing(): MarketplaceListingTO = {
        val data: JMap[String, MarketplaceListingTO] = getData
        if (data != null) data.get(MarketplaceListingQueryResponse.OPERATION_NAME) else null
    }

}

object MarketplaceListingQueryResponse {

    private final val OPERATION_NAME: String = "marketplaceListing"

}
