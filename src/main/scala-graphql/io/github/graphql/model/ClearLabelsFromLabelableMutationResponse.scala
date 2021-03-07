package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class ClearLabelsFromLabelableMutationResponse extends GraphQLResult[JMap[String, ClearLabelsFromLabelablePayloadTO]] {

    def clearLabelsFromLabelable(): ClearLabelsFromLabelablePayloadTO = {
        val data: JMap[String, ClearLabelsFromLabelablePayloadTO] = getData
        if (data != null) data.get(ClearLabelsFromLabelableMutationResponse.OPERATION_NAME) else null
    }

}

object ClearLabelsFromLabelableMutationResponse {

    private final val OPERATION_NAME: String = "clearLabelsFromLabelable"

}
