package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class LockLockablePayloadTO(
    clientMutationId: String,
    lockedRecord: LockableTO
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (lockedRecord != null) "lockedRecord: " + GraphQLRequestSerializer.getEntry(lockedRecord) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object LockLockablePayloadTO {

    def builder(): LockLockablePayloadTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var lockedRecord: LockableTO = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setLockedRecord(lockedRecord: LockableTO): Builder = {
            this.lockedRecord = lockedRecord
            this
        }

        def build(): LockLockablePayloadTO = new LockLockablePayloadTO(clientMutationId, lockedRecord)

    }
}
