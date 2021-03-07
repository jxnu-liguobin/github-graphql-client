package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class LanguageEdgeTO(
    @javax.validation.constraints.NotNull
    cursor: String,
    @javax.validation.constraints.NotNull
    node: LanguageTO,
    size: Int
) {

    override def toString(): String = {
        Seq(
            if (cursor != null) "cursor: " + GraphQLRequestSerializer.getEntry(cursor) else "",
            if (node != null) "node: " + GraphQLRequestSerializer.getEntry(node) else "",
            "size: " + GraphQLRequestSerializer.getEntry(size)
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[LanguageEdgeTO]
        Objects.equals(cursor, that.cursor) &&
        Objects.equals(node, that.node) &&
        Objects.equals(size, that.size)
    }

    override def hashCode(): Int = {
        Objects.hash(cursor, node, size)
    }
}

object LanguageEdgeTO {

    def builder(): LanguageEdgeTO.Builder = new Builder()

    class Builder {

        private var cursor: String = _
        private var node: LanguageTO = _
        private var size: Int = _

        def setCursor(cursor: String): Builder = {
            this.cursor = cursor
            this
        }

        def setNode(node: LanguageTO): Builder = {
            this.node = node
            this
        }

        def setSize(size: Int): Builder = {
            this.size = size
            this
        }

        def build(): LanguageEdgeTO = new LanguageEdgeTO(cursor, node, size)

    }
}
