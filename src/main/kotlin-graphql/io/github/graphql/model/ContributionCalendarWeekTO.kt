package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class ContributionCalendarWeekTO(
    val contributionDays: List<ContributionCalendarDayTO>,
    val firstDay: String
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("contributionDays: " + GraphQLRequestSerializer.getEntry(contributionDays))
        joiner.add("firstDay: " + GraphQLRequestSerializer.getEntry(firstDay))
        return joiner.toString()
    }

    class Builder {

        private lateinit var contributionDays: List<ContributionCalendarDayTO>
        private lateinit var firstDay: String

        fun setContributionDays(contributionDays: List<ContributionCalendarDayTO>): Builder {
            this.contributionDays = contributionDays
            return this
        }

        fun setFirstDay(firstDay: String): Builder {
            this.firstDay = firstDay
            return this
        }

        fun build(): ContributionCalendarWeekTO {
            return ContributionCalendarWeekTO(contributionDays, firstDay)
        }
    }
}
