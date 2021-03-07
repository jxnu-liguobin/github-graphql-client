package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class RepositoryInvitationTO(
    override
    val id: String,
    val invitee: UserTO,
    val inviter: UserTO,
    val permission: RepositoryPermissionTO,
    val repository: RepositoryInfoTO?
) : NodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("invitee: " + GraphQLRequestSerializer.getEntry(invitee))
        joiner.add("inviter: " + GraphQLRequestSerializer.getEntry(inviter))
        joiner.add("permission: " + GraphQLRequestSerializer.getEntry(permission))
        if (repository != null) {
            joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository))
        }
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as RepositoryInvitationTO
        return Objects.equals(id, that.id)
                && Objects.equals(invitee, that.invitee)
                && Objects.equals(inviter, that.inviter)
                && Objects.equals(permission, that.permission)
                && Objects.equals(repository, that.repository)

    }

    override fun hashCode(): Int = {
        return Objects.hash(id, invitee, inviter, permission, repository)
    }

    class Builder {

        private lateinit var id: String
        private lateinit var invitee: UserTO
        private lateinit var inviter: UserTO
        private lateinit var permission: RepositoryPermissionTO
        private var repository: RepositoryInfoTO? = null

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setInvitee(invitee: UserTO): Builder {
            this.invitee = invitee
            return this
        }

        fun setInviter(inviter: UserTO): Builder {
            this.inviter = inviter
            return this
        }

        fun setPermission(permission: RepositoryPermissionTO): Builder {
            this.permission = permission
            return this
        }

        fun setRepository(repository: RepositoryInfoTO?): Builder {
            this.repository = repository
            return this
        }

        fun build(): RepositoryInvitationTO {
            return RepositoryInvitationTO(id, invitee, inviter, permission, repository)
        }
    }
}
