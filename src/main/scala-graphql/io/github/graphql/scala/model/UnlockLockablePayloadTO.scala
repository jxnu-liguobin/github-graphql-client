package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
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

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[UnlockLockablePayloadTO]
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(unlockedRecord, that.unlockedRecord)
    }

    override def hashCode(): Int = {
        Objects.hash(clientMutationId, unlockedRecord)
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
