package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class SearchQueryResponse extends GraphQLResult[JMap[String, SearchResultItemConnectionTO]] {

    def search(): SearchResultItemConnectionTO = {
        val data: JMap[String, SearchResultItemConnectionTO] = getData
        if (data != null) data.get(SearchQueryResponse.OPERATION_NAME) else null
    }

}

object SearchQueryResponse {

    private final val OPERATION_NAME: String = "search"

}
