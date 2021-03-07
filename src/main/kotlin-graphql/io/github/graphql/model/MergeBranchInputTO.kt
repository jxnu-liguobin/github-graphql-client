package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class MergeBranchInputTO(
    val base: String,
    val clientMutationId: String?,
    val commitMessage: String?,
    val head: String,
    val repositoryId: String
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("base: " + GraphQLRequestSerializer.getEntry(base))
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        if (commitMessage != null) {
            joiner.add("commitMessage: " + GraphQLRequestSerializer.getEntry(commitMessage))
        }
        joiner.add("head: " + GraphQLRequestSerializer.getEntry(head))
        joiner.add("repositoryId: " + GraphQLRequestSerializer.getEntry(repositoryId))
        return joiner.toString()
    }

    class Builder {

        private lateinit var base: String
        private var clientMutationId: String? = null
        private var commitMessage: String? = null
        private lateinit var head: String
        private lateinit var repositoryId: String

        fun setBase(base: String): Builder {
            this.base = base
            return this
        }

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setCommitMessage(commitMessage: String?): Builder {
            this.commitMessage = commitMessage
            return this
        }

        fun setHead(head: String): Builder {
            this.head = head
            return this
        }

        fun setRepositoryId(repositoryId: String): Builder {
            this.repositoryId = repositoryId
            return this
        }

        fun build(): MergeBranchInputTO {
            return MergeBranchInputTO(base, clientMutationId, commitMessage, head, repositoryId)
        }
    }
}
