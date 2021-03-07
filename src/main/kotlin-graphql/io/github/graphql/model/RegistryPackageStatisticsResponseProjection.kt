package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RegistryPackageStatistics
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
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


}
