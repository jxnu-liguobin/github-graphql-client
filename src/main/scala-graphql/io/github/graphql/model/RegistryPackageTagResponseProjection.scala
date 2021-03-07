package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RegistryPackageTag
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class RegistryPackageTagResponseProjection extends GraphQLResponseProjection {

    override def all$(): RegistryPackageTagResponseProjection = all$(3)

    override def all$(maxDepth: Int): RegistryPackageTagResponseProjection = {
        this.id()
        this.name()
        if (projectionDepthOnFields.getOrDefault("RegistryPackageTagResponseProjection.RegistryPackageVersionResponseProjection.version", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageTagResponseProjection.RegistryPackageVersionResponseProjection.version", projectionDepthOnFields.getOrDefault("RegistryPackageTagResponseProjection.RegistryPackageVersionResponseProjection.version", 0) + 1)
            this.version(new RegistryPackageVersionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageTagResponseProjection.RegistryPackageVersionResponseProjection.version", 0)))
        }
        this.typename()
        this
    }

    def id(): RegistryPackageTagResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): RegistryPackageTagResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def name(): RegistryPackageTagResponseProjection = {
        name(null.asInstanceOf[String])
    }

    def name(alias: String): RegistryPackageTagResponseProjection = {
        fields.add(new GraphQLResponseField("name").alias(alias))
        this
    }

    def version(subProjection: RegistryPackageVersionResponseProjection): RegistryPackageTagResponseProjection = {
        version(null.asInstanceOf[String], subProjection)
    }

    def version(alias: String, subProjection: RegistryPackageVersionResponseProjection): RegistryPackageTagResponseProjection = {
        fields.add(new GraphQLResponseField("version").alias(alias).projection(subProjection))
        this
    }

    def typename(): RegistryPackageTagResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): RegistryPackageTagResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
