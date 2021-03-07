package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RegistryPackageStatistics
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class RegistryPackageStatisticsResponseProjection extends GraphQLResponseProjection {

    override def all$(): RegistryPackageStatisticsResponseProjection = all$(3)

    override def all$(maxDepth: Int): RegistryPackageStatisticsResponseProjection = {
        this.downloadsThisMonth()
        this.downloadsThisWeek()
        this.downloadsThisYear()
        this.downloadsToday()
        this.downloadsTotalCount()
        this.typename()
        this
    }

    def downloadsThisMonth(): RegistryPackageStatisticsResponseProjection = {
        downloadsThisMonth(null.asInstanceOf[String])
    }

    def downloadsThisMonth(alias: String): RegistryPackageStatisticsResponseProjection = {
        fields.add(new GraphQLResponseField("downloadsThisMonth").alias(alias))
        this
    }

    def downloadsThisWeek(): RegistryPackageStatisticsResponseProjection = {
        downloadsThisWeek(null.asInstanceOf[String])
    }

    def downloadsThisWeek(alias: String): RegistryPackageStatisticsResponseProjection = {
        fields.add(new GraphQLResponseField("downloadsThisWeek").alias(alias))
        this
    }

    def downloadsThisYear(): RegistryPackageStatisticsResponseProjection = {
        downloadsThisYear(null.asInstanceOf[String])
    }

    def downloadsThisYear(alias: String): RegistryPackageStatisticsResponseProjection = {
        fields.add(new GraphQLResponseField("downloadsThisYear").alias(alias))
        this
    }

    def downloadsToday(): RegistryPackageStatisticsResponseProjection = {
        downloadsToday(null.asInstanceOf[String])
    }

    def downloadsToday(alias: String): RegistryPackageStatisticsResponseProjection = {
        fields.add(new GraphQLResponseField("downloadsToday").alias(alias))
        this
    }

    def downloadsTotalCount(): RegistryPackageStatisticsResponseProjection = {
        downloadsTotalCount(null.asInstanceOf[String])
    }

    def downloadsTotalCount(alias: String): RegistryPackageStatisticsResponseProjection = {
        fields.add(new GraphQLResponseField("downloadsTotalCount").alias(alias))
        this
    }

    def typename(): RegistryPackageStatisticsResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): RegistryPackageStatisticsResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
