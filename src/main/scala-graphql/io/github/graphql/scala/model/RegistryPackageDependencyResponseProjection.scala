package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for RegistryPackageDependency
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
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

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[RegistryPackageDependencyResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
