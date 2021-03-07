package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class SponsorsListingQueryResponse extends GraphQLResult[JMap[String, SponsorsListingTO]] {

    def sponsorsListing(): SponsorsListingTO = {
        val data: JMap[String, SponsorsListingTO] = getData
        if (data != null) data.get(SponsorsListingQueryResponse.OPERATION_NAME) else null
    }

}

object SponsorsListingQueryResponse {

    private final val OPERATION_NAME: String = "sponsorsListing"

}
