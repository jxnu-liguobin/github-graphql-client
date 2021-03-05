package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class SearchResultItemConnectionTO(
    val codeCount: Int,
    val edges: List<SearchResultItemEdgeTO?>?,
    val issueCount: Int,
    val nodes: List<SearchResultItemTO?>?,
    val pageInfo: PageInfoTO,
    val repositoryCount: Int,
    val userCount: Int,
    val wikiCount: Int
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("codeCount: " + GraphQLRequestSerializer.getEntry(codeCount))
        if (edges != null) {
            joiner.add("edges: " + GraphQLRequestSerializer.getEntry(edges))
        }
        joiner.add("issueCount: " + GraphQLRequestSerializer.getEntry(issueCount))
        if (nodes != null) {
            joiner.add("nodes: " + GraphQLRequestSerializer.getEntry(nodes))
        }
        joiner.add("pageInfo: " + GraphQLRequestSerializer.getEntry(pageInfo))
        joiner.add("repositoryCount: " + GraphQLRequestSerializer.getEntry(repositoryCount))
        joiner.add("userCount: " + GraphQLRequestSerializer.getEntry(userCount))
        joiner.add("wikiCount: " + GraphQLRequestSerializer.getEntry(wikiCount))
        return joiner.toString()
    }
}
