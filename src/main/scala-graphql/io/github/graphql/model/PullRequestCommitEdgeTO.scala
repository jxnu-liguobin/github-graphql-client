package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class PullRequestCommitEdgeTO(
    @javax.validation.constraints.NotNull
    cursor: String,
    node: PullRequestCommitTO
) {

    override def toString(): String = {
        Seq(
            if (cursor != null) "cursor: " + GraphQLRequestSerializer.getEntry(cursor) else "",
            if (node != null) "node: " + GraphQLRequestSerializer.getEntry(node) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object PullRequestCommitEdgeTO {

    def builder(): PullRequestCommitEdgeTO.Builder = new Builder()

    class Builder {

        private var cursor: String = _
        private var node: PullRequestCommitTO = _

        def setCursor(cursor: String): Builder = {
            this.cursor = cursor
            this
        }

        def setNode(node: PullRequestCommitTO): Builder = {
            this.node = node
            this
        }

        def build(): PullRequestCommitEdgeTO = new PullRequestCommitEdgeTO(cursor, node)

    }
}
