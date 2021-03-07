package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class UpdatePullRequestPayloadTO(
    clientMutationId: String,
    pullRequest: PullRequestTO
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (pullRequest != null) "pullRequest: " + GraphQLRequestSerializer.getEntry(pullRequest) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[UpdatePullRequestPayloadTO]
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(pullRequest, that.pullRequest)
    }

    override def hashCode(): Int = {
        Objects.hash(clientMutationId, pullRequest)
    }
}

object UpdatePullRequestPayloadTO {

    def builder(): UpdatePullRequestPayloadTO.Builder = new Builder()

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

        def build(): UpdatePullRequestPayloadTO = new UpdatePullRequestPayloadTO(clientMutationId, pullRequest)

    }
}
