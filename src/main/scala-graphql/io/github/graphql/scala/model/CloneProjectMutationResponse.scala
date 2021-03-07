package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class CloneProjectMutationResponse extends GraphQLResult[JMap[String, CloneProjectPayloadTO]] {

    def cloneProject(): CloneProjectPayloadTO = {
        val data: JMap[String, CloneProjectPayloadTO] = getData
        if (data != null) data.get(CloneProjectMutationResponse.OPERATION_NAME) else null
    }

}

object CloneProjectMutationResponse {

    private final val OPERATION_NAME: String = "cloneProject"

}
