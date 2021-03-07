package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class DeleteRefMutationResponse extends GraphQLResult[JMap[String, DeleteRefPayloadTO]] {

    def deleteRef(): DeleteRefPayloadTO = {
        val data: JMap[String, DeleteRefPayloadTO] = getData
        if (data != null) data.get(DeleteRefMutationResponse.OPERATION_NAME) else null
    }

}

object DeleteRefMutationResponse {

    private final val OPERATION_NAME: String = "deleteRef"

}
