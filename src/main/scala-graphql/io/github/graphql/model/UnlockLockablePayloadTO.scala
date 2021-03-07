package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class UnlockLockablePayloadTO(
    clientMutationId: String,
    unlockedRecord: LockableTO
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (unlockedRecord != null) "unlockedRecord: " + GraphQLRequestSerializer.getEntry(unlockedRecord) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object UnlockLockablePayloadTO {

    def builder(): UnlockLockablePayloadTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var unlockedRecord: LockableTO = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setUnlockedRecord(unlockedRecord: LockableTO): Builder = {
            this.unlockedRecord = unlockedRecord
            this
        }

        def build(): UnlockLockablePayloadTO = new UnlockLockablePayloadTO(clientMutationId, unlockedRecord)

    }
}
