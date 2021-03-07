package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
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
