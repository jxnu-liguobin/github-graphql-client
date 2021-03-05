package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RegistryPackageDependency
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
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


}
