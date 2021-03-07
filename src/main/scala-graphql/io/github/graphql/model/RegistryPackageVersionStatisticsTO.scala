package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class RegistryPackageVersionStatisticsTO(
    downloadsThisMonth: Int,
    downloadsThisWeek: Int,
    downloadsThisYear: Int,
    downloadsToday: Int,
    downloadsTotalCount: Int
) {

    override def toString(): String = {
        Seq(
            "downloadsThisMonth: " + GraphQLRequestSerializer.getEntry(downloadsThisMonth),
            "downloadsThisWeek: " + GraphQLRequestSerializer.getEntry(downloadsThisWeek),
            "downloadsThisYear: " + GraphQLRequestSerializer.getEntry(downloadsThisYear),
            "downloadsToday: " + GraphQLRequestSerializer.getEntry(downloadsToday),
            "downloadsTotalCount: " + GraphQLRequestSerializer.getEntry(downloadsTotalCount)
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object RegistryPackageVersionStatisticsTO {

    def builder(): RegistryPackageVersionStatisticsTO.Builder = new Builder()

    class Builder {

        private var downloadsThisMonth: Int = _
        private var downloadsThisWeek: Int = _
        private var downloadsThisYear: Int = _
        private var downloadsToday: Int = _
        private var downloadsTotalCount: Int = _

        def setDownloadsThisMonth(downloadsThisMonth: Int): Builder = {
            this.downloadsThisMonth = downloadsThisMonth
            this
        }

        def setDownloadsThisWeek(downloadsThisWeek: Int): Builder = {
            this.downloadsThisWeek = downloadsThisWeek
            this
        }

        def setDownloadsThisYear(downloadsThisYear: Int): Builder = {
            this.downloadsThisYear = downloadsThisYear
            this
        }

        def setDownloadsToday(downloadsToday: Int): Builder = {
            this.downloadsToday = downloadsToday
            this
        }

        def setDownloadsTotalCount(downloadsTotalCount: Int): Builder = {
            this.downloadsTotalCount = downloadsTotalCount
            this
        }

        def build(): RegistryPackageVersionStatisticsTO = new RegistryPackageVersionStatisticsTO(downloadsThisMonth, downloadsThisWeek, downloadsThisYear, downloadsToday, downloadsTotalCount)

    }
}
