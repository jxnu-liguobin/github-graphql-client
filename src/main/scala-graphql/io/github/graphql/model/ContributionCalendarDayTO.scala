package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class ContributionCalendarDayTO(
    @javax.validation.constraints.NotNull
    color: String,
    contributionCount: Int,
    @javax.validation.constraints.NotNull
    date: String,
    weekday: Int
) {

    override def toString(): String = {
        Seq(
            if (color != null) "color: " + GraphQLRequestSerializer.getEntry(color) else "",
            "contributionCount: " + GraphQLRequestSerializer.getEntry(contributionCount),
            if (date != null) "date: " + GraphQLRequestSerializer.getEntry(date) else "",
            "weekday: " + GraphQLRequestSerializer.getEntry(weekday)
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object ContributionCalendarDayTO {

    def builder(): ContributionCalendarDayTO.Builder = new Builder()

    class Builder {

        private var color: String = _
        private var contributionCount: Int = _
        private var date: String = _
        private var weekday: Int = _

        def setColor(color: String): Builder = {
            this.color = color
            this
        }

        def setContributionCount(contributionCount: Int): Builder = {
            this.contributionCount = contributionCount
            this
        }

        def setDate(date: String): Builder = {
            this.date = date
            this
        }

        def setWeekday(weekday: Int): Builder = {
            this.weekday = weekday
            this
        }

        def build(): ContributionCalendarDayTO = new ContributionCalendarDayTO(color, contributionCount, date, weekday)

    }
}
