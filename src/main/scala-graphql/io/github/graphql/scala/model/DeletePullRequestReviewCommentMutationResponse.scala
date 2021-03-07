package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class DeletePullRequestReviewCommentMutationResponse extends GraphQLResult[JMap[String, DeletePullRequestReviewCommentPayloadTO]] {

    def deletePullRequestReviewComment(): DeletePullRequestReviewCommentPayloadTO = {
        val data: JMap[String, DeletePullRequestReviewCommentPayloadTO] = getData
        if (data != null) data.get(DeletePullRequestReviewCommentMutationResponse.OPERATION_NAME) else null
    }

}

object DeletePullRequestReviewCommentMutationResponse {

    private final val OPERATION_NAME: String = "deletePullRequestReviewComment"

}
