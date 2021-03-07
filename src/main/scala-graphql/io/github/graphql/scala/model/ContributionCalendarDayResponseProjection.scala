package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for ContributionCalendarDay
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class ContributionCalendarDayResponseProjection extends GraphQLResponseProjection {

    override def all$(): ContributionCalendarDayResponseProjection = all$(3)

    override def all$(maxDepth: Int): ContributionCalendarDayResponseProjection = {
        this.color()
        this.contributionCount()
        this.date()
        this.weekday()
        this.typename()
        this
    }

    def color(): ContributionCalendarDayResponseProjection = {
        color(null.asInstanceOf[String])
    }

    def color(alias: String): ContributionCalendarDayResponseProjection = {
        fields.add(new GraphQLResponseField("color").alias(alias))
        this
    }

    def contributionCount(): ContributionCalendarDayResponseProjection = {
        contributionCount(null.asInstanceOf[String])
    }

    def contributionCount(alias: String): ContributionCalendarDayResponseProjection = {
        fields.add(new GraphQLResponseField("contributionCount").alias(alias))
        this
    }

    def date(): ContributionCalendarDayResponseProjection = {
        date(null.asInstanceOf[String])
    }

    def date(alias: String): ContributionCalendarDayResponseProjection = {
        fields.add(new GraphQLResponseField("date").alias(alias))
        this
    }

    def weekday(): ContributionCalendarDayResponseProjection = {
        weekday(null.asInstanceOf[String])
    }

    def weekday(alias: String): ContributionCalendarDayResponseProjection = {
        fields.add(new GraphQLResponseField("weekday").alias(alias))
        this
    }

    def typename(): ContributionCalendarDayResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ContributionCalendarDayResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[ContributionCalendarDayResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
