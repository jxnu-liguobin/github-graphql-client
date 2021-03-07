package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for ExternalIdentitySamlAttributes
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
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

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[ExternalIdentitySamlAttributesResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
