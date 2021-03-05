package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class ContributionCalendarTO(
    val colors: List<String>,
    val isHalloween: Boolean,
    val months: List<ContributionCalendarMonthTO>,
    val totalContributions: Int,
    val weeks: List<ContributionCalendarWeekTO>
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("colors: " + GraphQLRequestSerializer.getEntry(colors))
        joiner.add("isHalloween: " + GraphQLRequestSerializer.getEntry(isHalloween))
        joiner.add("months: " + GraphQLRequestSerializer.getEntry(months))
        joiner.add("totalContributions: " + GraphQLRequestSerializer.getEntry(totalContributions))
        joiner.add("weeks: " + GraphQLRequestSerializer.getEntry(weeks))
        return joiner.toString()
    }
}
