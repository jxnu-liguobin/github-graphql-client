package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class DeletePullRequestReviewPayloadTO(
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

object DeletePullRequestReviewPayloadTO {

    def builder(): DeletePullRequestReviewPayloadTO.Builder = new Builder()

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

        def build(): DeletePullRequestReviewPayloadTO = new DeletePullRequestReviewPayloadTO(clientMutationId, pullRequestReview)

    }
}
