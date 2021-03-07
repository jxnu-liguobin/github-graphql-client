package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._
import OrganizationInvitationTypeTO._
import OrganizationInvitationRoleTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class OrganizationInvitationTO(
    @javax.validation.constraints.NotNull
    createdAt: String,
    email: String,
    @javax.validation.constraints.NotNull
    override val id: String,
    @javax.validation.constraints.NotNull
    invitationType: OrganizationInvitationTypeTO,
    invitee: UserTO,
    @javax.validation.constraints.NotNull
    inviter: UserTO,
    @javax.validation.constraints.NotNull
    organization: OrganizationTO,
    @javax.validation.constraints.NotNull
    role: OrganizationInvitationRoleTO
) extends NodeTO {

    override def toString(): String = {
        Seq(
            if (createdAt != null) "createdAt: " + GraphQLRequestSerializer.getEntry(createdAt) else "",
            if (email != null) "email: " + GraphQLRequestSerializer.getEntry(email) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (invitationType != null) "invitationType: " + GraphQLRequestSerializer.getEntry(invitationType) else "",
            if (invitee != null) "invitee: " + GraphQLRequestSerializer.getEntry(invitee) else "",
            if (inviter != null) "inviter: " + GraphQLRequestSerializer.getEntry(inviter) else "",
            if (organization != null) "organization: " + GraphQLRequestSerializer.getEntry(organization) else "",
            if (role != null) "role: " + GraphQLRequestSerializer.getEntry(role) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object OrganizationInvitationTO {

    def builder(): OrganizationInvitationTO.Builder = new Builder()

    class Builder {

        private var createdAt: String = _
        private var email: String = _
        private var id: String = _
        private var invitationType: OrganizationInvitationTypeTO = _
        private var invitee: UserTO = _
        private var inviter: UserTO = _
        private var organization: OrganizationTO = _
        private var role: OrganizationInvitationRoleTO = _

        def setCreatedAt(createdAt: String): Builder = {
            this.createdAt = createdAt
            this
        }

        def setEmail(email: String): Builder = {
            this.email = email
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setInvitationType(invitationType: OrganizationInvitationTypeTO): Builder = {
            this.invitationType = invitationType
            this
        }

        def setInvitee(invitee: UserTO): Builder = {
            this.invitee = invitee
            this
        }

        def setInviter(inviter: UserTO): Builder = {
            this.inviter = inviter
            this
        }

        def setOrganization(organization: OrganizationTO): Builder = {
            this.organization = organization
            this
        }

        def setRole(role: OrganizationInvitationRoleTO): Builder = {
            this.role = role
            this
        }

        def build(): OrganizationInvitationTO = new OrganizationInvitationTO(createdAt, email, id, invitationType, invitee, inviter, organization, role)

    }
}
