package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class RegistryPackageVersionTO(
    override
    val id: String,
    val installationCommand: String?,
    val manifest: String?,
    val platform: String?,
    val readme: String?,
    val readmeHtml: String?,
    val registryPackage: RegistryPackageTO?,
    val release: ReleaseTO?,
    val sha256: String?,
    val size: Int?,
    val statistics: RegistryPackageVersionStatisticsTO?,
    val summary: String?,
    val updatedAt: String,
    val version: String,
    val viewerCanEdit: Boolean
) : NodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        if (installationCommand != null) {
            joiner.add("installationCommand: " + GraphQLRequestSerializer.getEntry(installationCommand))
        }
        if (manifest != null) {
            joiner.add("manifest: " + GraphQLRequestSerializer.getEntry(manifest))
        }
        if (platform != null) {
            joiner.add("platform: " + GraphQLRequestSerializer.getEntry(platform))
        }
        if (readme != null) {
            joiner.add("readme: " + GraphQLRequestSerializer.getEntry(readme))
        }
        if (readmeHtml != null) {
            joiner.add("readmeHtml: " + GraphQLRequestSerializer.getEntry(readmeHtml))
        }
        if (registryPackage != null) {
            joiner.add("registryPackage: " + GraphQLRequestSerializer.getEntry(registryPackage))
        }
        if (release != null) {
            joiner.add("release: " + GraphQLRequestSerializer.getEntry(release))
        }
        if (sha256 != null) {
            joiner.add("sha256: " + GraphQLRequestSerializer.getEntry(sha256))
        }
        if (size != null) {
            joiner.add("size: " + GraphQLRequestSerializer.getEntry(size))
        }
        if (statistics != null) {
            joiner.add("statistics: " + GraphQLRequestSerializer.getEntry(statistics))
        }
        if (summary != null) {
            joiner.add("summary: " + GraphQLRequestSerializer.getEntry(summary))
        }
        joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt))
        joiner.add("version: " + GraphQLRequestSerializer.getEntry(version))
        joiner.add("viewerCanEdit: " + GraphQLRequestSerializer.getEntry(viewerCanEdit))
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as RegistryPackageVersionTO
        return Objects.equals(id, that.id)
                && Objects.equals(installationCommand, that.installationCommand)
                && Objects.equals(manifest, that.manifest)
                && Objects.equals(platform, that.platform)
                && Objects.equals(readme, that.readme)
                && Objects.equals(readmeHtml, that.readmeHtml)
                && Objects.equals(registryPackage, that.registryPackage)
                && Objects.equals(release, that.release)
                && Objects.equals(sha256, that.sha256)
                && Objects.equals(size, that.size)
                && Objects.equals(statistics, that.statistics)
                && Objects.equals(summary, that.summary)
                && Objects.equals(updatedAt, that.updatedAt)
                && Objects.equals(version, that.version)
                && Objects.equals(viewerCanEdit, that.viewerCanEdit)

    }

    override fun hashCode(): Int = {
        return Objects.hash(id, installationCommand, manifest, platform, readme, readmeHtml, registryPackage, release, sha256, size, statistics, summary, updatedAt, version, viewerCanEdit)
    }

    class Builder {

        private lateinit var id: String
        private var installationCommand: String? = null
        private var manifest: String? = null
        private var platform: String? = null
        private var readme: String? = null
        private var readmeHtml: String? = null
        private var registryPackage: RegistryPackageTO? = null
        private var release: ReleaseTO? = null
        private var sha256: String? = null
        private var size: Int? = null
        private var statistics: RegistryPackageVersionStatisticsTO? = null
        private var summary: String? = null
        private lateinit var updatedAt: String
        private lateinit var version: String
        private var viewerCanEdit: Boolean = false

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setInstallationCommand(installationCommand: String?): Builder {
            this.installationCommand = installationCommand
            return this
        }

        fun setManifest(manifest: String?): Builder {
            this.manifest = manifest
            return this
        }

        fun setPlatform(platform: String?): Builder {
            this.platform = platform
            return this
        }

        fun setReadme(readme: String?): Builder {
            this.readme = readme
            return this
        }

        fun setReadmeHtml(readmeHtml: String?): Builder {
            this.readmeHtml = readmeHtml
            return this
        }

        fun setRegistryPackage(registryPackage: RegistryPackageTO?): Builder {
            this.registryPackage = registryPackage
            return this
        }

        fun setRelease(release: ReleaseTO?): Builder {
            this.release = release
            return this
        }

        fun setSha256(sha256: String?): Builder {
            this.sha256 = sha256
            return this
        }

        fun setSize(size: Int?): Builder {
            this.size = size
            return this
        }

        fun setStatistics(statistics: RegistryPackageVersionStatisticsTO?): Builder {
            this.statistics = statistics
            return this
        }

        fun setSummary(summary: String?): Builder {
            this.summary = summary
            return this
        }

        fun setUpdatedAt(updatedAt: String): Builder {
            this.updatedAt = updatedAt
            return this
        }

        fun setVersion(version: String): Builder {
            this.version = version
            return this
        }

        fun setViewerCanEdit(viewerCanEdit: Boolean): Builder {
            this.viewerCanEdit = viewerCanEdit
            return this
        }

        fun build(): RegistryPackageVersionTO {
            return RegistryPackageVersionTO(id, installationCommand, manifest, platform, readme, readmeHtml, registryPackage, release, sha256, size, statistics, summary, updatedAt, version, viewerCanEdit)
        }
    }
}
