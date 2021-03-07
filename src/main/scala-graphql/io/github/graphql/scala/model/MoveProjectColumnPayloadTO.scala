package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class MoveProjectColumnPayloadTO(
    clientMutationId: String,
    columnEdge: ProjectColumnEdgeTO
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (columnEdge != null) "columnEdge: " + GraphQLRequestSerializer.getEntry(columnEdge) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[MoveProjectColumnPayloadTO]
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(columnEdge, that.columnEdge)
    }

    override def hashCode(): Int = {
        Objects.hash(clientMutationId, columnEdge)
    }
}

object MoveProjectColumnPayloadTO {

    def builder(): MoveProjectColumnPayloadTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var columnEdge: ProjectColumnEdgeTO = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setColumnEdge(columnEdge: ProjectColumnEdgeTO): Builder = {
            this.columnEdge = columnEdge
            this
        }

        def build(): MoveProjectColumnPayloadTO = new MoveProjectColumnPayloadTO(clientMutationId, columnEdge)

    }
}
