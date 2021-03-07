package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class CreateProjectMutationResponse extends GraphQLResult[JMap[String, CreateProjectPayloadTO]] {

    def createProject(): CreateProjectPayloadTO = {
        val data: JMap[String, CreateProjectPayloadTO] = getData
        if (data != null) data.get(CreateProjectMutationResponse.OPERATION_NAME) else null
    }

}

object CreateProjectMutationResponse {

    private final val OPERATION_NAME: String = "createProject"

}
