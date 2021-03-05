package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class CreateProjectInputTO(
    val body: String?,
    val clientMutationId: String?,
    val name: String,
    val ownerId: String,
    val repositoryIds: List<String>?,
    val template: ProjectTemplateTO?
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
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        joiner.add("ownerId: " + GraphQLRequestSerializer.getEntry(ownerId))
        if (repositoryIds != null) {
            joiner.add("repositoryIds: " + GraphQLRequestSerializer.getEntry(repositoryIds))
        }
        if (template != null) {
            joiner.add("template: " + GraphQLRequestSerializer.getEntry(template))
        }
        return joiner.toString()
    }
}
