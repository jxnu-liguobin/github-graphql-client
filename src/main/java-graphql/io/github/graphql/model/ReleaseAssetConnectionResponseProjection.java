package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ReleaseAssetConnection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class ReleaseAssetConnectionResponseProjection extends GraphQLResponseProjection {

    public ReleaseAssetConnectionResponseProjection() {
    }

    @Override
    public ReleaseAssetConnectionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ReleaseAssetConnectionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ReleaseAssetConnectionResponseProjection.ReleaseAssetEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReleaseAssetConnectionResponseProjection.ReleaseAssetEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("ReleaseAssetConnectionResponseProjection.ReleaseAssetEdgeResponseProjection.edges", 0) + 1);
            this.edges(new ReleaseAssetEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReleaseAssetConnectionResponseProjection.ReleaseAssetEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ReleaseAssetConnectionResponseProjection.ReleaseAssetResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReleaseAssetConnectionResponseProjection.ReleaseAssetResponseProjection.nodes", projectionDepthOnFields.getOrDefault("ReleaseAssetConnectionResponseProjection.ReleaseAssetResponseProjection.nodes", 0) + 1);
            this.nodes(new ReleaseAssetResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReleaseAssetConnectionResponseProjection.ReleaseAssetResponseProjection.nodes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ReleaseAssetConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReleaseAssetConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("ReleaseAssetConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReleaseAssetConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.totalCount();
        this.typename();
        return this;
    }

    public ReleaseAssetConnectionResponseProjection edges(ReleaseAssetEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public ReleaseAssetConnectionResponseProjection edges(String alias, ReleaseAssetEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public ReleaseAssetConnectionResponseProjection nodes(ReleaseAssetResponseProjection subProjection) {
        return nodes(null, subProjection);
    }

    public ReleaseAssetConnectionResponseProjection nodes(String alias, ReleaseAssetResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection));
        return this;
    }

    public ReleaseAssetConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public ReleaseAssetConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public ReleaseAssetConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public ReleaseAssetConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public ReleaseAssetConnectionResponseProjection typename() {
        return typename(null);
    }

    public ReleaseAssetConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
