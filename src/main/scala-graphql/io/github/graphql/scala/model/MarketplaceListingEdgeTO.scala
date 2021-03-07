package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class MarketplaceListingEdgeTO(
    @javax.validation.constraints.NotNull
    cursor: String,
    node: MarketplaceListingTO
) {

    override def toString(): String = {
        Seq(
            if (cursor != null) "cursor: " + GraphQLRequestSerializer.getEntry(cursor) else "",
            if (node != null) "node: " + GraphQLRequestSerializer.getEntry(node) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[MarketplaceListingEdgeTO]
        Objects.equals(cursor, that.cursor) &&
        Objects.equals(node, that.node)
    }

    override def hashCode(): Int = {
        Objects.hash(cursor, node)
    }
}

object MarketplaceListingEdgeTO {

    def builder(): MarketplaceListingEdgeTO.Builder = new Builder()

    class Builder {

        private var cursor: String = _
        private var node: MarketplaceListingTO = _

        def setCursor(cursor: String): Builder = {
            this.cursor = cursor
            this
        }

        def setNode(node: MarketplaceListingTO): Builder = {
            this.node = node
            this
        }

        def build(): MarketplaceListingEdgeTO = new MarketplaceListingEdgeTO(cursor, node)

    }
}
