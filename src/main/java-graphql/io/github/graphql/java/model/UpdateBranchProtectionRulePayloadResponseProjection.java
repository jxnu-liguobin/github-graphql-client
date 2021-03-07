package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for UpdateBranchProtectionRulePayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class UpdateBranchProtectionRulePayloadResponseProjection extends GraphQLResponseProjection {

    public UpdateBranchProtectionRulePayloadResponseProjection() {
    }

    @Override
    public UpdateBranchProtectionRulePayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public UpdateBranchProtectionRulePayloadResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("UpdateBranchProtectionRulePayloadResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", 0) <= maxDepth) {
            projectionDepthOnFields.put("UpdateBranchProtectionRulePayloadResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", projectionDepthOnFields.getOrDefault("UpdateBranchProtectionRulePayloadResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", 0) + 1);
            this.branchProtectionRule(new BranchProtectionRuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UpdateBranchProtectionRulePayloadResponseProjection.BranchProtectionRuleResponseProjection.branchProtectionRule", 0)));
        }
        this.clientMutationId();
        this.typename();
        return this;
    }

    public UpdateBranchProtectionRulePayloadResponseProjection branchProtectionRule(BranchProtectionRuleResponseProjection subProjection) {
        return branchProtectionRule(null, subProjection);
    }

    public UpdateBranchProtectionRulePayloadResponseProjection branchProtectionRule(String alias, BranchProtectionRuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("branchProtectionRule").alias(alias).projection(subProjection));
        return this;
    }

    public UpdateBranchProtectionRulePayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public UpdateBranchProtectionRulePayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public UpdateBranchProtectionRulePayloadResponseProjection typename() {
        return typename(null);
    }

    public UpdateBranchProtectionRulePayloadResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final UpdateBranchProtectionRulePayloadResponseProjection that = (UpdateBranchProtectionRulePayloadResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
