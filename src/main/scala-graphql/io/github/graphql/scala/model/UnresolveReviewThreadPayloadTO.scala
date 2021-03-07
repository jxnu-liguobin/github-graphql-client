package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class UnresolveReviewThreadPayloadTO(
    clientMutationId: String,
    thread: PullRequestReviewThreadTO
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (thread != null) "thread: " + GraphQLRequestSerializer.getEntry(thread) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[UnresolveReviewThreadPayloadTO]
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(thread, that.thread)
    }

    override def hashCode(): Int = {
        Objects.hash(clientMutationId, thread)
    }
}

object UnresolveReviewThreadPayloadTO {

    def builder(): UnresolveReviewThreadPayloadTO.Builder = new Builder()

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

        def build(): UnresolveReviewThreadPayloadTO = new UnresolveReviewThreadPayloadTO(clientMutationId, thread)

    }
}
