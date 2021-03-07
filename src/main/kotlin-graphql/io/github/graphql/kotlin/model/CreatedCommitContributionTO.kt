package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class CreatedCommitContributionTO(
    val commitCount: Int,
    override
    val isRestricted: Boolean,
    override
    val occurredAt: String,
    val repository: RepositoryTO,
    override
    val resourcePath: String,
    override
    val url: String,
    override
    val user: UserTO
) : ContributionTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("commitCount: " + GraphQLRequestSerializer.getEntry(commitCount))
        joiner.add("isRestricted: " + GraphQLRequestSerializer.getEntry(isRestricted))
        joiner.add("occurredAt: " + GraphQLRequestSerializer.getEntry(occurredAt))
        joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository))
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
        val that = other as CreatedCommitContributionTO
        return Objects.equals(commitCount, that.commitCount)
                && Objects.equals(isRestricted, that.isRestricted)
                && Objects.equals(occurredAt, that.occurredAt)
                && Objects.equals(repository, that.repository)
                && Objects.equals(resourcePath, that.resourcePath)
                && Objects.equals(url, that.url)
                && Objects.equals(user, that.user)

    }

    override fun hashCode(): Int = {
        return Objects.hash(commitCount, isRestricted, occurredAt, repository, resourcePath, url, user)
    }

    class Builder {

        private var commitCount: Int = 0
        private var isRestricted: Boolean = false
        private lateinit var occurredAt: String
        private lateinit var repository: RepositoryTO
        private lateinit var resourcePath: String
        private lateinit var url: String
        private lateinit var user: UserTO

        fun setCommitCount(commitCount: Int): Builder {
            this.commitCount = commitCount
            return this
        }

        fun setIsRestricted(isRestricted: Boolean): Builder {
            this.isRestricted = isRestricted
            return this
        }

        fun setOccurredAt(occurredAt: String): Builder {
            this.occurredAt = occurredAt
            return this
        }

        fun setRepository(repository: RepositoryTO): Builder {
            this.repository = repository
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

        fun build(): CreatedCommitContributionTO {
            return CreatedCommitContributionTO(commitCount, isRestricted, occurredAt, repository, resourcePath, url, user)
        }
    }
}
