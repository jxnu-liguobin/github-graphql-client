package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class AddPullRequestReviewMutationResponse extends GraphQLResult[JMap[String, AddPullRequestReviewPayloadTO]] {

    def addPullRequestReview(): AddPullRequestReviewPayloadTO = {
        val data: JMap[String, AddPullRequestReviewPayloadTO] = getData
        if (data != null) data.get(AddPullRequestReviewMutationResponse.OPERATION_NAME) else null
    }

}

object AddPullRequestReviewMutationResponse {

    private final val OPERATION_NAME: String = "addPullRequestReview"

}
