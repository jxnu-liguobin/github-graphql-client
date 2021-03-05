package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class ContributionCalendarDayTO(
    val color: String,
    val contributionCount: Int,
    val date: String,
    val weekday: Int
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("color: " + GraphQLRequestSerializer.getEntry(color))
        joiner.add("contributionCount: " + GraphQLRequestSerializer.getEntry(contributionCount))
        joiner.add("date: " + GraphQLRequestSerializer.getEntry(date))
        joiner.add("weekday: " + GraphQLRequestSerializer.getEntry(weekday))
        return joiner.toString()
    }
}
