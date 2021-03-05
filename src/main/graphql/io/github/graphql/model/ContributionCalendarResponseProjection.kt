package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ContributionCalendar
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
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


}
