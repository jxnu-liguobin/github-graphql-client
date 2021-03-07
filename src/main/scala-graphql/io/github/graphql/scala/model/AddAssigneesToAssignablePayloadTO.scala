package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class AddAssigneesToAssignablePayloadTO(
    assignable: AssignableTO,
    clientMutationId: String
) {

    override def toString(): String = {
        Seq(
            if (assignable != null) "assignable: " + GraphQLRequestSerializer.getEntry(assignable) else "",
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[AddAssigneesToAssignablePayloadTO]
        Objects.equals(assignable, that.assignable) &&
        Objects.equals(clientMutationId, that.clientMutationId)
    }

    override def hashCode(): Int = {
        Objects.hash(assignable, clientMutationId)
    }
}

object AddAssigneesToAssignablePayloadTO {

    def builder(): AddAssigneesToAssignablePayloadTO.Builder = new Builder()

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

        def build(): AddAssigneesToAssignablePayloadTO = new AddAssigneesToAssignablePayloadTO(assignable, clientMutationId)

    }
}
