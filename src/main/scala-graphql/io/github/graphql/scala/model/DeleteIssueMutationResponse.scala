package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
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
