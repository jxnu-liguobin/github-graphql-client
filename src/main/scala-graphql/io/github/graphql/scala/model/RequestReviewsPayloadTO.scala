package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
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

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[RequestReviewsPayloadTO]
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(pullRequest, that.pullRequest) &&
        Objects.equals(requestedReviewersEdge, that.requestedReviewersEdge)
    }

    override def hashCode(): Int = {
        Objects.hash(clientMutationId, pullRequest, requestedReviewersEdge)
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
