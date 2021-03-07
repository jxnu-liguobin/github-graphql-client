package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
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

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[RemoveOutsideCollaboratorPayloadTO]
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(removedUser, that.removedUser)
    }

    override def hashCode(): Int = {
        Objects.hash(clientMutationId, removedUser)
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
