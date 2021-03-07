package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class AddStarMutationResponse extends GraphQLResult[JMap[String, AddStarPayloadTO]] {

    def addStar(): AddStarPayloadTO = {
        val data: JMap[String, AddStarPayloadTO] = getData
        if (data != null) data.get(AddStarMutationResponse.OPERATION_NAME) else null
    }

}

object AddStarMutationResponse {

    private final val OPERATION_NAME: String = "addStar"

}
