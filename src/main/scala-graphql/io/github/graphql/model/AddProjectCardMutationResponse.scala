package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class AddProjectCardMutationResponse extends GraphQLResult[JMap[String, AddProjectCardPayloadTO]] {

    def addProjectCard(): AddProjectCardPayloadTO = {
        val data: JMap[String, AddProjectCardPayloadTO] = getData
        if (data != null) data.get(AddProjectCardMutationResponse.OPERATION_NAME) else null
    }

}

object AddProjectCardMutationResponse {

    private final val OPERATION_NAME: String = "addProjectCard"

}
