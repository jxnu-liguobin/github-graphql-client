package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class UpdateProjectCardMutationResponse extends GraphQLResult[JMap[String, UpdateProjectCardPayloadTO]] {

    def updateProjectCard(): UpdateProjectCardPayloadTO = {
        val data: JMap[String, UpdateProjectCardPayloadTO] = getData
        if (data != null) data.get(UpdateProjectCardMutationResponse.OPERATION_NAME) else null
    }

}

object UpdateProjectCardMutationResponse {

    private final val OPERATION_NAME: String = "updateProjectCard"

}
