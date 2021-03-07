package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
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
