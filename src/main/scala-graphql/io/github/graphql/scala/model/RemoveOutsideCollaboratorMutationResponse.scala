package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class RemoveOutsideCollaboratorMutationResponse extends GraphQLResult[JMap[String, RemoveOutsideCollaboratorPayloadTO]] {

    def removeOutsideCollaborator(): RemoveOutsideCollaboratorPayloadTO = {
        val data: JMap[String, RemoveOutsideCollaboratorPayloadTO] = getData
        if (data != null) data.get(RemoveOutsideCollaboratorMutationResponse.OPERATION_NAME) else null
    }

}

object RemoveOutsideCollaboratorMutationResponse {

    private final val OPERATION_NAME: String = "removeOutsideCollaborator"

}
