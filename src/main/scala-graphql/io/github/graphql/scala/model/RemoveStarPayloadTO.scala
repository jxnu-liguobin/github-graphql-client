package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class RemoveStarPayloadTO(
    clientMutationId: String,
    starrable: StarrableTO
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (starrable != null) "starrable: " + GraphQLRequestSerializer.getEntry(starrable) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[RemoveStarPayloadTO]
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(starrable, that.starrable)
    }

    override def hashCode(): Int = {
        Objects.hash(clientMutationId, starrable)
    }
}

object RemoveStarPayloadTO {

    def builder(): RemoveStarPayloadTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var starrable: StarrableTO = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setStarrable(starrable: StarrableTO): Builder = {
            this.starrable = starrable
            this
        }

        def build(): RemoveStarPayloadTO = new RemoveStarPayloadTO(clientMutationId, starrable)

    }
}
