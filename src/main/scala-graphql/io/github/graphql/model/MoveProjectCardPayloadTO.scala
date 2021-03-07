package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
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
