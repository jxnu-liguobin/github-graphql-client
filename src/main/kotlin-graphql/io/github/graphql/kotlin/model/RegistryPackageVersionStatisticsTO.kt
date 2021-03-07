package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class RegistryPackageVersionStatisticsTO(
    val downloadsThisMonth: Int,
    val downloadsThisWeek: Int,
    val downloadsThisYear: Int,
    val downloadsToday: Int,
    val downloadsTotalCount: Int
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("downloadsThisMonth: " + GraphQLRequestSerializer.getEntry(downloadsThisMonth))
        joiner.add("downloadsThisWeek: " + GraphQLRequestSerializer.getEntry(downloadsThisWeek))
        joiner.add("downloadsThisYear: " + GraphQLRequestSerializer.getEntry(downloadsThisYear))
        joiner.add("downloadsToday: " + GraphQLRequestSerializer.getEntry(downloadsToday))
        joiner.add("downloadsTotalCount: " + GraphQLRequestSerializer.getEntry(downloadsTotalCount))
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as RegistryPackageVersionStatisticsTO
        return Objects.equals(downloadsThisMonth, that.downloadsThisMonth)
                && Objects.equals(downloadsThisWeek, that.downloadsThisWeek)
                && Objects.equals(downloadsThisYear, that.downloadsThisYear)
                && Objects.equals(downloadsToday, that.downloadsToday)
                && Objects.equals(downloadsTotalCount, that.downloadsTotalCount)

    }

    override fun hashCode(): Int = {
        return Objects.hash(downloadsThisMonth, downloadsThisWeek, downloadsThisYear, downloadsToday, downloadsTotalCount)
    }

    class Builder {

        private var downloadsThisMonth: Int = 0
        private var downloadsThisWeek: Int = 0
        private var downloadsThisYear: Int = 0
        private var downloadsToday: Int = 0
        private var downloadsTotalCount: Int = 0

        fun setDownloadsThisMonth(downloadsThisMonth: Int): Builder {
            this.downloadsThisMonth = downloadsThisMonth
            return this
        }

        fun setDownloadsThisWeek(downloadsThisWeek: Int): Builder {
            this.downloadsThisWeek = downloadsThisWeek
            return this
        }

        fun setDownloadsThisYear(downloadsThisYear: Int): Builder {
            this.downloadsThisYear = downloadsThisYear
            return this
        }

        fun setDownloadsToday(downloadsToday: Int): Builder {
            this.downloadsToday = downloadsToday
            return this
        }

        fun setDownloadsTotalCount(downloadsTotalCount: Int): Builder {
            this.downloadsTotalCount = downloadsTotalCount
            return this
        }

        fun build(): RegistryPackageVersionStatisticsTO {
            return RegistryPackageVersionStatisticsTO(downloadsThisMonth, downloadsThisWeek, downloadsThisYear, downloadsToday, downloadsTotalCount)
        }
    }
}
