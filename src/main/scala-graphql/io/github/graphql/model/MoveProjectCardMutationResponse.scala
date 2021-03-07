package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class MoveProjectCardMutationResponse extends GraphQLResult[JMap[String, MoveProjectCardPayloadTO]] {

    def moveProjectCard(): MoveProjectCardPayloadTO = {
        val data: JMap[String, MoveProjectCardPayloadTO] = getData
        if (data != null) data.get(MoveProjectCardMutationResponse.OPERATION_NAME) else null
    }

}

object MoveProjectCardMutationResponse {

    private final val OPERATION_NAME: String = "moveProjectCard"

}
