package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class RemoveOutsideCollaboratorPayloadTO(
    clientMutationId: String,
    removedUser: UserTO
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (removedUser != null) "removedUser: " + GraphQLRequestSerializer.getEntry(removedUser) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object RemoveOutsideCollaboratorPayloadTO {

    def builder(): RemoveOutsideCollaboratorPayloadTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var removedUser: UserTO = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setRemovedUser(removedUser: UserTO): Builder = {
            this.removedUser = removedUser
            this
        }

        def build(): RemoveOutsideCollaboratorPayloadTO = new RemoveOutsideCollaboratorPayloadTO(clientMutationId, removedUser)

    }
}
