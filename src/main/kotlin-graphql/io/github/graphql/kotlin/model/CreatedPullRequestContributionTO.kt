package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class CreatedPullRequestContributionTO(
    override
    val isRestricted: Boolean,
    override
    val occurredAt: String,
    val pullRequest: PullRequestTO,
    override
    val resourcePath: String,
    override
    val url: String,
    override
    val user: UserTO
) : CreatedPullRequestOrRestrictedContributionTO, ContributionTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("isRestricted: " + GraphQLRequestSerializer.getEntry(isRestricted))
        joiner.add("occurredAt: " + GraphQLRequestSerializer.getEntry(occurredAt))
        joiner.add("pullRequest: " + GraphQLRequestSerializer.getEntry(pullRequest))
        joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath))
        joiner.add("url: " + GraphQLRequestSerializer.getEntry(url))
        joiner.add("user: " + GraphQLRequestSerializer.getEntry(user))
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as CreatedPullRequestContributionTO
        return Objects.equals(isRestricted, that.isRestricted)
                && Objects.equals(occurredAt, that.occurredAt)
                && Objects.equals(pullRequest, that.pullRequest)
                && Objects.equals(resourcePath, that.resourcePath)
                && Objects.equals(url, that.url)
                && Objects.equals(user, that.user)

    }

    override fun hashCode(): Int = {
        return Objects.hash(isRestricted, occurredAt, pullRequest, resourcePath, url, user)
    }

    class Builder {

        private var isRestricted: Boolean = false
        private lateinit var occurredAt: String
        private lateinit var pullRequest: PullRequestTO
        private lateinit var resourcePath: String
        private lateinit var url: String
        private lateinit var user: UserTO

        fun setIsRestricted(isRestricted: Boolean): Builder {
            this.isRestricted = isRestricted
            return this
        }

        fun setOccurredAt(occurredAt: String): Builder {
            this.occurredAt = occurredAt
            return this
        }

        fun setPullRequest(pullRequest: PullRequestTO): Builder {
            this.pullRequest = pullRequest
            return this
        }

        fun setResourcePath(resourcePath: String): Builder {
            this.resourcePath = resourcePath
            return this
        }

        fun setUrl(url: String): Builder {
            this.url = url
            return this
        }

        fun setUser(user: UserTO): Builder {
            this.user = user
            return this
        }

        fun build(): CreatedPullRequestContributionTO {
            return CreatedPullRequestContributionTO(isRestricted, occurredAt, pullRequest, resourcePath, url, user)
        }
    }
}
