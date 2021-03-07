package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RegistryPackageDependency
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class RegistryPackageDependencyResponseProjection extends GraphQLResponseProjection {

    override def all$(): RegistryPackageDependencyResponseProjection = all$(3)

    override def all$(maxDepth: Int): RegistryPackageDependencyResponseProjection = {
        this.dependencyType()
        this.id()
        this.name()
        this.version()
        this.typename()
        this
    }

    def dependencyType(): RegistryPackageDependencyResponseProjection = {
        dependencyType(null.asInstanceOf[String])
    }

    def dependencyType(alias: String): RegistryPackageDependencyResponseProjection = {
        fields.add(new GraphQLResponseField("dependencyType").alias(alias))
        this
    }

    def id(): RegistryPackageDependencyResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): RegistryPackageDependencyResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def name(): RegistryPackageDependencyResponseProjection = {
        name(null.asInstanceOf[String])
    }

    def name(alias: String): RegistryPackageDependencyResponseProjection = {
        fields.add(new GraphQLResponseField("name").alias(alias))
        this
    }

    def version(): RegistryPackageDependencyResponseProjection = {
        version(null.asInstanceOf[String])
    }

    def version(alias: String): RegistryPackageDependencyResponseProjection = {
        fields.add(new GraphQLResponseField("version").alias(alias))
        this
    }

    def typename(): RegistryPackageDependencyResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): RegistryPackageDependencyResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
