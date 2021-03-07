package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for License
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class LicenseResponseProjection extends GraphQLResponseProjection {

    override def all$(): LicenseResponseProjection = all$(3)

    override def all$(maxDepth: Int): LicenseResponseProjection = {
        this.body()
        if (projectionDepthOnFields.getOrDefault("LicenseResponseProjection.LicenseRuleResponseProjection.conditions", 0) <= maxDepth) {
            projectionDepthOnFields.put("LicenseResponseProjection.LicenseRuleResponseProjection.conditions", projectionDepthOnFields.getOrDefault("LicenseResponseProjection.LicenseRuleResponseProjection.conditions", 0) + 1)
            this.conditions(new LicenseRuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LicenseResponseProjection.LicenseRuleResponseProjection.conditions", 0)))
        }
        this.description()
        this.featured()
        this.hidden()
        this.id()
        this.implementation()
        this.key()
        if (projectionDepthOnFields.getOrDefault("LicenseResponseProjection.LicenseRuleResponseProjection.limitations", 0) <= maxDepth) {
            projectionDepthOnFields.put("LicenseResponseProjection.LicenseRuleResponseProjection.limitations", projectionDepthOnFields.getOrDefault("LicenseResponseProjection.LicenseRuleResponseProjection.limitations", 0) + 1)
            this.limitations(new LicenseRuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LicenseResponseProjection.LicenseRuleResponseProjection.limitations", 0)))
        }
        this.name()
        this.nickname()
        if (projectionDepthOnFields.getOrDefault("LicenseResponseProjection.LicenseRuleResponseProjection.permissions", 0) <= maxDepth) {
            projectionDepthOnFields.put("LicenseResponseProjection.LicenseRuleResponseProjection.permissions", projectionDepthOnFields.getOrDefault("LicenseResponseProjection.LicenseRuleResponseProjection.permissions", 0) + 1)
            this.permissions(new LicenseRuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LicenseResponseProjection.LicenseRuleResponseProjection.permissions", 0)))
        }
        this.pseudoLicense()
        this.spdxId()
        this.url()
        this.typename()
        this
    }

    def body(): LicenseResponseProjection = {
        body(null.asInstanceOf[String])
    }

    def body(alias: String): LicenseResponseProjection = {
        fields.add(new GraphQLResponseField("body").alias(alias))
        this
    }

    def conditions(subProjection: LicenseRuleResponseProjection): LicenseResponseProjection = {
        conditions(null.asInstanceOf[String], subProjection)
    }

    def conditions(alias: String, subProjection: LicenseRuleResponseProjection): LicenseResponseProjection = {
        fields.add(new GraphQLResponseField("conditions").alias(alias).projection(subProjection))
        this
    }

    def description(): LicenseResponseProjection = {
        description(null.asInstanceOf[String])
    }

    def description(alias: String): LicenseResponseProjection = {
        fields.add(new GraphQLResponseField("description").alias(alias))
        this
    }

    def featured(): LicenseResponseProjection = {
        featured(null.asInstanceOf[String])
    }

    def featured(alias: String): LicenseResponseProjection = {
        fields.add(new GraphQLResponseField("featured").alias(alias))
        this
    }

    def hidden(): LicenseResponseProjection = {
        hidden(null.asInstanceOf[String])
    }

    def hidden(alias: String): LicenseResponseProjection = {
        fields.add(new GraphQLResponseField("hidden").alias(alias))
        this
    }

    def id(): LicenseResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): LicenseResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def implementation(): LicenseResponseProjection = {
        implementation(null.asInstanceOf[String])
    }

    def implementation(alias: String): LicenseResponseProjection = {
        fields.add(new GraphQLResponseField("implementation").alias(alias))
        this
    }

    def key(): LicenseResponseProjection = {
        key(null.asInstanceOf[String])
    }

    def key(alias: String): LicenseResponseProjection = {
        fields.add(new GraphQLResponseField("key").alias(alias))
        this
    }

    def limitations(subProjection: LicenseRuleResponseProjection): LicenseResponseProjection = {
        limitations(null.asInstanceOf[String], subProjection)
    }

    def limitations(alias: String, subProjection: LicenseRuleResponseProjection): LicenseResponseProjection = {
        fields.add(new GraphQLResponseField("limitations").alias(alias).projection(subProjection))
        this
    }

    def name(): LicenseResponseProjection = {
        name(null.asInstanceOf[String])
    }

    def name(alias: String): LicenseResponseProjection = {
        fields.add(new GraphQLResponseField("name").alias(alias))
        this
    }

    def nickname(): LicenseResponseProjection = {
        nickname(null.asInstanceOf[String])
    }

    def nickname(alias: String): LicenseResponseProjection = {
        fields.add(new GraphQLResponseField("nickname").alias(alias))
        this
    }

    def permissions(subProjection: LicenseRuleResponseProjection): LicenseResponseProjection = {
        permissions(null.asInstanceOf[String], subProjection)
    }

    def permissions(alias: String, subProjection: LicenseRuleResponseProjection): LicenseResponseProjection = {
        fields.add(new GraphQLResponseField("permissions").alias(alias).projection(subProjection))
        this
    }

    def pseudoLicense(): LicenseResponseProjection = {
        pseudoLicense(null.asInstanceOf[String])
    }

    def pseudoLicense(alias: String): LicenseResponseProjection = {
        fields.add(new GraphQLResponseField("pseudoLicense").alias(alias))
        this
    }

    def spdxId(): LicenseResponseProjection = {
        spdxId(null.asInstanceOf[String])
    }

    def spdxId(alias: String): LicenseResponseProjection = {
        fields.add(new GraphQLResponseField("spdxId").alias(alias))
        this
    }

    def url(): LicenseResponseProjection = {
        url(null.asInstanceOf[String])
    }

    def url(alias: String): LicenseResponseProjection = {
        fields.add(new GraphQLResponseField("url").alias(alias))
        this
    }

    def typename(): LicenseResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): LicenseResponseProjection = {
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
        val that = obj.asInstanceOf[LicenseResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
