package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class UpdateIssueMutationResponse extends GraphQLResult[JMap[String, UpdateIssuePayloadTO]] {

    def updateIssue(): UpdateIssuePayloadTO = {
        val data: JMap[String, UpdateIssuePayloadTO] = getData
        if (data != null) data.get(UpdateIssueMutationResponse.OPERATION_NAME) else null
    }

}

object UpdateIssueMutationResponse {

    private final val OPERATION_NAME: String = "updateIssue"

}
