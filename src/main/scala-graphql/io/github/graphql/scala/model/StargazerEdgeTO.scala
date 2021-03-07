package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class StargazerEdgeTO(
    @javax.validation.constraints.NotNull
    cursor: String,
    @javax.validation.constraints.NotNull
    node: UserTO,
    @javax.validation.constraints.NotNull
    starredAt: String
) {

    override def toString(): String = {
        Seq(
            if (cursor != null) "cursor: " + GraphQLRequestSerializer.getEntry(cursor) else "",
            if (node != null) "node: " + GraphQLRequestSerializer.getEntry(node) else "",
            if (starredAt != null) "starredAt: " + GraphQLRequestSerializer.getEntry(starredAt) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[StargazerEdgeTO]
        Objects.equals(cursor, that.cursor) &&
        Objects.equals(node, that.node) &&
        Objects.equals(starredAt, that.starredAt)
    }

    override def hashCode(): Int = {
        Objects.hash(cursor, node, starredAt)
    }
}

object StargazerEdgeTO {

    def builder(): StargazerEdgeTO.Builder = new Builder()

    class Builder {

        private var cursor: String = _
        private var node: UserTO = _
        private var starredAt: String = _

        def setCursor(cursor: String): Builder = {
            this.cursor = cursor
            this
        }

        def setNode(node: UserTO): Builder = {
            this.node = node
            this
        }

        def setStarredAt(starredAt: String): Builder = {
            this.starredAt = starredAt
            this
        }

        def build(): StargazerEdgeTO = new StargazerEdgeTO(cursor, node, starredAt)

    }
}
