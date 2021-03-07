package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ContributionCalendarDayTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String color;
    private int contributionCount;
    @javax.validation.constraints.NotNull
    private String date;
    private int weekday;

    public ContributionCalendarDayTO() {
    }

    public ContributionCalendarDayTO(String color, int contributionCount, String date, int weekday) {
        this.color = color;
        this.contributionCount = contributionCount;
        this.date = date;
        this.weekday = weekday;
    }

    public String getColor() {
        return color;
    }

    public int getContributionCount() {
        return contributionCount;
    }

    public String getDate() {
        return date;
    }

    public int getWeekday() {
        return weekday;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final ContributionCalendarDayTO that = (ContributionCalendarDayTO) obj;
        return Objects.equals(color, that.color)
            && Objects.equals(contributionCount, that.contributionCount)
            && Objects.equals(date, that.date)
            && Objects.equals(weekday, that.weekday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, contributionCount, date, weekday);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (color != null) {
            joiner.add("color: " + GraphQLRequestSerializer.getEntry(color));
        }
        joiner.add("contributionCount: " + GraphQLRequestSerializer.getEntry(contributionCount));
        if (date != null) {
            joiner.add("date: " + GraphQLRequestSerializer.getEntry(date));
        }
        joiner.add("weekday: " + GraphQLRequestSerializer.getEntry(weekday));
        return joiner.toString();
    }

    public static ContributionCalendarDayTO.Builder builder() {
        return new ContributionCalendarDayTO.Builder();
    }

    public static class Builder {

        private String color;
        private int contributionCount;
        private String date;
        private int weekday;

        public Builder() {
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setContributionCount(int contributionCount) {
            this.contributionCount = contributionCount;
            return this;
        }

        public Builder setDate(String date) {
            this.date = date;
            return this;
        }

        public Builder setWeekday(int weekday) {
            this.weekday = weekday;
            return this;
        }


        public ContributionCalendarDayTO build() {
            return new ContributionCalendarDayTO(color, contributionCount, date, weekday);
        }

    }
}
