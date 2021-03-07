package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for ExternalIdentityScimAttributes
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class ExternalIdentityScimAttributesResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ExternalIdentityScimAttributesResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ExternalIdentityScimAttributesResponseProjection {
        this.username()
        this.typename()
        return this
    }

    fun username(): ExternalIdentityScimAttributesResponseProjection = username(null)

    fun username(alias: String?): ExternalIdentityScimAttributesResponseProjection {
        fields.add(GraphQLResponseField("username").alias(alias))
        return this
    }

    fun typename(): ExternalIdentityScimAttributesResponseProjection = typename(null)

    fun typename(alias: String?): ExternalIdentityScimAttributesResponseProjection {
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
        val that = other as ExternalIdentityScimAttributesResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
