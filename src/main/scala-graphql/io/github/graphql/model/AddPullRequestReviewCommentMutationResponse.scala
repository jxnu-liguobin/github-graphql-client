package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class AddPullRequestReviewCommentMutationResponse extends GraphQLResult[JMap[String, AddPullRequestReviewCommentPayloadTO]] {

    def addPullRequestReviewComment(): AddPullRequestReviewCommentPayloadTO = {
        val data: JMap[String, AddPullRequestReviewCommentPayloadTO] = getData
        if (data != null) data.get(AddPullRequestReviewCommentMutationResponse.OPERATION_NAME) else null
    }

}

object AddPullRequestReviewCommentMutationResponse {

    private final val OPERATION_NAME: String = "addPullRequestReviewComment"

}
