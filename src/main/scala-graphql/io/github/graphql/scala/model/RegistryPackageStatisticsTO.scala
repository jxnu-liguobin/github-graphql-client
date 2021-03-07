package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class RegistryPackageStatisticsTO(
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

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[RegistryPackageStatisticsTO]
        Objects.equals(downloadsThisMonth, that.downloadsThisMonth) &&
        Objects.equals(downloadsThisWeek, that.downloadsThisWeek) &&
        Objects.equals(downloadsThisYear, that.downloadsThisYear) &&
        Objects.equals(downloadsToday, that.downloadsToday) &&
        Objects.equals(downloadsTotalCount, that.downloadsTotalCount)
    }

    override def hashCode(): Int = {
        Objects.hash(downloadsThisMonth, downloadsThisWeek, downloadsThisYear, downloadsToday, downloadsTotalCount)
    }
}

object RegistryPackageStatisticsTO {

    def builder(): RegistryPackageStatisticsTO.Builder = new Builder()

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

        def build(): RegistryPackageStatisticsTO = new RegistryPackageStatisticsTO(downloadsThisMonth, downloadsThisWeek, downloadsThisYear, downloadsToday, downloadsTotalCount)

    }
}
