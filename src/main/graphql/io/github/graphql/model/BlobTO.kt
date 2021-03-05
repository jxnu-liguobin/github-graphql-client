package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class BlobTO(
    override
    val abbreviatedOid: String,
    val byteSize: Int,
    override
    val commitResourcePath: String,
    override
    val commitUrl: String,
    override
    val id: String,
    val isBinary: Boolean,
    val isTruncated: Boolean,
    override
    val oid: String,
    override
    val repository: RepositoryTO,
    val text: String?
) : GitObjectTO, NodeTO {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("abbreviatedOid: " + GraphQLRequestSerializer.getEntry(abbreviatedOid))
        joiner.add("byteSize: " + GraphQLRequestSerializer.getEntry(byteSize))
        joiner.add("commitResourcePath: " + GraphQLRequestSerializer.getEntry(commitResourcePath))
        joiner.add("commitUrl: " + GraphQLRequestSerializer.getEntry(commitUrl))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("isBinary: " + GraphQLRequestSerializer.getEntry(isBinary))
        joiner.add("isTruncated: " + GraphQLRequestSerializer.getEntry(isTruncated))
        joiner.add("oid: " + GraphQLRequestSerializer.getEntry(oid))
        joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository))
        if (text != null) {
            joiner.add("text: " + GraphQLRequestSerializer.getEntry(text))
        }
        return joiner.toString()
    }
}
