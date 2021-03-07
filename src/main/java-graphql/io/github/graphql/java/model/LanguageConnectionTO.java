package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class LanguageConnectionTO implements java.io.Serializable {

    private java.util.List<LanguageEdgeTO> edges;
    private java.util.List<LanguageTO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoTO pageInfo;
    private int totalCount;
    private int totalSize;

    public LanguageConnectionTO() {
    }

    public LanguageConnectionTO(java.util.List<LanguageEdgeTO> edges, java.util.List<LanguageTO> nodes, PageInfoTO pageInfo, int totalCount, int totalSize) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
        this.totalSize = totalSize;
    }

    public java.util.List<LanguageEdgeTO> getEdges() {
        return edges;
    }

    public java.util.List<LanguageTO> getNodes() {
        return nodes;
    }

    public PageInfoTO getPageInfo() {
        return pageInfo;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public int getTotalSize() {
        return totalSize;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final LanguageConnectionTO that = (LanguageConnectionTO) obj;
        return Objects.equals(edges, that.edges)
            && Objects.equals(nodes, that.nodes)
            && Objects.equals(pageInfo, that.pageInfo)
            && Objects.equals(totalCount, that.totalCount)
            && Objects.equals(totalSize, that.totalSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(edges, nodes, pageInfo, totalCount, totalSize);
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
        joiner.add("totalSize: " + GraphQLRequestSerializer.getEntry(totalSize));
        return joiner.toString();
    }

    public static LanguageConnectionTO.Builder builder() {
        return new LanguageConnectionTO.Builder();
    }

    public static class Builder {

        private java.util.List<LanguageEdgeTO> edges;
        private java.util.List<LanguageTO> nodes;
        private PageInfoTO pageInfo;
        private int totalCount;
        private int totalSize;

        public Builder() {
        }

        public Builder setEdges(java.util.List<LanguageEdgeTO> edges) {
            this.edges = edges;
            return this;
        }

        public Builder setNodes(java.util.List<LanguageTO> nodes) {
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

        public Builder setTotalSize(int totalSize) {
            this.totalSize = totalSize;
            return this;
        }


        public LanguageConnectionTO build() {
            return new LanguageConnectionTO(edges, nodes, pageInfo, totalCount, totalSize);
        }

    }
}
