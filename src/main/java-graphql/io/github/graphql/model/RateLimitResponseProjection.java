package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for RateLimit
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class RateLimitResponseProjection extends GraphQLResponseProjection {

    public RateLimitResponseProjection() {
    }

    @Override
    public RateLimitResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RateLimitResponseProjection all$(int maxDepth) {
        this.cost();
        this.limit();
        this.nodeCount();
        this.remaining();
        this.resetAt();
        this.typename();
        return this;
    }

    public RateLimitResponseProjection cost() {
        return cost(null);
    }

    public RateLimitResponseProjection cost(String alias) {
        fields.add(new GraphQLResponseField("cost").alias(alias));
        return this;
    }

    public RateLimitResponseProjection limit() {
        return limit(null);
    }

    public RateLimitResponseProjection limit(String alias) {
        fields.add(new GraphQLResponseField("limit").alias(alias));
        return this;
    }

    public RateLimitResponseProjection nodeCount() {
        return nodeCount(null);
    }

    public RateLimitResponseProjection nodeCount(String alias) {
        fields.add(new GraphQLResponseField("nodeCount").alias(alias));
        return this;
    }

    public RateLimitResponseProjection remaining() {
        return remaining(null);
    }

    public RateLimitResponseProjection remaining(String alias) {
        fields.add(new GraphQLResponseField("remaining").alias(alias));
        return this;
    }

    public RateLimitResponseProjection resetAt() {
        return resetAt(null);
    }

    public RateLimitResponseProjection resetAt(String alias) {
        fields.add(new GraphQLResponseField("resetAt").alias(alias));
        return this;
    }

    public RateLimitResponseProjection typename() {
        return typename(null);
    }

    public RateLimitResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}