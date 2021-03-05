package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RegistryPackageVersion
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class RegistryPackageVersionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): RegistryPackageVersionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): RegistryPackageVersionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.RegistryPackageDependencyConnectionResponseProjection.dependencies", 0) <= maxDepth) {
            projectionDepthOnFields["RegistryPackageVersionResponseProjection.RegistryPackageDependencyConnectionResponseProjection.dependencies"] = projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.RegistryPackageDependencyConnectionResponseProjection.dependencies", 0) + 1
            this.dependencies(RegistryPackageDependencyConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.RegistryPackageDependencyConnectionResponseProjection.dependencies", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.RegistryPackageFileResponseProjection.fileByName", 0) <= maxDepth) {
            projectionDepthOnFields["RegistryPackageVersionResponseProjection.RegistryPackageFileResponseProjection.fileByName"] = projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.RegistryPackageFileResponseProjection.fileByName", 0) + 1
            this.fileByName(RegistryPackageFileResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.RegistryPackageFileResponseProjection.fileByName", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.RegistryPackageFileConnectionResponseProjection.files", 0) <= maxDepth) {
            projectionDepthOnFields["RegistryPackageVersionResponseProjection.RegistryPackageFileConnectionResponseProjection.files"] = projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.RegistryPackageFileConnectionResponseProjection.files", 0) + 1
            this.files(RegistryPackageFileConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.RegistryPackageFileConnectionResponseProjection.files", 0)))
        }
        this.id()
        this.installationCommand()
        this.manifest()
        this.platform()
        this.readme()
        this.readmeHtml()
        if (projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.RegistryPackageResponseProjection.registryPackage", 0) <= maxDepth) {
            projectionDepthOnFields["RegistryPackageVersionResponseProjection.RegistryPackageResponseProjection.registryPackage"] = projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.RegistryPackageResponseProjection.registryPackage", 0) + 1
            this.registryPackage(RegistryPackageResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.RegistryPackageResponseProjection.registryPackage", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.ReleaseResponseProjection.release", 0) <= maxDepth) {
            projectionDepthOnFields["RegistryPackageVersionResponseProjection.ReleaseResponseProjection.release"] = projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.ReleaseResponseProjection.release", 0) + 1
            this.release(ReleaseResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.ReleaseResponseProjection.release", 0)))
        }
        this.sha256()
        this.size()
        if (projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.RegistryPackageVersionStatisticsResponseProjection.statistics", 0) <= maxDepth) {
            projectionDepthOnFields["RegistryPackageVersionResponseProjection.RegistryPackageVersionStatisticsResponseProjection.statistics"] = projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.RegistryPackageVersionStatisticsResponseProjection.statistics", 0) + 1
            this.statistics(RegistryPackageVersionStatisticsResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.RegistryPackageVersionStatisticsResponseProjection.statistics", 0)))
        }
        this.summary()
        this.updatedAt()
        this.version()
        this.viewerCanEdit()
        this.typename()
        return this
    }

    fun dependencies(subProjection: RegistryPackageDependencyConnectionResponseProjection): RegistryPackageVersionResponseProjection = dependencies(null, subProjection)

    fun dependencies(alias: String?, subProjection: RegistryPackageDependencyConnectionResponseProjection): RegistryPackageVersionResponseProjection {
        fields.add(GraphQLResponseField("dependencies").alias(alias).projection(subProjection))
        return this
    }

    fun dependencies(input: RegistryPackageVersionDependenciesParametrizedInput, subProjection: RegistryPackageDependencyConnectionResponseProjection): RegistryPackageVersionResponseProjection = dependencies(null, input, subProjection)

    fun dependencies(alias: String?, input: RegistryPackageVersionDependenciesParametrizedInput, subProjection: RegistryPackageDependencyConnectionResponseProjection): RegistryPackageVersionResponseProjection {
        fields.add(GraphQLResponseField("dependencies").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun fileByName(subProjection: RegistryPackageFileResponseProjection): RegistryPackageVersionResponseProjection = fileByName(null, subProjection)

    fun fileByName(alias: String?, subProjection: RegistryPackageFileResponseProjection): RegistryPackageVersionResponseProjection {
        fields.add(GraphQLResponseField("fileByName").alias(alias).projection(subProjection))
        return this
    }

    fun fileByName(input: RegistryPackageVersionFileByNameParametrizedInput, subProjection: RegistryPackageFileResponseProjection): RegistryPackageVersionResponseProjection = fileByName(null, input, subProjection)

    fun fileByName(alias: String?, input: RegistryPackageVersionFileByNameParametrizedInput, subProjection: RegistryPackageFileResponseProjection): RegistryPackageVersionResponseProjection {
        fields.add(GraphQLResponseField("fileByName").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun files(subProjection: RegistryPackageFileConnectionResponseProjection): RegistryPackageVersionResponseProjection = files(null, subProjection)

    fun files(alias: String?, subProjection: RegistryPackageFileConnectionResponseProjection): RegistryPackageVersionResponseProjection {
        fields.add(GraphQLResponseField("files").alias(alias).projection(subProjection))
        return this
    }

    fun files(input: RegistryPackageVersionFilesParametrizedInput, subProjection: RegistryPackageFileConnectionResponseProjection): RegistryPackageVersionResponseProjection = files(null, input, subProjection)

    fun files(alias: String?, input: RegistryPackageVersionFilesParametrizedInput, subProjection: RegistryPackageFileConnectionResponseProjection): RegistryPackageVersionResponseProjection {
        fields.add(GraphQLResponseField("files").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun id(): RegistryPackageVersionResponseProjection = id(null)

    fun id(alias: String?): RegistryPackageVersionResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun installationCommand(): RegistryPackageVersionResponseProjection = installationCommand(null)

    fun installationCommand(alias: String?): RegistryPackageVersionResponseProjection {
        fields.add(GraphQLResponseField("installationCommand").alias(alias))
        return this
    }

    fun manifest(): RegistryPackageVersionResponseProjection = manifest(null)

    fun manifest(alias: String?): RegistryPackageVersionResponseProjection {
        fields.add(GraphQLResponseField("manifest").alias(alias))
        return this
    }

    fun platform(): RegistryPackageVersionResponseProjection = platform(null)

    fun platform(alias: String?): RegistryPackageVersionResponseProjection {
        fields.add(GraphQLResponseField("platform").alias(alias))
        return this
    }

    fun readme(): RegistryPackageVersionResponseProjection = readme(null)

    fun readme(alias: String?): RegistryPackageVersionResponseProjection {
        fields.add(GraphQLResponseField("readme").alias(alias))
        return this
    }

    fun readmeHtml(): RegistryPackageVersionResponseProjection = readmeHtml(null)

    fun readmeHtml(alias: String?): RegistryPackageVersionResponseProjection {
        fields.add(GraphQLResponseField("readmeHtml").alias(alias))
        return this
    }

    fun registryPackage(subProjection: RegistryPackageResponseProjection): RegistryPackageVersionResponseProjection = registryPackage(null, subProjection)

    fun registryPackage(alias: String?, subProjection: RegistryPackageResponseProjection): RegistryPackageVersionResponseProjection {
        fields.add(GraphQLResponseField("registryPackage").alias(alias).projection(subProjection))
        return this
    }

    fun release(subProjection: ReleaseResponseProjection): RegistryPackageVersionResponseProjection = release(null, subProjection)

    fun release(alias: String?, subProjection: ReleaseResponseProjection): RegistryPackageVersionResponseProjection {
        fields.add(GraphQLResponseField("release").alias(alias).projection(subProjection))
        return this
    }

    fun sha256(): RegistryPackageVersionResponseProjection = sha256(null)

    fun sha256(alias: String?): RegistryPackageVersionResponseProjection {
        fields.add(GraphQLResponseField("sha256").alias(alias))
        return this
    }

    fun size(): RegistryPackageVersionResponseProjection = size(null)

    fun size(alias: String?): RegistryPackageVersionResponseProjection {
        fields.add(GraphQLResponseField("size").alias(alias))
        return this
    }

    fun statistics(subProjection: RegistryPackageVersionStatisticsResponseProjection): RegistryPackageVersionResponseProjection = statistics(null, subProjection)

    fun statistics(alias: String?, subProjection: RegistryPackageVersionStatisticsResponseProjection): RegistryPackageVersionResponseProjection {
        fields.add(GraphQLResponseField("statistics").alias(alias).projection(subProjection))
        return this
    }

    fun summary(): RegistryPackageVersionResponseProjection = summary(null)

    fun summary(alias: String?): RegistryPackageVersionResponseProjection {
        fields.add(GraphQLResponseField("summary").alias(alias))
        return this
    }

    fun updatedAt(): RegistryPackageVersionResponseProjection = updatedAt(null)

    fun updatedAt(alias: String?): RegistryPackageVersionResponseProjection {
        fields.add(GraphQLResponseField("updatedAt").alias(alias))
        return this
    }

    fun version(): RegistryPackageVersionResponseProjection = version(null)

    fun version(alias: String?): RegistryPackageVersionResponseProjection {
        fields.add(GraphQLResponseField("version").alias(alias))
        return this
    }

    fun viewerCanEdit(): RegistryPackageVersionResponseProjection = viewerCanEdit(null)

    fun viewerCanEdit(alias: String?): RegistryPackageVersionResponseProjection {
        fields.add(GraphQLResponseField("viewerCanEdit").alias(alias))
        return this
    }

    fun typename(): RegistryPackageVersionResponseProjection = typename(null)

    fun typename(alias: String?): RegistryPackageVersionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
