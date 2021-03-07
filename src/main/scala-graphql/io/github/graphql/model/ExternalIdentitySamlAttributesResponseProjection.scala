package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ExternalIdentitySamlAttributes
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class ExternalIdentitySamlAttributesResponseProjection extends GraphQLResponseProjection {

    override def all$(): ExternalIdentitySamlAttributesResponseProjection = all$(3)

    override def all$(maxDepth: Int): ExternalIdentitySamlAttributesResponseProjection = {
        this.nameId()
        this.typename()
        this
    }

    def nameId(): ExternalIdentitySamlAttributesResponseProjection = {
        nameId(null.asInstanceOf[String])
    }

    def nameId(alias: String): ExternalIdentitySamlAttributesResponseProjection = {
        fields.add(new GraphQLResponseField("nameId").alias(alias))
        this
    }

    def typename(): ExternalIdentitySamlAttributesResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ExternalIdentitySamlAttributesResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
