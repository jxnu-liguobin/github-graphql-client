package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
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
}
