package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class AddProjectColumnMutationResponse extends GraphQLResult[JMap[String, AddProjectColumnPayloadTO]] {

    def addProjectColumn(): AddProjectColumnPayloadTO = {
        val data: JMap[String, AddProjectColumnPayloadTO] = getData
        if (data != null) data.get(AddProjectColumnMutationResponse.OPERATION_NAME) else null
    }

}

object AddProjectColumnMutationResponse {

    private final val OPERATION_NAME: String = "addProjectColumn"

}
