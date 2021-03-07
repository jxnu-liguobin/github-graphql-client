package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ContributionCalendarWeek
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class ContributionCalendarWeekResponseProjection extends GraphQLResponseProjection {

    override def all$(): ContributionCalendarWeekResponseProjection = all$(3)

    override def all$(maxDepth: Int): ContributionCalendarWeekResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("ContributionCalendarWeekResponseProjection.ContributionCalendarDayResponseProjection.contributionDays", 0) <= maxDepth) {
            projectionDepthOnFields.put("ContributionCalendarWeekResponseProjection.ContributionCalendarDayResponseProjection.contributionDays", projectionDepthOnFields.getOrDefault("ContributionCalendarWeekResponseProjection.ContributionCalendarDayResponseProjection.contributionDays", 0) + 1)
            this.contributionDays(new ContributionCalendarDayResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ContributionCalendarWeekResponseProjection.ContributionCalendarDayResponseProjection.contributionDays", 0)))
        }
        this.firstDay()
        this.typename()
        this
    }

    def contributionDays(subProjection: ContributionCalendarDayResponseProjection): ContributionCalendarWeekResponseProjection = {
        contributionDays(null.asInstanceOf[String], subProjection)
    }

    def contributionDays(alias: String, subProjection: ContributionCalendarDayResponseProjection): ContributionCalendarWeekResponseProjection = {
        fields.add(new GraphQLResponseField("contributionDays").alias(alias).projection(subProjection))
        this
    }

    def firstDay(): ContributionCalendarWeekResponseProjection = {
        firstDay(null.asInstanceOf[String])
    }

    def firstDay(alias: String): ContributionCalendarWeekResponseProjection = {
        fields.add(new GraphQLResponseField("firstDay").alias(alias))
        this
    }

    def typename(): ContributionCalendarWeekResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ContributionCalendarWeekResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
