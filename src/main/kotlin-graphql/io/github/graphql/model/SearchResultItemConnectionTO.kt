package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
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

    companion object {
        fun builder(): Builder = Builder()
    }

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

    class Builder {

        private var codeCount: Int = 0
        private var edges: List<SearchResultItemEdgeTO?>? = null
        private var issueCount: Int = 0
        private var nodes: List<SearchResultItemTO?>? = null
        private lateinit var pageInfo: PageInfoTO
        private var repositoryCount: Int = 0
        private var userCount: Int = 0
        private var wikiCount: Int = 0

        fun setCodeCount(codeCount: Int): Builder {
            this.codeCount = codeCount
            return this
        }

        fun setEdges(edges: List<SearchResultItemEdgeTO?>?): Builder {
            this.edges = edges
            return this
        }

        fun setIssueCount(issueCount: Int): Builder {
            this.issueCount = issueCount
            return this
        }

        fun setNodes(nodes: List<SearchResultItemTO?>?): Builder {
            this.nodes = nodes
            return this
        }

        fun setPageInfo(pageInfo: PageInfoTO): Builder {
            this.pageInfo = pageInfo
            return this
        }

        fun setRepositoryCount(repositoryCount: Int): Builder {
            this.repositoryCount = repositoryCount
            return this
        }

        fun setUserCount(userCount: Int): Builder {
            this.userCount = userCount
            return this
        }

        fun setWikiCount(wikiCount: Int): Builder {
            this.wikiCount = wikiCount
            return this
        }

        fun build(): SearchResultItemConnectionTO {
            return SearchResultItemConnectionTO(codeCount, edges, issueCount, nodes, pageInfo, repositoryCount, userCount, wikiCount)
        }
    }
}
