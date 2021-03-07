package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for ExternalIdentityScimAttributes
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
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

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[ExternalIdentityScimAttributesResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
