package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for License
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class LicenseResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): LicenseResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): LicenseResponseProjection {
        this.body()
        if (projectionDepthOnFields.getOrDefault("LicenseResponseProjection.LicenseRuleResponseProjection.conditions", 0) <= maxDepth) {
            projectionDepthOnFields["LicenseResponseProjection.LicenseRuleResponseProjection.conditions"] = projectionDepthOnFields.getOrDefault("LicenseResponseProjection.LicenseRuleResponseProjection.conditions", 0) + 1
            this.conditions(LicenseRuleResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("LicenseResponseProjection.LicenseRuleResponseProjection.conditions", 0)))
        }
        this.description()
        this.featured()
        this.hidden()
        this.id()
        this.implementation()
        this.key()
        if (projectionDepthOnFields.getOrDefault("LicenseResponseProjection.LicenseRuleResponseProjection.limitations", 0) <= maxDepth) {
            projectionDepthOnFields["LicenseResponseProjection.LicenseRuleResponseProjection.limitations"] = projectionDepthOnFields.getOrDefault("LicenseResponseProjection.LicenseRuleResponseProjection.limitations", 0) + 1
            this.limitations(LicenseRuleResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("LicenseResponseProjection.LicenseRuleResponseProjection.limitations", 0)))
        }
        this.name()
        this.nickname()
        if (projectionDepthOnFields.getOrDefault("LicenseResponseProjection.LicenseRuleResponseProjection.permissions", 0) <= maxDepth) {
            projectionDepthOnFields["LicenseResponseProjection.LicenseRuleResponseProjection.permissions"] = projectionDepthOnFields.getOrDefault("LicenseResponseProjection.LicenseRuleResponseProjection.permissions", 0) + 1
            this.permissions(LicenseRuleResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("LicenseResponseProjection.LicenseRuleResponseProjection.permissions", 0)))
        }
        this.pseudoLicense()
        this.spdxId()
        this.url()
        this.typename()
        return this
    }

    fun body(): LicenseResponseProjection = body(null)

    fun body(alias: String?): LicenseResponseProjection {
        fields.add(GraphQLResponseField("body").alias(alias))
        return this
    }

    fun conditions(subProjection: LicenseRuleResponseProjection): LicenseResponseProjection = conditions(null, subProjection)

    fun conditions(alias: String?, subProjection: LicenseRuleResponseProjection): LicenseResponseProjection {
        fields.add(GraphQLResponseField("conditions").alias(alias).projection(subProjection))
        return this
    }

    fun description(): LicenseResponseProjection = description(null)

    fun description(alias: String?): LicenseResponseProjection {
        fields.add(GraphQLResponseField("description").alias(alias))
        return this
    }

    fun featured(): LicenseResponseProjection = featured(null)

    fun featured(alias: String?): LicenseResponseProjection {
        fields.add(GraphQLResponseField("featured").alias(alias))
        return this
    }

    fun hidden(): LicenseResponseProjection = hidden(null)

    fun hidden(alias: String?): LicenseResponseProjection {
        fields.add(GraphQLResponseField("hidden").alias(alias))
        return this
    }

    fun id(): LicenseResponseProjection = id(null)

    fun id(alias: String?): LicenseResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun implementation(): LicenseResponseProjection = implementation(null)

    fun implementation(alias: String?): LicenseResponseProjection {
        fields.add(GraphQLResponseField("implementation").alias(alias))
        return this
    }

    fun key(): LicenseResponseProjection = key(null)

    fun key(alias: String?): LicenseResponseProjection {
        fields.add(GraphQLResponseField("key").alias(alias))
        return this
    }

    fun limitations(subProjection: LicenseRuleResponseProjection): LicenseResponseProjection = limitations(null, subProjection)

    fun limitations(alias: String?, subProjection: LicenseRuleResponseProjection): LicenseResponseProjection {
        fields.add(GraphQLResponseField("limitations").alias(alias).projection(subProjection))
        return this
    }

    fun name(): LicenseResponseProjection = name(null)

    fun name(alias: String?): LicenseResponseProjection {
        fields.add(GraphQLResponseField("name").alias(alias))
        return this
    }

    fun nickname(): LicenseResponseProjection = nickname(null)

    fun nickname(alias: String?): LicenseResponseProjection {
        fields.add(GraphQLResponseField("nickname").alias(alias))
        return this
    }

    fun permissions(subProjection: LicenseRuleResponseProjection): LicenseResponseProjection = permissions(null, subProjection)

    fun permissions(alias: String?, subProjection: LicenseRuleResponseProjection): LicenseResponseProjection {
        fields.add(GraphQLResponseField("permissions").alias(alias).projection(subProjection))
        return this
    }

    fun pseudoLicense(): LicenseResponseProjection = pseudoLicense(null)

    fun pseudoLicense(alias: String?): LicenseResponseProjection {
        fields.add(GraphQLResponseField("pseudoLicense").alias(alias))
        return this
    }

    fun spdxId(): LicenseResponseProjection = spdxId(null)

    fun spdxId(alias: String?): LicenseResponseProjection {
        fields.add(GraphQLResponseField("spdxId").alias(alias))
        return this
    }

    fun url(): LicenseResponseProjection = url(null)

    fun url(alias: String?): LicenseResponseProjection {
        fields.add(GraphQLResponseField("url").alias(alias))
        return this
    }

    fun typename(): LicenseResponseProjection = typename(null)

    fun typename(alias: String?): LicenseResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
