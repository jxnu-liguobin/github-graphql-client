package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class UnresolveReviewThreadMutationResponse extends GraphQLResult[JMap[String, UnresolveReviewThreadPayloadTO]] {

    def unresolveReviewThread(): UnresolveReviewThreadPayloadTO = {
        val data: JMap[String, UnresolveReviewThreadPayloadTO] = getData
        if (data != null) data.get(UnresolveReviewThreadMutationResponse.OPERATION_NAME) else null
    }

}

object UnresolveReviewThreadMutationResponse {

    private final val OPERATION_NAME: String = "unresolveReviewThread"

}
