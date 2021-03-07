package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
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

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[SubmitPullRequestReviewPayloadTO]
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(pullRequestReview, that.pullRequestReview)
    }

    override def hashCode(): Int = {
        Objects.hash(clientMutationId, pullRequestReview)
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
