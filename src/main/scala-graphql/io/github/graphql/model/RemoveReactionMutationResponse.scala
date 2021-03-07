package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
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
