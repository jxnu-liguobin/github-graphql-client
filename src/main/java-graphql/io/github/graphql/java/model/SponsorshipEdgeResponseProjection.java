package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for SponsorshipEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class SponsorshipEdgeResponseProjection extends GraphQLResponseProjection {

    public SponsorshipEdgeResponseProjection() {
    }

    @Override
    public SponsorshipEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public SponsorshipEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("SponsorshipEdgeResponseProjection.SponsorshipResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("SponsorshipEdgeResponseProjection.SponsorshipResponseProjection.node", projectionDepthOnFields.getOrDefault("SponsorshipEdgeResponseProjection.SponsorshipResponseProjection.node", 0) + 1);
            this.node(new SponsorshipResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SponsorshipEdgeResponseProjection.SponsorshipResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public SponsorshipEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public SponsorshipEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public SponsorshipEdgeResponseProjection node(SponsorshipResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public SponsorshipEdgeResponseProjection node(String alias, SponsorshipResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public SponsorshipEdgeResponseProjection typename() {
        return typename(null);
    }

    public SponsorshipEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final SponsorshipEdgeResponseProjection that = (SponsorshipEdgeResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
