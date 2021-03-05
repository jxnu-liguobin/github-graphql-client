package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class TagTO(
    override
    val abbreviatedOid: String,
    override
    val commitResourcePath: String,
    override
    val commitUrl: String,
    override
    val id: String,
    val message: String?,
    val name: String,
    override
    val oid: String,
    override
    val repository: RepositoryTO,
    val tagger: GitActorTO?,
    val target: GitObjectTO
) : GitObjectTO, NodeTO {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("abbreviatedOid: " + GraphQLRequestSerializer.getEntry(abbreviatedOid))
        joiner.add("commitResourcePath: " + GraphQLRequestSerializer.getEntry(commitResourcePath))
        joiner.add("commitUrl: " + GraphQLRequestSerializer.getEntry(commitUrl))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        if (message != null) {
            joiner.add("message: " + GraphQLRequestSerializer.getEntry(message))
        }
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        joiner.add("oid: " + GraphQLRequestSerializer.getEntry(oid))
        joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository))
        if (tagger != null) {
            joiner.add("tagger: " + GraphQLRequestSerializer.getEntry(tagger))
        }
        joiner.add("target: " + GraphQLRequestSerializer.getEntry(target))
        return joiner.toString()
    }
}
