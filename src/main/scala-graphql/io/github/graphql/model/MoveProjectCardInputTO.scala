package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class MoveProjectCardInputTO(
    afterCardId: String,
    @javax.validation.constraints.NotNull
    cardId: String,
    clientMutationId: String,
    @javax.validation.constraints.NotNull
    columnId: String
) {

    override def toString(): String = {
        Seq(
            if (afterCardId != null) "afterCardId: " + GraphQLRequestSerializer.getEntry(afterCardId) else "",
            if (cardId != null) "cardId: " + GraphQLRequestSerializer.getEntry(cardId) else "",
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (columnId != null) "columnId: " + GraphQLRequestSerializer.getEntry(columnId) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object MoveProjectCardInputTO {

    def builder(): MoveProjectCardInputTO.Builder = new Builder()

    class Builder {

        private var afterCardId: String = _
        private var cardId: String = _
        private var clientMutationId: String = _
        private var columnId: String = _

        def setAfterCardId(afterCardId: String): Builder = {
            this.afterCardId = afterCardId
            this
        }

        def setCardId(cardId: String): Builder = {
            this.cardId = cardId
            this
        }

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setColumnId(columnId: String): Builder = {
            this.columnId = columnId
            this
        }

        def build(): MoveProjectCardInputTO = new MoveProjectCardInputTO(afterCardId, cardId, clientMutationId, columnId)

    }
}
