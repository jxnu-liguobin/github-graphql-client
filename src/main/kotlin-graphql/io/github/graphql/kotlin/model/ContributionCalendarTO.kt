package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class ContributionCalendarTO(
    val colors: List<String>,
    val isHalloween: Boolean,
    val months: List<ContributionCalendarMonthTO>,
    val totalContributions: Int,
    val weeks: List<ContributionCalendarWeekTO>
) {

    companion object {
        fun builder(): Builder = Builder()
    }

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as ContributionCalendarTO
        return Objects.equals(colors, that.colors)
                && Objects.equals(isHalloween, that.isHalloween)
                && Objects.equals(months, that.months)
                && Objects.equals(totalContributions, that.totalContributions)
                && Objects.equals(weeks, that.weeks)

    }

    override fun hashCode(): Int = {
        return Objects.hash(colors, isHalloween, months, totalContributions, weeks)
    }

    class Builder {

        private lateinit var colors: List<String>
        private var isHalloween: Boolean = false
        private lateinit var months: List<ContributionCalendarMonthTO>
        private var totalContributions: Int = 0
        private lateinit var weeks: List<ContributionCalendarWeekTO>

        fun setColors(colors: List<String>): Builder {
            this.colors = colors
            return this
        }

        fun setIsHalloween(isHalloween: Boolean): Builder {
            this.isHalloween = isHalloween
            return this
        }

        fun setMonths(months: List<ContributionCalendarMonthTO>): Builder {
            this.months = months
            return this
        }

        fun setTotalContributions(totalContributions: Int): Builder {
            this.totalContributions = totalContributions
            return this
        }

        fun setWeeks(weeks: List<ContributionCalendarWeekTO>): Builder {
            this.weeks = weeks
            return this
        }

        fun build(): ContributionCalendarTO {
            return ContributionCalendarTO(colors, isHalloween, months, totalContributions, weeks)
        }
    }
}
