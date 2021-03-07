package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class ExternalIdentityTO(
    val guid: String,
    override
    val id: String,
    val organizationInvitation: OrganizationInvitationTO?,
    val samlIdentity: ExternalIdentitySamlAttributesTO?,
    val scimIdentity: ExternalIdentityScimAttributesTO?,
    val user: UserTO?
) : NodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("guid: " + GraphQLRequestSerializer.getEntry(guid))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        if (organizationInvitation != null) {
            joiner.add("organizationInvitation: " + GraphQLRequestSerializer.getEntry(organizationInvitation))
        }
        if (samlIdentity != null) {
            joiner.add("samlIdentity: " + GraphQLRequestSerializer.getEntry(samlIdentity))
        }
        if (scimIdentity != null) {
            joiner.add("scimIdentity: " + GraphQLRequestSerializer.getEntry(scimIdentity))
        }
        if (user != null) {
            joiner.add("user: " + GraphQLRequestSerializer.getEntry(user))
        }
        return joiner.toString()
    }

    class Builder {

        private lateinit var guid: String
        private lateinit var id: String
        private var organizationInvitation: OrganizationInvitationTO? = null
        private var samlIdentity: ExternalIdentitySamlAttributesTO? = null
        private var scimIdentity: ExternalIdentityScimAttributesTO? = null
        private var user: UserTO? = null

        fun setGuid(guid: String): Builder {
            this.guid = guid
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setOrganizationInvitation(organizationInvitation: OrganizationInvitationTO?): Builder {
            this.organizationInvitation = organizationInvitation
            return this
        }

        fun setSamlIdentity(samlIdentity: ExternalIdentitySamlAttributesTO?): Builder {
            this.samlIdentity = samlIdentity
            return this
        }

        fun setScimIdentity(scimIdentity: ExternalIdentityScimAttributesTO?): Builder {
            this.scimIdentity = scimIdentity
            return this
        }

        fun setUser(user: UserTO?): Builder {
            this.user = user
            return this
        }

        fun build(): ExternalIdentityTO {
            return ExternalIdentityTO(guid, id, organizationInvitation, samlIdentity, scimIdentity, user)
        }
    }
}
