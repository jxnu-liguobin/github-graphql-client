package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._
import OrganizationMemberRoleTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class OrganizationMemberEdgeTO(
    @javax.validation.constraints.NotNull
    cursor: String,
    hasTwoFactorEnabled: Option[Boolean],
    node: UserTO,
    role: OrganizationMemberRoleTO
) {

    override def toString(): String = {
        Seq(
            if (cursor != null) "cursor: " + GraphQLRequestSerializer.getEntry(cursor) else "",
            if (hasTwoFactorEnabled.isDefined) "hasTwoFactorEnabled: " + GraphQLRequestSerializer.getEntry(hasTwoFactorEnabled.get) else "",
            if (node != null) "node: " + GraphQLRequestSerializer.getEntry(node) else "",
            if (role != null) "role: " + GraphQLRequestSerializer.getEntry(role) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object OrganizationMemberEdgeTO {

    def builder(): OrganizationMemberEdgeTO.Builder = new Builder()

    class Builder {

        private var cursor: String = _
        private var hasTwoFactorEnabled: Option[Boolean] = _
        private var node: UserTO = _
        private var role: OrganizationMemberRoleTO = _

        def setCursor(cursor: String): Builder = {
            this.cursor = cursor
            this
        }

        def setHasTwoFactorEnabled(hasTwoFactorEnabled: Option[Boolean]): Builder = {
            this.hasTwoFactorEnabled = hasTwoFactorEnabled
            this
        }

        def setNode(node: UserTO): Builder = {
            this.node = node
            this
        }

        def setRole(role: OrganizationMemberRoleTO): Builder = {
            this.role = role
            this
        }

        def build(): OrganizationMemberEdgeTO = new OrganizationMemberEdgeTO(cursor, hasTwoFactorEnabled, node, role)

    }
}
