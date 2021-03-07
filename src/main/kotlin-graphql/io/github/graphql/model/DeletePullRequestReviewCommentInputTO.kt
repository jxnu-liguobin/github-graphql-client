package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class DeletePullRequestReviewCommentInputTO(
    val clientMutationId: String?,
    val id: String
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
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        return joiner.toString()
    }

    class Builder {

        private var clientMutationId: String? = null
        private lateinit var id: String

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun build(): DeletePullRequestReviewCommentInputTO {
            return DeletePullRequestReviewCommentInputTO(clientMutationId, id)
        }
    }
}