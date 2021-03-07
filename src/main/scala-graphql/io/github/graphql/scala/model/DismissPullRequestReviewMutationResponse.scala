package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
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
