package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
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

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[ChangeUserStatusPayloadTO]
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(status, that.status)
    }

    override def hashCode(): Int = {
        Objects.hash(clientMutationId, status)
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
