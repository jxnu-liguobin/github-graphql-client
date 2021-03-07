package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class AddStarPayloadTO(
    clientMutationId: String,
    starrable: StarrableTO
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (starrable != null) "starrable: " + GraphQLRequestSerializer.getEntry(starrable) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object AddStarPayloadTO {

    def builder(): AddStarPayloadTO.Builder = new Builder()

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

        def build(): AddStarPayloadTO = new AddStarPayloadTO(clientMutationId, starrable)

    }
}
