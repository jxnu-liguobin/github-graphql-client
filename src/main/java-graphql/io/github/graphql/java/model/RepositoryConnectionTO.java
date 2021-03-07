package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class RepositoryConnectionTO implements java.io.Serializable {

    private java.util.List<RepositoryEdgeTO> edges;
    private java.util.List<RepositoryTO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoTO pageInfo;
    private int totalCount;
    private int totalDiskUsage;

    public RepositoryConnectionTO() {
    }

    public RepositoryConnectionTO(java.util.List<RepositoryEdgeTO> edges, java.util.List<RepositoryTO> nodes, PageInfoTO pageInfo, int totalCount, int totalDiskUsage) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
        this.totalDiskUsage = totalDiskUsage;
    }

    public java.util.List<RepositoryEdgeTO> getEdges() {
        return edges;
    }

    public java.util.List<RepositoryTO> getNodes() {
        return nodes;
    }

    public PageInfoTO getPageInfo() {
        return pageInfo;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public int getTotalDiskUsage() {
        return totalDiskUsage;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final RepositoryConnectionTO that = (RepositoryConnectionTO) obj;
        return Objects.equals(edges, that.edges)
            && Objects.equals(nodes, that.nodes)
            && Objects.equals(pageInfo, that.pageInfo)
            && Objects.equals(totalCount, that.totalCount)
            && Objects.equals(totalDiskUsage, that.totalDiskUsage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(edges, nodes, pageInfo, totalCount, totalDiskUsage);
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
        joiner.add("totalDiskUsage: " + GraphQLRequestSerializer.getEntry(totalDiskUsage));
        return joiner.toString();
    }

    public static RepositoryConnectionTO.Builder builder() {
        return new RepositoryConnectionTO.Builder();
    }

    public static class Builder {

        private java.util.List<RepositoryEdgeTO> edges;
        private java.util.List<RepositoryTO> nodes;
        private PageInfoTO pageInfo;
        private int totalCount;
        private int totalDiskUsage;

        public Builder() {
        }

        public Builder setEdges(java.util.List<RepositoryEdgeTO> edges) {
            this.edges = edges;
            return this;
        }

        public Builder setNodes(java.util.List<RepositoryTO> nodes) {
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

        public Builder setTotalDiskUsage(int totalDiskUsage) {
            this.totalDiskUsage = totalDiskUsage;
            return this;
        }


        public RepositoryConnectionTO build() {
            return new RepositoryConnectionTO(edges, nodes, pageInfo, totalCount, totalDiskUsage);
        }

    }
}
