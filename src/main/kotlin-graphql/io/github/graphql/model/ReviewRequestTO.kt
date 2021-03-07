package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class ReviewRequestTO(
    val databaseId: Int?,
    override
    val id: String,
    val pullRequest: PullRequestTO,
    val requestedReviewer: RequestedReviewerTO?
) : NodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (databaseId != null) {
            joiner.add("databaseId: " + GraphQLRequestSerializer.getEntry(databaseId))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("pullRequest: " + GraphQLRequestSerializer.getEntry(pullRequest))
        if (requestedReviewer != null) {
            joiner.add("requestedReviewer: " + GraphQLRequestSerializer.getEntry(requestedReviewer))
        }
        return joiner.toString()
    }

    class Builder {

        private var databaseId: Int? = null
        private lateinit var id: String
        private lateinit var pullRequest: PullRequestTO
        private var requestedReviewer: RequestedReviewerTO? = null

        fun setDatabaseId(databaseId: Int?): Builder {
            this.databaseId = databaseId
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setPullRequest(pullRequest: PullRequestTO): Builder {
            this.pullRequest = pullRequest
            return this
        }

        fun setRequestedReviewer(requestedReviewer: RequestedReviewerTO?): Builder {
            this.requestedReviewer = requestedReviewer
            return this
        }

        fun build(): ReviewRequestTO {
            return ReviewRequestTO(databaseId, id, pullRequest, requestedReviewer)
        }
    }
}
