package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class DeleteProjectMutationResponse extends GraphQLResult[JMap[String, DeleteProjectPayloadTO]] {

    def deleteProject(): DeleteProjectPayloadTO = {
        val data: JMap[String, DeleteProjectPayloadTO] = getData
        if (data != null) data.get(DeleteProjectMutationResponse.OPERATION_NAME) else null
    }

}

object DeleteProjectMutationResponse {

    private final val OPERATION_NAME: String = "deleteProject"

}
