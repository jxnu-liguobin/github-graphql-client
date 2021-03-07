package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class DeleteProjectCardPayloadTO(
    clientMutationId: String,
    column: ProjectColumnTO,
    deletedCardId: String
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (column != null) "column: " + GraphQLRequestSerializer.getEntry(column) else "",
            if (deletedCardId != null) "deletedCardId: " + GraphQLRequestSerializer.getEntry(deletedCardId) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object DeleteProjectCardPayloadTO {

    def builder(): DeleteProjectCardPayloadTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var column: ProjectColumnTO = _
        private var deletedCardId: String = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setColumn(column: ProjectColumnTO): Builder = {
            this.column = column
            this
        }

        def setDeletedCardId(deletedCardId: String): Builder = {
            this.deletedCardId = deletedCardId
            this
        }

        def build(): DeleteProjectCardPayloadTO = new DeleteProjectCardPayloadTO(clientMutationId, column, deletedCardId)

    }
}
