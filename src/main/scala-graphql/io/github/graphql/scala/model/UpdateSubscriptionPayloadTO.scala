package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class UpdateSubscriptionPayloadTO(
    clientMutationId: String,
    subscribable: SubscribableTO
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (subscribable != null) "subscribable: " + GraphQLRequestSerializer.getEntry(subscribable) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[UpdateSubscriptionPayloadTO]
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(subscribable, that.subscribable)
    }

    override def hashCode(): Int = {
        Objects.hash(clientMutationId, subscribable)
    }
}

object UpdateSubscriptionPayloadTO {

    def builder(): UpdateSubscriptionPayloadTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var subscribable: SubscribableTO = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setSubscribable(subscribable: SubscribableTO): Builder = {
            this.subscribable = subscribable
            this
        }

        def build(): UpdateSubscriptionPayloadTO = new UpdateSubscriptionPayloadTO(clientMutationId, subscribable)

    }
}
