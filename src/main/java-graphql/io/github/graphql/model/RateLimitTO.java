package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class RateLimitTO implements java.io.Serializable {

    private int cost;
    private int limit;
    private int nodeCount;
    private int remaining;
    @javax.validation.constraints.NotNull
    private String resetAt;

    public RateLimitTO() {
    }

    public RateLimitTO(int cost, int limit, int nodeCount, int remaining, String resetAt) {
        this.cost = cost;
        this.limit = limit;
        this.nodeCount = nodeCount;
        this.remaining = remaining;
        this.resetAt = resetAt;
    }

    public int getCost() {
        return cost;
    }

    public int getLimit() {
        return limit;
    }

    public int getNodeCount() {
        return nodeCount;
    }

    public int getRemaining() {
        return remaining;
    }

    public String getResetAt() {
        return resetAt;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("cost: " + GraphQLRequestSerializer.getEntry(cost));
        joiner.add("limit: " + GraphQLRequestSerializer.getEntry(limit));
        joiner.add("nodeCount: " + GraphQLRequestSerializer.getEntry(nodeCount));
        joiner.add("remaining: " + GraphQLRequestSerializer.getEntry(remaining));
        if (resetAt != null) {
            joiner.add("resetAt: " + GraphQLRequestSerializer.getEntry(resetAt));
        }
        return joiner.toString();
    }

    public static RateLimitTO.Builder builder() {
        return new RateLimitTO.Builder();
    }

    public static class Builder {

        private int cost;
        private int limit;
        private int nodeCount;
        private int remaining;
        private String resetAt;

        public Builder() {
        }

        public Builder setCost(int cost) {
            this.cost = cost;
            return this;
        }

        public Builder setLimit(int limit) {
            this.limit = limit;
            return this;
        }

        public Builder setNodeCount(int nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }

        public Builder setRemaining(int remaining) {
            this.remaining = remaining;
            return this;
        }

        public Builder setResetAt(String resetAt) {
            this.resetAt = resetAt;
            return this;
        }


        public RateLimitTO build() {
            return new RateLimitTO(cost, limit, nodeCount, remaining, resetAt);
        }

    }
}
