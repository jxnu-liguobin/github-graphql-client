package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class GitHubMetadataTO(
    val gitHubServicesSha: String,
    val gitIpAddresses: List<String>?,
    val hookIpAddresses: List<String>?,
    val importerIpAddresses: List<String>?,
    val isPasswordAuthenticationVerifiable: Boolean,
    val pagesIpAddresses: List<String>?
) {

    companion object {
        fun builder(): Builder = Builder()
    }

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

    class Builder {

        private lateinit var gitHubServicesSha: String
        private var gitIpAddresses: List<String>? = null
        private var hookIpAddresses: List<String>? = null
        private var importerIpAddresses: List<String>? = null
        private var isPasswordAuthenticationVerifiable: Boolean = false
        private var pagesIpAddresses: List<String>? = null

        fun setGitHubServicesSha(gitHubServicesSha: String): Builder {
            this.gitHubServicesSha = gitHubServicesSha
            return this
        }

        fun setGitIpAddresses(gitIpAddresses: List<String>?): Builder {
            this.gitIpAddresses = gitIpAddresses
            return this
        }

        fun setHookIpAddresses(hookIpAddresses: List<String>?): Builder {
            this.hookIpAddresses = hookIpAddresses
            return this
        }

        fun setImporterIpAddresses(importerIpAddresses: List<String>?): Builder {
            this.importerIpAddresses = importerIpAddresses
            return this
        }

        fun setIsPasswordAuthenticationVerifiable(isPasswordAuthenticationVerifiable: Boolean): Builder {
            this.isPasswordAuthenticationVerifiable = isPasswordAuthenticationVerifiable
            return this
        }

        fun setPagesIpAddresses(pagesIpAddresses: List<String>?): Builder {
            this.pagesIpAddresses = pagesIpAddresses
            return this
        }

        fun build(): GitHubMetadataTO {
            return GitHubMetadataTO(gitHubServicesSha, gitIpAddresses, hookIpAddresses, importerIpAddresses, isPasswordAuthenticationVerifiable, pagesIpAddresses)
        }
    }
}
