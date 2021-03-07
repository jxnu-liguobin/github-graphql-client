package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
open class UpdateRepositoryInputTO(
    val clientMutationId: String?,
    val description: String?,
    val hasIssuesEnabled: Boolean?,
    val hasProjectsEnabled: Boolean?,
    val hasWikiEnabled: Boolean?,
    val homepageUrl: String?,
    val name: String?,
    val repositoryId: String,
    val template: Boolean?
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description))
        }
        if (hasIssuesEnabled != null) {
            joiner.add("hasIssuesEnabled: " + GraphQLRequestSerializer.getEntry(hasIssuesEnabled))
        }
        if (hasProjectsEnabled != null) {
            joiner.add("hasProjectsEnabled: " + GraphQLRequestSerializer.getEntry(hasProjectsEnabled))
        }
        if (hasWikiEnabled != null) {
            joiner.add("hasWikiEnabled: " + GraphQLRequestSerializer.getEntry(hasWikiEnabled))
        }
        if (homepageUrl != null) {
            joiner.add("homepageUrl: " + GraphQLRequestSerializer.getEntry(homepageUrl))
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        }
        joiner.add("repositoryId: " + GraphQLRequestSerializer.getEntry(repositoryId))
        if (template != null) {
            joiner.add("template: " + GraphQLRequestSerializer.getEntry(template))
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
        val that = other as UpdateRepositoryInputTO
        return Objects.equals(clientMutationId, that.clientMutationId)
                && Objects.equals(description, that.description)
                && Objects.equals(hasIssuesEnabled, that.hasIssuesEnabled)
                && Objects.equals(hasProjectsEnabled, that.hasProjectsEnabled)
                && Objects.equals(hasWikiEnabled, that.hasWikiEnabled)
                && Objects.equals(homepageUrl, that.homepageUrl)
                && Objects.equals(name, that.name)
                && Objects.equals(repositoryId, that.repositoryId)
                && Objects.equals(template, that.template)

    }

    override fun hashCode(): Int = {
        return Objects.hash(clientMutationId, description, hasIssuesEnabled, hasProjectsEnabled, hasWikiEnabled, homepageUrl, name, repositoryId, template)
    }

    class Builder {

        private var clientMutationId: String? = null
        private var description: String? = null
        private var hasIssuesEnabled: Boolean? = null
        private var hasProjectsEnabled: Boolean? = null
        private var hasWikiEnabled: Boolean? = null
        private var homepageUrl: String? = null
        private var name: String? = null
        private lateinit var repositoryId: String
        private var template: Boolean? = null

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setDescription(description: String?): Builder {
            this.description = description
            return this
        }

        fun setHasIssuesEnabled(hasIssuesEnabled: Boolean?): Builder {
            this.hasIssuesEnabled = hasIssuesEnabled
            return this
        }

        fun setHasProjectsEnabled(hasProjectsEnabled: Boolean?): Builder {
            this.hasProjectsEnabled = hasProjectsEnabled
            return this
        }

        fun setHasWikiEnabled(hasWikiEnabled: Boolean?): Builder {
            this.hasWikiEnabled = hasWikiEnabled
            return this
        }

        fun setHomepageUrl(homepageUrl: String?): Builder {
            this.homepageUrl = homepageUrl
            return this
        }

        fun setName(name: String?): Builder {
            this.name = name
            return this
        }

        fun setRepositoryId(repositoryId: String): Builder {
            this.repositoryId = repositoryId
            return this
        }

        fun setTemplate(template: Boolean?): Builder {
            this.template = template
            return this
        }

        fun build(): UpdateRepositoryInputTO {
            return UpdateRepositoryInputTO(clientMutationId, description, hasIssuesEnabled, hasProjectsEnabled, hasWikiEnabled, homepageUrl, name, repositoryId, template)
        }
    }
}
