package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
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
