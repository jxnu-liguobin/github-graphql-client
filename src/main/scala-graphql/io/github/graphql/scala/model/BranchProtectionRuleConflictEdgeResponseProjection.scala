package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for BranchProtectionRuleConflictEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class BranchProtectionRuleConflictEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): BranchProtectionRuleConflictEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): BranchProtectionRuleConflictEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictEdgeResponseProjection.BranchProtectionRuleConflictResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("BranchProtectionRuleConflictEdgeResponseProjection.BranchProtectionRuleConflictResponseProjection.node", projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictEdgeResponseProjection.BranchProtectionRuleConflictResponseProjection.node", 0) + 1)
            this.node(new BranchProtectionRuleConflictResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleConflictEdgeResponseProjection.BranchProtectionRuleConflictResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): BranchProtectionRuleConflictEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): BranchProtectionRuleConflictEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: BranchProtectionRuleConflictResponseProjection): BranchProtectionRuleConflictEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: BranchProtectionRuleConflictResponseProjection): BranchProtectionRuleConflictEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): BranchProtectionRuleConflictEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): BranchProtectionRuleConflictEdgeResponseProjection = {
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
        val that = obj.asInstanceOf[BranchProtectionRuleConflictEdgeResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
