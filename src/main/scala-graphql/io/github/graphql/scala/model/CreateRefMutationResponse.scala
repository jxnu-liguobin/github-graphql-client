package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class CreateRefMutationResponse extends GraphQLResult[JMap[String, CreateRefPayloadTO]] {

    def createRef(): CreateRefPayloadTO = {
        val data: JMap[String, CreateRefPayloadTO] = getData
        if (data != null) data.get(CreateRefMutationResponse.OPERATION_NAME) else null
    }

}

object CreateRefMutationResponse {

    private final val OPERATION_NAME: String = "createRef"

}
