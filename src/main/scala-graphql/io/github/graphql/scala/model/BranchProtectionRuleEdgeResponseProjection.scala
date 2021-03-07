package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for BranchProtectionRuleEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class BranchProtectionRuleEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): BranchProtectionRuleEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): BranchProtectionRuleEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleEdgeResponseProjection.BranchProtectionRuleResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("BranchProtectionRuleEdgeResponseProjection.BranchProtectionRuleResponseProjection.node", projectionDepthOnFields.getOrDefault("BranchProtectionRuleEdgeResponseProjection.BranchProtectionRuleResponseProjection.node", 0) + 1)
            this.node(new BranchProtectionRuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleEdgeResponseProjection.BranchProtectionRuleResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): BranchProtectionRuleEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): BranchProtectionRuleEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: BranchProtectionRuleResponseProjection): BranchProtectionRuleEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: BranchProtectionRuleResponseProjection): BranchProtectionRuleEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): BranchProtectionRuleEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): BranchProtectionRuleEdgeResponseProjection = {
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
        val that = obj.asInstanceOf[BranchProtectionRuleEdgeResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
