package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class ChangeUserStatusPayloadTO(
    clientMutationId: String,
    status: UserStatusTO
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (status != null) "status: " + GraphQLRequestSerializer.getEntry(status) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object ChangeUserStatusPayloadTO {

    def builder(): ChangeUserStatusPayloadTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var status: UserStatusTO = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setStatus(status: UserStatusTO): Builder = {
            this.status = status
            this
        }

        def build(): ChangeUserStatusPayloadTO = new ChangeUserStatusPayloadTO(clientMutationId, status)

    }
}
