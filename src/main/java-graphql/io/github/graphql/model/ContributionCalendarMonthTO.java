package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class ContributionCalendarMonthTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String firstDay;
    @javax.validation.constraints.NotNull
    private String name;
    private int totalWeeks;
    private int year;

    public ContributionCalendarMonthTO() {
    }

    public ContributionCalendarMonthTO(String firstDay, String name, int totalWeeks, int year) {
        this.firstDay = firstDay;
        this.name = name;
        this.totalWeeks = totalWeeks;
        this.year = year;
    }

    public String getFirstDay() {
        return firstDay;
    }

    public String getName() {
        return name;
    }

    public int getTotalWeeks() {
        return totalWeeks;
    }

    public int getYear() {
        return year;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (firstDay != null) {
            joiner.add("firstDay: " + GraphQLRequestSerializer.getEntry(firstDay));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        joiner.add("totalWeeks: " + GraphQLRequestSerializer.getEntry(totalWeeks));
        joiner.add("year: " + GraphQLRequestSerializer.getEntry(year));
        return joiner.toString();
    }

    public static ContributionCalendarMonthTO.Builder builder() {
        return new ContributionCalendarMonthTO.Builder();
    }

    public static class Builder {

        private String firstDay;
        private String name;
        private int totalWeeks;
        private int year;

        public Builder() {
        }

        public Builder setFirstDay(String firstDay) {
            this.firstDay = firstDay;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setTotalWeeks(int totalWeeks) {
            this.totalWeeks = totalWeeks;
            return this;
        }

        public Builder setYear(int year) {
            this.year = year;
            return this;
        }


        public ContributionCalendarMonthTO build() {
            return new ContributionCalendarMonthTO(firstDay, name, totalWeeks, year);
        }

    }
}
