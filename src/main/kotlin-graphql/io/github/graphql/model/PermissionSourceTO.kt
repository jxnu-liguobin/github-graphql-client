package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
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
