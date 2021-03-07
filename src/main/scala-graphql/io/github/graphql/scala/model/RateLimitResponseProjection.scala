package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for RateLimit
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
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

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[RateLimitResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
