package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for SecurityAdvisoryPackage
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
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

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[SecurityAdvisoryPackageResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
