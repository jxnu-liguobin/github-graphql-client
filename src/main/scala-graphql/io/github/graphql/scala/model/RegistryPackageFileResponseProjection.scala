package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for RegistryPackageFile
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class RegistryPackageFileResponseProjection extends GraphQLResponseProjection {

    override def all$(): RegistryPackageFileResponseProjection = all$(3)

    override def all$(maxDepth: Int): RegistryPackageFileResponseProjection = {
        this.guid()
        this.id()
        this.md5()
        this.metadataUrl()
        this.name()
        if (projectionDepthOnFields.getOrDefault("RegistryPackageFileResponseProjection.RegistryPackageVersionResponseProjection.packageVersion", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageFileResponseProjection.RegistryPackageVersionResponseProjection.packageVersion", projectionDepthOnFields.getOrDefault("RegistryPackageFileResponseProjection.RegistryPackageVersionResponseProjection.packageVersion", 0) + 1)
            this.packageVersion(new RegistryPackageVersionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageFileResponseProjection.RegistryPackageVersionResponseProjection.packageVersion", 0)))
        }
        this.sha1()
        this.sha256()
        this.size()
        this.updatedAt()
        this.url()
        this.typename()
        this
    }

    def guid(): RegistryPackageFileResponseProjection = {
        guid(null.asInstanceOf[String])
    }

    def guid(alias: String): RegistryPackageFileResponseProjection = {
        fields.add(new GraphQLResponseField("guid").alias(alias))
        this
    }

    def id(): RegistryPackageFileResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): RegistryPackageFileResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def md5(): RegistryPackageFileResponseProjection = {
        md5(null.asInstanceOf[String])
    }

    def md5(alias: String): RegistryPackageFileResponseProjection = {
        fields.add(new GraphQLResponseField("md5").alias(alias))
        this
    }

    def metadataUrl(): RegistryPackageFileResponseProjection = {
        metadataUrl(null.asInstanceOf[String])
    }

    def metadataUrl(alias: String): RegistryPackageFileResponseProjection = {
        fields.add(new GraphQLResponseField("metadataUrl").alias(alias))
        this
    }

    def name(): RegistryPackageFileResponseProjection = {
        name(null.asInstanceOf[String])
    }

    def name(alias: String): RegistryPackageFileResponseProjection = {
        fields.add(new GraphQLResponseField("name").alias(alias))
        this
    }

    def packageVersion(subProjection: RegistryPackageVersionResponseProjection): RegistryPackageFileResponseProjection = {
        packageVersion(null.asInstanceOf[String], subProjection)
    }

    def packageVersion(alias: String, subProjection: RegistryPackageVersionResponseProjection): RegistryPackageFileResponseProjection = {
        fields.add(new GraphQLResponseField("packageVersion").alias(alias).projection(subProjection))
        this
    }

    def sha1(): RegistryPackageFileResponseProjection = {
        sha1(null.asInstanceOf[String])
    }

    def sha1(alias: String): RegistryPackageFileResponseProjection = {
        fields.add(new GraphQLResponseField("sha1").alias(alias))
        this
    }

    def sha256(): RegistryPackageFileResponseProjection = {
        sha256(null.asInstanceOf[String])
    }

    def sha256(alias: String): RegistryPackageFileResponseProjection = {
        fields.add(new GraphQLResponseField("sha256").alias(alias))
        this
    }

    def size(): RegistryPackageFileResponseProjection = {
        size(null.asInstanceOf[String])
    }

    def size(alias: String): RegistryPackageFileResponseProjection = {
        fields.add(new GraphQLResponseField("size").alias(alias))
        this
    }

    def updatedAt(): RegistryPackageFileResponseProjection = {
        updatedAt(null.asInstanceOf[String])
    }

    def updatedAt(alias: String): RegistryPackageFileResponseProjection = {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias))
        this
    }

    def url(): RegistryPackageFileResponseProjection = {
        url(null.asInstanceOf[String])
    }

    def url(alias: String): RegistryPackageFileResponseProjection = {
        fields.add(new GraphQLResponseField("url").alias(alias))
        this
    }

    def typename(): RegistryPackageFileResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): RegistryPackageFileResponseProjection = {
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
        val that = obj.asInstanceOf[RegistryPackageFileResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
