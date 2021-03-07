package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class RegistryPackageVersionStatisticsTO implements java.io.Serializable {

    private int downloadsThisMonth;
    private int downloadsThisWeek;
    private int downloadsThisYear;
    private int downloadsToday;
    private int downloadsTotalCount;

    public RegistryPackageVersionStatisticsTO() {
    }

    public RegistryPackageVersionStatisticsTO(int downloadsThisMonth, int downloadsThisWeek, int downloadsThisYear, int downloadsToday, int downloadsTotalCount) {
        this.downloadsThisMonth = downloadsThisMonth;
        this.downloadsThisWeek = downloadsThisWeek;
        this.downloadsThisYear = downloadsThisYear;
        this.downloadsToday = downloadsToday;
        this.downloadsTotalCount = downloadsTotalCount;
    }

    public int getDownloadsThisMonth() {
        return downloadsThisMonth;
    }

    public int getDownloadsThisWeek() {
        return downloadsThisWeek;
    }

    public int getDownloadsThisYear() {
        return downloadsThisYear;
    }

    public int getDownloadsToday() {
        return downloadsToday;
    }

    public int getDownloadsTotalCount() {
        return downloadsTotalCount;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final RegistryPackageVersionStatisticsTO that = (RegistryPackageVersionStatisticsTO) obj;
        return Objects.equals(downloadsThisMonth, that.downloadsThisMonth)
            && Objects.equals(downloadsThisWeek, that.downloadsThisWeek)
            && Objects.equals(downloadsThisYear, that.downloadsThisYear)
            && Objects.equals(downloadsToday, that.downloadsToday)
            && Objects.equals(downloadsTotalCount, that.downloadsTotalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(downloadsThisMonth, downloadsThisWeek, downloadsThisYear, downloadsToday, downloadsTotalCount);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("downloadsThisMonth: " + GraphQLRequestSerializer.getEntry(downloadsThisMonth));
        joiner.add("downloadsThisWeek: " + GraphQLRequestSerializer.getEntry(downloadsThisWeek));
        joiner.add("downloadsThisYear: " + GraphQLRequestSerializer.getEntry(downloadsThisYear));
        joiner.add("downloadsToday: " + GraphQLRequestSerializer.getEntry(downloadsToday));
        joiner.add("downloadsTotalCount: " + GraphQLRequestSerializer.getEntry(downloadsTotalCount));
        return joiner.toString();
    }

    public static RegistryPackageVersionStatisticsTO.Builder builder() {
        return new RegistryPackageVersionStatisticsTO.Builder();
    }

    public static class Builder {

        private int downloadsThisMonth;
        private int downloadsThisWeek;
        private int downloadsThisYear;
        private int downloadsToday;
        private int downloadsTotalCount;

        public Builder() {
        }

        public Builder setDownloadsThisMonth(int downloadsThisMonth) {
            this.downloadsThisMonth = downloadsThisMonth;
            return this;
        }

        public Builder setDownloadsThisWeek(int downloadsThisWeek) {
            this.downloadsThisWeek = downloadsThisWeek;
            return this;
        }

        public Builder setDownloadsThisYear(int downloadsThisYear) {
            this.downloadsThisYear = downloadsThisYear;
            return this;
        }

        public Builder setDownloadsToday(int downloadsToday) {
            this.downloadsToday = downloadsToday;
            return this;
        }

        public Builder setDownloadsTotalCount(int downloadsTotalCount) {
            this.downloadsTotalCount = downloadsTotalCount;
            return this;
        }


        public RegistryPackageVersionStatisticsTO build() {
            return new RegistryPackageVersionStatisticsTO(downloadsThisMonth, downloadsThisWeek, downloadsThisYear, downloadsToday, downloadsTotalCount);
        }

    }
}
