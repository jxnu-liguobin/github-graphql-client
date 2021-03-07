package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for RegistryPackageTag
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class RegistryPackageTagResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): RegistryPackageTagResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): RegistryPackageTagResponseProjection {
        this.id()
        this.name()
        if (projectionDepthOnFields.getOrDefault("RegistryPackageTagResponseProjection.RegistryPackageVersionResponseProjection.version", 0) <= maxDepth) {
            projectionDepthOnFields["RegistryPackageTagResponseProjection.RegistryPackageVersionResponseProjection.version"] = projectionDepthOnFields.getOrDefault("RegistryPackageTagResponseProjection.RegistryPackageVersionResponseProjection.version", 0) + 1
            this.version(RegistryPackageVersionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageTagResponseProjection.RegistryPackageVersionResponseProjection.version", 0)))
        }
        this.typename()
        return this
    }

    fun id(): RegistryPackageTagResponseProjection = id(null)

    fun id(alias: String?): RegistryPackageTagResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun name(): RegistryPackageTagResponseProjection = name(null)

    fun name(alias: String?): RegistryPackageTagResponseProjection {
        fields.add(GraphQLResponseField("name").alias(alias))
        return this
    }

    fun version(subProjection: RegistryPackageVersionResponseProjection): RegistryPackageTagResponseProjection = version(null, subProjection)

    fun version(alias: String?, subProjection: RegistryPackageVersionResponseProjection): RegistryPackageTagResponseProjection {
        fields.add(GraphQLResponseField("version").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): RegistryPackageTagResponseProjection = typename(null)

    fun typename(alias: String?): RegistryPackageTagResponseProjection {
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
        val that = other as RegistryPackageTagResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
