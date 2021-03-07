package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class DeleteProjectColumnMutationResponse extends GraphQLResult[JMap[String, DeleteProjectColumnPayloadTO]] {

    def deleteProjectColumn(): DeleteProjectColumnPayloadTO = {
        val data: JMap[String, DeleteProjectColumnPayloadTO] = getData
        if (data != null) data.get(DeleteProjectColumnMutationResponse.OPERATION_NAME) else null
    }

}

object DeleteProjectColumnMutationResponse {

    private final val OPERATION_NAME: String = "deleteProjectColumn"

}
