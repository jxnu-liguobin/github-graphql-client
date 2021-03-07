package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class SubmitPullRequestReviewMutationResponse extends GraphQLResult[JMap[String, SubmitPullRequestReviewPayloadTO]] {

    def submitPullRequestReview(): SubmitPullRequestReviewPayloadTO = {
        val data: JMap[String, SubmitPullRequestReviewPayloadTO] = getData
        if (data != null) data.get(SubmitPullRequestReviewMutationResponse.OPERATION_NAME) else null
    }

}

object SubmitPullRequestReviewMutationResponse {

    private final val OPERATION_NAME: String = "submitPullRequestReview"

}
