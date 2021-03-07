package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class ReleaseEdgeTO(
    @javax.validation.constraints.NotNull
    cursor: String,
    node: ReleaseTO
) {

    override def toString(): String = {
        Seq(
            if (cursor != null) "cursor: " + GraphQLRequestSerializer.getEntry(cursor) else "",
            if (node != null) "node: " + GraphQLRequestSerializer.getEntry(node) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object ReleaseEdgeTO {

    def builder(): ReleaseEdgeTO.Builder = new Builder()

    class Builder {

        private var cursor: String = _
        private var node: ReleaseTO = _

        def setCursor(cursor: String): Builder = {
            this.cursor = cursor
            this
        }

        def setNode(node: ReleaseTO): Builder = {
            this.node = node
            this
        }

        def build(): ReleaseEdgeTO = new ReleaseEdgeTO(cursor, node)

    }
}
