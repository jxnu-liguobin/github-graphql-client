package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
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

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[ContributionCalendarWeekTO]
        Objects.equals(contributionDays, that.contributionDays) &&
        Objects.equals(firstDay, that.firstDay)
    }

    override def hashCode(): Int = {
        Objects.hash(contributionDays, firstDay)
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
