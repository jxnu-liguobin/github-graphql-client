package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class OrganizationEdgeTO(
    @javax.validation.constraints.NotNull
    cursor: String,
    node: OrganizationTO
) {

    override def toString(): String = {
        Seq(
            if (cursor != null) "cursor: " + GraphQLRequestSerializer.getEntry(cursor) else "",
            if (node != null) "node: " + GraphQLRequestSerializer.getEntry(node) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object OrganizationEdgeTO {

    def builder(): OrganizationEdgeTO.Builder = new Builder()

    class Builder {

        private var cursor: String = _
        private var node: OrganizationTO = _

        def setCursor(cursor: String): Builder = {
            this.cursor = cursor
            this
        }

        def setNode(node: OrganizationTO): Builder = {
            this.node = node
            this
        }

        def build(): OrganizationEdgeTO = new OrganizationEdgeTO(cursor, node)

    }
}
