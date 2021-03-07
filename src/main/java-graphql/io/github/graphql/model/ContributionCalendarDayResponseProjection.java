package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ContributionCalendarDay
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class ContributionCalendarDayResponseProjection extends GraphQLResponseProjection {

    public ContributionCalendarDayResponseProjection() {
    }

    @Override
    public ContributionCalendarDayResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ContributionCalendarDayResponseProjection all$(int maxDepth) {
        this.color();
        this.contributionCount();
        this.date();
        this.weekday();
        this.typename();
        return this;
    }

    public ContributionCalendarDayResponseProjection color() {
        return color(null);
    }

    public ContributionCalendarDayResponseProjection color(String alias) {
        fields.add(new GraphQLResponseField("color").alias(alias));
        return this;
    }

    public ContributionCalendarDayResponseProjection contributionCount() {
        return contributionCount(null);
    }

    public ContributionCalendarDayResponseProjection contributionCount(String alias) {
        fields.add(new GraphQLResponseField("contributionCount").alias(alias));
        return this;
    }

    public ContributionCalendarDayResponseProjection date() {
        return date(null);
    }

    public ContributionCalendarDayResponseProjection date(String alias) {
        fields.add(new GraphQLResponseField("date").alias(alias));
        return this;
    }

    public ContributionCalendarDayResponseProjection weekday() {
        return weekday(null);
    }

    public ContributionCalendarDayResponseProjection weekday(String alias) {
        fields.add(new GraphQLResponseField("weekday").alias(alias));
        return this;
    }

    public ContributionCalendarDayResponseProjection typename() {
        return typename(null);
    }

    public ContributionCalendarDayResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
