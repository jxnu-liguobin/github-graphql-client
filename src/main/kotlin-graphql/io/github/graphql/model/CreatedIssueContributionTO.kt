package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class CreatedIssueContributionTO(
    override
    val isRestricted: Boolean,
    val issue: IssueTO,
    override
    val occurredAt: String,
    override
    val resourcePath: String,
    override
    val url: String,
    override
    val user: UserTO
) : CreatedIssueOrRestrictedContributionTO, ContributionTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("isRestricted: " + GraphQLRequestSerializer.getEntry(isRestricted))
        joiner.add("issue: " + GraphQLRequestSerializer.getEntry(issue))
        joiner.add("occurredAt: " + GraphQLRequestSerializer.getEntry(occurredAt))
        joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath))
        joiner.add("url: " + GraphQLRequestSerializer.getEntry(url))
        joiner.add("user: " + GraphQLRequestSerializer.getEntry(user))
        return joiner.toString()
    }

    class Builder {

        private var isRestricted: Boolean = false
        private lateinit var issue: IssueTO
        private lateinit var occurredAt: String
        private lateinit var resourcePath: String
        private lateinit var url: String
        private lateinit var user: UserTO

        fun setIsRestricted(isRestricted: Boolean): Builder {
            this.isRestricted = isRestricted
            return this
        }

        fun setIssue(issue: IssueTO): Builder {
            this.issue = issue
            return this
        }

        fun setOccurredAt(occurredAt: String): Builder {
            this.occurredAt = occurredAt
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

        fun build(): CreatedIssueContributionTO {
            return CreatedIssueContributionTO(isRestricted, issue, occurredAt, resourcePath, url, user)
        }
    }
}
