package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for SecurityAdvisoryPackageVersion
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class SecurityAdvisoryPackageVersionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): SecurityAdvisoryPackageVersionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): SecurityAdvisoryPackageVersionResponseProjection {
        this.identifier()
        this.typename()
        return this
    }

    fun identifier(): SecurityAdvisoryPackageVersionResponseProjection = identifier(null)

    fun identifier(alias: String?): SecurityAdvisoryPackageVersionResponseProjection {
        fields.add(GraphQLResponseField("identifier").alias(alias))
        return this
    }

    fun typename(): SecurityAdvisoryPackageVersionResponseProjection = typename(null)

    fun typename(alias: String?): SecurityAdvisoryPackageVersionResponseProjection {
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
        val that = other as SecurityAdvisoryPackageVersionResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
