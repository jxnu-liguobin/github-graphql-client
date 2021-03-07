package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ContributionCalendarTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private java.util.List<String> colors;
    private boolean isHalloween;
    @javax.validation.constraints.NotNull
    private java.util.List<ContributionCalendarMonthTO> months;
    private int totalContributions;
    @javax.validation.constraints.NotNull
    private java.util.List<ContributionCalendarWeekTO> weeks;

    public ContributionCalendarTO() {
    }

    public ContributionCalendarTO(java.util.List<String> colors, boolean isHalloween, java.util.List<ContributionCalendarMonthTO> months, int totalContributions, java.util.List<ContributionCalendarWeekTO> weeks) {
        this.colors = colors;
        this.isHalloween = isHalloween;
        this.months = months;
        this.totalContributions = totalContributions;
        this.weeks = weeks;
    }

    public java.util.List<String> getColors() {
        return colors;
    }

    public boolean getIsHalloween() {
        return isHalloween;
    }

    public java.util.List<ContributionCalendarMonthTO> getMonths() {
        return months;
    }

    public int getTotalContributions() {
        return totalContributions;
    }

    public java.util.List<ContributionCalendarWeekTO> getWeeks() {
        return weeks;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final ContributionCalendarTO that = (ContributionCalendarTO) obj;
        return Objects.equals(colors, that.colors)
            && Objects.equals(isHalloween, that.isHalloween)
            && Objects.equals(months, that.months)
            && Objects.equals(totalContributions, that.totalContributions)
            && Objects.equals(weeks, that.weeks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colors, isHalloween, months, totalContributions, weeks);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (colors != null) {
            joiner.add("colors: " + GraphQLRequestSerializer.getEntry(colors));
        }
        joiner.add("isHalloween: " + GraphQLRequestSerializer.getEntry(isHalloween));
        if (months != null) {
            joiner.add("months: " + GraphQLRequestSerializer.getEntry(months));
        }
        joiner.add("totalContributions: " + GraphQLRequestSerializer.getEntry(totalContributions));
        if (weeks != null) {
            joiner.add("weeks: " + GraphQLRequestSerializer.getEntry(weeks));
        }
        return joiner.toString();
    }

    public static ContributionCalendarTO.Builder builder() {
        return new ContributionCalendarTO.Builder();
    }

    public static class Builder {

        private java.util.List<String> colors;
        private boolean isHalloween;
        private java.util.List<ContributionCalendarMonthTO> months;
        private int totalContributions;
        private java.util.List<ContributionCalendarWeekTO> weeks;

        public Builder() {
        }

        public Builder setColors(java.util.List<String> colors) {
            this.colors = colors;
            return this;
        }

        public Builder setIsHalloween(boolean isHalloween) {
            this.isHalloween = isHalloween;
            return this;
        }

        public Builder setMonths(java.util.List<ContributionCalendarMonthTO> months) {
            this.months = months;
            return this;
        }

        public Builder setTotalContributions(int totalContributions) {
            this.totalContributions = totalContributions;
            return this;
        }

        public Builder setWeeks(java.util.List<ContributionCalendarWeekTO> weeks) {
            this.weeks = weeks;
            return this;
        }


        public ContributionCalendarTO build() {
            return new ContributionCalendarTO(colors, isHalloween, months, totalContributions, weeks);
        }

    }
}
