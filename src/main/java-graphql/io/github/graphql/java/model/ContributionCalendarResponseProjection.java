package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for ContributionCalendar
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ContributionCalendarResponseProjection extends GraphQLResponseProjection {

    public ContributionCalendarResponseProjection() {
    }

    @Override
    public ContributionCalendarResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ContributionCalendarResponseProjection all$(int maxDepth) {
        this.colors();
        this.isHalloween();
        if (projectionDepthOnFields.getOrDefault("ContributionCalendarResponseProjection.ContributionCalendarMonthResponseProjection.months", 0) <= maxDepth) {
            projectionDepthOnFields.put("ContributionCalendarResponseProjection.ContributionCalendarMonthResponseProjection.months", projectionDepthOnFields.getOrDefault("ContributionCalendarResponseProjection.ContributionCalendarMonthResponseProjection.months", 0) + 1);
            this.months(new ContributionCalendarMonthResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ContributionCalendarResponseProjection.ContributionCalendarMonthResponseProjection.months", 0)));
        }
        this.totalContributions();
        if (projectionDepthOnFields.getOrDefault("ContributionCalendarResponseProjection.ContributionCalendarWeekResponseProjection.weeks", 0) <= maxDepth) {
            projectionDepthOnFields.put("ContributionCalendarResponseProjection.ContributionCalendarWeekResponseProjection.weeks", projectionDepthOnFields.getOrDefault("ContributionCalendarResponseProjection.ContributionCalendarWeekResponseProjection.weeks", 0) + 1);
            this.weeks(new ContributionCalendarWeekResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ContributionCalendarResponseProjection.ContributionCalendarWeekResponseProjection.weeks", 0)));
        }
        this.typename();
        return this;
    }

    public ContributionCalendarResponseProjection colors() {
        return colors(null);
    }

    public ContributionCalendarResponseProjection colors(String alias) {
        fields.add(new GraphQLResponseField("colors").alias(alias));
        return this;
    }

    public ContributionCalendarResponseProjection isHalloween() {
        return isHalloween(null);
    }

    public ContributionCalendarResponseProjection isHalloween(String alias) {
        fields.add(new GraphQLResponseField("isHalloween").alias(alias));
        return this;
    }

    public ContributionCalendarResponseProjection months(ContributionCalendarMonthResponseProjection subProjection) {
        return months(null, subProjection);
    }

    public ContributionCalendarResponseProjection months(String alias, ContributionCalendarMonthResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("months").alias(alias).projection(subProjection));
        return this;
    }

    public ContributionCalendarResponseProjection totalContributions() {
        return totalContributions(null);
    }

    public ContributionCalendarResponseProjection totalContributions(String alias) {
        fields.add(new GraphQLResponseField("totalContributions").alias(alias));
        return this;
    }

    public ContributionCalendarResponseProjection weeks(ContributionCalendarWeekResponseProjection subProjection) {
        return weeks(null, subProjection);
    }

    public ContributionCalendarResponseProjection weeks(String alias, ContributionCalendarWeekResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("weeks").alias(alias).projection(subProjection));
        return this;
    }

    public ContributionCalendarResponseProjection typename() {
        return typename(null);
    }

    public ContributionCalendarResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final ContributionCalendarResponseProjection that = (ContributionCalendarResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
