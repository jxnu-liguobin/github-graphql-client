package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class PullRequestChangedFileEdgeTO(
    @javax.validation.constraints.NotNull
    cursor: String,
    node: PullRequestChangedFileTO
) {

    override def toString(): String = {
        Seq(
            if (cursor != null) "cursor: " + GraphQLRequestSerializer.getEntry(cursor) else "",
            if (node != null) "node: " + GraphQLRequestSerializer.getEntry(node) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object PullRequestChangedFileEdgeTO {

    def builder(): PullRequestChangedFileEdgeTO.Builder = new Builder()

    class Builder {

        private var cursor: String = _
        private var node: PullRequestChangedFileTO = _

        def setCursor(cursor: String): Builder = {
            this.cursor = cursor
            this
        }

        def setNode(node: PullRequestChangedFileTO): Builder = {
            this.node = node
            this
        }

        def build(): PullRequestChangedFileEdgeTO = new PullRequestChangedFileEdgeTO(cursor, node)

    }
}
