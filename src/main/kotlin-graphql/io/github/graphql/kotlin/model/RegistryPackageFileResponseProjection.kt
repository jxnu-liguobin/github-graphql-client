package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for RegistryPackageFile
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class RegistryPackageFileResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): RegistryPackageFileResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): RegistryPackageFileResponseProjection {
        this.guid()
        this.id()
        this.md5()
        this.metadataUrl()
        this.name()
        if (projectionDepthOnFields.getOrDefault("RegistryPackageFileResponseProjection.RegistryPackageVersionResponseProjection.packageVersion", 0) <= maxDepth) {
            projectionDepthOnFields["RegistryPackageFileResponseProjection.RegistryPackageVersionResponseProjection.packageVersion"] = projectionDepthOnFields.getOrDefault("RegistryPackageFileResponseProjection.RegistryPackageVersionResponseProjection.packageVersion", 0) + 1
            this.packageVersion(RegistryPackageVersionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageFileResponseProjection.RegistryPackageVersionResponseProjection.packageVersion", 0)))
        }
        this.sha1()
        this.sha256()
        this.size()
        this.updatedAt()
        this.url()
        this.typename()
        return this
    }

    fun guid(): RegistryPackageFileResponseProjection = guid(null)

    fun guid(alias: String?): RegistryPackageFileResponseProjection {
        fields.add(GraphQLResponseField("guid").alias(alias))
        return this
    }

    fun id(): RegistryPackageFileResponseProjection = id(null)

    fun id(alias: String?): RegistryPackageFileResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun md5(): RegistryPackageFileResponseProjection = md5(null)

    fun md5(alias: String?): RegistryPackageFileResponseProjection {
        fields.add(GraphQLResponseField("md5").alias(alias))
        return this
    }

    fun metadataUrl(): RegistryPackageFileResponseProjection = metadataUrl(null)

    fun metadataUrl(alias: String?): RegistryPackageFileResponseProjection {
        fields.add(GraphQLResponseField("metadataUrl").alias(alias))
        return this
    }

    fun name(): RegistryPackageFileResponseProjection = name(null)

    fun name(alias: String?): RegistryPackageFileResponseProjection {
        fields.add(GraphQLResponseField("name").alias(alias))
        return this
    }

    fun packageVersion(subProjection: RegistryPackageVersionResponseProjection): RegistryPackageFileResponseProjection = packageVersion(null, subProjection)

    fun packageVersion(alias: String?, subProjection: RegistryPackageVersionResponseProjection): RegistryPackageFileResponseProjection {
        fields.add(GraphQLResponseField("packageVersion").alias(alias).projection(subProjection))
        return this
    }

    fun sha1(): RegistryPackageFileResponseProjection = sha1(null)

    fun sha1(alias: String?): RegistryPackageFileResponseProjection {
        fields.add(GraphQLResponseField("sha1").alias(alias))
        return this
    }

    fun sha256(): RegistryPackageFileResponseProjection = sha256(null)

    fun sha256(alias: String?): RegistryPackageFileResponseProjection {
        fields.add(GraphQLResponseField("sha256").alias(alias))
        return this
    }

    fun size(): RegistryPackageFileResponseProjection = size(null)

    fun size(alias: String?): RegistryPackageFileResponseProjection {
        fields.add(GraphQLResponseField("size").alias(alias))
        return this
    }

    fun updatedAt(): RegistryPackageFileResponseProjection = updatedAt(null)

    fun updatedAt(alias: String?): RegistryPackageFileResponseProjection {
        fields.add(GraphQLResponseField("updatedAt").alias(alias))
        return this
    }

    fun url(): RegistryPackageFileResponseProjection = url(null)

    fun url(alias: String?): RegistryPackageFileResponseProjection {
        fields.add(GraphQLResponseField("url").alias(alias))
        return this
    }

    fun typename(): RegistryPackageFileResponseProjection = typename(null)

    fun typename(alias: String?): RegistryPackageFileResponseProjection {
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
        val that = other as RegistryPackageFileResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
