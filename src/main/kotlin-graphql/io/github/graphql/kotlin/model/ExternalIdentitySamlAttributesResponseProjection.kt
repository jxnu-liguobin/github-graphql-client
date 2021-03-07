package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for ExternalIdentitySamlAttributes
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class ExternalIdentitySamlAttributesResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ExternalIdentitySamlAttributesResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ExternalIdentitySamlAttributesResponseProjection {
        this.nameId()
        this.typename()
        return this
    }

    fun nameId(): ExternalIdentitySamlAttributesResponseProjection = nameId(null)

    fun nameId(alias: String?): ExternalIdentitySamlAttributesResponseProjection {
        fields.add(GraphQLResponseField("nameId").alias(alias))
        return this
    }

    fun typename(): ExternalIdentitySamlAttributesResponseProjection = typename(null)

    fun typename(alias: String?): ExternalIdentitySamlAttributesResponseProjection {
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
        val that = other as ExternalIdentitySamlAttributesResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
