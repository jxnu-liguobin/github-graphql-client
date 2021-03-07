package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as ContributionCalendarWeekTO
        return Objects.equals(contributionDays, that.contributionDays)
                && Objects.equals(firstDay, that.firstDay)

    }

    override fun hashCode(): Int = {
        return Objects.hash(contributionDays, firstDay)
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
