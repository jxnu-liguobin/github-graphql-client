package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class SearchResultItemConnectionTO implements java.io.Serializable {

    private int codeCount;
    private java.util.List<SearchResultItemEdgeTO> edges;
    private int issueCount;
    private java.util.List<SearchResultItemTO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoTO pageInfo;
    private int repositoryCount;
    private int userCount;
    private int wikiCount;

    public SearchResultItemConnectionTO() {
    }

    public SearchResultItemConnectionTO(int codeCount, java.util.List<SearchResultItemEdgeTO> edges, int issueCount, java.util.List<SearchResultItemTO> nodes, PageInfoTO pageInfo, int repositoryCount, int userCount, int wikiCount) {
        this.codeCount = codeCount;
        this.edges = edges;
        this.issueCount = issueCount;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.repositoryCount = repositoryCount;
        this.userCount = userCount;
        this.wikiCount = wikiCount;
    }

    public int getCodeCount() {
        return codeCount;
    }

    public java.util.List<SearchResultItemEdgeTO> getEdges() {
        return edges;
    }

    public int getIssueCount() {
        return issueCount;
    }

    public java.util.List<SearchResultItemTO> getNodes() {
        return nodes;
    }

    public PageInfoTO getPageInfo() {
        return pageInfo;
    }

    public int getRepositoryCount() {
        return repositoryCount;
    }

    public int getUserCount() {
        return userCount;
    }

    public int getWikiCount() {
        return wikiCount;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("codeCount: " + GraphQLRequestSerializer.getEntry(codeCount));
        if (edges != null) {
            joiner.add("edges: " + GraphQLRequestSerializer.getEntry(edges));
        }
        joiner.add("issueCount: " + GraphQLRequestSerializer.getEntry(issueCount));
        if (nodes != null) {
            joiner.add("nodes: " + GraphQLRequestSerializer.getEntry(nodes));
        }
        if (pageInfo != null) {
            joiner.add("pageInfo: " + GraphQLRequestSerializer.getEntry(pageInfo));
        }
        joiner.add("repositoryCount: " + GraphQLRequestSerializer.getEntry(repositoryCount));
        joiner.add("userCount: " + GraphQLRequestSerializer.getEntry(userCount));
        joiner.add("wikiCount: " + GraphQLRequestSerializer.getEntry(wikiCount));
        return joiner.toString();
    }

    public static SearchResultItemConnectionTO.Builder builder() {
        return new SearchResultItemConnectionTO.Builder();
    }

    public static class Builder {

        private int codeCount;
        private java.util.List<SearchResultItemEdgeTO> edges;
        private int issueCount;
        private java.util.List<SearchResultItemTO> nodes;
        private PageInfoTO pageInfo;
        private int repositoryCount;
        private int userCount;
        private int wikiCount;

        public Builder() {
        }

        public Builder setCodeCount(int codeCount) {
            this.codeCount = codeCount;
            return this;
        }

        public Builder setEdges(java.util.List<SearchResultItemEdgeTO> edges) {
            this.edges = edges;
            return this;
        }

        public Builder setIssueCount(int issueCount) {
            this.issueCount = issueCount;
            return this;
        }

        public Builder setNodes(java.util.List<SearchResultItemTO> nodes) {
            this.nodes = nodes;
            return this;
        }

        public Builder setPageInfo(PageInfoTO pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        public Builder setRepositoryCount(int repositoryCount) {
            this.repositoryCount = repositoryCount;
            return this;
        }

        public Builder setUserCount(int userCount) {
            this.userCount = userCount;
            return this;
        }

        public Builder setWikiCount(int wikiCount) {
            this.wikiCount = wikiCount;
            return this;
        }


        public SearchResultItemConnectionTO build() {
            return new SearchResultItemConnectionTO(codeCount, edges, issueCount, nodes, pageInfo, repositoryCount, userCount, wikiCount);
        }

    }
}
