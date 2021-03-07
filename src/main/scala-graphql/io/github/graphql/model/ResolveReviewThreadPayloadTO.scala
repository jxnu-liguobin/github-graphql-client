package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class ResolveReviewThreadPayloadTO(
    clientMutationId: String,
    thread: PullRequestReviewThreadTO
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (thread != null) "thread: " + GraphQLRequestSerializer.getEntry(thread) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object ResolveReviewThreadPayloadTO {

    def builder(): ResolveReviewThreadPayloadTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var thread: PullRequestReviewThreadTO = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setThread(thread: PullRequestReviewThreadTO): Builder = {
            this.thread = thread
            this
        }

        def build(): ResolveReviewThreadPayloadTO = new ResolveReviewThreadPayloadTO(clientMutationId, thread)

    }
}
