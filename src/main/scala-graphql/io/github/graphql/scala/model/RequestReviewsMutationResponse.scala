package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class RequestReviewsMutationResponse extends GraphQLResult[JMap[String, RequestReviewsPayloadTO]] {

    def requestReviews(): RequestReviewsPayloadTO = {
        val data: JMap[String, RequestReviewsPayloadTO] = getData
        if (data != null) data.get(RequestReviewsMutationResponse.OPERATION_NAME) else null
    }

}

object RequestReviewsMutationResponse {

    private final val OPERATION_NAME: String = "requestReviews"

}
