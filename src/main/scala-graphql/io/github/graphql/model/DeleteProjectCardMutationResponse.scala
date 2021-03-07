package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class DeleteProjectCardMutationResponse extends GraphQLResult[JMap[String, DeleteProjectCardPayloadTO]] {

    def deleteProjectCard(): DeleteProjectCardPayloadTO = {
        val data: JMap[String, DeleteProjectCardPayloadTO] = getData
        if (data != null) data.get(DeleteProjectCardMutationResponse.OPERATION_NAME) else null
    }

}

object DeleteProjectCardMutationResponse {

    private final val OPERATION_NAME: String = "deleteProjectCard"

}
