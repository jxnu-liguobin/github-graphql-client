package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for RegistryPackageVersion
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class RegistryPackageVersionResponseProjection extends GraphQLResponseProjection {

    override def all$(): RegistryPackageVersionResponseProjection = all$(3)

    override def all$(maxDepth: Int): RegistryPackageVersionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.RegistryPackageDependencyConnectionResponseProjection.dependencies", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageVersionResponseProjection.RegistryPackageDependencyConnectionResponseProjection.dependencies", projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.RegistryPackageDependencyConnectionResponseProjection.dependencies", 0) + 1)
            this.dependencies(new RegistryPackageDependencyConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.RegistryPackageDependencyConnectionResponseProjection.dependencies", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.RegistryPackageFileResponseProjection.fileByName", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageVersionResponseProjection.RegistryPackageFileResponseProjection.fileByName", projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.RegistryPackageFileResponseProjection.fileByName", 0) + 1)
            this.fileByName(new RegistryPackageFileResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.RegistryPackageFileResponseProjection.fileByName", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.RegistryPackageFileConnectionResponseProjection.files", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageVersionResponseProjection.RegistryPackageFileConnectionResponseProjection.files", projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.RegistryPackageFileConnectionResponseProjection.files", 0) + 1)
            this.files(new RegistryPackageFileConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.RegistryPackageFileConnectionResponseProjection.files", 0)))
        }
        this.id()
        this.installationCommand()
        this.manifest()
        this.platform()
        this.readme()
        this.readmeHtml()
        if (projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.RegistryPackageResponseProjection.registryPackage", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageVersionResponseProjection.RegistryPackageResponseProjection.registryPackage", projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.RegistryPackageResponseProjection.registryPackage", 0) + 1)
            this.registryPackage(new RegistryPackageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.RegistryPackageResponseProjection.registryPackage", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.ReleaseResponseProjection.release", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageVersionResponseProjection.ReleaseResponseProjection.release", projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.ReleaseResponseProjection.release", 0) + 1)
            this.release(new ReleaseResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.ReleaseResponseProjection.release", 0)))
        }
        this.sha256()
        this.size()
        if (projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.RegistryPackageVersionStatisticsResponseProjection.statistics", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageVersionResponseProjection.RegistryPackageVersionStatisticsResponseProjection.statistics", projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.RegistryPackageVersionStatisticsResponseProjection.statistics", 0) + 1)
            this.statistics(new RegistryPackageVersionStatisticsResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.RegistryPackageVersionStatisticsResponseProjection.statistics", 0)))
        }
        this.summary()
        this.updatedAt()
        this.version()
        this.viewerCanEdit()
        this.typename()
        this
    }

    def dependencies(subProjection: RegistryPackageDependencyConnectionResponseProjection): RegistryPackageVersionResponseProjection = {
        dependencies(null.asInstanceOf[String], subProjection)
    }

    def dependencies(alias: String, subProjection: RegistryPackageDependencyConnectionResponseProjection): RegistryPackageVersionResponseProjection = {
        fields.add(new GraphQLResponseField("dependencies").alias(alias).projection(subProjection))
        this
    }

    def dependencies(input: RegistryPackageVersionDependenciesParametrizedInput,subProjection: RegistryPackageDependencyConnectionResponseProjection): RegistryPackageVersionResponseProjection = {
        dependencies(null.asInstanceOf[String], input, subProjection)
    }

    def dependencies(alias: String, input: RegistryPackageVersionDependenciesParametrizedInput , subProjection: RegistryPackageDependencyConnectionResponseProjection): RegistryPackageVersionResponseProjection = {
        fields.add(new GraphQLResponseField("dependencies").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def fileByName(subProjection: RegistryPackageFileResponseProjection): RegistryPackageVersionResponseProjection = {
        fileByName(null.asInstanceOf[String], subProjection)
    }

    def fileByName(alias: String, subProjection: RegistryPackageFileResponseProjection): RegistryPackageVersionResponseProjection = {
        fields.add(new GraphQLResponseField("fileByName").alias(alias).projection(subProjection))
        this
    }

    def fileByName(input: RegistryPackageVersionFileByNameParametrizedInput,subProjection: RegistryPackageFileResponseProjection): RegistryPackageVersionResponseProjection = {
        fileByName(null.asInstanceOf[String], input, subProjection)
    }

    def fileByName(alias: String, input: RegistryPackageVersionFileByNameParametrizedInput , subProjection: RegistryPackageFileResponseProjection): RegistryPackageVersionResponseProjection = {
        fields.add(new GraphQLResponseField("fileByName").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def files(subProjection: RegistryPackageFileConnectionResponseProjection): RegistryPackageVersionResponseProjection = {
        files(null.asInstanceOf[String], subProjection)
    }

    def files(alias: String, subProjection: RegistryPackageFileConnectionResponseProjection): RegistryPackageVersionResponseProjection = {
        fields.add(new GraphQLResponseField("files").alias(alias).projection(subProjection))
        this
    }

    def files(input: RegistryPackageVersionFilesParametrizedInput,subProjection: RegistryPackageFileConnectionResponseProjection): RegistryPackageVersionResponseProjection = {
        files(null.asInstanceOf[String], input, subProjection)
    }

    def files(alias: String, input: RegistryPackageVersionFilesParametrizedInput , subProjection: RegistryPackageFileConnectionResponseProjection): RegistryPackageVersionResponseProjection = {
        fields.add(new GraphQLResponseField("files").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def id(): RegistryPackageVersionResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): RegistryPackageVersionResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def installationCommand(): RegistryPackageVersionResponseProjection = {
        installationCommand(null.asInstanceOf[String])
    }

    def installationCommand(alias: String): RegistryPackageVersionResponseProjection = {
        fields.add(new GraphQLResponseField("installationCommand").alias(alias))
        this
    }

    def manifest(): RegistryPackageVersionResponseProjection = {
        manifest(null.asInstanceOf[String])
    }

    def manifest(alias: String): RegistryPackageVersionResponseProjection = {
        fields.add(new GraphQLResponseField("manifest").alias(alias))
        this
    }

    def platform(): RegistryPackageVersionResponseProjection = {
        platform(null.asInstanceOf[String])
    }

    def platform(alias: String): RegistryPackageVersionResponseProjection = {
        fields.add(new GraphQLResponseField("platform").alias(alias))
        this
    }

    def readme(): RegistryPackageVersionResponseProjection = {
        readme(null.asInstanceOf[String])
    }

    def readme(alias: String): RegistryPackageVersionResponseProjection = {
        fields.add(new GraphQLResponseField("readme").alias(alias))
        this
    }

    def readmeHtml(): RegistryPackageVersionResponseProjection = {
        readmeHtml(null.asInstanceOf[String])
    }

    def readmeHtml(alias: String): RegistryPackageVersionResponseProjection = {
        fields.add(new GraphQLResponseField("readmeHtml").alias(alias))
        this
    }

    def registryPackage(subProjection: RegistryPackageResponseProjection): RegistryPackageVersionResponseProjection = {
        registryPackage(null.asInstanceOf[String], subProjection)
    }

    def registryPackage(alias: String, subProjection: RegistryPackageResponseProjection): RegistryPackageVersionResponseProjection = {
        fields.add(new GraphQLResponseField("registryPackage").alias(alias).projection(subProjection))
        this
    }

    def release(subProjection: ReleaseResponseProjection): RegistryPackageVersionResponseProjection = {
        release(null.asInstanceOf[String], subProjection)
    }

    def release(alias: String, subProjection: ReleaseResponseProjection): RegistryPackageVersionResponseProjection = {
        fields.add(new GraphQLResponseField("release").alias(alias).projection(subProjection))
        this
    }

    def sha256(): RegistryPackageVersionResponseProjection = {
        sha256(null.asInstanceOf[String])
    }

    def sha256(alias: String): RegistryPackageVersionResponseProjection = {
        fields.add(new GraphQLResponseField("sha256").alias(alias))
        this
    }

    def size(): RegistryPackageVersionResponseProjection = {
        size(null.asInstanceOf[String])
    }

    def size(alias: String): RegistryPackageVersionResponseProjection = {
        fields.add(new GraphQLResponseField("size").alias(alias))
        this
    }

    def statistics(subProjection: RegistryPackageVersionStatisticsResponseProjection): RegistryPackageVersionResponseProjection = {
        statistics(null.asInstanceOf[String], subProjection)
    }

    def statistics(alias: String, subProjection: RegistryPackageVersionStatisticsResponseProjection): RegistryPackageVersionResponseProjection = {
        fields.add(new GraphQLResponseField("statistics").alias(alias).projection(subProjection))
        this
    }

    def summary(): RegistryPackageVersionResponseProjection = {
        summary(null.asInstanceOf[String])
    }

    def summary(alias: String): RegistryPackageVersionResponseProjection = {
        fields.add(new GraphQLResponseField("summary").alias(alias))
        this
    }

    def updatedAt(): RegistryPackageVersionResponseProjection = {
        updatedAt(null.asInstanceOf[String])
    }

    def updatedAt(alias: String): RegistryPackageVersionResponseProjection = {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias))
        this
    }

    def version(): RegistryPackageVersionResponseProjection = {
        version(null.asInstanceOf[String])
    }

    def version(alias: String): RegistryPackageVersionResponseProjection = {
        fields.add(new GraphQLResponseField("version").alias(alias))
        this
    }

    def viewerCanEdit(): RegistryPackageVersionResponseProjection = {
        viewerCanEdit(null.asInstanceOf[String])
    }

    def viewerCanEdit(alias: String): RegistryPackageVersionResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanEdit").alias(alias))
        this
    }

    def typename(): RegistryPackageVersionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): RegistryPackageVersionResponseProjection = {
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
        val that = obj.asInstanceOf[RegistryPackageVersionResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
