package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class CodeOfConductTO(
    val body: String?,
    override
    val id: String,
    val key: String,
    val name: String,
    val resourcePath: String?,
    val url: String?
) : NodeTO {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (body != null) {
            joiner.add("body: " + GraphQLRequestSerializer.getEntry(body))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("key: " + GraphQLRequestSerializer.getEntry(key))
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        if (resourcePath != null) {
            joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath))
        }
        if (url != null) {
            joiner.add("url: " + GraphQLRequestSerializer.getEntry(url))
        }
        return joiner.toString()
    }
}
