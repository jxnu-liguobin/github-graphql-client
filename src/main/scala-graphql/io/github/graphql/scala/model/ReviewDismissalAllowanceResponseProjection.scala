package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for ReviewDismissalAllowance
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class ReviewDismissalAllowanceResponseProjection extends GraphQLResponseProjection {

    override def all$(): ReviewDismissalAllowanceResponseProjection = all$(3)

    override def all$(maxDepth: Int): ReviewDismissalAllowanceResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceResponseProjection.ReviewDismissalAllowanceActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReviewDismissalAllowanceResponseProjection.ReviewDismissalAllowanceActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceResponseProjection.ReviewDismissalAllowanceActorResponseProjection.actor", 0) + 1)
            this.actor(new ReviewDismissalAllowanceActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceResponseProjection.ReviewDismissalAllowanceActorResponseProjection.actor", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReviewDismissalAllowanceResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", 0) + 1)
            this.branchProtectionRule(new BranchProtectionRuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", 0)))
        }
        this.id()
        this.typename()
        this
    }

    def actor(subProjection: ReviewDismissalAllowanceActorResponseProjection): ReviewDismissalAllowanceResponseProjection = {
        actor(null.asInstanceOf[String], subProjection)
    }

    def actor(alias: String, subProjection: ReviewDismissalAllowanceActorResponseProjection): ReviewDismissalAllowanceResponseProjection = {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection))
        this
    }

    def branchProtectionRule(subProjection: BranchProtectionRuleResponseProjection): ReviewDismissalAllowanceResponseProjection = {
        branchProtectionRule(null.asInstanceOf[String], subProjection)
    }

    def branchProtectionRule(alias: String, subProjection: BranchProtectionRuleResponseProjection): ReviewDismissalAllowanceResponseProjection = {
        fields.add(new GraphQLResponseField("branchProtectionRule").alias(alias).projection(subProjection))
        this
    }

    def id(): ReviewDismissalAllowanceResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): ReviewDismissalAllowanceResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def typename(): ReviewDismissalAllowanceResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ReviewDismissalAllowanceResponseProjection = {
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
        val that = obj.asInstanceOf[ReviewDismissalAllowanceResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
