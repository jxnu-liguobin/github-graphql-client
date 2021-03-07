package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class UpdateProjectMutationResponse extends GraphQLResult[JMap[String, UpdateProjectPayloadTO]] {

    def updateProject(): UpdateProjectPayloadTO = {
        val data: JMap[String, UpdateProjectPayloadTO] = getData
        if (data != null) data.get(UpdateProjectMutationResponse.OPERATION_NAME) else null
    }

}

object UpdateProjectMutationResponse {

    private final val OPERATION_NAME: String = "updateProject"

}
