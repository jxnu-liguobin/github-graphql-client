package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class ReactionEdgeTO(
    @javax.validation.constraints.NotNull
    cursor: String,
    node: ReactionTO
) {

    override def toString(): String = {
        Seq(
            if (cursor != null) "cursor: " + GraphQLRequestSerializer.getEntry(cursor) else "",
            if (node != null) "node: " + GraphQLRequestSerializer.getEntry(node) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object ReactionEdgeTO {

    def builder(): ReactionEdgeTO.Builder = new Builder()

    class Builder {

        private var cursor: String = _
        private var node: ReactionTO = _

        def setCursor(cursor: String): Builder = {
            this.cursor = cursor
            this
        }

        def setNode(node: ReactionTO): Builder = {
            this.node = node
            this
        }

        def build(): ReactionEdgeTO = new ReactionEdgeTO(cursor, node)

    }
}
