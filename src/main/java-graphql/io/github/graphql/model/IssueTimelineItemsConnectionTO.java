package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class IssueTimelineItemsConnectionTO implements java.io.Serializable {

    private java.util.List<IssueTimelineItemsEdgeTO> edges;
    private int filteredCount;
    private java.util.List<IssueTimelineItemsTO> nodes;
    private int pageCount;
    @javax.validation.constraints.NotNull
    private PageInfoTO pageInfo;
    private int totalCount;
    @javax.validation.constraints.NotNull
    private String updatedAt;

    public IssueTimelineItemsConnectionTO() {
    }

    public IssueTimelineItemsConnectionTO(java.util.List<IssueTimelineItemsEdgeTO> edges, int filteredCount, java.util.List<IssueTimelineItemsTO> nodes, int pageCount, PageInfoTO pageInfo, int totalCount, String updatedAt) {
        this.edges = edges;
        this.filteredCount = filteredCount;
        this.nodes = nodes;
        this.pageCount = pageCount;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
        this.updatedAt = updatedAt;
    }

    public java.util.List<IssueTimelineItemsEdgeTO> getEdges() {
        return edges;
    }

    public int getFilteredCount() {
        return filteredCount;
    }

    public java.util.List<IssueTimelineItemsTO> getNodes() {
        return nodes;
    }

    public int getPageCount() {
        return pageCount;
    }

    public PageInfoTO getPageInfo() {
        return pageInfo;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (edges != null) {
            joiner.add("edges: " + GraphQLRequestSerializer.getEntry(edges));
        }
        joiner.add("filteredCount: " + GraphQLRequestSerializer.getEntry(filteredCount));
        if (nodes != null) {
            joiner.add("nodes: " + GraphQLRequestSerializer.getEntry(nodes));
        }
        joiner.add("pageCount: " + GraphQLRequestSerializer.getEntry(pageCount));
        if (pageInfo != null) {
            joiner.add("pageInfo: " + GraphQLRequestSerializer.getEntry(pageInfo));
        }
        joiner.add("totalCount: " + GraphQLRequestSerializer.getEntry(totalCount));
        if (updatedAt != null) {
            joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt));
        }
        return joiner.toString();
    }

    public static IssueTimelineItemsConnectionTO.Builder builder() {
        return new IssueTimelineItemsConnectionTO.Builder();
    }

    public static class Builder {

        private java.util.List<IssueTimelineItemsEdgeTO> edges;
        private int filteredCount;
        private java.util.List<IssueTimelineItemsTO> nodes;
        private int pageCount;
        private PageInfoTO pageInfo;
        private int totalCount;
        private String updatedAt;

        public Builder() {
        }

        public Builder setEdges(java.util.List<IssueTimelineItemsEdgeTO> edges) {
            this.edges = edges;
            return this;
        }

        public Builder setFilteredCount(int filteredCount) {
            this.filteredCount = filteredCount;
            return this;
        }

        public Builder setNodes(java.util.List<IssueTimelineItemsTO> nodes) {
            this.nodes = nodes;
            return this;
        }

        public Builder setPageCount(int pageCount) {
            this.pageCount = pageCount;
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

        public Builder setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }


        public IssueTimelineItemsConnectionTO build() {
            return new IssueTimelineItemsConnectionTO(edges, filteredCount, nodes, pageCount, pageInfo, totalCount, updatedAt);
        }

    }
}
