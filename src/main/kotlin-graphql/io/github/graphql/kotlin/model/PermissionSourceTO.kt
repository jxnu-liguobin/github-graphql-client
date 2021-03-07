package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class PermissionSourceTO(
    val organization: OrganizationTO,
    val permission: DefaultRepositoryPermissionFieldTO,
    val source: PermissionGranterTO
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("organization: " + GraphQLRequestSerializer.getEntry(organization))
        joiner.add("permission: " + GraphQLRequestSerializer.getEntry(permission))
        joiner.add("source: " + GraphQLRequestSerializer.getEntry(source))
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as PermissionSourceTO
        return Objects.equals(organization, that.organization)
                && Objects.equals(permission, that.permission)
                && Objects.equals(source, that.source)

    }

    override fun hashCode(): Int = {
        return Objects.hash(organization, permission, source)
    }

    class Builder {

        private lateinit var organization: OrganizationTO
        private lateinit var permission: DefaultRepositoryPermissionFieldTO
        private lateinit var source: PermissionGranterTO

        fun setOrganization(organization: OrganizationTO): Builder {
            this.organization = organization
            return this
        }

        fun setPermission(permission: DefaultRepositoryPermissionFieldTO): Builder {
            this.permission = permission
            return this
        }

        fun setSource(source: PermissionGranterTO): Builder {
            this.source = source
            return this
        }

        fun build(): PermissionSourceTO {
            return PermissionSourceTO(organization, permission, source)
        }
    }
}
