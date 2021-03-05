package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class RegistryPackageTO(
    val color: String,
    override
    val id: String,
    val latestVersion: RegistryPackageVersionTO?,
    val name: String,
    val nameWithOwner: String,
    val packageType: RegistryPackageTypeTO,
    val registryPackageType: String?,
    val repository: RepositoryTO?,
    val statistics: RegistryPackageStatisticsTO?
) : NodeTO {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("color: " + GraphQLRequestSerializer.getEntry(color))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        if (latestVersion != null) {
            joiner.add("latestVersion: " + GraphQLRequestSerializer.getEntry(latestVersion))
        }
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        joiner.add("nameWithOwner: " + GraphQLRequestSerializer.getEntry(nameWithOwner))
        joiner.add("packageType: " + GraphQLRequestSerializer.getEntry(packageType))
        if (registryPackageType != null) {
            joiner.add("registryPackageType: " + GraphQLRequestSerializer.getEntry(registryPackageType))
        }
        if (repository != null) {
            joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository))
        }
        if (statistics != null) {
            joiner.add("statistics: " + GraphQLRequestSerializer.getEntry(statistics))
        }
        return joiner.toString()
    }
}
