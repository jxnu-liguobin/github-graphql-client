package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class ContributionCalendarMonthTO(
    val firstDay: String,
    val name: String,
    val totalWeeks: Int,
    val year: Int
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("firstDay: " + GraphQLRequestSerializer.getEntry(firstDay))
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        joiner.add("totalWeeks: " + GraphQLRequestSerializer.getEntry(totalWeeks))
        joiner.add("year: " + GraphQLRequestSerializer.getEntry(year))
        return joiner.toString()
    }

    class Builder {

        private lateinit var firstDay: String
        private lateinit var name: String
        private var totalWeeks: Int = 0
        private var year: Int = 0

        fun setFirstDay(firstDay: String): Builder {
            this.firstDay = firstDay
            return this
        }

        fun setName(name: String): Builder {
            this.name = name
            return this
        }

        fun setTotalWeeks(totalWeeks: Int): Builder {
            this.totalWeeks = totalWeeks
            return this
        }

        fun setYear(year: Int): Builder {
            this.year = year
            return this
        }

        fun build(): ContributionCalendarMonthTO {
            return ContributionCalendarMonthTO(firstDay, name, totalWeeks, year)
        }
    }
}
