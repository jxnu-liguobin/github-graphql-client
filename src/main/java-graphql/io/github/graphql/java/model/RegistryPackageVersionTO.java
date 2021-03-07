package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class RegistryPackageVersionTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    private String installationCommand;
    private String manifest;
    private String platform;
    private String readme;
    private String readmeHtml;
    private RegistryPackageTO registryPackage;
    private ReleaseTO release;
    private String sha256;
    private Integer size;
    private RegistryPackageVersionStatisticsTO statistics;
    private String summary;
    @javax.validation.constraints.NotNull
    private String updatedAt;
    @javax.validation.constraints.NotNull
    private String version;
    private boolean viewerCanEdit;

    public RegistryPackageVersionTO() {
    }

    public RegistryPackageVersionTO(String id, String installationCommand, String manifest, String platform, String readme, String readmeHtml, RegistryPackageTO registryPackage, ReleaseTO release, String sha256, Integer size, RegistryPackageVersionStatisticsTO statistics, String summary, String updatedAt, String version, boolean viewerCanEdit) {
        this.id = id;
        this.installationCommand = installationCommand;
        this.manifest = manifest;
        this.platform = platform;
        this.readme = readme;
        this.readmeHtml = readmeHtml;
        this.registryPackage = registryPackage;
        this.release = release;
        this.sha256 = sha256;
        this.size = size;
        this.statistics = statistics;
        this.summary = summary;
        this.updatedAt = updatedAt;
        this.version = version;
        this.viewerCanEdit = viewerCanEdit;
    }

    public String getId() {
        return id;
    }

    public String getInstallationCommand() {
        return installationCommand;
    }

    public String getManifest() {
        return manifest;
    }

    public String getPlatform() {
        return platform;
    }

    public String getReadme() {
        return readme;
    }

    public String getReadmeHtml() {
        return readmeHtml;
    }

    public RegistryPackageTO getRegistryPackage() {
        return registryPackage;
    }

    public ReleaseTO getRelease() {
        return release;
    }

    public String getSha256() {
        return sha256;
    }

    public Integer getSize() {
        return size;
    }

    public RegistryPackageVersionStatisticsTO getStatistics() {
        return statistics;
    }

    public String getSummary() {
        return summary;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getVersion() {
        return version;
    }

    public boolean getViewerCanEdit() {
        return viewerCanEdit;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final RegistryPackageVersionTO that = (RegistryPackageVersionTO) obj;
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
            && Objects.equals(viewerCanEdit, that.viewerCanEdit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, installationCommand, manifest, platform, readme, readmeHtml, registryPackage, release, sha256, size, statistics, summary, updatedAt, version, viewerCanEdit);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (installationCommand != null) {
            joiner.add("installationCommand: " + GraphQLRequestSerializer.getEntry(installationCommand));
        }
        if (manifest != null) {
            joiner.add("manifest: " + GraphQLRequestSerializer.getEntry(manifest));
        }
        if (platform != null) {
            joiner.add("platform: " + GraphQLRequestSerializer.getEntry(platform));
        }
        if (readme != null) {
            joiner.add("readme: " + GraphQLRequestSerializer.getEntry(readme));
        }
        if (readmeHtml != null) {
            joiner.add("readmeHtml: " + GraphQLRequestSerializer.getEntry(readmeHtml));
        }
        if (registryPackage != null) {
            joiner.add("registryPackage: " + GraphQLRequestSerializer.getEntry(registryPackage));
        }
        if (release != null) {
            joiner.add("release: " + GraphQLRequestSerializer.getEntry(release));
        }
        if (sha256 != null) {
            joiner.add("sha256: " + GraphQLRequestSerializer.getEntry(sha256));
        }
        if (size != null) {
            joiner.add("size: " + GraphQLRequestSerializer.getEntry(size));
        }
        if (statistics != null) {
            joiner.add("statistics: " + GraphQLRequestSerializer.getEntry(statistics));
        }
        if (summary != null) {
            joiner.add("summary: " + GraphQLRequestSerializer.getEntry(summary));
        }
        if (updatedAt != null) {
            joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt));
        }
        if (version != null) {
            joiner.add("version: " + GraphQLRequestSerializer.getEntry(version));
        }
        joiner.add("viewerCanEdit: " + GraphQLRequestSerializer.getEntry(viewerCanEdit));
        return joiner.toString();
    }

    public static RegistryPackageVersionTO.Builder builder() {
        return new RegistryPackageVersionTO.Builder();
    }

    public static class Builder {

        private String id;
        private String installationCommand;
        private String manifest;
        private String platform;
        private String readme;
        private String readmeHtml;
        private RegistryPackageTO registryPackage;
        private ReleaseTO release;
        private String sha256;
        private Integer size;
        private RegistryPackageVersionStatisticsTO statistics;
        private String summary;
        private String updatedAt;
        private String version;
        private boolean viewerCanEdit;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setInstallationCommand(String installationCommand) {
            this.installationCommand = installationCommand;
            return this;
        }

        public Builder setManifest(String manifest) {
            this.manifest = manifest;
            return this;
        }

        public Builder setPlatform(String platform) {
            this.platform = platform;
            return this;
        }

        public Builder setReadme(String readme) {
            this.readme = readme;
            return this;
        }

        public Builder setReadmeHtml(String readmeHtml) {
            this.readmeHtml = readmeHtml;
            return this;
        }

        public Builder setRegistryPackage(RegistryPackageTO registryPackage) {
            this.registryPackage = registryPackage;
            return this;
        }

        public Builder setRelease(ReleaseTO release) {
            this.release = release;
            return this;
        }

        public Builder setSha256(String sha256) {
            this.sha256 = sha256;
            return this;
        }

        public Builder setSize(Integer size) {
            this.size = size;
            return this;
        }

        public Builder setStatistics(RegistryPackageVersionStatisticsTO statistics) {
            this.statistics = statistics;
            return this;
        }

        public Builder setSummary(String summary) {
            this.summary = summary;
            return this;
        }

        public Builder setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder setVersion(String version) {
            this.version = version;
            return this;
        }

        public Builder setViewerCanEdit(boolean viewerCanEdit) {
            this.viewerCanEdit = viewerCanEdit;
            return this;
        }


        public RegistryPackageVersionTO build() {
            return new RegistryPackageVersionTO(id, installationCommand, manifest, platform, readme, readmeHtml, registryPackage, release, sha256, size, statistics, summary, updatedAt, version, viewerCanEdit);
        }

    }
}
