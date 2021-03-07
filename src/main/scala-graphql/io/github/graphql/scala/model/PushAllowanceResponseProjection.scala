package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for PushAllowance
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class PushAllowanceResponseProjection extends GraphQLResponseProjection {

    override def all$(): PushAllowanceResponseProjection = all$(3)

    override def all$(maxDepth: Int): PushAllowanceResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("PushAllowanceResponseProjection.PushAllowanceActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("PushAllowanceResponseProjection.PushAllowanceActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("PushAllowanceResponseProjection.PushAllowanceActorResponseProjection.actor", 0) + 1)
            this.actor(new PushAllowanceActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PushAllowanceResponseProjection.PushAllowanceActorResponseProjection.actor", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PushAllowanceResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", 0) <= maxDepth) {
            projectionDepthOnFields.put("PushAllowanceResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", projectionDepthOnFields.getOrDefault("PushAllowanceResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", 0) + 1)
            this.branchProtectionRule(new BranchProtectionRuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PushAllowanceResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", 0)))
        }
        this.id()
        this.typename()
        this
    }

    def actor(subProjection: PushAllowanceActorResponseProjection): PushAllowanceResponseProjection = {
        actor(null.asInstanceOf[String], subProjection)
    }

    def actor(alias: String, subProjection: PushAllowanceActorResponseProjection): PushAllowanceResponseProjection = {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection))
        this
    }

    def branchProtectionRule(subProjection: BranchProtectionRuleResponseProjection): PushAllowanceResponseProjection = {
        branchProtectionRule(null.asInstanceOf[String], subProjection)
    }

    def branchProtectionRule(alias: String, subProjection: BranchProtectionRuleResponseProjection): PushAllowanceResponseProjection = {
        fields.add(new GraphQLResponseField("branchProtectionRule").alias(alias).projection(subProjection))
        this
    }

    def id(): PushAllowanceResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): PushAllowanceResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def typename(): PushAllowanceResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): PushAllowanceResponseProjection = {
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
        val that = obj.asInstanceOf[PushAllowanceResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
