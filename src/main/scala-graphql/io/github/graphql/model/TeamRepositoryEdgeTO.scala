package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._
import RepositoryPermissionTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class TeamRepositoryEdgeTO(
    @javax.validation.constraints.NotNull
    cursor: String,
    @javax.validation.constraints.NotNull
    node: RepositoryTO,
    @javax.validation.constraints.NotNull
    permission: RepositoryPermissionTO
) {

    override def toString(): String = {
        Seq(
            if (cursor != null) "cursor: " + GraphQLRequestSerializer.getEntry(cursor) else "",
            if (node != null) "node: " + GraphQLRequestSerializer.getEntry(node) else "",
            if (permission != null) "permission: " + GraphQLRequestSerializer.getEntry(permission) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object TeamRepositoryEdgeTO {

    def builder(): TeamRepositoryEdgeTO.Builder = new Builder()

    class Builder {

        private var cursor: String = _
        private var node: RepositoryTO = _
        private var permission: RepositoryPermissionTO = _

        def setCursor(cursor: String): Builder = {
            this.cursor = cursor
            this
        }

        def setNode(node: RepositoryTO): Builder = {
            this.node = node
            this
        }

        def setPermission(permission: RepositoryPermissionTO): Builder = {
            this.permission = permission
            this
        }

        def build(): TeamRepositoryEdgeTO = new TeamRepositoryEdgeTO(cursor, node, permission)

    }
}
