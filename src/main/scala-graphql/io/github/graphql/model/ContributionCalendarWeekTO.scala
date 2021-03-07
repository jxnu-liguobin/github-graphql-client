package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class ContributionCalendarWeekTO(
    @javax.validation.constraints.NotNull
    contributionDays: Seq[ContributionCalendarDayTO],
    @javax.validation.constraints.NotNull
    firstDay: String
) {

    override def toString(): String = {
        Seq(
            if (contributionDays != null) "contributionDays: " + GraphQLRequestSerializer.getEntry(contributionDays.asJava) else "",
            if (firstDay != null) "firstDay: " + GraphQLRequestSerializer.getEntry(firstDay) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object ContributionCalendarWeekTO {

    def builder(): ContributionCalendarWeekTO.Builder = new Builder()

    class Builder {

        private var contributionDays: Seq[ContributionCalendarDayTO] = _
        private var firstDay: String = _

        def setContributionDays(contributionDays: Seq[ContributionCalendarDayTO]): Builder = {
            this.contributionDays = contributionDays
            this
        }

        def setFirstDay(firstDay: String): Builder = {
            this.firstDay = firstDay
            this
        }

        def build(): ContributionCalendarWeekTO = new ContributionCalendarWeekTO(contributionDays, firstDay)

    }
}
