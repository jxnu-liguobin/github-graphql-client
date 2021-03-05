package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for LicenseRule
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class LicenseRuleResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): LicenseRuleResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): LicenseRuleResponseProjection {
        this.description()
        this.key()
        this.label()
        this.typename()
        return this
    }

    fun description(): LicenseRuleResponseProjection = description(null)

    fun description(alias: String?): LicenseRuleResponseProjection {
        fields.add(GraphQLResponseField("description").alias(alias))
        return this
    }

    fun key(): LicenseRuleResponseProjection = key(null)

    fun key(alias: String?): LicenseRuleResponseProjection {
        fields.add(GraphQLResponseField("key").alias(alias))
        return this
    }

    fun label(): LicenseRuleResponseProjection = label(null)

    fun label(alias: String?): LicenseRuleResponseProjection {
        fields.add(GraphQLResponseField("label").alias(alias))
        return this
    }

    fun typename(): LicenseRuleResponseProjection = typename(null)

    fun typename(alias: String?): LicenseRuleResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
