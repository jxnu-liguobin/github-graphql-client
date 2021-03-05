package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class GitHubMetadataTO(
    val gitHubServicesSha: String,
    val gitIpAddresses: List<String>?,
    val hookIpAddresses: List<String>?,
    val importerIpAddresses: List<String>?,
    val isPasswordAuthenticationVerifiable: Boolean,
    val pagesIpAddresses: List<String>?
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("gitHubServicesSha: " + GraphQLRequestSerializer.getEntry(gitHubServicesSha))
        if (gitIpAddresses != null) {
            joiner.add("gitIpAddresses: " + GraphQLRequestSerializer.getEntry(gitIpAddresses))
        }
        if (hookIpAddresses != null) {
            joiner.add("hookIpAddresses: " + GraphQLRequestSerializer.getEntry(hookIpAddresses))
        }
        if (importerIpAddresses != null) {
            joiner.add("importerIpAddresses: " + GraphQLRequestSerializer.getEntry(importerIpAddresses))
        }
        joiner.add("isPasswordAuthenticationVerifiable: " + GraphQLRequestSerializer.getEntry(isPasswordAuthenticationVerifiable))
        if (pagesIpAddresses != null) {
            joiner.add("pagesIpAddresses: " + GraphQLRequestSerializer.getEntry(pagesIpAddresses))
        }
        return joiner.toString()
    }
}
