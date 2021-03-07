package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for RegistryPackage
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class RegistryPackageResponseProjection extends GraphQLResponseProjection {

    public RegistryPackageResponseProjection() {
    }

    @Override
    public RegistryPackageResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RegistryPackageResponseProjection all$(int maxDepth) {
        this.color();
        this.id();
        if (projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionResponseProjection.latestVersion", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageResponseProjection.RegistryPackageVersionResponseProjection.latestVersion", projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionResponseProjection.latestVersion", 0) + 1);
            this.latestVersion(new RegistryPackageVersionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionResponseProjection.latestVersion", 0)));
        }
        this.name();
        this.nameWithOwner();
        if (projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageFileResponseProjection.packageFileByGuid", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageResponseProjection.RegistryPackageFileResponseProjection.packageFileByGuid", projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageFileResponseProjection.packageFileByGuid", 0) + 1);
            this.packageFileByGuid(new RegistryPackageFileResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageFileResponseProjection.packageFileByGuid", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageFileResponseProjection.packageFileBySha256", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageResponseProjection.RegistryPackageFileResponseProjection.packageFileBySha256", projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageFileResponseProjection.packageFileBySha256", 0) + 1);
            this.packageFileBySha256(new RegistryPackageFileResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageFileResponseProjection.packageFileBySha256", 0)));
        }
        this.packageType();
        if (projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionConnectionResponseProjection.preReleaseVersions", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageResponseProjection.RegistryPackageVersionConnectionResponseProjection.preReleaseVersions", projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionConnectionResponseProjection.preReleaseVersions", 0) + 1);
            this.preReleaseVersions(new RegistryPackageVersionConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionConnectionResponseProjection.preReleaseVersions", 0)));
        }
        this.registryPackageType();
        if (projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RepositoryResponseProjection.repository", 0) + 1);
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RepositoryResponseProjection.repository", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageStatisticsResponseProjection.statistics", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageResponseProjection.RegistryPackageStatisticsResponseProjection.statistics", projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageStatisticsResponseProjection.statistics", 0) + 1);
            this.statistics(new RegistryPackageStatisticsResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageStatisticsResponseProjection.statistics", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageTagConnectionResponseProjection.tags", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageResponseProjection.RegistryPackageTagConnectionResponseProjection.tags", projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageTagConnectionResponseProjection.tags", 0) + 1);
            this.tags(new RegistryPackageTagConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageTagConnectionResponseProjection.tags", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.TopicConnectionResponseProjection.topics", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageResponseProjection.TopicConnectionResponseProjection.topics", projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.TopicConnectionResponseProjection.topics", 0) + 1);
            this.topics(new TopicConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.TopicConnectionResponseProjection.topics", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionResponseProjection.version", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageResponseProjection.RegistryPackageVersionResponseProjection.version", projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionResponseProjection.version", 0) + 1);
            this.version(new RegistryPackageVersionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionResponseProjection.version", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionResponseProjection.versionByPlatform", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageResponseProjection.RegistryPackageVersionResponseProjection.versionByPlatform", projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionResponseProjection.versionByPlatform", 0) + 1);
            this.versionByPlatform(new RegistryPackageVersionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionResponseProjection.versionByPlatform", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionResponseProjection.versionBySha256", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageResponseProjection.RegistryPackageVersionResponseProjection.versionBySha256", projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionResponseProjection.versionBySha256", 0) + 1);
            this.versionBySha256(new RegistryPackageVersionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionResponseProjection.versionBySha256", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionConnectionResponseProjection.versions", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageResponseProjection.RegistryPackageVersionConnectionResponseProjection.versions", projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionConnectionResponseProjection.versions", 0) + 1);
            this.versions(new RegistryPackageVersionConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionConnectionResponseProjection.versions", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionConnectionResponseProjection.versionsByMetadatum", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageResponseProjection.RegistryPackageVersionConnectionResponseProjection.versionsByMetadatum", projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionConnectionResponseProjection.versionsByMetadatum", 0) + 1);
            this.versionsByMetadatum(new RegistryPackageVersionConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionConnectionResponseProjection.versionsByMetadatum", 0)));
        }
        this.typename();
        return this;
    }

    public RegistryPackageResponseProjection color() {
        return color(null);
    }

    public RegistryPackageResponseProjection color(String alias) {
        fields.add(new GraphQLResponseField("color").alias(alias));
        return this;
    }

    public RegistryPackageResponseProjection id() {
        return id(null);
    }

    public RegistryPackageResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public RegistryPackageResponseProjection latestVersion(RegistryPackageVersionResponseProjection subProjection) {
        return latestVersion(null, subProjection);
    }

    public RegistryPackageResponseProjection latestVersion(String alias, RegistryPackageVersionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("latestVersion").alias(alias).projection(subProjection));
        return this;
    }

    public RegistryPackageResponseProjection name() {
        return name(null);
    }

    public RegistryPackageResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public RegistryPackageResponseProjection nameWithOwner() {
        return nameWithOwner(null);
    }

    public RegistryPackageResponseProjection nameWithOwner(String alias) {
        fields.add(new GraphQLResponseField("nameWithOwner").alias(alias));
        return this;
    }

    public RegistryPackageResponseProjection packageFileByGuid(RegistryPackageFileResponseProjection subProjection) {
        return packageFileByGuid((String)null, subProjection);
    }

    public RegistryPackageResponseProjection packageFileByGuid(String alias, RegistryPackageFileResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("packageFileByGuid").alias(alias).projection(subProjection));
        return this;
    }

    public RegistryPackageResponseProjection packageFileByGuid(RegistryPackagePackageFileByGuidParametrizedInput input, RegistryPackageFileResponseProjection subProjection) {
        return packageFileByGuid(null, input, subProjection);
    }

    public RegistryPackageResponseProjection packageFileByGuid(String alias, RegistryPackagePackageFileByGuidParametrizedInput input, RegistryPackageFileResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("packageFileByGuid").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RegistryPackageResponseProjection packageFileBySha256(RegistryPackageFileResponseProjection subProjection) {
        return packageFileBySha256((String)null, subProjection);
    }

    public RegistryPackageResponseProjection packageFileBySha256(String alias, RegistryPackageFileResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("packageFileBySha256").alias(alias).projection(subProjection));
        return this;
    }

    public RegistryPackageResponseProjection packageFileBySha256(RegistryPackagePackageFileBySha256ParametrizedInput input, RegistryPackageFileResponseProjection subProjection) {
        return packageFileBySha256(null, input, subProjection);
    }

    public RegistryPackageResponseProjection packageFileBySha256(String alias, RegistryPackagePackageFileBySha256ParametrizedInput input, RegistryPackageFileResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("packageFileBySha256").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RegistryPackageResponseProjection packageType() {
        return packageType(null);
    }

    public RegistryPackageResponseProjection packageType(String alias) {
        fields.add(new GraphQLResponseField("packageType").alias(alias));
        return this;
    }

    public RegistryPackageResponseProjection preReleaseVersions(RegistryPackageVersionConnectionResponseProjection subProjection) {
        return preReleaseVersions((String)null, subProjection);
    }

    public RegistryPackageResponseProjection preReleaseVersions(String alias, RegistryPackageVersionConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("preReleaseVersions").alias(alias).projection(subProjection));
        return this;
    }

    public RegistryPackageResponseProjection preReleaseVersions(RegistryPackagePreReleaseVersionsParametrizedInput input, RegistryPackageVersionConnectionResponseProjection subProjection) {
        return preReleaseVersions(null, input, subProjection);
    }

    public RegistryPackageResponseProjection preReleaseVersions(String alias, RegistryPackagePreReleaseVersionsParametrizedInput input, RegistryPackageVersionConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("preReleaseVersions").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RegistryPackageResponseProjection registryPackageType() {
        return registryPackageType(null);
    }

    public RegistryPackageResponseProjection registryPackageType(String alias) {
        fields.add(new GraphQLResponseField("registryPackageType").alias(alias));
        return this;
    }

    public RegistryPackageResponseProjection repository(RepositoryResponseProjection subProjection) {
        return repository(null, subProjection);
    }

    public RegistryPackageResponseProjection repository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection));
        return this;
    }

    public RegistryPackageResponseProjection statistics(RegistryPackageStatisticsResponseProjection subProjection) {
        return statistics(null, subProjection);
    }

    public RegistryPackageResponseProjection statistics(String alias, RegistryPackageStatisticsResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("statistics").alias(alias).projection(subProjection));
        return this;
    }

    public RegistryPackageResponseProjection tags(RegistryPackageTagConnectionResponseProjection subProjection) {
        return tags((String)null, subProjection);
    }

    public RegistryPackageResponseProjection tags(String alias, RegistryPackageTagConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("tags").alias(alias).projection(subProjection));
        return this;
    }

    public RegistryPackageResponseProjection tags(RegistryPackageTagsParametrizedInput input, RegistryPackageTagConnectionResponseProjection subProjection) {
        return tags(null, input, subProjection);
    }

    public RegistryPackageResponseProjection tags(String alias, RegistryPackageTagsParametrizedInput input, RegistryPackageTagConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("tags").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RegistryPackageResponseProjection topics(TopicConnectionResponseProjection subProjection) {
        return topics((String)null, subProjection);
    }

    public RegistryPackageResponseProjection topics(String alias, TopicConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("topics").alias(alias).projection(subProjection));
        return this;
    }

    public RegistryPackageResponseProjection topics(RegistryPackageTopicsParametrizedInput input, TopicConnectionResponseProjection subProjection) {
        return topics(null, input, subProjection);
    }

    public RegistryPackageResponseProjection topics(String alias, RegistryPackageTopicsParametrizedInput input, TopicConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("topics").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RegistryPackageResponseProjection version(RegistryPackageVersionResponseProjection subProjection) {
        return version((String)null, subProjection);
    }

    public RegistryPackageResponseProjection version(String alias, RegistryPackageVersionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("version").alias(alias).projection(subProjection));
        return this;
    }

    public RegistryPackageResponseProjection version(RegistryPackageVersionParametrizedInput input, RegistryPackageVersionResponseProjection subProjection) {
        return version(null, input, subProjection);
    }

    public RegistryPackageResponseProjection version(String alias, RegistryPackageVersionParametrizedInput input, RegistryPackageVersionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("version").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RegistryPackageResponseProjection versionByPlatform(RegistryPackageVersionResponseProjection subProjection) {
        return versionByPlatform((String)null, subProjection);
    }

    public RegistryPackageResponseProjection versionByPlatform(String alias, RegistryPackageVersionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("versionByPlatform").alias(alias).projection(subProjection));
        return this;
    }

    public RegistryPackageResponseProjection versionByPlatform(RegistryPackageVersionByPlatformParametrizedInput input, RegistryPackageVersionResponseProjection subProjection) {
        return versionByPlatform(null, input, subProjection);
    }

    public RegistryPackageResponseProjection versionByPlatform(String alias, RegistryPackageVersionByPlatformParametrizedInput input, RegistryPackageVersionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("versionByPlatform").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RegistryPackageResponseProjection versionBySha256(RegistryPackageVersionResponseProjection subProjection) {
        return versionBySha256((String)null, subProjection);
    }

    public RegistryPackageResponseProjection versionBySha256(String alias, RegistryPackageVersionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("versionBySha256").alias(alias).projection(subProjection));
        return this;
    }

    public RegistryPackageResponseProjection versionBySha256(RegistryPackageVersionBySha256ParametrizedInput input, RegistryPackageVersionResponseProjection subProjection) {
        return versionBySha256(null, input, subProjection);
    }

    public RegistryPackageResponseProjection versionBySha256(String alias, RegistryPackageVersionBySha256ParametrizedInput input, RegistryPackageVersionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("versionBySha256").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RegistryPackageResponseProjection versions(RegistryPackageVersionConnectionResponseProjection subProjection) {
        return versions((String)null, subProjection);
    }

    public RegistryPackageResponseProjection versions(String alias, RegistryPackageVersionConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("versions").alias(alias).projection(subProjection));
        return this;
    }

    public RegistryPackageResponseProjection versions(RegistryPackageVersionsParametrizedInput input, RegistryPackageVersionConnectionResponseProjection subProjection) {
        return versions(null, input, subProjection);
    }

    public RegistryPackageResponseProjection versions(String alias, RegistryPackageVersionsParametrizedInput input, RegistryPackageVersionConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("versions").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RegistryPackageResponseProjection versionsByMetadatum(RegistryPackageVersionConnectionResponseProjection subProjection) {
        return versionsByMetadatum((String)null, subProjection);
    }

    public RegistryPackageResponseProjection versionsByMetadatum(String alias, RegistryPackageVersionConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("versionsByMetadatum").alias(alias).projection(subProjection));
        return this;
    }

    public RegistryPackageResponseProjection versionsByMetadatum(RegistryPackageVersionsByMetadatumParametrizedInput input, RegistryPackageVersionConnectionResponseProjection subProjection) {
        return versionsByMetadatum(null, input, subProjection);
    }

    public RegistryPackageResponseProjection versionsByMetadatum(String alias, RegistryPackageVersionsByMetadatumParametrizedInput input, RegistryPackageVersionConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("versionsByMetadatum").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RegistryPackageResponseProjection typename() {
        return typename(null);
    }

    public RegistryPackageResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
