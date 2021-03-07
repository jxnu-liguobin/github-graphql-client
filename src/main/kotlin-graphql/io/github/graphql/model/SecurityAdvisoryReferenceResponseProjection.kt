package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for SecurityAdvisoryReference
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
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


}
