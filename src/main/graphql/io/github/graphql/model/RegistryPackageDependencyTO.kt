package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class RegistryPackageDependencyTO(
    val dependencyType: RegistryPackageDependencyTypeTO,
    override
    val id: String,
    val name: String,
    val version: String
) : NodeTO {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("dependencyType: " + GraphQLRequestSerializer.getEntry(dependencyType))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        joiner.add("version: " + GraphQLRequestSerializer.getEntry(version))
        return joiner.toString()
    }
}
