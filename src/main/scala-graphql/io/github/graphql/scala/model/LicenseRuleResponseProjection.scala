package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for LicenseRule
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class LicenseRuleResponseProjection extends GraphQLResponseProjection {

    override def all$(): LicenseRuleResponseProjection = all$(3)

    override def all$(maxDepth: Int): LicenseRuleResponseProjection = {
        this.description()
        this.key()
        this.label()
        this.typename()
        this
    }

    def description(): LicenseRuleResponseProjection = {
        description(null.asInstanceOf[String])
    }

    def description(alias: String): LicenseRuleResponseProjection = {
        fields.add(new GraphQLResponseField("description").alias(alias))
        this
    }

    def key(): LicenseRuleResponseProjection = {
        key(null.asInstanceOf[String])
    }

    def key(alias: String): LicenseRuleResponseProjection = {
        fields.add(new GraphQLResponseField("key").alias(alias))
        this
    }

    def label(): LicenseRuleResponseProjection = {
        label(null.asInstanceOf[String])
    }

    def label(alias: String): LicenseRuleResponseProjection = {
        fields.add(new GraphQLResponseField("label").alias(alias))
        this
    }

    def typename(): LicenseRuleResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): LicenseRuleResponseProjection = {
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
        val that = obj.asInstanceOf[LicenseRuleResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
