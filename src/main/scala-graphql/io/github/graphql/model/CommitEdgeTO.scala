package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class CommitEdgeTO(
    @javax.validation.constraints.NotNull
    cursor: String,
    node: CommitTO
) {

    override def toString(): String = {
        Seq(
            if (cursor != null) "cursor: " + GraphQLRequestSerializer.getEntry(cursor) else "",
            if (node != null) "node: " + GraphQLRequestSerializer.getEntry(node) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object CommitEdgeTO {

    def builder(): CommitEdgeTO.Builder = new Builder()

    class Builder {

        private var cursor: String = _
        private var node: CommitTO = _

        def setCursor(cursor: String): Builder = {
            this.cursor = cursor
            this
        }

        def setNode(node: CommitTO): Builder = {
            this.node = node
            this
        }

        def build(): CommitEdgeTO = new CommitEdgeTO(cursor, node)

    }
}
