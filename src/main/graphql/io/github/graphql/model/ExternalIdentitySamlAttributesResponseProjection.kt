package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ExternalIdentitySamlAttributes
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
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


}
