package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
open class RequestReviewsInputTO(
    val clientMutationId: String?,
    val pullRequestId: String,
    val teamIds: List<String>?,
    val union: Boolean?,
    val userIds: List<String>?
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
        joiner.add("pullRequestId: " + GraphQLRequestSerializer.getEntry(pullRequestId))
        if (teamIds != null) {
            joiner.add("teamIds: " + GraphQLRequestSerializer.getEntry(teamIds))
        }
        if (union != null) {
            joiner.add("union: " + GraphQLRequestSerializer.getEntry(union))
        }
        if (userIds != null) {
            joiner.add("userIds: " + GraphQLRequestSerializer.getEntry(userIds))
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
        val that = other as RequestReviewsInputTO
        return Objects.equals(clientMutationId, that.clientMutationId)
                && Objects.equals(pullRequestId, that.pullRequestId)
                && Objects.equals(teamIds, that.teamIds)
                && Objects.equals(union, that.union)
                && Objects.equals(userIds, that.userIds)

    }

    override fun hashCode(): Int = {
        return Objects.hash(clientMutationId, pullRequestId, teamIds, union, userIds)
    }

    class Builder {

        private var clientMutationId: String? = null
        private lateinit var pullRequestId: String
        private var teamIds: List<String>? = null
        private var union: Boolean? = null
        private var userIds: List<String>? = null

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setPullRequestId(pullRequestId: String): Builder {
            this.pullRequestId = pullRequestId
            return this
        }

        fun setTeamIds(teamIds: List<String>?): Builder {
            this.teamIds = teamIds
            return this
        }

        fun setUnion(union: Boolean?): Builder {
            this.union = union
            return this
        }

        fun setUserIds(userIds: List<String>?): Builder {
            this.userIds = userIds
            return this
        }

        fun build(): RequestReviewsInputTO {
            return RequestReviewsInputTO(clientMutationId, pullRequestId, teamIds, union, userIds)
        }
    }
}
