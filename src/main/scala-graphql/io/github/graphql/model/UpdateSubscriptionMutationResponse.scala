package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class UpdateSubscriptionMutationResponse extends GraphQLResult[JMap[String, UpdateSubscriptionPayloadTO]] {

    def updateSubscription(): UpdateSubscriptionPayloadTO = {
        val data: JMap[String, UpdateSubscriptionPayloadTO] = getData
        if (data != null) data.get(UpdateSubscriptionMutationResponse.OPERATION_NAME) else null
    }

}

object UpdateSubscriptionMutationResponse {

    private final val OPERATION_NAME: String = "updateSubscription"

}
