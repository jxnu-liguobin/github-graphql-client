package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RateLimit
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class RateLimitResponseProjection extends GraphQLResponseProjection {

    override def all$(): RateLimitResponseProjection = all$(3)

    override def all$(maxDepth: Int): RateLimitResponseProjection = {
        this.cost()
        this.limit()
        this.nodeCount()
        this.remaining()
        this.resetAt()
        this.typename()
        this
    }

    def cost(): RateLimitResponseProjection = {
        cost(null.asInstanceOf[String])
    }

    def cost(alias: String): RateLimitResponseProjection = {
        fields.add(new GraphQLResponseField("cost").alias(alias))
        this
    }

    def limit(): RateLimitResponseProjection = {
        limit(null.asInstanceOf[String])
    }

    def limit(alias: String): RateLimitResponseProjection = {
        fields.add(new GraphQLResponseField("limit").alias(alias))
        this
    }

    def nodeCount(): RateLimitResponseProjection = {
        nodeCount(null.asInstanceOf[String])
    }

    def nodeCount(alias: String): RateLimitResponseProjection = {
        fields.add(new GraphQLResponseField("nodeCount").alias(alias))
        this
    }

    def remaining(): RateLimitResponseProjection = {
        remaining(null.asInstanceOf[String])
    }

    def remaining(alias: String): RateLimitResponseProjection = {
        fields.add(new GraphQLResponseField("remaining").alias(alias))
        this
    }

    def resetAt(): RateLimitResponseProjection = {
        resetAt(null.asInstanceOf[String])
    }

    def resetAt(alias: String): RateLimitResponseProjection = {
        fields.add(new GraphQLResponseField("resetAt").alias(alias))
        this
    }

    def typename(): RateLimitResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): RateLimitResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
