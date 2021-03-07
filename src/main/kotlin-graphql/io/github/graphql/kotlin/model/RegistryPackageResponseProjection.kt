package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for RegistryPackage
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class RegistryPackageResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): RegistryPackageResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): RegistryPackageResponseProjection {
        this.color()
        this.id()
        if (projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionResponseProjection.latestVersion", 0) <= maxDepth) {
            projectionDepthOnFields["RegistryPackageResponseProjection.RegistryPackageVersionResponseProjection.latestVersion"] = projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionResponseProjection.latestVersion", 0) + 1
            this.latestVersion(RegistryPackageVersionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionResponseProjection.latestVersion", 0)))
        }
        this.name()
        this.nameWithOwner()
        if (projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageFileResponseProjection.packageFileByGuid", 0) <= maxDepth) {
            projectionDepthOnFields["RegistryPackageResponseProjection.RegistryPackageFileResponseProjection.packageFileByGuid"] = projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageFileResponseProjection.packageFileByGuid", 0) + 1
            this.packageFileByGuid(RegistryPackageFileResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageFileResponseProjection.packageFileByGuid", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageFileResponseProjection.packageFileBySha256", 0) <= maxDepth) {
            projectionDepthOnFields["RegistryPackageResponseProjection.RegistryPackageFileResponseProjection.packageFileBySha256"] = projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageFileResponseProjection.packageFileBySha256", 0) + 1
            this.packageFileBySha256(RegistryPackageFileResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageFileResponseProjection.packageFileBySha256", 0)))
        }
        this.packageType()
        if (projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionConnectionResponseProjection.preReleaseVersions", 0) <= maxDepth) {
            projectionDepthOnFields["RegistryPackageResponseProjection.RegistryPackageVersionConnectionResponseProjection.preReleaseVersions"] = projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionConnectionResponseProjection.preReleaseVersions", 0) + 1
            this.preReleaseVersions(RegistryPackageVersionConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionConnectionResponseProjection.preReleaseVersions", 0)))
        }
        this.registryPackageType()
        if (projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields["RegistryPackageResponseProjection.RepositoryResponseProjection.repository"] = projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RepositoryResponseProjection.repository", 0) + 1
            this.repository(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageStatisticsResponseProjection.statistics", 0) <= maxDepth) {
            projectionDepthOnFields["RegistryPackageResponseProjection.RegistryPackageStatisticsResponseProjection.statistics"] = projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageStatisticsResponseProjection.statistics", 0) + 1
            this.statistics(RegistryPackageStatisticsResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageStatisticsResponseProjection.statistics", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageTagConnectionResponseProjection.tags", 0) <= maxDepth) {
            projectionDepthOnFields["RegistryPackageResponseProjection.RegistryPackageTagConnectionResponseProjection.tags"] = projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageTagConnectionResponseProjection.tags", 0) + 1
            this.tags(RegistryPackageTagConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageTagConnectionResponseProjection.tags", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.TopicConnectionResponseProjection.topics", 0) <= maxDepth) {
            projectionDepthOnFields["RegistryPackageResponseProjection.TopicConnectionResponseProjection.topics"] = projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.TopicConnectionResponseProjection.topics", 0) + 1
            this.topics(TopicConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.TopicConnectionResponseProjection.topics", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionResponseProjection.version", 0) <= maxDepth) {
            projectionDepthOnFields["RegistryPackageResponseProjection.RegistryPackageVersionResponseProjection.version"] = projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionResponseProjection.version", 0) + 1
            this.version(RegistryPackageVersionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionResponseProjection.version", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionResponseProjection.versionByPlatform", 0) <= maxDepth) {
            projectionDepthOnFields["RegistryPackageResponseProjection.RegistryPackageVersionResponseProjection.versionByPlatform"] = projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionResponseProjection.versionByPlatform", 0) + 1
            this.versionByPlatform(RegistryPackageVersionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionResponseProjection.versionByPlatform", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionResponseProjection.versionBySha256", 0) <= maxDepth) {
            projectionDepthOnFields["RegistryPackageResponseProjection.RegistryPackageVersionResponseProjection.versionBySha256"] = projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionResponseProjection.versionBySha256", 0) + 1
            this.versionBySha256(RegistryPackageVersionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionResponseProjection.versionBySha256", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionConnectionResponseProjection.versions", 0) <= maxDepth) {
            projectionDepthOnFields["RegistryPackageResponseProjection.RegistryPackageVersionConnectionResponseProjection.versions"] = projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionConnectionResponseProjection.versions", 0) + 1
            this.versions(RegistryPackageVersionConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionConnectionResponseProjection.versions", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionConnectionResponseProjection.versionsByMetadatum", 0) <= maxDepth) {
            projectionDepthOnFields["RegistryPackageResponseProjection.RegistryPackageVersionConnectionResponseProjection.versionsByMetadatum"] = projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionConnectionResponseProjection.versionsByMetadatum", 0) + 1
            this.versionsByMetadatum(RegistryPackageVersionConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageResponseProjection.RegistryPackageVersionConnectionResponseProjection.versionsByMetadatum", 0)))
        }
        this.typename()
        return this
    }

    fun color(): RegistryPackageResponseProjection = color(null)

    fun color(alias: String?): RegistryPackageResponseProjection {
        fields.add(GraphQLResponseField("color").alias(alias))
        return this
    }

    fun id(): RegistryPackageResponseProjection = id(null)

    fun id(alias: String?): RegistryPackageResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun latestVersion(subProjection: RegistryPackageVersionResponseProjection): RegistryPackageResponseProjection = latestVersion(null, subProjection)

    fun latestVersion(alias: String?, subProjection: RegistryPackageVersionResponseProjection): RegistryPackageResponseProjection {
        fields.add(GraphQLResponseField("latestVersion").alias(alias).projection(subProjection))
        return this
    }

    fun name(): RegistryPackageResponseProjection = name(null)

    fun name(alias: String?): RegistryPackageResponseProjection {
        fields.add(GraphQLResponseField("name").alias(alias))
        return this
    }

    fun nameWithOwner(): RegistryPackageResponseProjection = nameWithOwner(null)

    fun nameWithOwner(alias: String?): RegistryPackageResponseProjection {
        fields.add(GraphQLResponseField("nameWithOwner").alias(alias))
        return this
    }

    fun packageFileByGuid(subProjection: RegistryPackageFileResponseProjection): RegistryPackageResponseProjection = packageFileByGuid(null, subProjection)

    fun packageFileByGuid(alias: String?, subProjection: RegistryPackageFileResponseProjection): RegistryPackageResponseProjection {
        fields.add(GraphQLResponseField("packageFileByGuid").alias(alias).projection(subProjection))
        return this
    }

    fun packageFileByGuid(input: RegistryPackagePackageFileByGuidParametrizedInput, subProjection: RegistryPackageFileResponseProjection): RegistryPackageResponseProjection = packageFileByGuid(null, input, subProjection)

    fun packageFileByGuid(alias: String?, input: RegistryPackagePackageFileByGuidParametrizedInput, subProjection: RegistryPackageFileResponseProjection): RegistryPackageResponseProjection {
        fields.add(GraphQLResponseField("packageFileByGuid").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun packageFileBySha256(subProjection: RegistryPackageFileResponseProjection): RegistryPackageResponseProjection = packageFileBySha256(null, subProjection)

    fun packageFileBySha256(alias: String?, subProjection: RegistryPackageFileResponseProjection): RegistryPackageResponseProjection {
        fields.add(GraphQLResponseField("packageFileBySha256").alias(alias).projection(subProjection))
        return this
    }

    fun packageFileBySha256(input: RegistryPackagePackageFileBySha256ParametrizedInput, subProjection: RegistryPackageFileResponseProjection): RegistryPackageResponseProjection = packageFileBySha256(null, input, subProjection)

    fun packageFileBySha256(alias: String?, input: RegistryPackagePackageFileBySha256ParametrizedInput, subProjection: RegistryPackageFileResponseProjection): RegistryPackageResponseProjection {
        fields.add(GraphQLResponseField("packageFileBySha256").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun packageType(): RegistryPackageResponseProjection = packageType(null)

    fun packageType(alias: String?): RegistryPackageResponseProjection {
        fields.add(GraphQLResponseField("packageType").alias(alias))
        return this
    }

    fun preReleaseVersions(subProjection: RegistryPackageVersionConnectionResponseProjection): RegistryPackageResponseProjection = preReleaseVersions(null, subProjection)

    fun preReleaseVersions(alias: String?, subProjection: RegistryPackageVersionConnectionResponseProjection): RegistryPackageResponseProjection {
        fields.add(GraphQLResponseField("preReleaseVersions").alias(alias).projection(subProjection))
        return this
    }

    fun preReleaseVersions(input: RegistryPackagePreReleaseVersionsParametrizedInput, subProjection: RegistryPackageVersionConnectionResponseProjection): RegistryPackageResponseProjection = preReleaseVersions(null, input, subProjection)

    fun preReleaseVersions(alias: String?, input: RegistryPackagePreReleaseVersionsParametrizedInput, subProjection: RegistryPackageVersionConnectionResponseProjection): RegistryPackageResponseProjection {
        fields.add(GraphQLResponseField("preReleaseVersions").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun registryPackageType(): RegistryPackageResponseProjection = registryPackageType(null)

    fun registryPackageType(alias: String?): RegistryPackageResponseProjection {
        fields.add(GraphQLResponseField("registryPackageType").alias(alias))
        return this
    }

    fun repository(subProjection: RepositoryResponseProjection): RegistryPackageResponseProjection = repository(null, subProjection)

    fun repository(alias: String?, subProjection: RepositoryResponseProjection): RegistryPackageResponseProjection {
        fields.add(GraphQLResponseField("repository").alias(alias).projection(subProjection))
        return this
    }

    fun statistics(subProjection: RegistryPackageStatisticsResponseProjection): RegistryPackageResponseProjection = statistics(null, subProjection)

    fun statistics(alias: String?, subProjection: RegistryPackageStatisticsResponseProjection): RegistryPackageResponseProjection {
        fields.add(GraphQLResponseField("statistics").alias(alias).projection(subProjection))
        return this
    }

    fun tags(subProjection: RegistryPackageTagConnectionResponseProjection): RegistryPackageResponseProjection = tags(null, subProjection)

    fun tags(alias: String?, subProjection: RegistryPackageTagConnectionResponseProjection): RegistryPackageResponseProjection {
        fields.add(GraphQLResponseField("tags").alias(alias).projection(subProjection))
        return this
    }

    fun tags(input: RegistryPackageTagsParametrizedInput, subProjection: RegistryPackageTagConnectionResponseProjection): RegistryPackageResponseProjection = tags(null, input, subProjection)

    fun tags(alias: String?, input: RegistryPackageTagsParametrizedInput, subProjection: RegistryPackageTagConnectionResponseProjection): RegistryPackageResponseProjection {
        fields.add(GraphQLResponseField("tags").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun topics(subProjection: TopicConnectionResponseProjection): RegistryPackageResponseProjection = topics(null, subProjection)

    fun topics(alias: String?, subProjection: TopicConnectionResponseProjection): RegistryPackageResponseProjection {
        fields.add(GraphQLResponseField("topics").alias(alias).projection(subProjection))
        return this
    }

    fun topics(input: RegistryPackageTopicsParametrizedInput, subProjection: TopicConnectionResponseProjection): RegistryPackageResponseProjection = topics(null, input, subProjection)

    fun topics(alias: String?, input: RegistryPackageTopicsParametrizedInput, subProjection: TopicConnectionResponseProjection): RegistryPackageResponseProjection {
        fields.add(GraphQLResponseField("topics").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun version(subProjection: RegistryPackageVersionResponseProjection): RegistryPackageResponseProjection = version(null, subProjection)

    fun version(alias: String?, subProjection: RegistryPackageVersionResponseProjection): RegistryPackageResponseProjection {
        fields.add(GraphQLResponseField("version").alias(alias).projection(subProjection))
        return this
    }

    fun version(input: RegistryPackageVersionParametrizedInput, subProjection: RegistryPackageVersionResponseProjection): RegistryPackageResponseProjection = version(null, input, subProjection)

    fun version(alias: String?, input: RegistryPackageVersionParametrizedInput, subProjection: RegistryPackageVersionResponseProjection): RegistryPackageResponseProjection {
        fields.add(GraphQLResponseField("version").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun versionByPlatform(subProjection: RegistryPackageVersionResponseProjection): RegistryPackageResponseProjection = versionByPlatform(null, subProjection)

    fun versionByPlatform(alias: String?, subProjection: RegistryPackageVersionResponseProjection): RegistryPackageResponseProjection {
        fields.add(GraphQLResponseField("versionByPlatform").alias(alias).projection(subProjection))
        return this
    }

    fun versionByPlatform(input: RegistryPackageVersionByPlatformParametrizedInput, subProjection: RegistryPackageVersionResponseProjection): RegistryPackageResponseProjection = versionByPlatform(null, input, subProjection)

    fun versionByPlatform(alias: String?, input: RegistryPackageVersionByPlatformParametrizedInput, subProjection: RegistryPackageVersionResponseProjection): RegistryPackageResponseProjection {
        fields.add(GraphQLResponseField("versionByPlatform").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun versionBySha256(subProjection: RegistryPackageVersionResponseProjection): RegistryPackageResponseProjection = versionBySha256(null, subProjection)

    fun versionBySha256(alias: String?, subProjection: RegistryPackageVersionResponseProjection): RegistryPackageResponseProjection {
        fields.add(GraphQLResponseField("versionBySha256").alias(alias).projection(subProjection))
        return this
    }

    fun versionBySha256(input: RegistryPackageVersionBySha256ParametrizedInput, subProjection: RegistryPackageVersionResponseProjection): RegistryPackageResponseProjection = versionBySha256(null, input, subProjection)

    fun versionBySha256(alias: String?, input: RegistryPackageVersionBySha256ParametrizedInput, subProjection: RegistryPackageVersionResponseProjection): RegistryPackageResponseProjection {
        fields.add(GraphQLResponseField("versionBySha256").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun versions(subProjection: RegistryPackageVersionConnectionResponseProjection): RegistryPackageResponseProjection = versions(null, subProjection)

    fun versions(alias: String?, subProjection: RegistryPackageVersionConnectionResponseProjection): RegistryPackageResponseProjection {
        fields.add(GraphQLResponseField("versions").alias(alias).projection(subProjection))
        return this
    }

    fun versions(input: RegistryPackageVersionsParametrizedInput, subProjection: RegistryPackageVersionConnectionResponseProjection): RegistryPackageResponseProjection = versions(null, input, subProjection)

    fun versions(alias: String?, input: RegistryPackageVersionsParametrizedInput, subProjection: RegistryPackageVersionConnectionResponseProjection): RegistryPackageResponseProjection {
        fields.add(GraphQLResponseField("versions").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun versionsByMetadatum(subProjection: RegistryPackageVersionConnectionResponseProjection): RegistryPackageResponseProjection = versionsByMetadatum(null, subProjection)

    fun versionsByMetadatum(alias: String?, subProjection: RegistryPackageVersionConnectionResponseProjection): RegistryPackageResponseProjection {
        fields.add(GraphQLResponseField("versionsByMetadatum").alias(alias).projection(subProjection))
        return this
    }

    fun versionsByMetadatum(input: RegistryPackageVersionsByMetadatumParametrizedInput, subProjection: RegistryPackageVersionConnectionResponseProjection): RegistryPackageResponseProjection = versionsByMetadatum(null, input, subProjection)

    fun versionsByMetadatum(alias: String?, input: RegistryPackageVersionsByMetadatumParametrizedInput, subProjection: RegistryPackageVersionConnectionResponseProjection): RegistryPackageResponseProjection {
        fields.add(GraphQLResponseField("versionsByMetadatum").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun typename(): RegistryPackageResponseProjection = typename(null)

    fun typename(alias: String?): RegistryPackageResponseProjection {
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
        val that = other as RegistryPackageResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
