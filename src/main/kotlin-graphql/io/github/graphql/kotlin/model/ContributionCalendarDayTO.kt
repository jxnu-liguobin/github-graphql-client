package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as ContributionCalendarDayTO
        return Objects.equals(color, that.color)
                && Objects.equals(contributionCount, that.contributionCount)
                && Objects.equals(date, that.date)
                && Objects.equals(weekday, that.weekday)

    }

    override fun hashCode(): Int = {
        return Objects.hash(color, contributionCount, date, weekday)
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
