package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for RegistryPackageStatistics
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class RegistryPackageStatisticsResponseProjection extends GraphQLResponseProjection {

    public RegistryPackageStatisticsResponseProjection() {
    }

    @Override
    public RegistryPackageStatisticsResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RegistryPackageStatisticsResponseProjection all$(int maxDepth) {
        this.downloadsThisMonth();
        this.downloadsThisWeek();
        this.downloadsThisYear();
        this.downloadsToday();
        this.downloadsTotalCount();
        this.typename();
        return this;
    }

    public RegistryPackageStatisticsResponseProjection downloadsThisMonth() {
        return downloadsThisMonth(null);
    }

    public RegistryPackageStatisticsResponseProjection downloadsThisMonth(String alias) {
        fields.add(new GraphQLResponseField("downloadsThisMonth").alias(alias));
        return this;
    }

    public RegistryPackageStatisticsResponseProjection downloadsThisWeek() {
        return downloadsThisWeek(null);
    }

    public RegistryPackageStatisticsResponseProjection downloadsThisWeek(String alias) {
        fields.add(new GraphQLResponseField("downloadsThisWeek").alias(alias));
        return this;
    }

    public RegistryPackageStatisticsResponseProjection downloadsThisYear() {
        return downloadsThisYear(null);
    }

    public RegistryPackageStatisticsResponseProjection downloadsThisYear(String alias) {
        fields.add(new GraphQLResponseField("downloadsThisYear").alias(alias));
        return this;
    }

    public RegistryPackageStatisticsResponseProjection downloadsToday() {
        return downloadsToday(null);
    }

    public RegistryPackageStatisticsResponseProjection downloadsToday(String alias) {
        fields.add(new GraphQLResponseField("downloadsToday").alias(alias));
        return this;
    }

    public RegistryPackageStatisticsResponseProjection downloadsTotalCount() {
        return downloadsTotalCount(null);
    }

    public RegistryPackageStatisticsResponseProjection downloadsTotalCount(String alias) {
        fields.add(new GraphQLResponseField("downloadsTotalCount").alias(alias));
        return this;
    }

    public RegistryPackageStatisticsResponseProjection typename() {
        return typename(null);
    }

    public RegistryPackageStatisticsResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final RegistryPackageStatisticsResponseProjection that = (RegistryPackageStatisticsResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
