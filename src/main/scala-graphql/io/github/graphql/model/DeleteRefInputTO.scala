package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class DeleteRefInputTO(
    clientMutationId: String,
    @javax.validation.constraints.NotNull
    refId: String
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (refId != null) "refId: " + GraphQLRequestSerializer.getEntry(refId) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object DeleteRefInputTO {

    def builder(): DeleteRefInputTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var refId: String = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setRefId(refId: String): Builder = {
            this.refId = refId
            this
        }

        def build(): DeleteRefInputTO = new DeleteRefInputTO(clientMutationId, refId)

    }
}
