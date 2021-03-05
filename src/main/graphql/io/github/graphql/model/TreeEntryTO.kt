package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class TreeEntryTO(
    val mode: Int,
    val name: String,
    val `object`: GitObjectTO?,
    val oid: String,
    val repository: RepositoryTO,
    val type: String
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("mode: " + GraphQLRequestSerializer.getEntry(mode))
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        if (`object` != null) {
            joiner.add("object: " + GraphQLRequestSerializer.getEntry(`object`))
        }
        joiner.add("oid: " + GraphQLRequestSerializer.getEntry(oid))
        joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository))
        joiner.add("type: " + GraphQLRequestSerializer.getEntry(type))
        return joiner.toString()
    }
}
