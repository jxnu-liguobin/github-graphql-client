package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class SubmitPullRequestReviewPayloadTO(
    clientMutationId: String,
    pullRequestReview: PullRequestReviewTO
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (pullRequestReview != null) "pullRequestReview: " + GraphQLRequestSerializer.getEntry(pullRequestReview) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object SubmitPullRequestReviewPayloadTO {

    def builder(): SubmitPullRequestReviewPayloadTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var pullRequestReview: PullRequestReviewTO = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setPullRequestReview(pullRequestReview: PullRequestReviewTO): Builder = {
            this.pullRequestReview = pullRequestReview
            this
        }

        def build(): SubmitPullRequestReviewPayloadTO = new SubmitPullRequestReviewPayloadTO(clientMutationId, pullRequestReview)

    }
}
