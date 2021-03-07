package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class SearchResultItemConnectionTO(
    codeCount: Int,
    edges: Seq[SearchResultItemEdgeTO],
    issueCount: Int,
    nodes: Seq[SearchResultItemTO],
    @javax.validation.constraints.NotNull
    pageInfo: PageInfoTO,
    repositoryCount: Int,
    userCount: Int,
    wikiCount: Int
) {

    override def toString(): String = {
        Seq(
            "codeCount: " + GraphQLRequestSerializer.getEntry(codeCount),
            if (edges != null) "edges: " + GraphQLRequestSerializer.getEntry(edges.asJava) else "",
            "issueCount: " + GraphQLRequestSerializer.getEntry(issueCount),
            if (nodes != null) "nodes: " + GraphQLRequestSerializer.getEntry(nodes.asJava) else "",
            if (pageInfo != null) "pageInfo: " + GraphQLRequestSerializer.getEntry(pageInfo) else "",
            "repositoryCount: " + GraphQLRequestSerializer.getEntry(repositoryCount),
            "userCount: " + GraphQLRequestSerializer.getEntry(userCount),
            "wikiCount: " + GraphQLRequestSerializer.getEntry(wikiCount)
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object SearchResultItemConnectionTO {

    def builder(): SearchResultItemConnectionTO.Builder = new Builder()

    class Builder {

        private var codeCount: Int = _
        private var edges: Seq[SearchResultItemEdgeTO] = _
        private var issueCount: Int = _
        private var nodes: Seq[SearchResultItemTO] = _
        private var pageInfo: PageInfoTO = _
        private var repositoryCount: Int = _
        private var userCount: Int = _
        private var wikiCount: Int = _

        def setCodeCount(codeCount: Int): Builder = {
            this.codeCount = codeCount
            this
        }

        def setEdges(edges: Seq[SearchResultItemEdgeTO]): Builder = {
            this.edges = edges
            this
        }

        def setIssueCount(issueCount: Int): Builder = {
            this.issueCount = issueCount
            this
        }

        def setNodes(nodes: Seq[SearchResultItemTO]): Builder = {
            this.nodes = nodes
            this
        }

        def setPageInfo(pageInfo: PageInfoTO): Builder = {
            this.pageInfo = pageInfo
            this
        }

        def setRepositoryCount(repositoryCount: Int): Builder = {
            this.repositoryCount = repositoryCount
            this
        }

        def setUserCount(userCount: Int): Builder = {
            this.userCount = userCount
            this
        }

        def setWikiCount(wikiCount: Int): Builder = {
            this.wikiCount = wikiCount
            this
        }

        def build(): SearchResultItemConnectionTO = new SearchResultItemConnectionTO(codeCount, edges, issueCount, nodes, pageInfo, repositoryCount, userCount, wikiCount)

    }
}
