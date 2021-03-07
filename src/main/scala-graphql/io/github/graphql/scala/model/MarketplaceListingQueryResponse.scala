package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
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
