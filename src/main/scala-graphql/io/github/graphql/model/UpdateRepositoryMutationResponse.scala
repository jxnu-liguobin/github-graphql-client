package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
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
