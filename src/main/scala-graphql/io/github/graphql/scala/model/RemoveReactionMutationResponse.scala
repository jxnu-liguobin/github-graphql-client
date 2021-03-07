package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class RemoveReactionMutationResponse extends GraphQLResult[JMap[String, RemoveReactionPayloadTO]] {

    def removeReaction(): RemoveReactionPayloadTO = {
        val data: JMap[String, RemoveReactionPayloadTO] = getData
        if (data != null) data.get(RemoveReactionMutationResponse.OPERATION_NAME) else null
    }

}

object RemoveReactionMutationResponse {

    private final val OPERATION_NAME: String = "removeReaction"

}
