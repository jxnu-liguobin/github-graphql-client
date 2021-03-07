package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class UpdateProjectColumnMutationResponse extends GraphQLResult[JMap[String, UpdateProjectColumnPayloadTO]] {

    def updateProjectColumn(): UpdateProjectColumnPayloadTO = {
        val data: JMap[String, UpdateProjectColumnPayloadTO] = getData
        if (data != null) data.get(UpdateProjectColumnMutationResponse.OPERATION_NAME) else null
    }

}

object UpdateProjectColumnMutationResponse {

    private final val OPERATION_NAME: String = "updateProjectColumn"

}
