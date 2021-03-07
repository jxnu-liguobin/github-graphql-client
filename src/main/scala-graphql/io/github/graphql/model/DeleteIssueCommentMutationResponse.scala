package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class DeleteIssueCommentMutationResponse extends GraphQLResult[JMap[String, DeleteIssueCommentPayloadTO]] {

    def deleteIssueComment(): DeleteIssueCommentPayloadTO = {
        val data: JMap[String, DeleteIssueCommentPayloadTO] = getData
        if (data != null) data.get(DeleteIssueCommentMutationResponse.OPERATION_NAME) else null
    }

}

object DeleteIssueCommentMutationResponse {

    private final val OPERATION_NAME: String = "deleteIssueComment"

}
