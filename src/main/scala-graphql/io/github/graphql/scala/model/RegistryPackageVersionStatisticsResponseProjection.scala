package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for RegistryPackageVersionStatistics
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class RegistryPackageVersionStatisticsResponseProjection extends GraphQLResponseProjection {

    override def all$(): RegistryPackageVersionStatisticsResponseProjection = all$(3)

    override def all$(maxDepth: Int): RegistryPackageVersionStatisticsResponseProjection = {
        this.downloadsThisMonth()
        this.downloadsThisWeek()
        this.downloadsThisYear()
        this.downloadsToday()
        this.downloadsTotalCount()
        this.typename()
        this
    }

    def downloadsThisMonth(): RegistryPackageVersionStatisticsResponseProjection = {
        downloadsThisMonth(null.asInstanceOf[String])
    }

    def downloadsThisMonth(alias: String): RegistryPackageVersionStatisticsResponseProjection = {
        fields.add(new GraphQLResponseField("downloadsThisMonth").alias(alias))
        this
    }

    def downloadsThisWeek(): RegistryPackageVersionStatisticsResponseProjection = {
        downloadsThisWeek(null.asInstanceOf[String])
    }

    def downloadsThisWeek(alias: String): RegistryPackageVersionStatisticsResponseProjection = {
        fields.add(new GraphQLResponseField("downloadsThisWeek").alias(alias))
        this
    }

    def downloadsThisYear(): RegistryPackageVersionStatisticsResponseProjection = {
        downloadsThisYear(null.asInstanceOf[String])
    }

    def downloadsThisYear(alias: String): RegistryPackageVersionStatisticsResponseProjection = {
        fields.add(new GraphQLResponseField("downloadsThisYear").alias(alias))
        this
    }

    def downloadsToday(): RegistryPackageVersionStatisticsResponseProjection = {
        downloadsToday(null.asInstanceOf[String])
    }

    def downloadsToday(alias: String): RegistryPackageVersionStatisticsResponseProjection = {
        fields.add(new GraphQLResponseField("downloadsToday").alias(alias))
        this
    }

    def downloadsTotalCount(): RegistryPackageVersionStatisticsResponseProjection = {
        downloadsTotalCount(null.asInstanceOf[String])
    }

    def downloadsTotalCount(alias: String): RegistryPackageVersionStatisticsResponseProjection = {
        fields.add(new GraphQLResponseField("downloadsTotalCount").alias(alias))
        this
    }

    def typename(): RegistryPackageVersionStatisticsResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): RegistryPackageVersionStatisticsResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[RegistryPackageVersionStatisticsResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
