package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for SecurityAdvisoryReference
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class SecurityAdvisoryReferenceResponseProjection extends GraphQLResponseProjection {

    override def all$(): SecurityAdvisoryReferenceResponseProjection = all$(3)

    override def all$(maxDepth: Int): SecurityAdvisoryReferenceResponseProjection = {
        this.url()
        this.typename()
        this
    }

    def url(): SecurityAdvisoryReferenceResponseProjection = {
        url(null.asInstanceOf[String])
    }

    def url(alias: String): SecurityAdvisoryReferenceResponseProjection = {
        fields.add(new GraphQLResponseField("url").alias(alias))
        this
    }

    def typename(): SecurityAdvisoryReferenceResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): SecurityAdvisoryReferenceResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
