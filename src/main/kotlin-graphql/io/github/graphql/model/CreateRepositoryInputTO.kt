package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class CreateRepositoryInputTO(
    val clientMutationId: String?,
    val description: String?,
    val hasIssuesEnabled: Boolean? = true,
    val hasWikiEnabled: Boolean? = false,
    val homepageUrl: String?,
    val name: String,
    val ownerId: String?,
    val teamId: String?,
    val template: Boolean? = false,
    val visibility: RepositoryVisibilityTO
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
        if (hasWikiEnabled != null) {
            joiner.add("hasWikiEnabled: " + GraphQLRequestSerializer.getEntry(hasWikiEnabled))
        }
        if (homepageUrl != null) {
            joiner.add("homepageUrl: " + GraphQLRequestSerializer.getEntry(homepageUrl))
        }
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        if (ownerId != null) {
            joiner.add("ownerId: " + GraphQLRequestSerializer.getEntry(ownerId))
        }
        if (teamId != null) {
            joiner.add("teamId: " + GraphQLRequestSerializer.getEntry(teamId))
        }
        if (template != null) {
            joiner.add("template: " + GraphQLRequestSerializer.getEntry(template))
        }
        joiner.add("visibility: " + GraphQLRequestSerializer.getEntry(visibility))
        return joiner.toString()
    }

    class Builder {

        private var clientMutationId: String? = null
        private var description: String? = null
        private var hasIssuesEnabled: Boolean? = true
        private var hasWikiEnabled: Boolean? = false
        private var homepageUrl: String? = null
        private lateinit var name: String
        private var ownerId: String? = null
        private var teamId: String? = null
        private var template: Boolean? = false
        private lateinit var visibility: RepositoryVisibilityTO

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

        fun setHasWikiEnabled(hasWikiEnabled: Boolean?): Builder {
            this.hasWikiEnabled = hasWikiEnabled
            return this
        }

        fun setHomepageUrl(homepageUrl: String?): Builder {
            this.homepageUrl = homepageUrl
            return this
        }

        fun setName(name: String): Builder {
            this.name = name
            return this
        }

        fun setOwnerId(ownerId: String?): Builder {
            this.ownerId = ownerId
            return this
        }

        fun setTeamId(teamId: String?): Builder {
            this.teamId = teamId
            return this
        }

        fun setTemplate(template: Boolean?): Builder {
            this.template = template
            return this
        }

        fun setVisibility(visibility: RepositoryVisibilityTO): Builder {
            this.visibility = visibility
            return this
        }

        fun build(): CreateRepositoryInputTO {
            return CreateRepositoryInputTO(clientMutationId, description, hasIssuesEnabled, hasWikiEnabled, homepageUrl, name, ownerId, teamId, template, visibility)
        }
    }
}
