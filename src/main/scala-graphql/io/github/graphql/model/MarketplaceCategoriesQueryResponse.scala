package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class MarketplaceCategoriesQueryResponse extends GraphQLResult[JMap[String, Seq[MarketplaceCategoryTO]]] {

    def marketplaceCategories(): Seq[MarketplaceCategoryTO] = {
        val data: JMap[String, Seq[MarketplaceCategoryTO]] = getData
        if (data != null) data.get(MarketplaceCategoriesQueryResponse.OPERATION_NAME) else null
    }

}

object MarketplaceCategoriesQueryResponse {

    private final val OPERATION_NAME: String = "marketplaceCategories"

}
