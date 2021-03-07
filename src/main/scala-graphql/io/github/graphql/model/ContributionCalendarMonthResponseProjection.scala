package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ContributionCalendarMonth
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class ContributionCalendarMonthResponseProjection extends GraphQLResponseProjection {

    override def all$(): ContributionCalendarMonthResponseProjection = all$(3)

    override def all$(maxDepth: Int): ContributionCalendarMonthResponseProjection = {
        this.firstDay()
        this.name()
        this.totalWeeks()
        this.year()
        this.typename()
        this
    }

    def firstDay(): ContributionCalendarMonthResponseProjection = {
        firstDay(null.asInstanceOf[String])
    }

    def firstDay(alias: String): ContributionCalendarMonthResponseProjection = {
        fields.add(new GraphQLResponseField("firstDay").alias(alias))
        this
    }

    def name(): ContributionCalendarMonthResponseProjection = {
        name(null.asInstanceOf[String])
    }

    def name(alias: String): ContributionCalendarMonthResponseProjection = {
        fields.add(new GraphQLResponseField("name").alias(alias))
        this
    }

    def totalWeeks(): ContributionCalendarMonthResponseProjection = {
        totalWeeks(null.asInstanceOf[String])
    }

    def totalWeeks(alias: String): ContributionCalendarMonthResponseProjection = {
        fields.add(new GraphQLResponseField("totalWeeks").alias(alias))
        this
    }

    def year(): ContributionCalendarMonthResponseProjection = {
        year(null.asInstanceOf[String])
    }

    def year(alias: String): ContributionCalendarMonthResponseProjection = {
        fields.add(new GraphQLResponseField("year").alias(alias))
        this
    }

    def typename(): ContributionCalendarMonthResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ContributionCalendarMonthResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
