package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
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
