package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
open class MergePullRequestInputTO(
    val clientMutationId: String?,
    val commitBody: String?,
    val commitHeadline: String?,
    val expectedHeadOid: String?,
    val pullRequestId: String
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
        if (commitBody != null) {
            joiner.add("commitBody: " + GraphQLRequestSerializer.getEntry(commitBody))
        }
        if (commitHeadline != null) {
            joiner.add("commitHeadline: " + GraphQLRequestSerializer.getEntry(commitHeadline))
        }
        if (expectedHeadOid != null) {
            joiner.add("expectedHeadOid: " + GraphQLRequestSerializer.getEntry(expectedHeadOid))
        }
        joiner.add("pullRequestId: " + GraphQLRequestSerializer.getEntry(pullRequestId))
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as MergePullRequestInputTO
        return Objects.equals(clientMutationId, that.clientMutationId)
                && Objects.equals(commitBody, that.commitBody)
                && Objects.equals(commitHeadline, that.commitHeadline)
                && Objects.equals(expectedHeadOid, that.expectedHeadOid)
                && Objects.equals(pullRequestId, that.pullRequestId)

    }

    override fun hashCode(): Int = {
        return Objects.hash(clientMutationId, commitBody, commitHeadline, expectedHeadOid, pullRequestId)
    }

    class Builder {

        private var clientMutationId: String? = null
        private var commitBody: String? = null
        private var commitHeadline: String? = null
        private var expectedHeadOid: String? = null
        private lateinit var pullRequestId: String

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setCommitBody(commitBody: String?): Builder {
            this.commitBody = commitBody
            return this
        }

        fun setCommitHeadline(commitHeadline: String?): Builder {
            this.commitHeadline = commitHeadline
            return this
        }

        fun setExpectedHeadOid(expectedHeadOid: String?): Builder {
            this.expectedHeadOid = expectedHeadOid
            return this
        }

        fun setPullRequestId(pullRequestId: String): Builder {
            this.pullRequestId = pullRequestId
            return this
        }

        fun build(): MergePullRequestInputTO {
            return MergePullRequestInputTO(clientMutationId, commitBody, commitHeadline, expectedHeadOid, pullRequestId)
        }
    }
}
