package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
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
