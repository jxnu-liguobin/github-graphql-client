package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for SecurityAdvisoryIdentifier
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class SecurityAdvisoryIdentifierResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): SecurityAdvisoryIdentifierResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): SecurityAdvisoryIdentifierResponseProjection {
        this.type()
        this.value()
        this.typename()
        return this
    }

    fun type(): SecurityAdvisoryIdentifierResponseProjection = type(null)

    fun type(alias: String?): SecurityAdvisoryIdentifierResponseProjection {
        fields.add(GraphQLResponseField("type").alias(alias))
        return this
    }

    fun value(): SecurityAdvisoryIdentifierResponseProjection = value(null)

    fun value(alias: String?): SecurityAdvisoryIdentifierResponseProjection {
        fields.add(GraphQLResponseField("value").alias(alias))
        return this
    }

    fun typename(): SecurityAdvisoryIdentifierResponseProjection = typename(null)

    fun typename(alias: String?): SecurityAdvisoryIdentifierResponseProjection {
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
        val that = other as SecurityAdvisoryIdentifierResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
