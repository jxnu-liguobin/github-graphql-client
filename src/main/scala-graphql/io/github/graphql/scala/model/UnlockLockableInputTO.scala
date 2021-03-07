package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class UnlockLockableInputTO(
    clientMutationId: String,
    @javax.validation.constraints.NotNull
    lockableId: String
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (lockableId != null) "lockableId: " + GraphQLRequestSerializer.getEntry(lockableId) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[UnlockLockableInputTO]
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(lockableId, that.lockableId)
    }

    override def hashCode(): Int = {
        Objects.hash(clientMutationId, lockableId)
    }
}

object UnlockLockableInputTO {

    def builder(): UnlockLockableInputTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var lockableId: String = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setLockableId(lockableId: String): Builder = {
            this.lockableId = lockableId
            this
        }

        def build(): UnlockLockableInputTO = new UnlockLockableInputTO(clientMutationId, lockableId)

    }
}
