package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class RegistryPackageVersionTO(
    @javax.validation.constraints.NotNull
    override val id: String,
    installationCommand: String,
    manifest: String,
    platform: String,
    readme: String,
    readmeHtml: String,
    registryPackage: RegistryPackageTO,
    release: ReleaseTO,
    sha256: String,
    size: Option[Int],
    statistics: RegistryPackageVersionStatisticsTO,
    summary: String,
    @javax.validation.constraints.NotNull
    updatedAt: String,
    @javax.validation.constraints.NotNull
    version: String,
    viewerCanEdit: Boolean
) extends NodeTO {

    override def toString(): String = {
        Seq(
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (installationCommand != null) "installationCommand: " + GraphQLRequestSerializer.getEntry(installationCommand) else "",
            if (manifest != null) "manifest: " + GraphQLRequestSerializer.getEntry(manifest) else "",
            if (platform != null) "platform: " + GraphQLRequestSerializer.getEntry(platform) else "",
            if (readme != null) "readme: " + GraphQLRequestSerializer.getEntry(readme) else "",
            if (readmeHtml != null) "readmeHtml: " + GraphQLRequestSerializer.getEntry(readmeHtml) else "",
            if (registryPackage != null) "registryPackage: " + GraphQLRequestSerializer.getEntry(registryPackage) else "",
            if (release != null) "release: " + GraphQLRequestSerializer.getEntry(release) else "",
            if (sha256 != null) "sha256: " + GraphQLRequestSerializer.getEntry(sha256) else "",
            if (size.isDefined) "size: " + GraphQLRequestSerializer.getEntry(size.get) else "",
            if (statistics != null) "statistics: " + GraphQLRequestSerializer.getEntry(statistics) else "",
            if (summary != null) "summary: " + GraphQLRequestSerializer.getEntry(summary) else "",
            if (updatedAt != null) "updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt) else "",
            if (version != null) "version: " + GraphQLRequestSerializer.getEntry(version) else "",
            "viewerCanEdit: " + GraphQLRequestSerializer.getEntry(viewerCanEdit)
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[RegistryPackageVersionTO]
        Objects.equals(id, that.id) &&
        Objects.equals(installationCommand, that.installationCommand) &&
        Objects.equals(manifest, that.manifest) &&
        Objects.equals(platform, that.platform) &&
        Objects.equals(readme, that.readme) &&
        Objects.equals(readmeHtml, that.readmeHtml) &&
        Objects.equals(registryPackage, that.registryPackage) &&
        Objects.equals(release, that.release) &&
        Objects.equals(sha256, that.sha256) &&
        Objects.equals(size, that.size) &&
        Objects.equals(statistics, that.statistics) &&
        Objects.equals(summary, that.summary) &&
        Objects.equals(updatedAt, that.updatedAt) &&
        Objects.equals(version, that.version) &&
        Objects.equals(viewerCanEdit, that.viewerCanEdit)
    }

    override def hashCode(): Int = {
        Objects.hash(id, installationCommand, manifest, platform, readme, readmeHtml, registryPackage, release, sha256, size, statistics, summary, updatedAt, version, viewerCanEdit)
    }
}

object RegistryPackageVersionTO {

    def builder(): RegistryPackageVersionTO.Builder = new Builder()

    class Builder {

        private var id: String = _
        private var installationCommand: String = _
        private var manifest: String = _
        private var platform: String = _
        private var readme: String = _
        private var readmeHtml: String = _
        private var registryPackage: RegistryPackageTO = _
        private var release: ReleaseTO = _
        private var sha256: String = _
        private var size: Option[Int] = _
        private var statistics: RegistryPackageVersionStatisticsTO = _
        private var summary: String = _
        private var updatedAt: String = _
        private var version: String = _
        private var viewerCanEdit: Boolean = _

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setInstallationCommand(installationCommand: String): Builder = {
            this.installationCommand = installationCommand
            this
        }

        def setManifest(manifest: String): Builder = {
            this.manifest = manifest
            this
        }

        def setPlatform(platform: String): Builder = {
            this.platform = platform
            this
        }

        def setReadme(readme: String): Builder = {
            this.readme = readme
            this
        }

        def setReadmeHtml(readmeHtml: String): Builder = {
            this.readmeHtml = readmeHtml
            this
        }

        def setRegistryPackage(registryPackage: RegistryPackageTO): Builder = {
            this.registryPackage = registryPackage
            this
        }

        def setRelease(release: ReleaseTO): Builder = {
            this.release = release
            this
        }

        def setSha256(sha256: String): Builder = {
            this.sha256 = sha256
            this
        }

        def setSize(size: Option[Int]): Builder = {
            this.size = size
            this
        }

        def setStatistics(statistics: RegistryPackageVersionStatisticsTO): Builder = {
            this.statistics = statistics
            this
        }

        def setSummary(summary: String): Builder = {
            this.summary = summary
            this
        }

        def setUpdatedAt(updatedAt: String): Builder = {
            this.updatedAt = updatedAt
            this
        }

        def setVersion(version: String): Builder = {
            this.version = version
            this
        }

        def setViewerCanEdit(viewerCanEdit: Boolean): Builder = {
            this.viewerCanEdit = viewerCanEdit
            this
        }

        def build(): RegistryPackageVersionTO = new RegistryPackageVersionTO(id, installationCommand, manifest, platform, readme, readmeHtml, registryPackage, release, sha256, size, statistics, summary, updatedAt, version, viewerCanEdit)

    }
}
