package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
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
