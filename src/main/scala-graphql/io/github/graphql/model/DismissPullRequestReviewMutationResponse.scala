package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class DismissPullRequestReviewMutationResponse extends GraphQLResult[JMap[String, DismissPullRequestReviewPayloadTO]] {

    def dismissPullRequestReview(): DismissPullRequestReviewPayloadTO = {
        val data: JMap[String, DismissPullRequestReviewPayloadTO] = getData
        if (data != null) data.get(DismissPullRequestReviewMutationResponse.OPERATION_NAME) else null
    }

}

object DismissPullRequestReviewMutationResponse {

    private final val OPERATION_NAME: String = "dismissPullRequestReview"

}
