package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for LicenseRule
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
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


}
