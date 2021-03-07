package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
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
