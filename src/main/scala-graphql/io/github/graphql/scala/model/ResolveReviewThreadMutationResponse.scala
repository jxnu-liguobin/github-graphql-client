package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class ResolveReviewThreadMutationResponse extends GraphQLResult[JMap[String, ResolveReviewThreadPayloadTO]] {

    def resolveReviewThread(): ResolveReviewThreadPayloadTO = {
        val data: JMap[String, ResolveReviewThreadPayloadTO] = getData
        if (data != null) data.get(ResolveReviewThreadMutationResponse.OPERATION_NAME) else null
    }

}

object ResolveReviewThreadMutationResponse {

    private final val OPERATION_NAME: String = "resolveReviewThread"

}
