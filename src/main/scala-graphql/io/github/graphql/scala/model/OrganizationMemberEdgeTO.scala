package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._
import OrganizationMemberRoleTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
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

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[OrganizationMemberEdgeTO]
        Objects.equals(cursor, that.cursor) &&
        Objects.equals(hasTwoFactorEnabled, that.hasTwoFactorEnabled) &&
        Objects.equals(node, that.node) &&
        Objects.equals(role, that.role)
    }

    override def hashCode(): Int = {
        Objects.hash(cursor, hasTwoFactorEnabled, node, role)
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
