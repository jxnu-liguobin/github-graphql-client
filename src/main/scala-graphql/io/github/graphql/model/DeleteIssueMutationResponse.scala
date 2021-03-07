package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class DeleteIssueMutationResponse extends GraphQLResult[JMap[String, DeleteIssuePayloadTO]] {

    def deleteIssue(): DeleteIssuePayloadTO = {
        val data: JMap[String, DeleteIssuePayloadTO] = getData
        if (data != null) data.get(DeleteIssueMutationResponse.OPERATION_NAME) else null
    }

}

object DeleteIssueMutationResponse {

    private final val OPERATION_NAME: String = "deleteIssue"

}
