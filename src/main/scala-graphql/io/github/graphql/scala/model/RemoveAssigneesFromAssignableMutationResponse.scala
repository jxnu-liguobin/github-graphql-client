package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class RemoveAssigneesFromAssignableMutationResponse extends GraphQLResult[JMap[String, RemoveAssigneesFromAssignablePayloadTO]] {

    def removeAssigneesFromAssignable(): RemoveAssigneesFromAssignablePayloadTO = {
        val data: JMap[String, RemoveAssigneesFromAssignablePayloadTO] = getData
        if (data != null) data.get(RemoveAssigneesFromAssignableMutationResponse.OPERATION_NAME) else null
    }

}

object RemoveAssigneesFromAssignableMutationResponse {

    private final val OPERATION_NAME: String = "removeAssigneesFromAssignable"

}
