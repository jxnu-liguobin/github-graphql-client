package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class PullRequestTimelineItemsEdgeTO(
    @javax.validation.constraints.NotNull
    cursor: String,
    node: PullRequestTimelineItemsTO
) {

    override def toString(): String = {
        Seq(
            if (cursor != null) "cursor: " + GraphQLRequestSerializer.getEntry(cursor) else "",
            if (node != null) "node: " + GraphQLRequestSerializer.getEntry(node) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object PullRequestTimelineItemsEdgeTO {

    def builder(): PullRequestTimelineItemsEdgeTO.Builder = new Builder()

    class Builder {

        private var cursor: String = _
        private var node: PullRequestTimelineItemsTO = _

        def setCursor(cursor: String): Builder = {
            this.cursor = cursor
            this
        }

        def setNode(node: PullRequestTimelineItemsTO): Builder = {
            this.node = node
            this
        }

        def build(): PullRequestTimelineItemsEdgeTO = new PullRequestTimelineItemsEdgeTO(cursor, node)

    }
}
