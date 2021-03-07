package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class UnmarkIssueAsDuplicateMutationResponse extends GraphQLResult[JMap[String, UnmarkIssueAsDuplicatePayloadTO]] {

    def unmarkIssueAsDuplicate(): UnmarkIssueAsDuplicatePayloadTO = {
        val data: JMap[String, UnmarkIssueAsDuplicatePayloadTO] = getData
        if (data != null) data.get(UnmarkIssueAsDuplicateMutationResponse.OPERATION_NAME) else null
    }

}

object UnmarkIssueAsDuplicateMutationResponse {

    private final val OPERATION_NAME: String = "unmarkIssueAsDuplicate"

}
