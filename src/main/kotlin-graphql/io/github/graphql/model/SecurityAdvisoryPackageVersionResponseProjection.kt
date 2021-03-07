package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for SecurityAdvisoryPackageVersion
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
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


}
