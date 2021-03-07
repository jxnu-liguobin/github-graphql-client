package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class RemoveAssigneesFromAssignablePayloadTO(
    assignable: AssignableTO,
    clientMutationId: String
) {

    override def toString(): String = {
        Seq(
            if (assignable != null) "assignable: " + GraphQLRequestSerializer.getEntry(assignable) else "",
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object RemoveAssigneesFromAssignablePayloadTO {

    def builder(): RemoveAssigneesFromAssignablePayloadTO.Builder = new Builder()

    class Builder {

        private var assignable: AssignableTO = _
        private var clientMutationId: String = _

        def setAssignable(assignable: AssignableTO): Builder = {
            this.assignable = assignable
            this
        }

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def build(): RemoveAssigneesFromAssignablePayloadTO = new RemoveAssigneesFromAssignablePayloadTO(assignable, clientMutationId)

    }
}
