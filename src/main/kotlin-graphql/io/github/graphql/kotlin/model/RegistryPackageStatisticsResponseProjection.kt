package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for RegistryPackageStatistics
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class RegistryPackageStatisticsResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): RegistryPackageStatisticsResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): RegistryPackageStatisticsResponseProjection {
        this.downloadsThisMonth()
        this.downloadsThisWeek()
        this.downloadsThisYear()
        this.downloadsToday()
        this.downloadsTotalCount()
        this.typename()
        return this
    }

    fun downloadsThisMonth(): RegistryPackageStatisticsResponseProjection = downloadsThisMonth(null)

    fun downloadsThisMonth(alias: String?): RegistryPackageStatisticsResponseProjection {
        fields.add(GraphQLResponseField("downloadsThisMonth").alias(alias))
        return this
    }

    fun downloadsThisWeek(): RegistryPackageStatisticsResponseProjection = downloadsThisWeek(null)

    fun downloadsThisWeek(alias: String?): RegistryPackageStatisticsResponseProjection {
        fields.add(GraphQLResponseField("downloadsThisWeek").alias(alias))
        return this
    }

    fun downloadsThisYear(): RegistryPackageStatisticsResponseProjection = downloadsThisYear(null)

    fun downloadsThisYear(alias: String?): RegistryPackageStatisticsResponseProjection {
        fields.add(GraphQLResponseField("downloadsThisYear").alias(alias))
        return this
    }

    fun downloadsToday(): RegistryPackageStatisticsResponseProjection = downloadsToday(null)

    fun downloadsToday(alias: String?): RegistryPackageStatisticsResponseProjection {
        fields.add(GraphQLResponseField("downloadsToday").alias(alias))
        return this
    }

    fun downloadsTotalCount(): RegistryPackageStatisticsResponseProjection = downloadsTotalCount(null)

    fun downloadsTotalCount(alias: String?): RegistryPackageStatisticsResponseProjection {
        fields.add(GraphQLResponseField("downloadsTotalCount").alias(alias))
        return this
    }

    fun typename(): RegistryPackageStatisticsResponseProjection = typename(null)

    fun typename(alias: String?): RegistryPackageStatisticsResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as RegistryPackageStatisticsResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
