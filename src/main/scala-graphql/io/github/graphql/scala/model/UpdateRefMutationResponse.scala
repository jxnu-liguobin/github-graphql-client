package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
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
