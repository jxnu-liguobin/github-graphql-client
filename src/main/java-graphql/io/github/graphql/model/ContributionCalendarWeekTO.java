package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class ContributionCalendarWeekTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private java.util.List<ContributionCalendarDayTO> contributionDays;
    @javax.validation.constraints.NotNull
    private String firstDay;

    public ContributionCalendarWeekTO() {
    }

    public ContributionCalendarWeekTO(java.util.List<ContributionCalendarDayTO> contributionDays, String firstDay) {
        this.contributionDays = contributionDays;
        this.firstDay = firstDay;
    }

    public java.util.List<ContributionCalendarDayTO> getContributionDays() {
        return contributionDays;
    }

    public String getFirstDay() {
        return firstDay;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (contributionDays != null) {
            joiner.add("contributionDays: " + GraphQLRequestSerializer.getEntry(contributionDays));
        }
        if (firstDay != null) {
            joiner.add("firstDay: " + GraphQLRequestSerializer.getEntry(firstDay));
        }
        return joiner.toString();
    }

    public static ContributionCalendarWeekTO.Builder builder() {
        return new ContributionCalendarWeekTO.Builder();
    }

    public static class Builder {

        private java.util.List<ContributionCalendarDayTO> contributionDays;
        private String firstDay;

        public Builder() {
        }

        public Builder setContributionDays(java.util.List<ContributionCalendarDayTO> contributionDays) {
            this.contributionDays = contributionDays;
            return this;
        }

        public Builder setFirstDay(String firstDay) {
            this.firstDay = firstDay;
            return this;
        }


        public ContributionCalendarWeekTO build() {
            return new ContributionCalendarWeekTO(contributionDays, firstDay);
        }

    }
}
