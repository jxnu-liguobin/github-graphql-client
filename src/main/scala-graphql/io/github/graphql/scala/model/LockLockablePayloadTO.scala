package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
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

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[LockLockablePayloadTO]
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(lockedRecord, that.lockedRecord)
    }

    override def hashCode(): Int = {
        Objects.hash(clientMutationId, lockedRecord)
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
