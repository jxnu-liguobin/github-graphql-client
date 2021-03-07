package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._
import RepositoryPermissionTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class RepositoryCollaboratorEdgeTO(
    @javax.validation.constraints.NotNull
    cursor: String,
    @javax.validation.constraints.NotNull
    node: UserTO,
    @javax.validation.constraints.NotNull
    permission: RepositoryPermissionTO,
    @javax.validation.constraints.NotNull
    permissionSources: Seq[PermissionSourceTO]
) {

    override def toString(): String = {
        Seq(
            if (cursor != null) "cursor: " + GraphQLRequestSerializer.getEntry(cursor) else "",
            if (node != null) "node: " + GraphQLRequestSerializer.getEntry(node) else "",
            if (permission != null) "permission: " + GraphQLRequestSerializer.getEntry(permission) else "",
            if (permissionSources != null) "permissionSources: " + GraphQLRequestSerializer.getEntry(permissionSources.asJava) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object RepositoryCollaboratorEdgeTO {

    def builder(): RepositoryCollaboratorEdgeTO.Builder = new Builder()

    class Builder {

        private var cursor: String = _
        private var node: UserTO = _
        private var permission: RepositoryPermissionTO = _
        private var permissionSources: Seq[PermissionSourceTO] = _

        def setCursor(cursor: String): Builder = {
            this.cursor = cursor
            this
        }

        def setNode(node: UserTO): Builder = {
            this.node = node
            this
        }

        def setPermission(permission: RepositoryPermissionTO): Builder = {
            this.permission = permission
            this
        }

        def setPermissionSources(permissionSources: Seq[PermissionSourceTO]): Builder = {
            this.permissionSources = permissionSources
            this
        }

        def build(): RepositoryCollaboratorEdgeTO = new RepositoryCollaboratorEdgeTO(cursor, node, permission, permissionSources)

    }
}
