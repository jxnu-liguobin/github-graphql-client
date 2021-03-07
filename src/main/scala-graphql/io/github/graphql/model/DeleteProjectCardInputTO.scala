package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class DeleteProjectCardInputTO(
    @javax.validation.constraints.NotNull
    cardId: String,
    clientMutationId: String
) {

    override def toString(): String = {
        Seq(
            if (cardId != null) "cardId: " + GraphQLRequestSerializer.getEntry(cardId) else "",
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object DeleteProjectCardInputTO {

    def builder(): DeleteProjectCardInputTO.Builder = new Builder()

    class Builder {

        private var cardId: String = _
        private var clientMutationId: String = _

        def setCardId(cardId: String): Builder = {
            this.cardId = cardId
            this
        }

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def build(): DeleteProjectCardInputTO = new DeleteProjectCardInputTO(cardId, clientMutationId)

    }
}
