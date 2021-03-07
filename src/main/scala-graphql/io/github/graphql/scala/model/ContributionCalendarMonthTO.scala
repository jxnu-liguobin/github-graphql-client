package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class ContributionCalendarMonthTO(
    @javax.validation.constraints.NotNull
    firstDay: String,
    @javax.validation.constraints.NotNull
    name: String,
    totalWeeks: Int,
    year: Int
) {

    override def toString(): String = {
        Seq(
            if (firstDay != null) "firstDay: " + GraphQLRequestSerializer.getEntry(firstDay) else "",
            if (name != null) "name: " + GraphQLRequestSerializer.getEntry(name) else "",
            "totalWeeks: " + GraphQLRequestSerializer.getEntry(totalWeeks),
            "year: " + GraphQLRequestSerializer.getEntry(year)
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[ContributionCalendarMonthTO]
        Objects.equals(firstDay, that.firstDay) &&
        Objects.equals(name, that.name) &&
        Objects.equals(totalWeeks, that.totalWeeks) &&
        Objects.equals(year, that.year)
    }

    override def hashCode(): Int = {
        Objects.hash(firstDay, name, totalWeeks, year)
    }
}

object ContributionCalendarMonthTO {

    def builder(): ContributionCalendarMonthTO.Builder = new Builder()

    class Builder {

        private var firstDay: String = _
        private var name: String = _
        private var totalWeeks: Int = _
        private var year: Int = _

        def setFirstDay(firstDay: String): Builder = {
            this.firstDay = firstDay
            this
        }

        def setName(name: String): Builder = {
            this.name = name
            this
        }

        def setTotalWeeks(totalWeeks: Int): Builder = {
            this.totalWeeks = totalWeeks
            this
        }

        def setYear(year: Int): Builder = {
            this.year = year
            this
        }

        def build(): ContributionCalendarMonthTO = new ContributionCalendarMonthTO(firstDay, name, totalWeeks, year)

    }
}
