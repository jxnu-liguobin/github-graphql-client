package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class ContributionCalendarMonthTO(
    val firstDay: String,
    val name: String,
    val totalWeeks: Int,
    val year: Int
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("firstDay: " + GraphQLRequestSerializer.getEntry(firstDay))
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        joiner.add("totalWeeks: " + GraphQLRequestSerializer.getEntry(totalWeeks))
        joiner.add("year: " + GraphQLRequestSerializer.getEntry(year))
        return joiner.toString()
    }
}
