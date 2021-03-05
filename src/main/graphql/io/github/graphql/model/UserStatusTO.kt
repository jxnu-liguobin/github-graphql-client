package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class UserStatusTO(
    val createdAt: String,
    val emoji: String?,
    val emojiHTML: String?,
    val expiresAt: String?,
    override
    val id: String,
    val indicatesLimitedAvailability: Boolean,
    val message: String?,
    val organization: OrganizationTO?,
    val updatedAt: String,
    val user: UserTO
) : NodeTO {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        if (emoji != null) {
            joiner.add("emoji: " + GraphQLRequestSerializer.getEntry(emoji))
        }
        if (emojiHTML != null) {
            joiner.add("emojiHTML: " + GraphQLRequestSerializer.getEntry(emojiHTML))
        }
        if (expiresAt != null) {
            joiner.add("expiresAt: " + GraphQLRequestSerializer.getEntry(expiresAt))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("indicatesLimitedAvailability: " + GraphQLRequestSerializer.getEntry(indicatesLimitedAvailability))
        if (message != null) {
            joiner.add("message: " + GraphQLRequestSerializer.getEntry(message))
        }
        if (organization != null) {
            joiner.add("organization: " + GraphQLRequestSerializer.getEntry(organization))
        }
        joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt))
        joiner.add("user: " + GraphQLRequestSerializer.getEntry(user))
        return joiner.toString()
    }
}
