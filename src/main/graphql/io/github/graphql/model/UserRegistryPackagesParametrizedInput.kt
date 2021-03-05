package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import java.util.StringJoiner
/**
 * Parametrized input for field registryPackages in type User
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
data class UserRegistryPackagesParametrizedInput(
    val after: String?,
    val before: String?,
    val first: Int?,
    val last: Int?,
    val name: String?,
    val names: List<String?>?,
    val packageType: RegistryPackageTypeTO?,
    val publicOnly: Boolean? = false,
    val registryPackageType: String?,
    val repositoryId: String?
) : GraphQLParametrizedInput {

    override fun toString(): String {
        val joiner = StringJoiner(", ", "( ", " )")
        if (after != null) {
            joiner.add("after: " + GraphQLRequestSerializer.getEntry(after))
        }
        if (before != null) {
            joiner.add("before: " + GraphQLRequestSerializer.getEntry(before))
        }
        if (first != null) {
            joiner.add("first: " + GraphQLRequestSerializer.getEntry(first))
        }
        if (last != null) {
            joiner.add("last: " + GraphQLRequestSerializer.getEntry(last))
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        }
        if (names != null) {
            joiner.add("names: " + GraphQLRequestSerializer.getEntry(names))
        }
        if (packageType != null) {
            joiner.add("packageType: " + GraphQLRequestSerializer.getEntry(packageType))
        }
        if (publicOnly != null) {
            joiner.add("publicOnly: " + GraphQLRequestSerializer.getEntry(publicOnly))
        }
        if (registryPackageType != null) {
            joiner.add("registryPackageType: " + GraphQLRequestSerializer.getEntry(registryPackageType))
        }
        if (repositoryId != null) {
            joiner.add("repositoryId: " + GraphQLRequestSerializer.getEntry(repositoryId))
        }
        return joiner.toString()
    }
}
