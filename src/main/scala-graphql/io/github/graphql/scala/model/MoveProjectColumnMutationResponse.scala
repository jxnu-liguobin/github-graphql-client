package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class MoveProjectColumnMutationResponse extends GraphQLResult[JMap[String, MoveProjectColumnPayloadTO]] {

    def moveProjectColumn(): MoveProjectColumnPayloadTO = {
        val data: JMap[String, MoveProjectColumnPayloadTO] = getData
        if (data != null) data.get(MoveProjectColumnMutationResponse.OPERATION_NAME) else null
    }

}

object MoveProjectColumnMutationResponse {

    private final val OPERATION_NAME: String = "moveProjectColumn"

}
