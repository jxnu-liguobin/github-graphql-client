package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._
import SubscriptionStateTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class UpdateSubscriptionInputTO(
    clientMutationId: String,
    @javax.validation.constraints.NotNull
    state: SubscriptionStateTO,
    @javax.validation.constraints.NotNull
    subscribableId: String
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (state != null) "state: " + GraphQLRequestSerializer.getEntry(state) else "",
            if (subscribableId != null) "subscribableId: " + GraphQLRequestSerializer.getEntry(subscribableId) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[UpdateSubscriptionInputTO]
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(state, that.state) &&
        Objects.equals(subscribableId, that.subscribableId)
    }

    override def hashCode(): Int = {
        Objects.hash(clientMutationId, state, subscribableId)
    }
}

object UpdateSubscriptionInputTO {

    def builder(): UpdateSubscriptionInputTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var state: SubscriptionStateTO = _
        private var subscribableId: String = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setState(state: SubscriptionStateTO): Builder = {
            this.state = state
            this
        }

        def setSubscribableId(subscribableId: String): Builder = {
            this.subscribableId = subscribableId
            this
        }

        def build(): UpdateSubscriptionInputTO = new UpdateSubscriptionInputTO(clientMutationId, state, subscribableId)

    }
}
