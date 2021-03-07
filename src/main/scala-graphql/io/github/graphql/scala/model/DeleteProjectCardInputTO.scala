package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
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

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[DeleteProjectCardInputTO]
        Objects.equals(cardId, that.cardId) &&
        Objects.equals(clientMutationId, that.clientMutationId)
    }

    override def hashCode(): Int = {
        Objects.hash(cardId, clientMutationId)
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
