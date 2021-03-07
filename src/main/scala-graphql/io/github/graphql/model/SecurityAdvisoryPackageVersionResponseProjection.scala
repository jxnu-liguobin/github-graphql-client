package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for SecurityAdvisoryPackageVersion
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class SecurityAdvisoryPackageVersionResponseProjection extends GraphQLResponseProjection {

    override def all$(): SecurityAdvisoryPackageVersionResponseProjection = all$(3)

    override def all$(maxDepth: Int): SecurityAdvisoryPackageVersionResponseProjection = {
        this.identifier()
        this.typename()
        this
    }

    def identifier(): SecurityAdvisoryPackageVersionResponseProjection = {
        identifier(null.asInstanceOf[String])
    }

    def identifier(alias: String): SecurityAdvisoryPackageVersionResponseProjection = {
        fields.add(new GraphQLResponseField("identifier").alias(alias))
        this
    }

    def typename(): SecurityAdvisoryPackageVersionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): SecurityAdvisoryPackageVersionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
