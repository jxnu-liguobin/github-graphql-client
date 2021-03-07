package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class CreatePullRequestInputTO(
    val baseRefName: String,
    val body: String?,
    val clientMutationId: String?,
    val headRefName: String,
    val maintainerCanModify: Boolean? = true,
    val repositoryId: String,
    val title: String
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("baseRefName: " + GraphQLRequestSerializer.getEntry(baseRefName))
        if (body != null) {
            joiner.add("body: " + GraphQLRequestSerializer.getEntry(body))
        }
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        joiner.add("headRefName: " + GraphQLRequestSerializer.getEntry(headRefName))
        if (maintainerCanModify != null) {
            joiner.add("maintainerCanModify: " + GraphQLRequestSerializer.getEntry(maintainerCanModify))
        }
        joiner.add("repositoryId: " + GraphQLRequestSerializer.getEntry(repositoryId))
        joiner.add("title: " + GraphQLRequestSerializer.getEntry(title))
        return joiner.toString()
    }

    class Builder {

        private lateinit var baseRefName: String
        private var body: String? = null
        private var clientMutationId: String? = null
        private lateinit var headRefName: String
        private var maintainerCanModify: Boolean? = true
        private lateinit var repositoryId: String
        private lateinit var title: String

        fun setBaseRefName(baseRefName: String): Builder {
            this.baseRefName = baseRefName
            return this
        }

        fun setBody(body: String?): Builder {
            this.body = body
            return this
        }

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setHeadRefName(headRefName: String): Builder {
            this.headRefName = headRefName
            return this
        }

        fun setMaintainerCanModify(maintainerCanModify: Boolean?): Builder {
            this.maintainerCanModify = maintainerCanModify
            return this
        }

        fun setRepositoryId(repositoryId: String): Builder {
            this.repositoryId = repositoryId
            return this
        }

        fun setTitle(title: String): Builder {
            this.title = title
            return this
        }

        fun build(): CreatePullRequestInputTO {
            return CreatePullRequestInputTO(baseRefName, body, clientMutationId, headRefName, maintainerCanModify, repositoryId, title)
        }
    }
}
