package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class ReactionConnectionTO implements java.io.Serializable {

    private java.util.List<ReactionEdgeTO> edges;
    private java.util.List<ReactionTO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoTO pageInfo;
    private int totalCount;
    private boolean viewerHasReacted;

    public ReactionConnectionTO() {
    }

    public ReactionConnectionTO(java.util.List<ReactionEdgeTO> edges, java.util.List<ReactionTO> nodes, PageInfoTO pageInfo, int totalCount, boolean viewerHasReacted) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
        this.viewerHasReacted = viewerHasReacted;
    }

    public java.util.List<ReactionEdgeTO> getEdges() {
        return edges;
    }

    public java.util.List<ReactionTO> getNodes() {
        return nodes;
    }

    public PageInfoTO getPageInfo() {
        return pageInfo;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public boolean getViewerHasReacted() {
        return viewerHasReacted;
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
        joiner.add("viewerHasReacted: " + GraphQLRequestSerializer.getEntry(viewerHasReacted));
        return joiner.toString();
    }

    public static ReactionConnectionTO.Builder builder() {
        return new ReactionConnectionTO.Builder();
    }

    public static class Builder {

        private java.util.List<ReactionEdgeTO> edges;
        private java.util.List<ReactionTO> nodes;
        private PageInfoTO pageInfo;
        private int totalCount;
        private boolean viewerHasReacted;

        public Builder() {
        }

        public Builder setEdges(java.util.List<ReactionEdgeTO> edges) {
            this.edges = edges;
            return this;
        }

        public Builder setNodes(java.util.List<ReactionTO> nodes) {
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

        public Builder setViewerHasReacted(boolean viewerHasReacted) {
            this.viewerHasReacted = viewerHasReacted;
            return this;
        }


        public ReactionConnectionTO build() {
            return new ReactionConnectionTO(edges, nodes, pageInfo, totalCount, viewerHasReacted);
        }

    }
}
