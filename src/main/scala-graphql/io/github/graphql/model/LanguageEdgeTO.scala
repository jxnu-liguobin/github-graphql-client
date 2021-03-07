package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
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
