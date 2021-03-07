package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class ReactingUserEdgeTO(
    @javax.validation.constraints.NotNull
    cursor: String,
    @javax.validation.constraints.NotNull
    node: UserTO,
    @javax.validation.constraints.NotNull
    reactedAt: String
) {

    override def toString(): String = {
        Seq(
            if (cursor != null) "cursor: " + GraphQLRequestSerializer.getEntry(cursor) else "",
            if (node != null) "node: " + GraphQLRequestSerializer.getEntry(node) else "",
            if (reactedAt != null) "reactedAt: " + GraphQLRequestSerializer.getEntry(reactedAt) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object ReactingUserEdgeTO {

    def builder(): ReactingUserEdgeTO.Builder = new Builder()

    class Builder {

        private var cursor: String = _
        private var node: UserTO = _
        private var reactedAt: String = _

        def setCursor(cursor: String): Builder = {
            this.cursor = cursor
            this
        }

        def setNode(node: UserTO): Builder = {
            this.node = node
            this
        }

        def setReactedAt(reactedAt: String): Builder = {
            this.reactedAt = reactedAt
            this
        }

        def build(): ReactingUserEdgeTO = new ReactingUserEdgeTO(cursor, node, reactedAt)

    }
}
