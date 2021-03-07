package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class MoveProjectColumnInputTO(
    afterColumnId: String,
    clientMutationId: String,
    @javax.validation.constraints.NotNull
    columnId: String
) {

    override def toString(): String = {
        Seq(
            if (afterColumnId != null) "afterColumnId: " + GraphQLRequestSerializer.getEntry(afterColumnId) else "",
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (columnId != null) "columnId: " + GraphQLRequestSerializer.getEntry(columnId) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object MoveProjectColumnInputTO {

    def builder(): MoveProjectColumnInputTO.Builder = new Builder()

    class Builder {

        private var afterColumnId: String = _
        private var clientMutationId: String = _
        private var columnId: String = _

        def setAfterColumnId(afterColumnId: String): Builder = {
            this.afterColumnId = afterColumnId
            this
        }

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setColumnId(columnId: String): Builder = {
            this.columnId = columnId
            this
        }

        def build(): MoveProjectColumnInputTO = new MoveProjectColumnInputTO(afterColumnId, clientMutationId, columnId)

    }
}
