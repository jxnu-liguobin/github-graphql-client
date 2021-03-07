package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class UpdateIssueCommentPayloadTO(
    val clientMutationId: String?,
    val issueComment: IssueCommentTO?
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
        if (issueComment != null) {
            joiner.add("issueComment: " + GraphQLRequestSerializer.getEntry(issueComment))
        }
        return joiner.toString()
    }

    class Builder {

        private var clientMutationId: String? = null
        private var issueComment: IssueCommentTO? = null

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setIssueComment(issueComment: IssueCommentTO?): Builder {
            this.issueComment = issueComment
            return this
        }

        fun build(): UpdateIssueCommentPayloadTO {
            return UpdateIssueCommentPayloadTO(clientMutationId, issueComment)
        }
    }
}
