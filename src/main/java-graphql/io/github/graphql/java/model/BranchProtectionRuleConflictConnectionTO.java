package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class BranchProtectionRuleConflictConnectionTO implements java.io.Serializable {

    private java.util.List<BranchProtectionRuleConflictEdgeTO> edges;
    private java.util.List<BranchProtectionRuleConflictTO> nodes;
    @javax.validation.constraints.NotNull
    private PageInfoTO pageInfo;
    private int totalCount;

    public BranchProtectionRuleConflictConnectionTO() {
    }

    public BranchProtectionRuleConflictConnectionTO(java.util.List<BranchProtectionRuleConflictEdgeTO> edges, java.util.List<BranchProtectionRuleConflictTO> nodes, PageInfoTO pageInfo, int totalCount) {
        this.edges = edges;
        this.nodes = nodes;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public java.util.List<BranchProtectionRuleConflictEdgeTO> getEdges() {
        return edges;
    }

    public java.util.List<BranchProtectionRuleConflictTO> getNodes() {
        return nodes;
    }

    public PageInfoTO getPageInfo() {
        return pageInfo;
    }

    public int getTotalCount() {
        return totalCount;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final BranchProtectionRuleConflictConnectionTO that = (BranchProtectionRuleConflictConnectionTO) obj;
        return Objects.equals(edges, that.edges)
            && Objects.equals(nodes, that.nodes)
            && Objects.equals(pageInfo, that.pageInfo)
            && Objects.equals(totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(edges, nodes, pageInfo, totalCount);
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

    public static BranchProtectionRuleConflictConnectionTO.Builder builder() {
        return new BranchProtectionRuleConflictConnectionTO.Builder();
    }

    public static class Builder {

        private java.util.List<BranchProtectionRuleConflictEdgeTO> edges;
        private java.util.List<BranchProtectionRuleConflictTO> nodes;
        private PageInfoTO pageInfo;
        private int totalCount;

        public Builder() {
        }

        public Builder setEdges(java.util.List<BranchProtectionRuleConflictEdgeTO> edges) {
            this.edges = edges;
            return this;
        }

        public Builder setNodes(java.util.List<BranchProtectionRuleConflictTO> nodes) {
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


        public BranchProtectionRuleConflictConnectionTO build() {
            return new BranchProtectionRuleConflictConnectionTO(edges, nodes, pageInfo, totalCount);
        }

    }
}
