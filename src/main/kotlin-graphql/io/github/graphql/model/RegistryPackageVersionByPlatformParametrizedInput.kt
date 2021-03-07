package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import java.util.StringJoiner
/**
 * Parametrized input for field versionByPlatform in type RegistryPackage
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
data class RegistryPackageVersionByPlatformParametrizedInput(
    val platform: String,
    val version: String
) : GraphQLParametrizedInput {

    override fun toString(): String {
        val joiner = StringJoiner(", ", "( ", " )")
        joiner.add("platform: " + GraphQLRequestSerializer.getEntry(platform))
        joiner.add("version: " + GraphQLRequestSerializer.getEntry(version))
        return joiner.toString()
    }
}
