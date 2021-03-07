package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class PullRequestTimelineItemsConnectionTO implements java.io.Serializable {

    private java.util.List<PullRequestTimelineItemsEdgeTO> edges;
    private int filteredCount;
    private java.util.List<PullRequestTimelineItemsTO> nodes;
    private int pageCount;
    @javax.validation.constraints.NotNull
    private PageInfoTO pageInfo;
    private int totalCount;
    @javax.validation.constraints.NotNull
    private String updatedAt;

    public PullRequestTimelineItemsConnectionTO() {
    }

    public PullRequestTimelineItemsConnectionTO(java.util.List<PullRequestTimelineItemsEdgeTO> edges, int filteredCount, java.util.List<PullRequestTimelineItemsTO> nodes, int pageCount, PageInfoTO pageInfo, int totalCount, String updatedAt) {
        this.edges = edges;
        this.filteredCount = filteredCount;
        this.nodes = nodes;
        this.pageCount = pageCount;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
        this.updatedAt = updatedAt;
    }

    public java.util.List<PullRequestTimelineItemsEdgeTO> getEdges() {
        return edges;
    }

    public int getFilteredCount() {
        return filteredCount;
    }

    public java.util.List<PullRequestTimelineItemsTO> getNodes() {
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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final PullRequestTimelineItemsConnectionTO that = (PullRequestTimelineItemsConnectionTO) obj;
        return Objects.equals(edges, that.edges)
            && Objects.equals(filteredCount, that.filteredCount)
            && Objects.equals(nodes, that.nodes)
            && Objects.equals(pageCount, that.pageCount)
            && Objects.equals(pageInfo, that.pageInfo)
            && Objects.equals(totalCount, that.totalCount)
            && Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(edges, filteredCount, nodes, pageCount, pageInfo, totalCount, updatedAt);
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

    public static PullRequestTimelineItemsConnectionTO.Builder builder() {
        return new PullRequestTimelineItemsConnectionTO.Builder();
    }

    public static class Builder {

        private java.util.List<PullRequestTimelineItemsEdgeTO> edges;
        private int filteredCount;
        private java.util.List<PullRequestTimelineItemsTO> nodes;
        private int pageCount;
        private PageInfoTO pageInfo;
        private int totalCount;
        private String updatedAt;

        public Builder() {
        }

        public Builder setEdges(java.util.List<PullRequestTimelineItemsEdgeTO> edges) {
            this.edges = edges;
            return this;
        }

        public Builder setFilteredCount(int filteredCount) {
            this.filteredCount = filteredCount;
            return this;
        }

        public Builder setNodes(java.util.List<PullRequestTimelineItemsTO> nodes) {
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


        public PullRequestTimelineItemsConnectionTO build() {
            return new PullRequestTimelineItemsConnectionTO(edges, filteredCount, nodes, pageCount, pageInfo, totalCount, updatedAt);
        }

    }
}
