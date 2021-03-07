package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class AddPullRequestReviewPayloadTO(
    clientMutationId: String,
    pullRequestReview: PullRequestReviewTO,
    reviewEdge: PullRequestReviewEdgeTO
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (pullRequestReview != null) "pullRequestReview: " + GraphQLRequestSerializer.getEntry(pullRequestReview) else "",
            if (reviewEdge != null) "reviewEdge: " + GraphQLRequestSerializer.getEntry(reviewEdge) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object AddPullRequestReviewPayloadTO {

    def builder(): AddPullRequestReviewPayloadTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var pullRequestReview: PullRequestReviewTO = _
        private var reviewEdge: PullRequestReviewEdgeTO = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setPullRequestReview(pullRequestReview: PullRequestReviewTO): Builder = {
            this.pullRequestReview = pullRequestReview
            this
        }

        def setReviewEdge(reviewEdge: PullRequestReviewEdgeTO): Builder = {
            this.reviewEdge = reviewEdge
            this
        }

        def build(): AddPullRequestReviewPayloadTO = new AddPullRequestReviewPayloadTO(clientMutationId, pullRequestReview, reviewEdge)

    }
}
