package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for RegistryPackageVersionStatistics
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class RegistryPackageVersionStatisticsResponseProjection extends GraphQLResponseProjection {

    public RegistryPackageVersionStatisticsResponseProjection() {
    }

    @Override
    public RegistryPackageVersionStatisticsResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RegistryPackageVersionStatisticsResponseProjection all$(int maxDepth) {
        this.downloadsThisMonth();
        this.downloadsThisWeek();
        this.downloadsThisYear();
        this.downloadsToday();
        this.downloadsTotalCount();
        this.typename();
        return this;
    }

    public RegistryPackageVersionStatisticsResponseProjection downloadsThisMonth() {
        return downloadsThisMonth(null);
    }

    public RegistryPackageVersionStatisticsResponseProjection downloadsThisMonth(String alias) {
        fields.add(new GraphQLResponseField("downloadsThisMonth").alias(alias));
        return this;
    }

    public RegistryPackageVersionStatisticsResponseProjection downloadsThisWeek() {
        return downloadsThisWeek(null);
    }

    public RegistryPackageVersionStatisticsResponseProjection downloadsThisWeek(String alias) {
        fields.add(new GraphQLResponseField("downloadsThisWeek").alias(alias));
        return this;
    }

    public RegistryPackageVersionStatisticsResponseProjection downloadsThisYear() {
        return downloadsThisYear(null);
    }

    public RegistryPackageVersionStatisticsResponseProjection downloadsThisYear(String alias) {
        fields.add(new GraphQLResponseField("downloadsThisYear").alias(alias));
        return this;
    }

    public RegistryPackageVersionStatisticsResponseProjection downloadsToday() {
        return downloadsToday(null);
    }

    public RegistryPackageVersionStatisticsResponseProjection downloadsToday(String alias) {
        fields.add(new GraphQLResponseField("downloadsToday").alias(alias));
        return this;
    }

    public RegistryPackageVersionStatisticsResponseProjection downloadsTotalCount() {
        return downloadsTotalCount(null);
    }

    public RegistryPackageVersionStatisticsResponseProjection downloadsTotalCount(String alias) {
        fields.add(new GraphQLResponseField("downloadsTotalCount").alias(alias));
        return this;
    }

    public RegistryPackageVersionStatisticsResponseProjection typename() {
        return typename(null);
    }

    public RegistryPackageVersionStatisticsResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
