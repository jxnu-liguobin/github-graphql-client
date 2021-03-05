package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
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
}
