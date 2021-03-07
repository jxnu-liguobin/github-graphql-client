package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class AddLabelsToLabelableMutationResponse extends GraphQLResult[JMap[String, AddLabelsToLabelablePayloadTO]] {

    def addLabelsToLabelable(): AddLabelsToLabelablePayloadTO = {
        val data: JMap[String, AddLabelsToLabelablePayloadTO] = getData
        if (data != null) data.get(AddLabelsToLabelableMutationResponse.OPERATION_NAME) else null
    }

}

object AddLabelsToLabelableMutationResponse {

    private final val OPERATION_NAME: String = "addLabelsToLabelable"

}
