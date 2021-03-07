package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for SecurityAdvisoryIdentifier
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
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


}
