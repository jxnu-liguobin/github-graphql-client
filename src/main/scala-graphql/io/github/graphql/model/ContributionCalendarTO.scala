package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class ContributionCalendarTO(
    @javax.validation.constraints.NotNull
    colors: Seq[String],
    isHalloween: Boolean,
    @javax.validation.constraints.NotNull
    months: Seq[ContributionCalendarMonthTO],
    totalContributions: Int,
    @javax.validation.constraints.NotNull
    weeks: Seq[ContributionCalendarWeekTO]
) {

    override def toString(): String = {
        Seq(
            if (colors != null) "colors: " + GraphQLRequestSerializer.getEntry(colors.asJava) else "",
            "isHalloween: " + GraphQLRequestSerializer.getEntry(isHalloween),
            if (months != null) "months: " + GraphQLRequestSerializer.getEntry(months.asJava) else "",
            "totalContributions: " + GraphQLRequestSerializer.getEntry(totalContributions),
            if (weeks != null) "weeks: " + GraphQLRequestSerializer.getEntry(weeks.asJava) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object ContributionCalendarTO {

    def builder(): ContributionCalendarTO.Builder = new Builder()

    class Builder {

        private var colors: Seq[String] = _
        private var isHalloween: Boolean = _
        private var months: Seq[ContributionCalendarMonthTO] = _
        private var totalContributions: Int = _
        private var weeks: Seq[ContributionCalendarWeekTO] = _

        def setColors(colors: Seq[String]): Builder = {
            this.colors = colors
            this
        }

        def setIsHalloween(isHalloween: Boolean): Builder = {
            this.isHalloween = isHalloween
            this
        }

        def setMonths(months: Seq[ContributionCalendarMonthTO]): Builder = {
            this.months = months
            this
        }

        def setTotalContributions(totalContributions: Int): Builder = {
            this.totalContributions = totalContributions
            this
        }

        def setWeeks(weeks: Seq[ContributionCalendarWeekTO]): Builder = {
            this.weeks = weeks
            this
        }

        def build(): ContributionCalendarTO = new ContributionCalendarTO(colors, isHalloween, months, totalContributions, weeks)

    }
}
