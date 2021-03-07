package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class UpdatePullRequestReviewCommentMutationResponse extends GraphQLResult[JMap[String, UpdatePullRequestReviewCommentPayloadTO]] {

    def updatePullRequestReviewComment(): UpdatePullRequestReviewCommentPayloadTO = {
        val data: JMap[String, UpdatePullRequestReviewCommentPayloadTO] = getData
        if (data != null) data.get(UpdatePullRequestReviewCommentMutationResponse.OPERATION_NAME) else null
    }

}

object UpdatePullRequestReviewCommentMutationResponse {

    private final val OPERATION_NAME: String = "updatePullRequestReviewComment"

}
