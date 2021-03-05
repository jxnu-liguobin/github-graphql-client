package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class ContributionCalendarWeekTO(
    val contributionDays: List<ContributionCalendarDayTO>,
    val firstDay: String
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("contributionDays: " + GraphQLRequestSerializer.getEntry(contributionDays))
        joiner.add("firstDay: " + GraphQLRequestSerializer.getEntry(firstDay))
        return joiner.toString()
    }
}
