package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class OrganizationInvitationTO(
    val createdAt: String,
    val email: String?,
    override
    val id: String,
    val invitationType: OrganizationInvitationTypeTO,
    val invitee: UserTO?,
    val inviter: UserTO,
    val organization: OrganizationTO,
    val role: OrganizationInvitationRoleTO
) : NodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        if (email != null) {
            joiner.add("email: " + GraphQLRequestSerializer.getEntry(email))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("invitationType: " + GraphQLRequestSerializer.getEntry(invitationType))
        if (invitee != null) {
            joiner.add("invitee: " + GraphQLRequestSerializer.getEntry(invitee))
        }
        joiner.add("inviter: " + GraphQLRequestSerializer.getEntry(inviter))
        joiner.add("organization: " + GraphQLRequestSerializer.getEntry(organization))
        joiner.add("role: " + GraphQLRequestSerializer.getEntry(role))
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as OrganizationInvitationTO
        return Objects.equals(createdAt, that.createdAt)
                && Objects.equals(email, that.email)
                && Objects.equals(id, that.id)
                && Objects.equals(invitationType, that.invitationType)
                && Objects.equals(invitee, that.invitee)
                && Objects.equals(inviter, that.inviter)
                && Objects.equals(organization, that.organization)
                && Objects.equals(role, that.role)

    }

    override fun hashCode(): Int = {
        return Objects.hash(createdAt, email, id, invitationType, invitee, inviter, organization, role)
    }

    class Builder {

        private lateinit var createdAt: String
        private var email: String? = null
        private lateinit var id: String
        private lateinit var invitationType: OrganizationInvitationTypeTO
        private var invitee: UserTO? = null
        private lateinit var inviter: UserTO
        private lateinit var organization: OrganizationTO
        private lateinit var role: OrganizationInvitationRoleTO

        fun setCreatedAt(createdAt: String): Builder {
            this.createdAt = createdAt
            return this
        }

        fun setEmail(email: String?): Builder {
            this.email = email
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setInvitationType(invitationType: OrganizationInvitationTypeTO): Builder {
            this.invitationType = invitationType
            return this
        }

        fun setInvitee(invitee: UserTO?): Builder {
            this.invitee = invitee
            return this
        }

        fun setInviter(inviter: UserTO): Builder {
            this.inviter = inviter
            return this
        }

        fun setOrganization(organization: OrganizationTO): Builder {
            this.organization = organization
            return this
        }

        fun setRole(role: OrganizationInvitationRoleTO): Builder {
            this.role = role
            return this
        }

        fun build(): OrganizationInvitationTO {
            return OrganizationInvitationTO(createdAt, email, id, invitationType, invitee, inviter, organization, role)
        }
    }
}
