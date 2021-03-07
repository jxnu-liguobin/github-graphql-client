package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for BranchProtectionRule
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class BranchProtectionRuleResponseProjection extends GraphQLResponseProjection {

    override def all$(): BranchProtectionRuleResponseProjection = all$(3)

    override def all$(maxDepth: Int): BranchProtectionRuleResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.BranchProtectionRuleConflictConnectionResponseProjection.branchProtectionRuleConflicts", 0) <= maxDepth) {
            projectionDepthOnFields.put("BranchProtectionRuleResponseProjection.BranchProtectionRuleConflictConnectionResponseProjection.branchProtectionRuleConflicts", projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.BranchProtectionRuleConflictConnectionResponseProjection.branchProtectionRuleConflicts", 0) + 1)
            this.branchProtectionRuleConflicts(new BranchProtectionRuleConflictConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.BranchProtectionRuleConflictConnectionResponseProjection.branchProtectionRuleConflicts", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.ActorResponseProjection.creator", 0) <= maxDepth) {
            projectionDepthOnFields.put("BranchProtectionRuleResponseProjection.ActorResponseProjection.creator", projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.ActorResponseProjection.creator", 0) + 1)
            this.creator(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.ActorResponseProjection.creator", 0)))
        }
        this.databaseId()
        this.dismissesStaleReviews()
        this.id()
        this.isAdminEnforced()
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.RefConnectionResponseProjection.matchingRefs", 0) <= maxDepth) {
            projectionDepthOnFields.put("BranchProtectionRuleResponseProjection.RefConnectionResponseProjection.matchingRefs", projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.RefConnectionResponseProjection.matchingRefs", 0) + 1)
            this.matchingRefs(new RefConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.RefConnectionResponseProjection.matchingRefs", 0)))
        }
        this.pattern()
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.PushAllowanceConnectionResponseProjection.pushAllowances", 0) <= maxDepth) {
            projectionDepthOnFields.put("BranchProtectionRuleResponseProjection.PushAllowanceConnectionResponseProjection.pushAllowances", projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.PushAllowanceConnectionResponseProjection.pushAllowances", 0) + 1)
            this.pushAllowances(new PushAllowanceConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.PushAllowanceConnectionResponseProjection.pushAllowances", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("BranchProtectionRuleResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.RepositoryResponseProjection.repository", 0) + 1)
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.requiredApprovingReviewCount()
        this.requiredStatusCheckContexts()
        this.requiresApprovingReviews()
        this.requiresCodeOwnerReviews()
        this.requiresCommitSignatures()
        this.requiresStatusChecks()
        this.requiresStrictStatusChecks()
        this.restrictsPushes()
        this.restrictsReviewDismissals()
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.ReviewDismissalAllowanceConnectionResponseProjection.reviewDismissalAllowances", 0) <= maxDepth) {
            projectionDepthOnFields.put("BranchProtectionRuleResponseProjection.ReviewDismissalAllowanceConnectionResponseProjection.reviewDismissalAllowances", projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.ReviewDismissalAllowanceConnectionResponseProjection.reviewDismissalAllowances", 0) + 1)
            this.reviewDismissalAllowances(new ReviewDismissalAllowanceConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.ReviewDismissalAllowanceConnectionResponseProjection.reviewDismissalAllowances", 0)))
        }
        this.typename()
        this
    }

    def branchProtectionRuleConflicts(subProjection: BranchProtectionRuleConflictConnectionResponseProjection): BranchProtectionRuleResponseProjection = {
        branchProtectionRuleConflicts(null.asInstanceOf[String], subProjection)
    }

    def branchProtectionRuleConflicts(alias: String, subProjection: BranchProtectionRuleConflictConnectionResponseProjection): BranchProtectionRuleResponseProjection = {
        fields.add(new GraphQLResponseField("branchProtectionRuleConflicts").alias(alias).projection(subProjection))
        this
    }

    def branchProtectionRuleConflicts(input: BranchProtectionRuleBranchProtectionRuleConflictsParametrizedInput,subProjection: BranchProtectionRuleConflictConnectionResponseProjection): BranchProtectionRuleResponseProjection = {
        branchProtectionRuleConflicts(null.asInstanceOf[String], input, subProjection)
    }

    def branchProtectionRuleConflicts(alias: String, input: BranchProtectionRuleBranchProtectionRuleConflictsParametrizedInput , subProjection: BranchProtectionRuleConflictConnectionResponseProjection): BranchProtectionRuleResponseProjection = {
        fields.add(new GraphQLResponseField("branchProtectionRuleConflicts").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def creator(subProjection: ActorResponseProjection): BranchProtectionRuleResponseProjection = {
        creator(null.asInstanceOf[String], subProjection)
    }

    def creator(alias: String, subProjection: ActorResponseProjection): BranchProtectionRuleResponseProjection = {
        fields.add(new GraphQLResponseField("creator").alias(alias).projection(subProjection))
        this
    }

    def databaseId(): BranchProtectionRuleResponseProjection = {
        databaseId(null.asInstanceOf[String])
    }

    def databaseId(alias: String): BranchProtectionRuleResponseProjection = {
        fields.add(new GraphQLResponseField("databaseId").alias(alias))
        this
    }

    def dismissesStaleReviews(): BranchProtectionRuleResponseProjection = {
        dismissesStaleReviews(null.asInstanceOf[String])
    }

    def dismissesStaleReviews(alias: String): BranchProtectionRuleResponseProjection = {
        fields.add(new GraphQLResponseField("dismissesStaleReviews").alias(alias))
        this
    }

    def id(): BranchProtectionRuleResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): BranchProtectionRuleResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def isAdminEnforced(): BranchProtectionRuleResponseProjection = {
        isAdminEnforced(null.asInstanceOf[String])
    }

    def isAdminEnforced(alias: String): BranchProtectionRuleResponseProjection = {
        fields.add(new GraphQLResponseField("isAdminEnforced").alias(alias))
        this
    }

    def matchingRefs(subProjection: RefConnectionResponseProjection): BranchProtectionRuleResponseProjection = {
        matchingRefs(null.asInstanceOf[String], subProjection)
    }

    def matchingRefs(alias: String, subProjection: RefConnectionResponseProjection): BranchProtectionRuleResponseProjection = {
        fields.add(new GraphQLResponseField("matchingRefs").alias(alias).projection(subProjection))
        this
    }

    def matchingRefs(input: BranchProtectionRuleMatchingRefsParametrizedInput,subProjection: RefConnectionResponseProjection): BranchProtectionRuleResponseProjection = {
        matchingRefs(null.asInstanceOf[String], input, subProjection)
    }

    def matchingRefs(alias: String, input: BranchProtectionRuleMatchingRefsParametrizedInput , subProjection: RefConnectionResponseProjection): BranchProtectionRuleResponseProjection = {
        fields.add(new GraphQLResponseField("matchingRefs").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def pattern(): BranchProtectionRuleResponseProjection = {
        pattern(null.asInstanceOf[String])
    }

    def pattern(alias: String): BranchProtectionRuleResponseProjection = {
        fields.add(new GraphQLResponseField("pattern").alias(alias))
        this
    }

    def pushAllowances(subProjection: PushAllowanceConnectionResponseProjection): BranchProtectionRuleResponseProjection = {
        pushAllowances(null.asInstanceOf[String], subProjection)
    }

    def pushAllowances(alias: String, subProjection: PushAllowanceConnectionResponseProjection): BranchProtectionRuleResponseProjection = {
        fields.add(new GraphQLResponseField("pushAllowances").alias(alias).projection(subProjection))
        this
    }

    def pushAllowances(input: BranchProtectionRulePushAllowancesParametrizedInput,subProjection: PushAllowanceConnectionResponseProjection): BranchProtectionRuleResponseProjection = {
        pushAllowances(null.asInstanceOf[String], input, subProjection)
    }

    def pushAllowances(alias: String, input: BranchProtectionRulePushAllowancesParametrizedInput , subProjection: PushAllowanceConnectionResponseProjection): BranchProtectionRuleResponseProjection = {
        fields.add(new GraphQLResponseField("pushAllowances").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def repository(subProjection: RepositoryResponseProjection): BranchProtectionRuleResponseProjection = {
        repository(null.asInstanceOf[String], subProjection)
    }

    def repository(alias: String, subProjection: RepositoryResponseProjection): BranchProtectionRuleResponseProjection = {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection))
        this
    }

    def requiredApprovingReviewCount(): BranchProtectionRuleResponseProjection = {
        requiredApprovingReviewCount(null.asInstanceOf[String])
    }

    def requiredApprovingReviewCount(alias: String): BranchProtectionRuleResponseProjection = {
        fields.add(new GraphQLResponseField("requiredApprovingReviewCount").alias(alias))
        this
    }

    def requiredStatusCheckContexts(): BranchProtectionRuleResponseProjection = {
        requiredStatusCheckContexts(null.asInstanceOf[String])
    }

    def requiredStatusCheckContexts(alias: String): BranchProtectionRuleResponseProjection = {
        fields.add(new GraphQLResponseField("requiredStatusCheckContexts").alias(alias))
        this
    }

    def requiresApprovingReviews(): BranchProtectionRuleResponseProjection = {
        requiresApprovingReviews(null.asInstanceOf[String])
    }

    def requiresApprovingReviews(alias: String): BranchProtectionRuleResponseProjection = {
        fields.add(new GraphQLResponseField("requiresApprovingReviews").alias(alias))
        this
    }

    def requiresCodeOwnerReviews(): BranchProtectionRuleResponseProjection = {
        requiresCodeOwnerReviews(null.asInstanceOf[String])
    }

    def requiresCodeOwnerReviews(alias: String): BranchProtectionRuleResponseProjection = {
        fields.add(new GraphQLResponseField("requiresCodeOwnerReviews").alias(alias))
        this
    }

    def requiresCommitSignatures(): BranchProtectionRuleResponseProjection = {
        requiresCommitSignatures(null.asInstanceOf[String])
    }

    def requiresCommitSignatures(alias: String): BranchProtectionRuleResponseProjection = {
        fields.add(new GraphQLResponseField("requiresCommitSignatures").alias(alias))
        this
    }

    def requiresStatusChecks(): BranchProtectionRuleResponseProjection = {
        requiresStatusChecks(null.asInstanceOf[String])
    }

    def requiresStatusChecks(alias: String): BranchProtectionRuleResponseProjection = {
        fields.add(new GraphQLResponseField("requiresStatusChecks").alias(alias))
        this
    }

    def requiresStrictStatusChecks(): BranchProtectionRuleResponseProjection = {
        requiresStrictStatusChecks(null.asInstanceOf[String])
    }

    def requiresStrictStatusChecks(alias: String): BranchProtectionRuleResponseProjection = {
        fields.add(new GraphQLResponseField("requiresStrictStatusChecks").alias(alias))
        this
    }

    def restrictsPushes(): BranchProtectionRuleResponseProjection = {
        restrictsPushes(null.asInstanceOf[String])
    }

    def restrictsPushes(alias: String): BranchProtectionRuleResponseProjection = {
        fields.add(new GraphQLResponseField("restrictsPushes").alias(alias))
        this
    }

    def restrictsReviewDismissals(): BranchProtectionRuleResponseProjection = {
        restrictsReviewDismissals(null.asInstanceOf[String])
    }

    def restrictsReviewDismissals(alias: String): BranchProtectionRuleResponseProjection = {
        fields.add(new GraphQLResponseField("restrictsReviewDismissals").alias(alias))
        this
    }

    def reviewDismissalAllowances(subProjection: ReviewDismissalAllowanceConnectionResponseProjection): BranchProtectionRuleResponseProjection = {
        reviewDismissalAllowances(null.asInstanceOf[String], subProjection)
    }

    def reviewDismissalAllowances(alias: String, subProjection: ReviewDismissalAllowanceConnectionResponseProjection): BranchProtectionRuleResponseProjection = {
        fields.add(new GraphQLResponseField("reviewDismissalAllowances").alias(alias).projection(subProjection))
        this
    }

    def reviewDismissalAllowances(input: BranchProtectionRuleReviewDismissalAllowancesParametrizedInput,subProjection: ReviewDismissalAllowanceConnectionResponseProjection): BranchProtectionRuleResponseProjection = {
        reviewDismissalAllowances(null.asInstanceOf[String], input, subProjection)
    }

    def reviewDismissalAllowances(alias: String, input: BranchProtectionRuleReviewDismissalAllowancesParametrizedInput , subProjection: ReviewDismissalAllowanceConnectionResponseProjection): BranchProtectionRuleResponseProjection = {
        fields.add(new GraphQLResponseField("reviewDismissalAllowances").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def typename(): BranchProtectionRuleResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): BranchProtectionRuleResponseProjection = {
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
        val that = obj.asInstanceOf[BranchProtectionRuleResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
