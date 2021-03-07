package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
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

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[DeleteProjectCardPayloadTO]
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(column, that.column) &&
        Objects.equals(deletedCardId, that.deletedCardId)
    }

    override def hashCode(): Int = {
        Objects.hash(clientMutationId, column, deletedCardId)
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
