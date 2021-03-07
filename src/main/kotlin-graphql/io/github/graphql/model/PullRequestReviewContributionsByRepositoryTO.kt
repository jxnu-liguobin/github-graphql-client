package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class PullRequestReviewContributionsByRepositoryTO(
    val repository: RepositoryTO
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository))
        return joiner.toString()
    }

    class Builder {

        private lateinit var repository: RepositoryTO

        fun setRepository(repository: RepositoryTO): Builder {
            this.repository = repository
            return this
        }

        fun build(): PullRequestReviewContributionsByRepositoryTO {
            return PullRequestReviewContributionsByRepositoryTO(repository)
        }
    }
}
