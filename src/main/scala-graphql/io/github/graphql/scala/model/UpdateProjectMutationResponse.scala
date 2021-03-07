package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
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
