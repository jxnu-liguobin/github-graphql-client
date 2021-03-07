package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for ContributionCalendarWeek
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class ContributionCalendarWeekResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ContributionCalendarWeekResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ContributionCalendarWeekResponseProjection {
        if (projectionDepthOnFields.getOrDefault("ContributionCalendarWeekResponseProjection.ContributionCalendarDayResponseProjection.contributionDays", 0) <= maxDepth) {
            projectionDepthOnFields["ContributionCalendarWeekResponseProjection.ContributionCalendarDayResponseProjection.contributionDays"] = projectionDepthOnFields.getOrDefault("ContributionCalendarWeekResponseProjection.ContributionCalendarDayResponseProjection.contributionDays", 0) + 1
            this.contributionDays(ContributionCalendarDayResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ContributionCalendarWeekResponseProjection.ContributionCalendarDayResponseProjection.contributionDays", 0)))
        }
        this.firstDay()
        this.typename()
        return this
    }

    fun contributionDays(subProjection: ContributionCalendarDayResponseProjection): ContributionCalendarWeekResponseProjection = contributionDays(null, subProjection)

    fun contributionDays(alias: String?, subProjection: ContributionCalendarDayResponseProjection): ContributionCalendarWeekResponseProjection {
        fields.add(GraphQLResponseField("contributionDays").alias(alias).projection(subProjection))
        return this
    }

    fun firstDay(): ContributionCalendarWeekResponseProjection = firstDay(null)

    fun firstDay(alias: String?): ContributionCalendarWeekResponseProjection {
        fields.add(GraphQLResponseField("firstDay").alias(alias))
        return this
    }

    fun typename(): ContributionCalendarWeekResponseProjection = typename(null)

    fun typename(alias: String?): ContributionCalendarWeekResponseProjection {
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
        val that = other as ContributionCalendarWeekResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
