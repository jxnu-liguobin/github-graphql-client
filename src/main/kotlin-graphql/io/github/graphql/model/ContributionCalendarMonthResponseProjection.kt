package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ContributionCalendarMonth
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class ContributionCalendarMonthResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ContributionCalendarMonthResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ContributionCalendarMonthResponseProjection {
        this.firstDay()
        this.name()
        this.totalWeeks()
        this.year()
        this.typename()
        return this
    }

    fun firstDay(): ContributionCalendarMonthResponseProjection = firstDay(null)

    fun firstDay(alias: String?): ContributionCalendarMonthResponseProjection {
        fields.add(GraphQLResponseField("firstDay").alias(alias))
        return this
    }

    fun name(): ContributionCalendarMonthResponseProjection = name(null)

    fun name(alias: String?): ContributionCalendarMonthResponseProjection {
        fields.add(GraphQLResponseField("name").alias(alias))
        return this
    }

    fun totalWeeks(): ContributionCalendarMonthResponseProjection = totalWeeks(null)

    fun totalWeeks(alias: String?): ContributionCalendarMonthResponseProjection {
        fields.add(GraphQLResponseField("totalWeeks").alias(alias))
        return this
    }

    fun year(): ContributionCalendarMonthResponseProjection = year(null)

    fun year(alias: String?): ContributionCalendarMonthResponseProjection {
        fields.add(GraphQLResponseField("year").alias(alias))
        return this
    }

    fun typename(): ContributionCalendarMonthResponseProjection = typename(null)

    fun typename(alias: String?): ContributionCalendarMonthResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
