package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class ExternalIdentityTO(
    @javax.validation.constraints.NotNull
    guid: String,
    @javax.validation.constraints.NotNull
    override val id: String,
    organizationInvitation: OrganizationInvitationTO,
    samlIdentity: ExternalIdentitySamlAttributesTO,
    scimIdentity: ExternalIdentityScimAttributesTO,
    user: UserTO
) extends NodeTO {

    override def toString(): String = {
        Seq(
            if (guid != null) "guid: " + GraphQLRequestSerializer.getEntry(guid) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (organizationInvitation != null) "organizationInvitation: " + GraphQLRequestSerializer.getEntry(organizationInvitation) else "",
            if (samlIdentity != null) "samlIdentity: " + GraphQLRequestSerializer.getEntry(samlIdentity) else "",
            if (scimIdentity != null) "scimIdentity: " + GraphQLRequestSerializer.getEntry(scimIdentity) else "",
            if (user != null) "user: " + GraphQLRequestSerializer.getEntry(user) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[ExternalIdentityTO]
        Objects.equals(guid, that.guid) &&
        Objects.equals(id, that.id) &&
        Objects.equals(organizationInvitation, that.organizationInvitation) &&
        Objects.equals(samlIdentity, that.samlIdentity) &&
        Objects.equals(scimIdentity, that.scimIdentity) &&
        Objects.equals(user, that.user)
    }

    override def hashCode(): Int = {
        Objects.hash(guid, id, organizationInvitation, samlIdentity, scimIdentity, user)
    }
}

object ExternalIdentityTO {

    def builder(): ExternalIdentityTO.Builder = new Builder()

    class Builder {

        private var guid: String = _
        private var id: String = _
        private var organizationInvitation: OrganizationInvitationTO = _
        private var samlIdentity: ExternalIdentitySamlAttributesTO = _
        private var scimIdentity: ExternalIdentityScimAttributesTO = _
        private var user: UserTO = _

        def setGuid(guid: String): Builder = {
            this.guid = guid
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setOrganizationInvitation(organizationInvitation: OrganizationInvitationTO): Builder = {
            this.organizationInvitation = organizationInvitation
            this
        }

        def setSamlIdentity(samlIdentity: ExternalIdentitySamlAttributesTO): Builder = {
            this.samlIdentity = samlIdentity
            this
        }

        def setScimIdentity(scimIdentity: ExternalIdentityScimAttributesTO): Builder = {
            this.scimIdentity = scimIdentity
            this
        }

        def setUser(user: UserTO): Builder = {
            this.user = user
            this
        }

        def build(): ExternalIdentityTO = new ExternalIdentityTO(guid, id, organizationInvitation, samlIdentity, scimIdentity, user)

    }
}
