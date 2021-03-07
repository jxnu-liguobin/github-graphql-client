package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class AddAssigneesToAssignableInputTO(
    @javax.validation.constraints.NotNull
    assignableId: String,
    @javax.validation.constraints.NotNull
    assigneeIds: Seq[String],
    clientMutationId: String
) {

    override def toString(): String = {
        Seq(
            if (assignableId != null) "assignableId: " + GraphQLRequestSerializer.getEntry(assignableId) else "",
            if (assigneeIds != null) "assigneeIds: " + GraphQLRequestSerializer.getEntry(assigneeIds.asJava) else "",
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
        val that = obj.asInstanceOf[AddAssigneesToAssignableInputTO]
        Objects.equals(assignableId, that.assignableId) &&
        Objects.equals(assigneeIds, that.assigneeIds) &&
        Objects.equals(clientMutationId, that.clientMutationId)
    }

    override def hashCode(): Int = {
        Objects.hash(assignableId, assigneeIds, clientMutationId)
    }
}

object AddAssigneesToAssignableInputTO {

    def builder(): AddAssigneesToAssignableInputTO.Builder = new Builder()

    class Builder {

        private var assignableId: String = _
        private var assigneeIds: Seq[String] = _
        private var clientMutationId: String = _

        def setAssignableId(assignableId: String): Builder = {
            this.assignableId = assignableId
            this
        }

        def setAssigneeIds(assigneeIds: Seq[String]): Builder = {
            this.assigneeIds = assigneeIds
            this
        }

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def build(): AddAssigneesToAssignableInputTO = new AddAssigneesToAssignableInputTO(assignableId, assigneeIds, clientMutationId)

    }
}
