package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for SecurityAdvisoryPackageVersion
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
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

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[SecurityAdvisoryPackageVersionResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
