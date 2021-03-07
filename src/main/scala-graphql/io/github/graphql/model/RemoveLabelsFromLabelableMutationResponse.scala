package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class RemoveLabelsFromLabelableMutationResponse extends GraphQLResult[JMap[String, RemoveLabelsFromLabelablePayloadTO]] {

    def removeLabelsFromLabelable(): RemoveLabelsFromLabelablePayloadTO = {
        val data: JMap[String, RemoveLabelsFromLabelablePayloadTO] = getData
        if (data != null) data.get(RemoveLabelsFromLabelableMutationResponse.OPERATION_NAME) else null
    }

}

object RemoveLabelsFromLabelableMutationResponse {

    private final val OPERATION_NAME: String = "removeLabelsFromLabelable"

}
