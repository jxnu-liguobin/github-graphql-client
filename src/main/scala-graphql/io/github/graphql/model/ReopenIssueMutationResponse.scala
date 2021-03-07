package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class ReopenIssueMutationResponse extends GraphQLResult[JMap[String, ReopenIssuePayloadTO]] {

    def reopenIssue(): ReopenIssuePayloadTO = {
        val data: JMap[String, ReopenIssuePayloadTO] = getData
        if (data != null) data.get(ReopenIssueMutationResponse.OPERATION_NAME) else null
    }

}

object ReopenIssueMutationResponse {

    private final val OPERATION_NAME: String = "reopenIssue"

}
