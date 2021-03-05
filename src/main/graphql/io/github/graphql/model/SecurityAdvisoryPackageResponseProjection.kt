package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for SecurityAdvisoryPackage
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class SecurityAdvisoryPackageResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): SecurityAdvisoryPackageResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): SecurityAdvisoryPackageResponseProjection {
        this.ecosystem()
        this.name()
        this.typename()
        return this
    }

    fun ecosystem(): SecurityAdvisoryPackageResponseProjection = ecosystem(null)

    fun ecosystem(alias: String?): SecurityAdvisoryPackageResponseProjection {
        fields.add(GraphQLResponseField("ecosystem").alias(alias))
        return this
    }

    fun name(): SecurityAdvisoryPackageResponseProjection = name(null)

    fun name(alias: String?): SecurityAdvisoryPackageResponseProjection {
        fields.add(GraphQLResponseField("name").alias(alias))
        return this
    }

    fun typename(): SecurityAdvisoryPackageResponseProjection = typename(null)

    fun typename(alias: String?): SecurityAdvisoryPackageResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
