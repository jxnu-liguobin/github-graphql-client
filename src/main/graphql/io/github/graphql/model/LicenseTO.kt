package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class LicenseTO(
    val body: String,
    val conditions: List<LicenseRuleTO?>,
    val description: String?,
    val featured: Boolean,
    val hidden: Boolean,
    override
    val id: String,
    val implementation: String?,
    val key: String,
    val limitations: List<LicenseRuleTO?>,
    val name: String,
    val nickname: String?,
    val permissions: List<LicenseRuleTO?>,
    val pseudoLicense: Boolean,
    val spdxId: String?,
    val url: String?
) : NodeTO {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("body: " + GraphQLRequestSerializer.getEntry(body))
        joiner.add("conditions: " + GraphQLRequestSerializer.getEntry(conditions))
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description))
        }
        joiner.add("featured: " + GraphQLRequestSerializer.getEntry(featured))
        joiner.add("hidden: " + GraphQLRequestSerializer.getEntry(hidden))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        if (implementation != null) {
            joiner.add("implementation: " + GraphQLRequestSerializer.getEntry(implementation))
        }
        joiner.add("key: " + GraphQLRequestSerializer.getEntry(key))
        joiner.add("limitations: " + GraphQLRequestSerializer.getEntry(limitations))
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        if (nickname != null) {
            joiner.add("nickname: " + GraphQLRequestSerializer.getEntry(nickname))
        }
        joiner.add("permissions: " + GraphQLRequestSerializer.getEntry(permissions))
        joiner.add("pseudoLicense: " + GraphQLRequestSerializer.getEntry(pseudoLicense))
        if (spdxId != null) {
            joiner.add("spdxId: " + GraphQLRequestSerializer.getEntry(spdxId))
        }
        if (url != null) {
            joiner.add("url: " + GraphQLRequestSerializer.getEntry(url))
        }
        return joiner.toString()
    }
}
