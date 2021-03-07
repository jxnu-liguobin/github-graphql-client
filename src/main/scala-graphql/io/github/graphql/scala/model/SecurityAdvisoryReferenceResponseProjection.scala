package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for SecurityAdvisoryReference
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
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

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[SecurityAdvisoryReferenceResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
