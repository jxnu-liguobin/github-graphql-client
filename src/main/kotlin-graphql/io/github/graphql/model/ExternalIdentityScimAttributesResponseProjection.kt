package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ExternalIdentityScimAttributes
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
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


}
