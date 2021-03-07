package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class RemoveStarMutationResponse extends GraphQLResult[JMap[String, RemoveStarPayloadTO]] {

    def removeStar(): RemoveStarPayloadTO = {
        val data: JMap[String, RemoveStarPayloadTO] = getData
        if (data != null) data.get(RemoveStarMutationResponse.OPERATION_NAME) else null
    }

}

object RemoveStarMutationResponse {

    private final val OPERATION_NAME: String = "removeStar"

}
