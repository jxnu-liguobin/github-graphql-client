package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class IssueTimelineConnectionTO implements java.io.Serializable {

    private java.util.List<IssueTimelineItemEdgeTO> edges;
    private java.util.List<IssueTimelineItemTO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoTO pageInfo;
    private int totalCount;

    public IssueTimelineConnectionTO() {
    }

    public IssueTimelineConnectionTO(java.util.List<IssueTimelineItemEdgeTO> edges, java.util.List<IssueTimelineItemTO> nodes, PageInfoTO pageInfo, int totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public java.util.List<IssueTimelineItemEdgeTO> getEdges() {
        return edges;
    }

    public java.util.List<IssueTimelineItemTO> getNodes() {
        return nodes;
    }

    public PageInfoTO getPageInfo() {
        return pageInfo;
    }

    public int getTotalCount() {
        return totalCount;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (edges != null) {
            joiner.add("edges: " + GraphQLRequestSerializer.getEntry(edges));
        }
        if (nodes != null) {
            joiner.add("nodes: " + GraphQLRequestSerializer.getEntry(nodes));
        }
        if (pageInfo != null) {
            joiner.add("pageInfo: " + GraphQLRequestSerializer.getEntry(pageInfo));
        }
        joiner.add("totalCount: " + GraphQLRequestSerializer.getEntry(totalCount));
        return joiner.toString();
    }

    public static IssueTimelineConnectionTO.Builder builder() {
        return new IssueTimelineConnectionTO.Builder();
    }

    public static class Builder {

        private java.util.List<IssueTimelineItemEdgeTO> edges;
        private java.util.List<IssueTimelineItemTO> nodes;
        private PageInfoTO pageInfo;
        private int totalCount;

        public Builder() {
        }

        public Builder setEdges(java.util.List<IssueTimelineItemEdgeTO> edges) {
            this.edges = edges;
            return this;
        }

        public Builder setNodes(java.util.List<IssueTimelineItemTO> nodes) {
            this.nodes = nodes;
            return this;
        }

        public Builder setPageInfo(PageInfoTO pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        public Builder setTotalCount(int totalCount) {
            this.totalCount = totalCount;
            return this;
        }


        public IssueTimelineConnectionTO build() {
            return new IssueTimelineConnectionTO(edges, nodes, pageInfo, totalCount);
        }

    }
}
