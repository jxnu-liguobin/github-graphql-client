package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class UpdatePullRequestReviewMutationResponse extends GraphQLResult[JMap[String, UpdatePullRequestReviewPayloadTO]] {

    def updatePullRequestReview(): UpdatePullRequestReviewPayloadTO = {
        val data: JMap[String, UpdatePullRequestReviewPayloadTO] = getData
        if (data != null) data.get(UpdatePullRequestReviewMutationResponse.OPERATION_NAME) else null
    }

}

object UpdatePullRequestReviewMutationResponse {

    private final val OPERATION_NAME: String = "updatePullRequestReview"

}
