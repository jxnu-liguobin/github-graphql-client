package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class ImportProjectInputTO(
    val body: String?,
    val clientMutationId: String?,
    val columnImports: List<ProjectColumnImportTO>,
    val name: String,
    val ownerName: String,
    val public: Boolean? = false
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (body != null) {
            joiner.add("body: " + GraphQLRequestSerializer.getEntry(body))
        }
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        joiner.add("columnImports: " + GraphQLRequestSerializer.getEntry(columnImports))
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        joiner.add("ownerName: " + GraphQLRequestSerializer.getEntry(ownerName))
        if (public != null) {
            joiner.add("public: " + GraphQLRequestSerializer.getEntry(public))
        }
        return joiner.toString()
    }
}
