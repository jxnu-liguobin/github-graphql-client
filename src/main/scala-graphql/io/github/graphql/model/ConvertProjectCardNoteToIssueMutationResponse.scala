package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class ConvertProjectCardNoteToIssueMutationResponse extends GraphQLResult[JMap[String, ConvertProjectCardNoteToIssuePayloadTO]] {

    def convertProjectCardNoteToIssue(): ConvertProjectCardNoteToIssuePayloadTO = {
        val data: JMap[String, ConvertProjectCardNoteToIssuePayloadTO] = getData
        if (data != null) data.get(ConvertProjectCardNoteToIssueMutationResponse.OPERATION_NAME) else null
    }

}

object ConvertProjectCardNoteToIssueMutationResponse {

    private final val OPERATION_NAME: String = "convertProjectCardNoteToIssue"

}
