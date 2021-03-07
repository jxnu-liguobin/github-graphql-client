package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class UpdateRefPayloadTO(
    clientMutationId: String,
    ref: RefTO
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (ref != null) "ref: " + GraphQLRequestSerializer.getEntry(ref) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object UpdateRefPayloadTO {

    def builder(): UpdateRefPayloadTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var ref: RefTO = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setRef(ref: RefTO): Builder = {
            this.ref = ref
            this
        }

        def build(): UpdateRefPayloadTO = new UpdateRefPayloadTO(clientMutationId, ref)

    }
}
