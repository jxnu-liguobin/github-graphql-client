package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for SecurityAdvisoryReference
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class SecurityAdvisoryReferenceResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): SecurityAdvisoryReferenceResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): SecurityAdvisoryReferenceResponseProjection {
        this.url()
        this.typename()
        return this
    }

    fun url(): SecurityAdvisoryReferenceResponseProjection = url(null)

    fun url(alias: String?): SecurityAdvisoryReferenceResponseProjection {
        fields.add(GraphQLResponseField("url").alias(alias))
        return this
    }

    fun typename(): SecurityAdvisoryReferenceResponseProjection = typename(null)

    fun typename(alias: String?): SecurityAdvisoryReferenceResponseProjection {
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
        val that = other as SecurityAdvisoryReferenceResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
