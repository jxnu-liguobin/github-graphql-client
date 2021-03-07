package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class SuggestedReviewerTO(
    val isAuthor: Boolean,
    val isCommenter: Boolean,
    val reviewer: UserTO
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("isAuthor: " + GraphQLRequestSerializer.getEntry(isAuthor))
        joiner.add("isCommenter: " + GraphQLRequestSerializer.getEntry(isCommenter))
        joiner.add("reviewer: " + GraphQLRequestSerializer.getEntry(reviewer))
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as SuggestedReviewerTO
        return Objects.equals(isAuthor, that.isAuthor)
                && Objects.equals(isCommenter, that.isCommenter)
                && Objects.equals(reviewer, that.reviewer)

    }

    override fun hashCode(): Int = {
        return Objects.hash(isAuthor, isCommenter, reviewer)
    }

    class Builder {

        private var isAuthor: Boolean = false
        private var isCommenter: Boolean = false
        private lateinit var reviewer: UserTO

        fun setIsAuthor(isAuthor: Boolean): Builder {
            this.isAuthor = isAuthor
            return this
        }

        fun setIsCommenter(isCommenter: Boolean): Builder {
            this.isCommenter = isCommenter
            return this
        }

        fun setReviewer(reviewer: UserTO): Builder {
            this.reviewer = reviewer
            return this
        }

        fun build(): SuggestedReviewerTO {
            return SuggestedReviewerTO(isAuthor, isCommenter, reviewer)
        }
    }
}
