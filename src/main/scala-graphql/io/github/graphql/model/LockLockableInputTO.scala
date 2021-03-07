package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._
import LockReasonTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class LockLockableInputTO(
    clientMutationId: String,
    lockReason: LockReasonTO,
    @javax.validation.constraints.NotNull
    lockableId: String
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (lockReason != null) "lockReason: " + GraphQLRequestSerializer.getEntry(lockReason) else "",
            if (lockableId != null) "lockableId: " + GraphQLRequestSerializer.getEntry(lockableId) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object LockLockableInputTO {

    def builder(): LockLockableInputTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var lockReason: LockReasonTO = _
        private var lockableId: String = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setLockReason(lockReason: LockReasonTO): Builder = {
            this.lockReason = lockReason
            this
        }

        def setLockableId(lockableId: String): Builder = {
            this.lockableId = lockableId
            this
        }

        def build(): LockLockableInputTO = new LockLockableInputTO(clientMutationId, lockReason, lockableId)

    }
}
