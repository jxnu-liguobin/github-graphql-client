package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
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
