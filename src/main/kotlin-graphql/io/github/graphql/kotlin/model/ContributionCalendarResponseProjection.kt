package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for ContributionCalendar
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class ContributionCalendarResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ContributionCalendarResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ContributionCalendarResponseProjection {
        this.colors()
        this.isHalloween()
        if (projectionDepthOnFields.getOrDefault("ContributionCalendarResponseProjection.ContributionCalendarMonthResponseProjection.months", 0) <= maxDepth) {
            projectionDepthOnFields["ContributionCalendarResponseProjection.ContributionCalendarMonthResponseProjection.months"] = projectionDepthOnFields.getOrDefault("ContributionCalendarResponseProjection.ContributionCalendarMonthResponseProjection.months", 0) + 1
            this.months(ContributionCalendarMonthResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ContributionCalendarResponseProjection.ContributionCalendarMonthResponseProjection.months", 0)))
        }
        this.totalContributions()
        if (projectionDepthOnFields.getOrDefault("ContributionCalendarResponseProjection.ContributionCalendarWeekResponseProjection.weeks", 0) <= maxDepth) {
            projectionDepthOnFields["ContributionCalendarResponseProjection.ContributionCalendarWeekResponseProjection.weeks"] = projectionDepthOnFields.getOrDefault("ContributionCalendarResponseProjection.ContributionCalendarWeekResponseProjection.weeks", 0) + 1
            this.weeks(ContributionCalendarWeekResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ContributionCalendarResponseProjection.ContributionCalendarWeekResponseProjection.weeks", 0)))
        }
        this.typename()
        return this
    }

    fun colors(): ContributionCalendarResponseProjection = colors(null)

    fun colors(alias: String?): ContributionCalendarResponseProjection {
        fields.add(GraphQLResponseField("colors").alias(alias))
        return this
    }

    fun isHalloween(): ContributionCalendarResponseProjection = isHalloween(null)

    fun isHalloween(alias: String?): ContributionCalendarResponseProjection {
        fields.add(GraphQLResponseField("isHalloween").alias(alias))
        return this
    }

    fun months(subProjection: ContributionCalendarMonthResponseProjection): ContributionCalendarResponseProjection = months(null, subProjection)

    fun months(alias: String?, subProjection: ContributionCalendarMonthResponseProjection): ContributionCalendarResponseProjection {
        fields.add(GraphQLResponseField("months").alias(alias).projection(subProjection))
        return this
    }

    fun totalContributions(): ContributionCalendarResponseProjection = totalContributions(null)

    fun totalContributions(alias: String?): ContributionCalendarResponseProjection {
        fields.add(GraphQLResponseField("totalContributions").alias(alias))
        return this
    }

    fun weeks(subProjection: ContributionCalendarWeekResponseProjection): ContributionCalendarResponseProjection = weeks(null, subProjection)

    fun weeks(alias: String?, subProjection: ContributionCalendarWeekResponseProjection): ContributionCalendarResponseProjection {
        fields.add(GraphQLResponseField("weeks").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): ContributionCalendarResponseProjection = typename(null)

    fun typename(alias: String?): ContributionCalendarResponseProjection {
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
        val that = other as ContributionCalendarResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
