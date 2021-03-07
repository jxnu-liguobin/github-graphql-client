package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ExternalIdentityScimAttributes
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class ExternalIdentityScimAttributesResponseProjection extends GraphQLResponseProjection {

    override def all$(): ExternalIdentityScimAttributesResponseProjection = all$(3)

    override def all$(maxDepth: Int): ExternalIdentityScimAttributesResponseProjection = {
        this.username()
        this.typename()
        this
    }

    def username(): ExternalIdentityScimAttributesResponseProjection = {
        username(null.asInstanceOf[String])
    }

    def username(alias: String): ExternalIdentityScimAttributesResponseProjection = {
        fields.add(new GraphQLResponseField("username").alias(alias))
        this
    }

    def typename(): ExternalIdentityScimAttributesResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ExternalIdentityScimAttributesResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
