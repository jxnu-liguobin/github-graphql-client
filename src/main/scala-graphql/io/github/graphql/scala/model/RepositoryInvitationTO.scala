package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._
import RepositoryPermissionTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class RepositoryInvitationTO(
    @javax.validation.constraints.NotNull
    override val id: String,
    @javax.validation.constraints.NotNull
    invitee: UserTO,
    @javax.validation.constraints.NotNull
    inviter: UserTO,
    @javax.validation.constraints.NotNull
    permission: RepositoryPermissionTO,
    repository: RepositoryInfoTO
) extends NodeTO {

    override def toString(): String = {
        Seq(
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (invitee != null) "invitee: " + GraphQLRequestSerializer.getEntry(invitee) else "",
            if (inviter != null) "inviter: " + GraphQLRequestSerializer.getEntry(inviter) else "",
            if (permission != null) "permission: " + GraphQLRequestSerializer.getEntry(permission) else "",
            if (repository != null) "repository: " + GraphQLRequestSerializer.getEntry(repository) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[RepositoryInvitationTO]
        Objects.equals(id, that.id) &&
        Objects.equals(invitee, that.invitee) &&
        Objects.equals(inviter, that.inviter) &&
        Objects.equals(permission, that.permission) &&
        Objects.equals(repository, that.repository)
    }

    override def hashCode(): Int = {
        Objects.hash(id, invitee, inviter, permission, repository)
    }
}

object RepositoryInvitationTO {

    def builder(): RepositoryInvitationTO.Builder = new Builder()

    class Builder {

        private var id: String = _
        private var invitee: UserTO = _
        private var inviter: UserTO = _
        private var permission: RepositoryPermissionTO = _
        private var repository: RepositoryInfoTO = _

        def setId(id: String): Builder = {
            this.id = id
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

        def setPermission(permission: RepositoryPermissionTO): Builder = {
            this.permission = permission
            this
        }

        def setRepository(repository: RepositoryInfoTO): Builder = {
            this.repository = repository
            this
        }

        def build(): RepositoryInvitationTO = new RepositoryInvitationTO(id, invitee, inviter, permission, repository)

    }
}
