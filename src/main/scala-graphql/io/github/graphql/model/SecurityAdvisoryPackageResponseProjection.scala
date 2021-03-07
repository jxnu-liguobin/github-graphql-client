package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for SecurityAdvisoryPackage
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class SecurityAdvisoryPackageResponseProjection extends GraphQLResponseProjection {

    override def all$(): SecurityAdvisoryPackageResponseProjection = all$(3)

    override def all$(maxDepth: Int): SecurityAdvisoryPackageResponseProjection = {
        this.ecosystem()
        this.name()
        this.typename()
        this
    }

    def ecosystem(): SecurityAdvisoryPackageResponseProjection = {
        ecosystem(null.asInstanceOf[String])
    }

    def ecosystem(alias: String): SecurityAdvisoryPackageResponseProjection = {
        fields.add(new GraphQLResponseField("ecosystem").alias(alias))
        this
    }

    def name(): SecurityAdvisoryPackageResponseProjection = {
        name(null.asInstanceOf[String])
    }

    def name(alias: String): SecurityAdvisoryPackageResponseProjection = {
        fields.add(new GraphQLResponseField("name").alias(alias))
        this
    }

    def typename(): SecurityAdvisoryPackageResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): SecurityAdvisoryPackageResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
