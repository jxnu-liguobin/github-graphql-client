package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
open class ConvertProjectCardNoteToIssueInputTO(
    val body: String?,
    val clientMutationId: String?,
    val projectCardId: String,
    val repositoryId: String,
    val title: String?
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (body != null) {
            joiner.add("body: " + GraphQLRequestSerializer.getEntry(body))
        }
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        joiner.add("projectCardId: " + GraphQLRequestSerializer.getEntry(projectCardId))
        joiner.add("repositoryId: " + GraphQLRequestSerializer.getEntry(repositoryId))
        if (title != null) {
            joiner.add("title: " + GraphQLRequestSerializer.getEntry(title))
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
        val that = other as ConvertProjectCardNoteToIssueInputTO
        return Objects.equals(body, that.body)
                && Objects.equals(clientMutationId, that.clientMutationId)
                && Objects.equals(projectCardId, that.projectCardId)
                && Objects.equals(repositoryId, that.repositoryId)
                && Objects.equals(title, that.title)

    }

    override fun hashCode(): Int = {
        return Objects.hash(body, clientMutationId, projectCardId, repositoryId, title)
    }

    class Builder {

        private var body: String? = null
        private var clientMutationId: String? = null
        private lateinit var projectCardId: String
        private lateinit var repositoryId: String
        private var title: String? = null

        fun setBody(body: String?): Builder {
            this.body = body
            return this
        }

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setProjectCardId(projectCardId: String): Builder {
            this.projectCardId = projectCardId
            return this
        }

        fun setRepositoryId(repositoryId: String): Builder {
            this.repositoryId = repositoryId
            return this
        }

        fun setTitle(title: String?): Builder {
            this.title = title
            return this
        }

        fun build(): ConvertProjectCardNoteToIssueInputTO {
            return ConvertProjectCardNoteToIssueInputTO(body, clientMutationId, projectCardId, repositoryId, title)
        }
    }
}
