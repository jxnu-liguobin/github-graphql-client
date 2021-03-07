package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class RemoveAssigneesFromAssignableInputTO(
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
}

object RemoveAssigneesFromAssignableInputTO {

    def builder(): RemoveAssigneesFromAssignableInputTO.Builder = new Builder()

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

        def build(): RemoveAssigneesFromAssignableInputTO = new RemoveAssigneesFromAssignableInputTO(assignableId, assigneeIds, clientMutationId)

    }
}
