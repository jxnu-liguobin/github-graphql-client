package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class ChangeUserStatusInputTO(
    val clientMutationId: String?,
    val emoji: String?,
    val expiresAt: String?,
    val limitedAvailability: Boolean? = false,
    val message: String?,
    val organizationId: String?
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        if (emoji != null) {
            joiner.add("emoji: " + GraphQLRequestSerializer.getEntry(emoji))
        }
        if (expiresAt != null) {
            joiner.add("expiresAt: " + GraphQLRequestSerializer.getEntry(expiresAt))
        }
        if (limitedAvailability != null) {
            joiner.add("limitedAvailability: " + GraphQLRequestSerializer.getEntry(limitedAvailability))
        }
        if (message != null) {
            joiner.add("message: " + GraphQLRequestSerializer.getEntry(message))
        }
        if (organizationId != null) {
            joiner.add("organizationId: " + GraphQLRequestSerializer.getEntry(organizationId))
        }
        return joiner.toString()
    }
}
