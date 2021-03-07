package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class MarketplaceCategoryQueryResponse extends GraphQLResult[JMap[String, MarketplaceCategoryTO]] {

    def marketplaceCategory(): MarketplaceCategoryTO = {
        val data: JMap[String, MarketplaceCategoryTO] = getData
        if (data != null) data.get(MarketplaceCategoryQueryResponse.OPERATION_NAME) else null
    }

}

object MarketplaceCategoryQueryResponse {

    private final val OPERATION_NAME: String = "marketplaceCategory"

}
