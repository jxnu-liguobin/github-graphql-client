package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RegistryPackageVersionStatistics
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class RegistryPackageVersionStatisticsResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): RegistryPackageVersionStatisticsResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): RegistryPackageVersionStatisticsResponseProjection {
        this.downloadsThisMonth()
        this.downloadsThisWeek()
        this.downloadsThisYear()
        this.downloadsToday()
        this.downloadsTotalCount()
        this.typename()
        return this
    }

    fun downloadsThisMonth(): RegistryPackageVersionStatisticsResponseProjection = downloadsThisMonth(null)

    fun downloadsThisMonth(alias: String?): RegistryPackageVersionStatisticsResponseProjection {
        fields.add(GraphQLResponseField("downloadsThisMonth").alias(alias))
        return this
    }

    fun downloadsThisWeek(): RegistryPackageVersionStatisticsResponseProjection = downloadsThisWeek(null)

    fun downloadsThisWeek(alias: String?): RegistryPackageVersionStatisticsResponseProjection {
        fields.add(GraphQLResponseField("downloadsThisWeek").alias(alias))
        return this
    }

    fun downloadsThisYear(): RegistryPackageVersionStatisticsResponseProjection = downloadsThisYear(null)

    fun downloadsThisYear(alias: String?): RegistryPackageVersionStatisticsResponseProjection {
        fields.add(GraphQLResponseField("downloadsThisYear").alias(alias))
        return this
    }

    fun downloadsToday(): RegistryPackageVersionStatisticsResponseProjection = downloadsToday(null)

    fun downloadsToday(alias: String?): RegistryPackageVersionStatisticsResponseProjection {
        fields.add(GraphQLResponseField("downloadsToday").alias(alias))
        return this
    }

    fun downloadsTotalCount(): RegistryPackageVersionStatisticsResponseProjection = downloadsTotalCount(null)

    fun downloadsTotalCount(alias: String?): RegistryPackageVersionStatisticsResponseProjection {
        fields.add(GraphQLResponseField("downloadsTotalCount").alias(alias))
        return this
    }

    fun typename(): RegistryPackageVersionStatisticsResponseProjection = typename(null)

    fun typename(alias: String?): RegistryPackageVersionStatisticsResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
