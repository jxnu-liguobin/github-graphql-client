package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for RateLimit
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class RateLimitResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): RateLimitResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): RateLimitResponseProjection {
        this.cost()
        this.limit()
        this.nodeCount()
        this.remaining()
        this.resetAt()
        this.typename()
        return this
    }

    fun cost(): RateLimitResponseProjection = cost(null)

    fun cost(alias: String?): RateLimitResponseProjection {
        fields.add(GraphQLResponseField("cost").alias(alias))
        return this
    }

    fun limit(): RateLimitResponseProjection = limit(null)

    fun limit(alias: String?): RateLimitResponseProjection {
        fields.add(GraphQLResponseField("limit").alias(alias))
        return this
    }

    fun nodeCount(): RateLimitResponseProjection = nodeCount(null)

    fun nodeCount(alias: String?): RateLimitResponseProjection {
        fields.add(GraphQLResponseField("nodeCount").alias(alias))
        return this
    }

    fun remaining(): RateLimitResponseProjection = remaining(null)

    fun remaining(alias: String?): RateLimitResponseProjection {
        fields.add(GraphQLResponseField("remaining").alias(alias))
        return this
    }

    fun resetAt(): RateLimitResponseProjection = resetAt(null)

    fun resetAt(alias: String?): RateLimitResponseProjection {
        fields.add(GraphQLResponseField("resetAt").alias(alias))
        return this
    }

    fun typename(): RateLimitResponseProjection = typename(null)

    fun typename(alias: String?): RateLimitResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as RateLimitResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
