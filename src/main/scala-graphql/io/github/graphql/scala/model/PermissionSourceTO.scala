package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._
import DefaultRepositoryPermissionFieldTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class PermissionSourceTO(
    @javax.validation.constraints.NotNull
    organization: OrganizationTO,
    @javax.validation.constraints.NotNull
    permission: DefaultRepositoryPermissionFieldTO,
    @javax.validation.constraints.NotNull
    source: PermissionGranterTO
) {

    override def toString(): String = {
        Seq(
            if (organization != null) "organization: " + GraphQLRequestSerializer.getEntry(organization) else "",
            if (permission != null) "permission: " + GraphQLRequestSerializer.getEntry(permission) else "",
            if (source != null) "source: " + GraphQLRequestSerializer.getEntry(source) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[PermissionSourceTO]
        Objects.equals(organization, that.organization) &&
        Objects.equals(permission, that.permission) &&
        Objects.equals(source, that.source)
    }

    override def hashCode(): Int = {
        Objects.hash(organization, permission, source)
    }
}

object PermissionSourceTO {

    def builder(): PermissionSourceTO.Builder = new Builder()

    class Builder {

        private var organization: OrganizationTO = _
        private var permission: DefaultRepositoryPermissionFieldTO = _
        private var source: PermissionGranterTO = _

        def setOrganization(organization: OrganizationTO): Builder = {
            this.organization = organization
            this
        }

        def setPermission(permission: DefaultRepositoryPermissionFieldTO): Builder = {
            this.permission = permission
            this
        }

        def setSource(source: PermissionGranterTO): Builder = {
            this.source = source
            this
        }

        def build(): PermissionSourceTO = new PermissionSourceTO(organization, permission, source)

    }
}
