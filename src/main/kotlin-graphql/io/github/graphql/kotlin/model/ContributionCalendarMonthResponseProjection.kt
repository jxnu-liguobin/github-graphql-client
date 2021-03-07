package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for ContributionCalendarMonth
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as ContributionCalendarMonthResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
