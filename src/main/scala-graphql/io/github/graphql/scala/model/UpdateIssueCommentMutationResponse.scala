package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class UpdateIssueCommentMutationResponse extends GraphQLResult[JMap[String, UpdateIssueCommentPayloadTO]] {

    def updateIssueComment(): UpdateIssueCommentPayloadTO = {
        val data: JMap[String, UpdateIssueCommentPayloadTO] = getData
        if (data != null) data.get(UpdateIssueCommentMutationResponse.OPERATION_NAME) else null
    }

}

object UpdateIssueCommentMutationResponse {

    private final val OPERATION_NAME: String = "updateIssueComment"

}
