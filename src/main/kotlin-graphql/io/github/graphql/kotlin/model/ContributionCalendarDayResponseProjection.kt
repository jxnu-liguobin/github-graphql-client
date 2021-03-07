package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for ContributionCalendarDay
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class ContributionCalendarDayResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ContributionCalendarDayResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ContributionCalendarDayResponseProjection {
        this.color()
        this.contributionCount()
        this.date()
        this.weekday()
        this.typename()
        return this
    }

    fun color(): ContributionCalendarDayResponseProjection = color(null)

    fun color(alias: String?): ContributionCalendarDayResponseProjection {
        fields.add(GraphQLResponseField("color").alias(alias))
        return this
    }

    fun contributionCount(): ContributionCalendarDayResponseProjection = contributionCount(null)

    fun contributionCount(alias: String?): ContributionCalendarDayResponseProjection {
        fields.add(GraphQLResponseField("contributionCount").alias(alias))
        return this
    }

    fun date(): ContributionCalendarDayResponseProjection = date(null)

    fun date(alias: String?): ContributionCalendarDayResponseProjection {
        fields.add(GraphQLResponseField("date").alias(alias))
        return this
    }

    fun weekday(): ContributionCalendarDayResponseProjection = weekday(null)

    fun weekday(alias: String?): ContributionCalendarDayResponseProjection {
        fields.add(GraphQLResponseField("weekday").alias(alias))
        return this
    }

    fun typename(): ContributionCalendarDayResponseProjection = typename(null)

    fun typename(alias: String?): ContributionCalendarDayResponseProjection {
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
        val that = other as ContributionCalendarDayResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
