package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class ChangeUserStatusMutationResponse extends GraphQLResult[JMap[String, ChangeUserStatusPayloadTO]] {

    def changeUserStatus(): ChangeUserStatusPayloadTO = {
        val data: JMap[String, ChangeUserStatusPayloadTO] = getData
        if (data != null) data.get(ChangeUserStatusMutationResponse.OPERATION_NAME) else null
    }

}

object ChangeUserStatusMutationResponse {

    private final val OPERATION_NAME: String = "changeUserStatus"

}
