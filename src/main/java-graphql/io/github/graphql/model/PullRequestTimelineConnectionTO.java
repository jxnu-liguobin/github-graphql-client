package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class PullRequestTimelineConnectionTO implements java.io.Serializable {

    private java.util.List<PullRequestTimelineItemEdgeTO> edges;
    private java.util.List<PullRequestTimelineItemTO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoTO pageInfo;
    private int totalCount;

    public PullRequestTimelineConnectionTO() {
    }

    public PullRequestTimelineConnectionTO(java.util.List<PullRequestTimelineItemEdgeTO> edges, java.util.List<PullRequestTimelineItemTO> nodes, PageInfoTO pageInfo, int totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public java.util.List<PullRequestTimelineItemEdgeTO> getEdges() {
        return edges;
    }

    public java.util.List<PullRequestTimelineItemTO> getNodes() {
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

    public static PullRequestTimelineConnectionTO.Builder builder() {
        return new PullRequestTimelineConnectionTO.Builder();
    }

    public static class Builder {

        private java.util.List<PullRequestTimelineItemEdgeTO> edges;
        private java.util.List<PullRequestTimelineItemTO> nodes;
        private PageInfoTO pageInfo;
        private int totalCount;

        public Builder() {
        }

        public Builder setEdges(java.util.List<PullRequestTimelineItemEdgeTO> edges) {
            this.edges = edges;
            return this;
        }

        public Builder setNodes(java.util.List<PullRequestTimelineItemTO> nodes) {
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


        public PullRequestTimelineConnectionTO build() {
            return new PullRequestTimelineConnectionTO(edges, nodes, pageInfo, totalCount);
        }

    }
}
