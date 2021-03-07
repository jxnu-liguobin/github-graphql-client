package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class ClosePullRequestPayloadTO(
    clientMutationId: String,
    pullRequest: PullRequestTO
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (pullRequest != null) "pullRequest: " + GraphQLRequestSerializer.getEntry(pullRequest) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object ClosePullRequestPayloadTO {

    def builder(): ClosePullRequestPayloadTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var pullRequest: PullRequestTO = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setPullRequest(pullRequest: PullRequestTO): Builder = {
            this.pullRequest = pullRequest
            this
        }

        def build(): ClosePullRequestPayloadTO = new ClosePullRequestPayloadTO(clientMutationId, pullRequest)

    }
}
