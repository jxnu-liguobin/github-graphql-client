package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class DeletePullRequestReviewMutationResponse extends GraphQLResult[JMap[String, DeletePullRequestReviewPayloadTO]] {

    def deletePullRequestReview(): DeletePullRequestReviewPayloadTO = {
        val data: JMap[String, DeletePullRequestReviewPayloadTO] = getData
        if (data != null) data.get(DeletePullRequestReviewMutationResponse.OPERATION_NAME) else null
    }

}

object DeletePullRequestReviewMutationResponse {

    private final val OPERATION_NAME: String = "deletePullRequestReview"

}