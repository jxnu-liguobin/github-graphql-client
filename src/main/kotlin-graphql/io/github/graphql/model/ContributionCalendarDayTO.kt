package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class ContributionCalendarDayTO(
    val color: String,
    val contributionCount: Int,
    val date: String,
    val weekday: Int
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("color: " + GraphQLRequestSerializer.getEntry(color))
        joiner.add("contributionCount: " + GraphQLRequestSerializer.getEntry(contributionCount))
        joiner.add("date: " + GraphQLRequestSerializer.getEntry(date))
        joiner.add("weekday: " + GraphQLRequestSerializer.getEntry(weekday))
        return joiner.toString()
    }

    class Builder {

        private lateinit var color: String
        private var contributionCount: Int = 0
        private lateinit var date: String
        private var weekday: Int = 0

        fun setColor(color: String): Builder {
            this.color = color
            return this
        }

        fun setContributionCount(contributionCount: Int): Builder {
            this.contributionCount = contributionCount
            return this
        }

        fun setDate(date: String): Builder {
            this.date = date
            return this
        }

        fun setWeekday(weekday: Int): Builder {
            this.weekday = weekday
            return this
        }

        fun build(): ContributionCalendarDayTO {
            return ContributionCalendarDayTO(color, contributionCount, date, weekday)
        }
    }
}
