package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class UpdateRepositoryMutationResponse extends GraphQLResult[JMap[String, UpdateRepositoryPayloadTO]] {

    def updateRepository(): UpdateRepositoryPayloadTO = {
        val data: JMap[String, UpdateRepositoryPayloadTO] = getData
        if (data != null) data.get(UpdateRepositoryMutationResponse.OPERATION_NAME) else null
    }

}

object UpdateRepositoryMutationResponse {

    private final val OPERATION_NAME: String = "updateRepository"

}
