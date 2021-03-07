package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for RegistryPackage
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class RegistryPackageResponseProjection extends GraphQLResponseProjection {

    override def all$(): RegistryPackageResponseProjection = all$(3)

    override def all$(maxDepth: Int): RegistryPackageResponseProjection = {
        this.color()
        this.id()
        if (projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionResponseProjection.latestVersion", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageResponseProjection.RegistryPackageVersionResponseProjection.latestVersion", projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionResponseProjection.latestVersion", 0) + 1)
            this.latestVersion(new RegistryPackageVersionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionResponseProjection.latestVersion", 0)))
        }
        this.name()
        this.nameWithOwner()
        if (projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageFileResponseProjection.packageFileByGuid", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageResponseProjection.RegistryPackageFileResponseProjection.packageFileByGuid", projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageFileResponseProjection.packageFileByGuid", 0) + 1)
            this.packageFileByGuid(new RegistryPackageFileResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageFileResponseProjection.packageFileByGuid", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageFileResponseProjection.packageFileBySha256", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageResponseProjection.RegistryPackageFileResponseProjection.packageFileBySha256", projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageFileResponseProjection.packageFileBySha256", 0) + 1)
            this.packageFileBySha256(new RegistryPackageFileResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageFileResponseProjection.packageFileBySha256", 0)))
        }
        this.packageType()
        if (projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionConnectionResponseProjection.preReleaseVersions", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageResponseProjection.RegistryPackageVersionConnectionResponseProjection.preReleaseVersions", projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionConnectionResponseProjection.preReleaseVersions", 0) + 1)
            this.preReleaseVersions(new RegistryPackageVersionConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionConnectionResponseProjection.preReleaseVersions", 0)))
        }
        this.registryPackageType()
        if (projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RepositoryResponseProjection.repository", 0) + 1)
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageStatisticsResponseProjection.statistics", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageResponseProjection.RegistryPackageStatisticsResponseProjection.statistics", projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageStatisticsResponseProjection.statistics", 0) + 1)
            this.statistics(new RegistryPackageStatisticsResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageStatisticsResponseProjection.statistics", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageTagConnectionResponseProjection.tags", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageResponseProjection.RegistryPackageTagConnectionResponseProjection.tags", projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageTagConnectionResponseProjection.tags", 0) + 1)
            this.tags(new RegistryPackageTagConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageTagConnectionResponseProjection.tags", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.TopicConnectionResponseProjection.topics", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageResponseProjection.TopicConnectionResponseProjection.topics", projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.TopicConnectionResponseProjection.topics", 0) + 1)
            this.topics(new TopicConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.TopicConnectionResponseProjection.topics", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionResponseProjection.version", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageResponseProjection.RegistryPackageVersionResponseProjection.version", projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionResponseProjection.version", 0) + 1)
            this.version(new RegistryPackageVersionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionResponseProjection.version", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionResponseProjection.versionByPlatform", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageResponseProjection.RegistryPackageVersionResponseProjection.versionByPlatform", projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionResponseProjection.versionByPlatform", 0) + 1)
            this.versionByPlatform(new RegistryPackageVersionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionResponseProjection.versionByPlatform", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionResponseProjection.versionBySha256", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageResponseProjection.RegistryPackageVersionResponseProjection.versionBySha256", projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionResponseProjection.versionBySha256", 0) + 1)
            this.versionBySha256(new RegistryPackageVersionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionResponseProjection.versionBySha256", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionConnectionResponseProjection.versions", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageResponseProjection.RegistryPackageVersionConnectionResponseProjection.versions", projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionConnectionResponseProjection.versions", 0) + 1)
            this.versions(new RegistryPackageVersionConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionConnectionResponseProjection.versions", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionConnectionResponseProjection.versionsByMetadatum", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageResponseProjection.RegistryPackageVersionConnectionResponseProjection.versionsByMetadatum", projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionConnectionResponseProjection.versionsByMetadatum", 0) + 1)
            this.versionsByMetadatum(new RegistryPackageVersionConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionConnectionResponseProjection.versionsByMetadatum", 0)))
        }
        this.typename()
        this
    }

    def color(): RegistryPackageResponseProjection = {
        color(null.asInstanceOf[String])
    }

    def color(alias: String): RegistryPackageResponseProjection = {
        fields.add(new GraphQLResponseField("color").alias(alias))
        this
    }

    def id(): RegistryPackageResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): RegistryPackageResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def latestVersion(subProjection: RegistryPackageVersionResponseProjection): RegistryPackageResponseProjection = {
        latestVersion(null.asInstanceOf[String], subProjection)
    }

    def latestVersion(alias: String, subProjection: RegistryPackageVersionResponseProjection): RegistryPackageResponseProjection = {
        fields.add(new GraphQLResponseField("latestVersion").alias(alias).projection(subProjection))
        this
    }

    def name(): RegistryPackageResponseProjection = {
        name(null.asInstanceOf[String])
    }

    def name(alias: String): RegistryPackageResponseProjection = {
        fields.add(new GraphQLResponseField("name").alias(alias))
        this
    }

    def nameWithOwner(): RegistryPackageResponseProjection = {
        nameWithOwner(null.asInstanceOf[String])
    }

    def nameWithOwner(alias: String): RegistryPackageResponseProjection = {
        fields.add(new GraphQLResponseField("nameWithOwner").alias(alias))
        this
    }

    def packageFileByGuid(subProjection: RegistryPackageFileResponseProjection): RegistryPackageResponseProjection = {
        packageFileByGuid(null.asInstanceOf[String], subProjection)
    }

    def packageFileByGuid(alias: String, subProjection: RegistryPackageFileResponseProjection): RegistryPackageResponseProjection = {
        fields.add(new GraphQLResponseField("packageFileByGuid").alias(alias).projection(subProjection))
        this
    }

    def packageFileByGuid(input: RegistryPackagePackageFileByGuidParametrizedInput,subProjection: RegistryPackageFileResponseProjection): RegistryPackageResponseProjection = {
        packageFileByGuid(null.asInstanceOf[String], input, subProjection)
    }

    def packageFileByGuid(alias: String, input: RegistryPackagePackageFileByGuidParametrizedInput , subProjection: RegistryPackageFileResponseProjection): RegistryPackageResponseProjection = {
        fields.add(new GraphQLResponseField("packageFileByGuid").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def packageFileBySha256(subProjection: RegistryPackageFileResponseProjection): RegistryPackageResponseProjection = {
        packageFileBySha256(null.asInstanceOf[String], subProjection)
    }

    def packageFileBySha256(alias: String, subProjection: RegistryPackageFileResponseProjection): RegistryPackageResponseProjection = {
        fields.add(new GraphQLResponseField("packageFileBySha256").alias(alias).projection(subProjection))
        this
    }

    def packageFileBySha256(input: RegistryPackagePackageFileBySha256ParametrizedInput,subProjection: RegistryPackageFileResponseProjection): RegistryPackageResponseProjection = {
        packageFileBySha256(null.asInstanceOf[String], input, subProjection)
    }

    def packageFileBySha256(alias: String, input: RegistryPackagePackageFileBySha256ParametrizedInput , subProjection: RegistryPackageFileResponseProjection): RegistryPackageResponseProjection = {
        fields.add(new GraphQLResponseField("packageFileBySha256").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def packageType(): RegistryPackageResponseProjection = {
        packageType(null.asInstanceOf[String])
    }

    def packageType(alias: String): RegistryPackageResponseProjection = {
        fields.add(new GraphQLResponseField("packageType").alias(alias))
        this
    }

    def preReleaseVersions(subProjection: RegistryPackageVersionConnectionResponseProjection): RegistryPackageResponseProjection = {
        preReleaseVersions(null.asInstanceOf[String], subProjection)
    }

    def preReleaseVersions(alias: String, subProjection: RegistryPackageVersionConnectionResponseProjection): RegistryPackageResponseProjection = {
        fields.add(new GraphQLResponseField("preReleaseVersions").alias(alias).projection(subProjection))
        this
    }

    def preReleaseVersions(input: RegistryPackagePreReleaseVersionsParametrizedInput,subProjection: RegistryPackageVersionConnectionResponseProjection): RegistryPackageResponseProjection = {
        preReleaseVersions(null.asInstanceOf[String], input, subProjection)
    }

    def preReleaseVersions(alias: String, input: RegistryPackagePreReleaseVersionsParametrizedInput , subProjection: RegistryPackageVersionConnectionResponseProjection): RegistryPackageResponseProjection = {
        fields.add(new GraphQLResponseField("preReleaseVersions").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def registryPackageType(): RegistryPackageResponseProjection = {
        registryPackageType(null.asInstanceOf[String])
    }

    def registryPackageType(alias: String): RegistryPackageResponseProjection = {
        fields.add(new GraphQLResponseField("registryPackageType").alias(alias))
        this
    }

    def repository(subProjection: RepositoryResponseProjection): RegistryPackageResponseProjection = {
        repository(null.asInstanceOf[String], subProjection)
    }

    def repository(alias: String, subProjection: RepositoryResponseProjection): RegistryPackageResponseProjection = {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection))
        this
    }

    def statistics(subProjection: RegistryPackageStatisticsResponseProjection): RegistryPackageResponseProjection = {
        statistics(null.asInstanceOf[String], subProjection)
    }

    def statistics(alias: String, subProjection: RegistryPackageStatisticsResponseProjection): RegistryPackageResponseProjection = {
        fields.add(new GraphQLResponseField("statistics").alias(alias).projection(subProjection))
        this
    }

    def tags(subProjection: RegistryPackageTagConnectionResponseProjection): RegistryPackageResponseProjection = {
        tags(null.asInstanceOf[String], subProjection)
    }

    def tags(alias: String, subProjection: RegistryPackageTagConnectionResponseProjection): RegistryPackageResponseProjection = {
        fields.add(new GraphQLResponseField("tags").alias(alias).projection(subProjection))
        this
    }

    def tags(input: RegistryPackageTagsParametrizedInput,subProjection: RegistryPackageTagConnectionResponseProjection): RegistryPackageResponseProjection = {
        tags(null.asInstanceOf[String], input, subProjection)
    }

    def tags(alias: String, input: RegistryPackageTagsParametrizedInput , subProjection: RegistryPackageTagConnectionResponseProjection): RegistryPackageResponseProjection = {
        fields.add(new GraphQLResponseField("tags").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def topics(subProjection: TopicConnectionResponseProjection): RegistryPackageResponseProjection = {
        topics(null.asInstanceOf[String], subProjection)
    }

    def topics(alias: String, subProjection: TopicConnectionResponseProjection): RegistryPackageResponseProjection = {
        fields.add(new GraphQLResponseField("topics").alias(alias).projection(subProjection))
        this
    }

    def topics(input: RegistryPackageTopicsParametrizedInput,subProjection: TopicConnectionResponseProjection): RegistryPackageResponseProjection = {
        topics(null.asInstanceOf[String], input, subProjection)
    }

    def topics(alias: String, input: RegistryPackageTopicsParametrizedInput , subProjection: TopicConnectionResponseProjection): RegistryPackageResponseProjection = {
        fields.add(new GraphQLResponseField("topics").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def version(subProjection: RegistryPackageVersionResponseProjection): RegistryPackageResponseProjection = {
        version(null.asInstanceOf[String], subProjection)
    }

    def version(alias: String, subProjection: RegistryPackageVersionResponseProjection): RegistryPackageResponseProjection = {
        fields.add(new GraphQLResponseField("version").alias(alias).projection(subProjection))
        this
    }

    def version(input: RegistryPackageVersionParametrizedInput,subProjection: RegistryPackageVersionResponseProjection): RegistryPackageResponseProjection = {
        version(null.asInstanceOf[String], input, subProjection)
    }

    def version(alias: String, input: RegistryPackageVersionParametrizedInput , subProjection: RegistryPackageVersionResponseProjection): RegistryPackageResponseProjection = {
        fields.add(new GraphQLResponseField("version").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def versionByPlatform(subProjection: RegistryPackageVersionResponseProjection): RegistryPackageResponseProjection = {
        versionByPlatform(null.asInstanceOf[String], subProjection)
    }

    def versionByPlatform(alias: String, subProjection: RegistryPackageVersionResponseProjection): RegistryPackageResponseProjection = {
        fields.add(new GraphQLResponseField("versionByPlatform").alias(alias).projection(subProjection))
        this
    }

    def versionByPlatform(input: RegistryPackageVersionByPlatformParametrizedInput,subProjection: RegistryPackageVersionResponseProjection): RegistryPackageResponseProjection = {
        versionByPlatform(null.asInstanceOf[String], input, subProjection)
    }

    def versionByPlatform(alias: String, input: RegistryPackageVersionByPlatformParametrizedInput , subProjection: RegistryPackageVersionResponseProjection): RegistryPackageResponseProjection = {
        fields.add(new GraphQLResponseField("versionByPlatform").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def versionBySha256(subProjection: RegistryPackageVersionResponseProjection): RegistryPackageResponseProjection = {
        versionBySha256(null.asInstanceOf[String], subProjection)
    }

    def versionBySha256(alias: String, subProjection: RegistryPackageVersionResponseProjection): RegistryPackageResponseProjection = {
        fields.add(new GraphQLResponseField("versionBySha256").alias(alias).projection(subProjection))
        this
    }

    def versionBySha256(input: RegistryPackageVersionBySha256ParametrizedInput,subProjection: RegistryPackageVersionResponseProjection): RegistryPackageResponseProjection = {
        versionBySha256(null.asInstanceOf[String], input, subProjection)
    }

    def versionBySha256(alias: String, input: RegistryPackageVersionBySha256ParametrizedInput , subProjection: RegistryPackageVersionResponseProjection): RegistryPackageResponseProjection = {
        fields.add(new GraphQLResponseField("versionBySha256").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def versions(subProjection: RegistryPackageVersionConnectionResponseProjection): RegistryPackageResponseProjection = {
        versions(null.asInstanceOf[String], subProjection)
    }

    def versions(alias: String, subProjection: RegistryPackageVersionConnectionResponseProjection): RegistryPackageResponseProjection = {
        fields.add(new GraphQLResponseField("versions").alias(alias).projection(subProjection))
        this
    }

    def versions(input: RegistryPackageVersionsParametrizedInput,subProjection: RegistryPackageVersionConnectionResponseProjection): RegistryPackageResponseProjection = {
        versions(null.asInstanceOf[String], input, subProjection)
    }

    def versions(alias: String, input: RegistryPackageVersionsParametrizedInput , subProjection: RegistryPackageVersionConnectionResponseProjection): RegistryPackageResponseProjection = {
        fields.add(new GraphQLResponseField("versions").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def versionsByMetadatum(subProjection: RegistryPackageVersionConnectionResponseProjection): RegistryPackageResponseProjection = {
        versionsByMetadatum(null.asInstanceOf[String], subProjection)
    }

    def versionsByMetadatum(alias: String, subProjection: RegistryPackageVersionConnectionResponseProjection): RegistryPackageResponseProjection = {
        fields.add(new GraphQLResponseField("versionsByMetadatum").alias(alias).projection(subProjection))
        this
    }

    def versionsByMetadatum(input: RegistryPackageVersionsByMetadatumParametrizedInput,subProjection: RegistryPackageVersionConnectionResponseProjection): RegistryPackageResponseProjection = {
        versionsByMetadatum(null.asInstanceOf[String], input, subProjection)
    }

    def versionsByMetadatum(alias: String, input: RegistryPackageVersionsByMetadatumParametrizedInput , subProjection: RegistryPackageVersionConnectionResponseProjection): RegistryPackageResponseProjection = {
        fields.add(new GraphQLResponseField("versionsByMetadatum").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def typename(): RegistryPackageResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): RegistryPackageResponseProjection = {
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
        val that = obj.asInstanceOf[RegistryPackageResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
