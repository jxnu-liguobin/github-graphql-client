package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class MoveProjectCardPayloadTO(
    cardEdge: ProjectCardEdgeTO,
    clientMutationId: String
) {

    override def toString(): String = {
        Seq(
            if (cardEdge != null) "cardEdge: " + GraphQLRequestSerializer.getEntry(cardEdge) else "",
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[MoveProjectCardPayloadTO]
        Objects.equals(cardEdge, that.cardEdge) &&
        Objects.equals(clientMutationId, that.clientMutationId)
    }

    override def hashCode(): Int = {
        Objects.hash(cardEdge, clientMutationId)
    }
}

object MoveProjectCardPayloadTO {

    def builder(): MoveProjectCardPayloadTO.Builder = new Builder()

    class Builder {

        private var cardEdge: ProjectCardEdgeTO = _
        private var clientMutationId: String = _

        def setCardEdge(cardEdge: ProjectCardEdgeTO): Builder = {
            this.cardEdge = cardEdge
            this
        }

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def build(): MoveProjectCardPayloadTO = new MoveProjectCardPayloadTO(cardEdge, clientMutationId)

    }
}
