package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class AddAssigneesToAssignableMutationResponse extends GraphQLResult[JMap[String, AddAssigneesToAssignablePayloadTO]] {

    def addAssigneesToAssignable(): AddAssigneesToAssignablePayloadTO = {
        val data: JMap[String, AddAssigneesToAssignablePayloadTO] = getData
        if (data != null) data.get(AddAssigneesToAssignableMutationResponse.OPERATION_NAME) else null
    }

}

object AddAssigneesToAssignableMutationResponse {

    private final val OPERATION_NAME: String = "addAssigneesToAssignable"

}
