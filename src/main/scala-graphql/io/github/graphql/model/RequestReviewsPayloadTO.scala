package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class RequestReviewsPayloadTO(
    clientMutationId: String,
    pullRequest: PullRequestTO,
    requestedReviewersEdge: UserEdgeTO
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (pullRequest != null) "pullRequest: " + GraphQLRequestSerializer.getEntry(pullRequest) else "",
            if (requestedReviewersEdge != null) "requestedReviewersEdge: " + GraphQLRequestSerializer.getEntry(requestedReviewersEdge) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object RequestReviewsPayloadTO {

    def builder(): RequestReviewsPayloadTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var pullRequest: PullRequestTO = _
        private var requestedReviewersEdge: UserEdgeTO = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setPullRequest(pullRequest: PullRequestTO): Builder = {
            this.pullRequest = pullRequest
            this
        }

        def setRequestedReviewersEdge(requestedReviewersEdge: UserEdgeTO): Builder = {
            this.requestedReviewersEdge = requestedReviewersEdge
            this
        }

        def build(): RequestReviewsPayloadTO = new RequestReviewsPayloadTO(clientMutationId, pullRequest, requestedReviewersEdge)

    }
}
