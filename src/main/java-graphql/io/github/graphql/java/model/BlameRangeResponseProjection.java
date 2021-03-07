package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for BlameRange
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class BlameRangeResponseProjection extends GraphQLResponseProjection {

    public BlameRangeResponseProjection() {
    }

    @Override
    public BlameRangeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public BlameRangeResponseProjection all$(int maxDepth) {
        this.age();
        if (projectionDepthOnFields.getOrDefault("BlameRangeResponseProjection.CommitResponseProjection.commit", 0) <= maxDepth) {
            projectionDepthOnFields.put("BlameRangeResponseProjection.CommitResponseProjection.commit", projectionDepthOnFields.getOrDefault("BlameRangeResponseProjection.CommitResponseProjection.commit", 0) + 1);
            this.commit(new CommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BlameRangeResponseProjection.CommitResponseProjection.commit", 0)));
        }
        this.endingLine();
        this.startingLine();
        this.typename();
        return this;
    }

    public BlameRangeResponseProjection age() {
        return age(null);
    }

    public BlameRangeResponseProjection age(String alias) {
        fields.add(new GraphQLResponseField("age").alias(alias));
        return this;
    }

    public BlameRangeResponseProjection commit(CommitResponseProjection subProjection) {
        return commit(null, subProjection);
    }

    public BlameRangeResponseProjection commit(String alias, CommitResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("commit").alias(alias).projection(subProjection));
        return this;
    }

    public BlameRangeResponseProjection endingLine() {
        return endingLine(null);
    }

    public BlameRangeResponseProjection endingLine(String alias) {
        fields.add(new GraphQLResponseField("endingLine").alias(alias));
        return this;
    }

    public BlameRangeResponseProjection startingLine() {
        return startingLine(null);
    }

    public BlameRangeResponseProjection startingLine(String alias) {
        fields.add(new GraphQLResponseField("startingLine").alias(alias));
        return this;
    }

    public BlameRangeResponseProjection typename() {
        return typename(null);
    }

    public BlameRangeResponseProjection typename(String alias) {
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
        final BlameRangeResponseProjection that = (BlameRangeResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
