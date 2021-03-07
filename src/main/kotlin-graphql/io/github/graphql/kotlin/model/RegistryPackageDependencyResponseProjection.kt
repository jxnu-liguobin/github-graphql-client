package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for RegistryPackageDependency
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class RegistryPackageDependencyResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): RegistryPackageDependencyResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): RegistryPackageDependencyResponseProjection {
        this.dependencyType()
        this.id()
        this.name()
        this.version()
        this.typename()
        return this
    }

    fun dependencyType(): RegistryPackageDependencyResponseProjection = dependencyType(null)

    fun dependencyType(alias: String?): RegistryPackageDependencyResponseProjection {
        fields.add(GraphQLResponseField("dependencyType").alias(alias))
        return this
    }

    fun id(): RegistryPackageDependencyResponseProjection = id(null)

    fun id(alias: String?): RegistryPackageDependencyResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun name(): RegistryPackageDependencyResponseProjection = name(null)

    fun name(alias: String?): RegistryPackageDependencyResponseProjection {
        fields.add(GraphQLResponseField("name").alias(alias))
        return this
    }

    fun version(): RegistryPackageDependencyResponseProjection = version(null)

    fun version(alias: String?): RegistryPackageDependencyResponseProjection {
        fields.add(GraphQLResponseField("version").alias(alias))
        return this
    }

    fun typename(): RegistryPackageDependencyResponseProjection = typename(null)

    fun typename(alias: String?): RegistryPackageDependencyResponseProjection {
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
        val that = other as RegistryPackageDependencyResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
