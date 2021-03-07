package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class UpdateRefMutationResponse extends GraphQLResult[JMap[String, UpdateRefPayloadTO]] {

    def updateRef(): UpdateRefPayloadTO = {
        val data: JMap[String, UpdateRefPayloadTO] = getData
        if (data != null) data.get(UpdateRefMutationResponse.OPERATION_NAME) else null
    }

}

object UpdateRefMutationResponse {

    private final val OPERATION_NAME: String = "updateRef"

}
