package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class TreeTO(
    override
    val abbreviatedOid: String,
    override
    val commitResourcePath: String,
    override
    val commitUrl: String,
    val entries: List<TreeEntryTO>?,
    override
    val id: String,
    override
    val oid: String,
    override
    val repository: RepositoryTO
) : GitObjectTO, NodeTO {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("abbreviatedOid: " + GraphQLRequestSerializer.getEntry(abbreviatedOid))
        joiner.add("commitResourcePath: " + GraphQLRequestSerializer.getEntry(commitResourcePath))
        joiner.add("commitUrl: " + GraphQLRequestSerializer.getEntry(commitUrl))
        if (entries != null) {
            joiner.add("entries: " + GraphQLRequestSerializer.getEntry(entries))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("oid: " + GraphQLRequestSerializer.getEntry(oid))
        joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository))
        return joiner.toString()
    }
}
