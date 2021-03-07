package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Blame
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class BlameResponseProjection extends GraphQLResponseProjection {

    public BlameResponseProjection() {
    }

    @Override
    public BlameResponseProjection all$() {
        return all$(3);
    }

    @Override
    public BlameResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("BlameResponseProjection.BlameRangeResponseProjection.ranges", 0) <= maxDepth) {
            projectionDepthOnFields.put("BlameResponseProjection.BlameRangeResponseProjection.ranges", projectionDepthOnFields.getOrDefault("BlameResponseProjection.BlameRangeResponseProjection.ranges", 0) + 1);
            this.ranges(new BlameRangeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BlameResponseProjection.BlameRangeResponseProjection.ranges", 0)));
        }
        this.typename();
        return this;
    }

    public BlameResponseProjection ranges(BlameRangeResponseProjection subProjection) {
        return ranges(null, subProjection);
    }

    public BlameResponseProjection ranges(String alias, BlameRangeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("ranges").alias(alias).projection(subProjection));
        return this;
    }

    public BlameResponseProjection typename() {
        return typename(null);
    }

    public BlameResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
