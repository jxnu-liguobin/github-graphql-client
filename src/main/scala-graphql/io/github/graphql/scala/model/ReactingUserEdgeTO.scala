package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
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

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[ReactingUserEdgeTO]
        Objects.equals(cursor, that.cursor) &&
        Objects.equals(node, that.node) &&
        Objects.equals(reactedAt, that.reactedAt)
    }

    override def hashCode(): Int = {
        Objects.hash(cursor, node, reactedAt)
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
