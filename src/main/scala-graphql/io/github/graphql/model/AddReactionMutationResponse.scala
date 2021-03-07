package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class AddReactionMutationResponse extends GraphQLResult[JMap[String, AddReactionPayloadTO]] {

    def addReaction(): AddReactionPayloadTO = {
        val data: JMap[String, AddReactionPayloadTO] = getData
        if (data != null) data.get(AddReactionMutationResponse.OPERATION_NAME) else null
    }

}

object AddReactionMutationResponse {

    private final val OPERATION_NAME: String = "addReaction"

}
