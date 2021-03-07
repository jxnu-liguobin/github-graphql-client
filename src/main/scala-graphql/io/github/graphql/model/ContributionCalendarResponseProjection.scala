package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ContributionCalendar
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class ContributionCalendarResponseProjection extends GraphQLResponseProjection {

    override def all$(): ContributionCalendarResponseProjection = all$(3)

    override def all$(maxDepth: Int): ContributionCalendarResponseProjection = {
        this.colors()
        this.isHalloween()
        if (projectionDepthOnFields.getOrDefault("ContributionCalendarResponseProjection.ContributionCalendarMonthResponseProjection.months", 0) <= maxDepth) {
            projectionDepthOnFields.put("ContributionCalendarResponseProjection.ContributionCalendarMonthResponseProjection.months", projectionDepthOnFields.getOrDefault("ContributionCalendarResponseProjection.ContributionCalendarMonthResponseProjection.months", 0) + 1)
            this.months(new ContributionCalendarMonthResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ContributionCalendarResponseProjection.ContributionCalendarMonthResponseProjection.months", 0)))
        }
        this.totalContributions()
        if (projectionDepthOnFields.getOrDefault("ContributionCalendarResponseProjection.ContributionCalendarWeekResponseProjection.weeks", 0) <= maxDepth) {
            projectionDepthOnFields.put("ContributionCalendarResponseProjection.ContributionCalendarWeekResponseProjection.weeks", projectionDepthOnFields.getOrDefault("ContributionCalendarResponseProjection.ContributionCalendarWeekResponseProjection.weeks", 0) + 1)
            this.weeks(new ContributionCalendarWeekResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ContributionCalendarResponseProjection.ContributionCalendarWeekResponseProjection.weeks", 0)))
        }
        this.typename()
        this
    }

    def colors(): ContributionCalendarResponseProjection = {
        colors(null.asInstanceOf[String])
    }

    def colors(alias: String): ContributionCalendarResponseProjection = {
        fields.add(new GraphQLResponseField("colors").alias(alias))
        this
    }

    def isHalloween(): ContributionCalendarResponseProjection = {
        isHalloween(null.asInstanceOf[String])
    }

    def isHalloween(alias: String): ContributionCalendarResponseProjection = {
        fields.add(new GraphQLResponseField("isHalloween").alias(alias))
        this
    }

    def months(subProjection: ContributionCalendarMonthResponseProjection): ContributionCalendarResponseProjection = {
        months(null.asInstanceOf[String], subProjection)
    }

    def months(alias: String, subProjection: ContributionCalendarMonthResponseProjection): ContributionCalendarResponseProjection = {
        fields.add(new GraphQLResponseField("months").alias(alias).projection(subProjection))
        this
    }

    def totalContributions(): ContributionCalendarResponseProjection = {
        totalContributions(null.asInstanceOf[String])
    }

    def totalContributions(alias: String): ContributionCalendarResponseProjection = {
        fields.add(new GraphQLResponseField("totalContributions").alias(alias))
        this
    }

    def weeks(subProjection: ContributionCalendarWeekResponseProjection): ContributionCalendarResponseProjection = {
        weeks(null.asInstanceOf[String], subProjection)
    }

    def weeks(alias: String, subProjection: ContributionCalendarWeekResponseProjection): ContributionCalendarResponseProjection = {
        fields.add(new GraphQLResponseField("weeks").alias(alias).projection(subProjection))
        this
    }

    def typename(): ContributionCalendarResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ContributionCalendarResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
