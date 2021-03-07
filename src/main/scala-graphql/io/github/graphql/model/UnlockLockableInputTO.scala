package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
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
