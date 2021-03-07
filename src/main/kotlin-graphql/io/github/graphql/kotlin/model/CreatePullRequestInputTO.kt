package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as CreatePullRequestInputTO
        return Objects.equals(baseRefName, that.baseRefName)
                && Objects.equals(body, that.body)
                && Objects.equals(clientMutationId, that.clientMutationId)
                && Objects.equals(headRefName, that.headRefName)
                && Objects.equals(maintainerCanModify, that.maintainerCanModify)
                && Objects.equals(repositoryId, that.repositoryId)
                && Objects.equals(title, that.title)

    }

    override fun hashCode(): Int = {
        return Objects.hash(baseRefName, body, clientMutationId, headRefName, maintainerCanModify, repositoryId, title)
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
