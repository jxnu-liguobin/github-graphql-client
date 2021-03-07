package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class SearchResultItemEdgeTO(
    @javax.validation.constraints.NotNull
    cursor: String,
    node: SearchResultItemTO,
    textMatches: Seq[TextMatchTO]
) {

    override def toString(): String = {
        Seq(
            if (cursor != null) "cursor: " + GraphQLRequestSerializer.getEntry(cursor) else "",
            if (node != null) "node: " + GraphQLRequestSerializer.getEntry(node) else "",
            if (textMatches != null) "textMatches: " + GraphQLRequestSerializer.getEntry(textMatches.asJava) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[SearchResultItemEdgeTO]
        Objects.equals(cursor, that.cursor) &&
        Objects.equals(node, that.node) &&
        Objects.equals(textMatches, that.textMatches)
    }

    override def hashCode(): Int = {
        Objects.hash(cursor, node, textMatches)
    }
}

object SearchResultItemEdgeTO {

    def builder(): SearchResultItemEdgeTO.Builder = new Builder()

    class Builder {

        private var cursor: String = _
        private var node: SearchResultItemTO = _
        private var textMatches: Seq[TextMatchTO] = _

        def setCursor(cursor: String): Builder = {
            this.cursor = cursor
            this
        }

        def setNode(node: SearchResultItemTO): Builder = {
            this.node = node
            this
        }

        def setTextMatches(textMatches: Seq[TextMatchTO]): Builder = {
            this.textMatches = textMatches
            this
        }

        def build(): SearchResultItemEdgeTO = new SearchResultItemEdgeTO(cursor, node, textMatches)

    }
}
