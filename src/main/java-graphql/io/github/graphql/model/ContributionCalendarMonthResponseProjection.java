package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ContributionCalendarMonth
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class ContributionCalendarMonthResponseProjection extends GraphQLResponseProjection {

    public ContributionCalendarMonthResponseProjection() {
    }

    @Override
    public ContributionCalendarMonthResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ContributionCalendarMonthResponseProjection all$(int maxDepth) {
        this.firstDay();
        this.name();
        this.totalWeeks();
        this.year();
        this.typename();
        return this;
    }

    public ContributionCalendarMonthResponseProjection firstDay() {
        return firstDay(null);
    }

    public ContributionCalendarMonthResponseProjection firstDay(String alias) {
        fields.add(new GraphQLResponseField("firstDay").alias(alias));
        return this;
    }

    public ContributionCalendarMonthResponseProjection name() {
        return name(null);
    }

    public ContributionCalendarMonthResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ContributionCalendarMonthResponseProjection totalWeeks() {
        return totalWeeks(null);
    }

    public ContributionCalendarMonthResponseProjection totalWeeks(String alias) {
        fields.add(new GraphQLResponseField("totalWeeks").alias(alias));
        return this;
    }

    public ContributionCalendarMonthResponseProjection year() {
        return year(null);
    }

    public ContributionCalendarMonthResponseProjection year(String alias) {
        fields.add(new GraphQLResponseField("year").alias(alias));
        return this;
    }

    public ContributionCalendarMonthResponseProjection typename() {
        return typename(null);
    }

    public ContributionCalendarMonthResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
