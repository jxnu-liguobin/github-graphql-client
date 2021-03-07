package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for BranchProtectionRule
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class BranchProtectionRuleResponseProjection extends GraphQLResponseProjection {

    public BranchProtectionRuleResponseProjection() {
    }

    @Override
    public BranchProtectionRuleResponseProjection all$() {
        return all$(3);
    }

    @Override
    public BranchProtectionRuleResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.BranchProtectionRuleConflictConnectionResponseProjection.branchProtectionRuleConflicts", 0) <= maxDepth) {
            projectionDepthOnFields.put("BranchProtectionRuleResponseProjection.BranchProtectionRuleConflictConnectionResponseProjection.branchProtectionRuleConflicts", projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.BranchProtectionRuleConflictConnectionResponseProjection.branchProtectionRuleConflicts", 0) + 1);
            this.branchProtectionRuleConflicts(new BranchProtectionRuleConflictConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.BranchProtectionRuleConflictConnectionResponseProjection.branchProtectionRuleConflicts", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.ActorResponseProjection.creator", 0) <= maxDepth) {
            projectionDepthOnFields.put("BranchProtectionRuleResponseProjection.ActorResponseProjection.creator", projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.ActorResponseProjection.creator", 0) + 1);
            this.creator(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.ActorResponseProjection.creator", 0)));
        }
        this.databaseId();
        this.dismissesStaleReviews();
        this.id();
        this.isAdminEnforced();
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.RefConnectionResponseProjection.matchingRefs", 0) <= maxDepth) {
            projectionDepthOnFields.put("BranchProtectionRuleResponseProjection.RefConnectionResponseProjection.matchingRefs", projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.RefConnectionResponseProjection.matchingRefs", 0) + 1);
            this.matchingRefs(new RefConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.RefConnectionResponseProjection.matchingRefs", 0)));
        }
        this.pattern();
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.PushAllowanceConnectionResponseProjection.pushAllowances", 0) <= maxDepth) {
            projectionDepthOnFields.put("BranchProtectionRuleResponseProjection.PushAllowanceConnectionResponseProjection.pushAllowances", projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.PushAllowanceConnectionResponseProjection.pushAllowances", 0) + 1);
            this.pushAllowances(new PushAllowanceConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.PushAllowanceConnectionResponseProjection.pushAllowances", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("BranchProtectionRuleResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.RepositoryResponseProjection.repository", 0) + 1);
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.RepositoryResponseProjection.repository", 0)));
        }
        this.requiredApprovingReviewCount();
        this.requiredStatusCheckContexts();
        this.requiresApprovingReviews();
        this.requiresCodeOwnerReviews();
        this.requiresCommitSignatures();
        this.requiresStatusChecks();
        this.requiresStrictStatusChecks();
        this.restrictsPushes();
        this.restrictsReviewDismissals();
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.ReviewDismissalAllowanceConnectionResponseProjection.reviewDismissalAllowances", 0) <= maxDepth) {
            projectionDepthOnFields.put("BranchProtectionRuleResponseProjection.ReviewDismissalAllowanceConnectionResponseProjection.reviewDismissalAllowances", projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.ReviewDismissalAllowanceConnectionResponseProjection.reviewDismissalAllowances", 0) + 1);
            this.reviewDismissalAllowances(new ReviewDismissalAllowanceConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.ReviewDismissalAllowanceConnectionResponseProjection.reviewDismissalAllowances", 0)));
        }
        this.typename();
        return this;
    }

    public BranchProtectionRuleResponseProjection branchProtectionRuleConflicts(BranchProtectionRuleConflictConnectionResponseProjection subProjection) {
        return branchProtectionRuleConflicts((String)null, subProjection);
    }

    public BranchProtectionRuleResponseProjection branchProtectionRuleConflicts(String alias, BranchProtectionRuleConflictConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("branchProtectionRuleConflicts").alias(alias).projection(subProjection));
        return this;
    }

    public BranchProtectionRuleResponseProjection branchProtectionRuleConflicts(BranchProtectionRuleBranchProtectionRuleConflictsParametrizedInput input, BranchProtectionRuleConflictConnectionResponseProjection subProjection) {
        return branchProtectionRuleConflicts(null, input, subProjection);
    }

    public BranchProtectionRuleResponseProjection branchProtectionRuleConflicts(String alias, BranchProtectionRuleBranchProtectionRuleConflictsParametrizedInput input, BranchProtectionRuleConflictConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("branchProtectionRuleConflicts").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public BranchProtectionRuleResponseProjection creator(ActorResponseProjection subProjection) {
        return creator(null, subProjection);
    }

    public BranchProtectionRuleResponseProjection creator(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("creator").alias(alias).projection(subProjection));
        return this;
    }

    public BranchProtectionRuleResponseProjection databaseId() {
        return databaseId(null);
    }

    public BranchProtectionRuleResponseProjection databaseId(String alias) {
        fields.add(new GraphQLResponseField("databaseId").alias(alias));
        return this;
    }

    public BranchProtectionRuleResponseProjection dismissesStaleReviews() {
        return dismissesStaleReviews(null);
    }

    public BranchProtectionRuleResponseProjection dismissesStaleReviews(String alias) {
        fields.add(new GraphQLResponseField("dismissesStaleReviews").alias(alias));
        return this;
    }

    public BranchProtectionRuleResponseProjection id() {
        return id(null);
    }

    public BranchProtectionRuleResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public BranchProtectionRuleResponseProjection isAdminEnforced() {
        return isAdminEnforced(null);
    }

    public BranchProtectionRuleResponseProjection isAdminEnforced(String alias) {
        fields.add(new GraphQLResponseField("isAdminEnforced").alias(alias));
        return this;
    }

    public BranchProtectionRuleResponseProjection matchingRefs(RefConnectionResponseProjection subProjection) {
        return matchingRefs((String)null, subProjection);
    }

    public BranchProtectionRuleResponseProjection matchingRefs(String alias, RefConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("matchingRefs").alias(alias).projection(subProjection));
        return this;
    }

    public BranchProtectionRuleResponseProjection matchingRefs(BranchProtectionRuleMatchingRefsParametrizedInput input, RefConnectionResponseProjection subProjection) {
        return matchingRefs(null, input, subProjection);
    }

    public BranchProtectionRuleResponseProjection matchingRefs(String alias, BranchProtectionRuleMatchingRefsParametrizedInput input, RefConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("matchingRefs").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public BranchProtectionRuleResponseProjection pattern() {
        return pattern(null);
    }

    public BranchProtectionRuleResponseProjection pattern(String alias) {
        fields.add(new GraphQLResponseField("pattern").alias(alias));
        return this;
    }

    public BranchProtectionRuleResponseProjection pushAllowances(PushAllowanceConnectionResponseProjection subProjection) {
        return pushAllowances((String)null, subProjection);
    }

    public BranchProtectionRuleResponseProjection pushAllowances(String alias, PushAllowanceConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pushAllowances").alias(alias).projection(subProjection));
        return this;
    }

    public BranchProtectionRuleResponseProjection pushAllowances(BranchProtectionRulePushAllowancesParametrizedInput input, PushAllowanceConnectionResponseProjection subProjection) {
        return pushAllowances(null, input, subProjection);
    }

    public BranchProtectionRuleResponseProjection pushAllowances(String alias, BranchProtectionRulePushAllowancesParametrizedInput input, PushAllowanceConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pushAllowances").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public BranchProtectionRuleResponseProjection repository(RepositoryResponseProjection subProjection) {
        return repository(null, subProjection);
    }

    public BranchProtectionRuleResponseProjection repository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection));
        return this;
    }

    public BranchProtectionRuleResponseProjection requiredApprovingReviewCount() {
        return requiredApprovingReviewCount(null);
    }

    public BranchProtectionRuleResponseProjection requiredApprovingReviewCount(String alias) {
        fields.add(new GraphQLResponseField("requiredApprovingReviewCount").alias(alias));
        return this;
    }

    public BranchProtectionRuleResponseProjection requiredStatusCheckContexts() {
        return requiredStatusCheckContexts(null);
    }

    public BranchProtectionRuleResponseProjection requiredStatusCheckContexts(String alias) {
        fields.add(new GraphQLResponseField("requiredStatusCheckContexts").alias(alias));
        return this;
    }

    public BranchProtectionRuleResponseProjection requiresApprovingReviews() {
        return requiresApprovingReviews(null);
    }

    public BranchProtectionRuleResponseProjection requiresApprovingReviews(String alias) {
        fields.add(new GraphQLResponseField("requiresApprovingReviews").alias(alias));
        return this;
    }

    public BranchProtectionRuleResponseProjection requiresCodeOwnerReviews() {
        return requiresCodeOwnerReviews(null);
    }

    public BranchProtectionRuleResponseProjection requiresCodeOwnerReviews(String alias) {
        fields.add(new GraphQLResponseField("requiresCodeOwnerReviews").alias(alias));
        return this;
    }

    public BranchProtectionRuleResponseProjection requiresCommitSignatures() {
        return requiresCommitSignatures(null);
    }

    public BranchProtectionRuleResponseProjection requiresCommitSignatures(String alias) {
        fields.add(new GraphQLResponseField("requiresCommitSignatures").alias(alias));
        return this;
    }

    public BranchProtectionRuleResponseProjection requiresStatusChecks() {
        return requiresStatusChecks(null);
    }

    public BranchProtectionRuleResponseProjection requiresStatusChecks(String alias) {
        fields.add(new GraphQLResponseField("requiresStatusChecks").alias(alias));
        return this;
    }

    public BranchProtectionRuleResponseProjection requiresStrictStatusChecks() {
        return requiresStrictStatusChecks(null);
    }

    public BranchProtectionRuleResponseProjection requiresStrictStatusChecks(String alias) {
        fields.add(new GraphQLResponseField("requiresStrictStatusChecks").alias(alias));
        return this;
    }

    public BranchProtectionRuleResponseProjection restrictsPushes() {
        return restrictsPushes(null);
    }

    public BranchProtectionRuleResponseProjection restrictsPushes(String alias) {
        fields.add(new GraphQLResponseField("restrictsPushes").alias(alias));
        return this;
    }

    public BranchProtectionRuleResponseProjection restrictsReviewDismissals() {
        return restrictsReviewDismissals(null);
    }

    public BranchProtectionRuleResponseProjection restrictsReviewDismissals(String alias) {
        fields.add(new GraphQLResponseField("restrictsReviewDismissals").alias(alias));
        return this;
    }

    public BranchProtectionRuleResponseProjection reviewDismissalAllowances(ReviewDismissalAllowanceConnectionResponseProjection subProjection) {
        return reviewDismissalAllowances((String)null, subProjection);
    }

    public BranchProtectionRuleResponseProjection reviewDismissalAllowances(String alias, ReviewDismissalAllowanceConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("reviewDismissalAllowances").alias(alias).projection(subProjection));
        return this;
    }

    public BranchProtectionRuleResponseProjection reviewDismissalAllowances(BranchProtectionRuleReviewDismissalAllowancesParametrizedInput input, ReviewDismissalAllowanceConnectionResponseProjection subProjection) {
        return reviewDismissalAllowances(null, input, subProjection);
    }

    public BranchProtectionRuleResponseProjection reviewDismissalAllowances(String alias, BranchProtectionRuleReviewDismissalAllowancesParametrizedInput input, ReviewDismissalAllowanceConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("reviewDismissalAllowances").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public BranchProtectionRuleResponseProjection typename() {
        return typename(null);
    }

    public BranchProtectionRuleResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
