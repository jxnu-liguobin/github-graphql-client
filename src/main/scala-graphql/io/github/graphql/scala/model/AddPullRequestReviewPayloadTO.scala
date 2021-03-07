package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
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

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[AddPullRequestReviewPayloadTO]
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(pullRequestReview, that.pullRequestReview) &&
        Objects.equals(reviewEdge, that.reviewEdge)
    }

    override def hashCode(): Int = {
        Objects.hash(clientMutationId, pullRequestReview, reviewEdge)
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
