package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._
import DefaultRepositoryPermissionFieldTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
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
