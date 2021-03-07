package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class StarredRepositoryEdgeTO(
    @javax.validation.constraints.NotNull
    cursor: String,
    @javax.validation.constraints.NotNull
    node: RepositoryTO,
    @javax.validation.constraints.NotNull
    starredAt: String
) {

    override def toString(): String = {
        Seq(
            if (cursor != null) "cursor: " + GraphQLRequestSerializer.getEntry(cursor) else "",
            if (node != null) "node: " + GraphQLRequestSerializer.getEntry(node) else "",
            if (starredAt != null) "starredAt: " + GraphQLRequestSerializer.getEntry(starredAt) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object StarredRepositoryEdgeTO {

    def builder(): StarredRepositoryEdgeTO.Builder = new Builder()

    class Builder {

        private var cursor: String = _
        private var node: RepositoryTO = _
        private var starredAt: String = _

        def setCursor(cursor: String): Builder = {
            this.cursor = cursor
            this
        }

        def setNode(node: RepositoryTO): Builder = {
            this.node = node
            this
        }

        def setStarredAt(starredAt: String): Builder = {
            this.starredAt = starredAt
            this
        }

        def build(): StarredRepositoryEdgeTO = new StarredRepositoryEdgeTO(cursor, node, starredAt)

    }
}
