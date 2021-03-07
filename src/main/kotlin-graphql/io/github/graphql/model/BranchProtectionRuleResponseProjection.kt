package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for BranchProtectionRule
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class BranchProtectionRuleResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): BranchProtectionRuleResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): BranchProtectionRuleResponseProjection {
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.BranchProtectionRuleConflictConnectionResponseProjection.branchProtectionRuleConflicts", 0) <= maxDepth) {
            projectionDepthOnFields["BranchProtectionRuleResponseProjection.BranchProtectionRuleConflictConnectionResponseProjection.branchProtectionRuleConflicts"] = projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.BranchProtectionRuleConflictConnectionResponseProjection.branchProtectionRuleConflicts", 0) + 1
            this.branchProtectionRuleConflicts(BranchProtectionRuleConflictConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.BranchProtectionRuleConflictConnectionResponseProjection.branchProtectionRuleConflicts", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.ActorResponseProjection.creator", 0) <= maxDepth) {
            projectionDepthOnFields["BranchProtectionRuleResponseProjection.ActorResponseProjection.creator"] = projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.ActorResponseProjection.creator", 0) + 1
            this.creator(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.ActorResponseProjection.creator", 0)))
        }
        this.databaseId()
        this.dismissesStaleReviews()
        this.id()
        this.isAdminEnforced()
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.RefConnectionResponseProjection.matchingRefs", 0) <= maxDepth) {
            projectionDepthOnFields["BranchProtectionRuleResponseProjection.RefConnectionResponseProjection.matchingRefs"] = projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.RefConnectionResponseProjection.matchingRefs", 0) + 1
            this.matchingRefs(RefConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.RefConnectionResponseProjection.matchingRefs", 0)))
        }
        this.pattern()
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.PushAllowanceConnectionResponseProjection.pushAllowances", 0) <= maxDepth) {
            projectionDepthOnFields["BranchProtectionRuleResponseProjection.PushAllowanceConnectionResponseProjection.pushAllowances"] = projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.PushAllowanceConnectionResponseProjection.pushAllowances", 0) + 1
            this.pushAllowances(PushAllowanceConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.PushAllowanceConnectionResponseProjection.pushAllowances", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields["BranchProtectionRuleResponseProjection.RepositoryResponseProjection.repository"] = projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.RepositoryResponseProjection.repository", 0) + 1
            this.repository(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.RepositoryResponseProjection.repository", 0)))
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
            projectionDepthOnFields["BranchProtectionRuleResponseProjection.ReviewDismissalAllowanceConnectionResponseProjection.reviewDismissalAllowances"] = projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.ReviewDismissalAllowanceConnectionResponseProjection.reviewDismissalAllowances", 0) + 1
            this.reviewDismissalAllowances(ReviewDismissalAllowanceConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("BranchProtectionRuleResponseProjection.ReviewDismissalAllowanceConnectionResponseProjection.reviewDismissalAllowances", 0)))
        }
        this.typename()
        return this
    }

    fun branchProtectionRuleConflicts(subProjection: BranchProtectionRuleConflictConnectionResponseProjection): BranchProtectionRuleResponseProjection = branchProtectionRuleConflicts(null, subProjection)

    fun branchProtectionRuleConflicts(alias: String?, subProjection: BranchProtectionRuleConflictConnectionResponseProjection): BranchProtectionRuleResponseProjection {
        fields.add(GraphQLResponseField("branchProtectionRuleConflicts").alias(alias).projection(subProjection))
        return this
    }

    fun branchProtectionRuleConflicts(input: BranchProtectionRuleBranchProtectionRuleConflictsParametrizedInput, subProjection: BranchProtectionRuleConflictConnectionResponseProjection): BranchProtectionRuleResponseProjection = branchProtectionRuleConflicts(null, input, subProjection)

    fun branchProtectionRuleConflicts(alias: String?, input: BranchProtectionRuleBranchProtectionRuleConflictsParametrizedInput, subProjection: BranchProtectionRuleConflictConnectionResponseProjection): BranchProtectionRuleResponseProjection {
        fields.add(GraphQLResponseField("branchProtectionRuleConflicts").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun creator(subProjection: ActorResponseProjection): BranchProtectionRuleResponseProjection = creator(null, subProjection)

    fun creator(alias: String?, subProjection: ActorResponseProjection): BranchProtectionRuleResponseProjection {
        fields.add(GraphQLResponseField("creator").alias(alias).projection(subProjection))
        return this
    }

    fun databaseId(): BranchProtectionRuleResponseProjection = databaseId(null)

    fun databaseId(alias: String?): BranchProtectionRuleResponseProjection {
        fields.add(GraphQLResponseField("databaseId").alias(alias))
        return this
    }

    fun dismissesStaleReviews(): BranchProtectionRuleResponseProjection = dismissesStaleReviews(null)

    fun dismissesStaleReviews(alias: String?): BranchProtectionRuleResponseProjection {
        fields.add(GraphQLResponseField("dismissesStaleReviews").alias(alias))
        return this
    }

    fun id(): BranchProtectionRuleResponseProjection = id(null)

    fun id(alias: String?): BranchProtectionRuleResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun isAdminEnforced(): BranchProtectionRuleResponseProjection = isAdminEnforced(null)

    fun isAdminEnforced(alias: String?): BranchProtectionRuleResponseProjection {
        fields.add(GraphQLResponseField("isAdminEnforced").alias(alias))
        return this
    }

    fun matchingRefs(subProjection: RefConnectionResponseProjection): BranchProtectionRuleResponseProjection = matchingRefs(null, subProjection)

    fun matchingRefs(alias: String?, subProjection: RefConnectionResponseProjection): BranchProtectionRuleResponseProjection {
        fields.add(GraphQLResponseField("matchingRefs").alias(alias).projection(subProjection))
        return this
    }

    fun matchingRefs(input: BranchProtectionRuleMatchingRefsParametrizedInput, subProjection: RefConnectionResponseProjection): BranchProtectionRuleResponseProjection = matchingRefs(null, input, subProjection)

    fun matchingRefs(alias: String?, input: BranchProtectionRuleMatchingRefsParametrizedInput, subProjection: RefConnectionResponseProjection): BranchProtectionRuleResponseProjection {
        fields.add(GraphQLResponseField("matchingRefs").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun pattern(): BranchProtectionRuleResponseProjection = pattern(null)

    fun pattern(alias: String?): BranchProtectionRuleResponseProjection {
        fields.add(GraphQLResponseField("pattern").alias(alias))
        return this
    }

    fun pushAllowances(subProjection: PushAllowanceConnectionResponseProjection): BranchProtectionRuleResponseProjection = pushAllowances(null, subProjection)

    fun pushAllowances(alias: String?, subProjection: PushAllowanceConnectionResponseProjection): BranchProtectionRuleResponseProjection {
        fields.add(GraphQLResponseField("pushAllowances").alias(alias).projection(subProjection))
        return this
    }

    fun pushAllowances(input: BranchProtectionRulePushAllowancesParametrizedInput, subProjection: PushAllowanceConnectionResponseProjection): BranchProtectionRuleResponseProjection = pushAllowances(null, input, subProjection)

    fun pushAllowances(alias: String?, input: BranchProtectionRulePushAllowancesParametrizedInput, subProjection: PushAllowanceConnectionResponseProjection): BranchProtectionRuleResponseProjection {
        fields.add(GraphQLResponseField("pushAllowances").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun repository(subProjection: RepositoryResponseProjection): BranchProtectionRuleResponseProjection = repository(null, subProjection)

    fun repository(alias: String?, subProjection: RepositoryResponseProjection): BranchProtectionRuleResponseProjection {
        fields.add(GraphQLResponseField("repository").alias(alias).projection(subProjection))
        return this
    }

    fun requiredApprovingReviewCount(): BranchProtectionRuleResponseProjection = requiredApprovingReviewCount(null)

    fun requiredApprovingReviewCount(alias: String?): BranchProtectionRuleResponseProjection {
        fields.add(GraphQLResponseField("requiredApprovingReviewCount").alias(alias))
        return this
    }

    fun requiredStatusCheckContexts(): BranchProtectionRuleResponseProjection = requiredStatusCheckContexts(null)

    fun requiredStatusCheckContexts(alias: String?): BranchProtectionRuleResponseProjection {
        fields.add(GraphQLResponseField("requiredStatusCheckContexts").alias(alias))
        return this
    }

    fun requiresApprovingReviews(): BranchProtectionRuleResponseProjection = requiresApprovingReviews(null)

    fun requiresApprovingReviews(alias: String?): BranchProtectionRuleResponseProjection {
        fields.add(GraphQLResponseField("requiresApprovingReviews").alias(alias))
        return this
    }

    fun requiresCodeOwnerReviews(): BranchProtectionRuleResponseProjection = requiresCodeOwnerReviews(null)

    fun requiresCodeOwnerReviews(alias: String?): BranchProtectionRuleResponseProjection {
        fields.add(GraphQLResponseField("requiresCodeOwnerReviews").alias(alias))
        return this
    }

    fun requiresCommitSignatures(): BranchProtectionRuleResponseProjection = requiresCommitSignatures(null)

    fun requiresCommitSignatures(alias: String?): BranchProtectionRuleResponseProjection {
        fields.add(GraphQLResponseField("requiresCommitSignatures").alias(alias))
        return this
    }

    fun requiresStatusChecks(): BranchProtectionRuleResponseProjection = requiresStatusChecks(null)

    fun requiresStatusChecks(alias: String?): BranchProtectionRuleResponseProjection {
        fields.add(GraphQLResponseField("requiresStatusChecks").alias(alias))
        return this
    }

    fun requiresStrictStatusChecks(): BranchProtectionRuleResponseProjection = requiresStrictStatusChecks(null)

    fun requiresStrictStatusChecks(alias: String?): BranchProtectionRuleResponseProjection {
        fields.add(GraphQLResponseField("requiresStrictStatusChecks").alias(alias))
        return this
    }

    fun restrictsPushes(): BranchProtectionRuleResponseProjection = restrictsPushes(null)

    fun restrictsPushes(alias: String?): BranchProtectionRuleResponseProjection {
        fields.add(GraphQLResponseField("restrictsPushes").alias(alias))
        return this
    }

    fun restrictsReviewDismissals(): BranchProtectionRuleResponseProjection = restrictsReviewDismissals(null)

    fun restrictsReviewDismissals(alias: String?): BranchProtectionRuleResponseProjection {
        fields.add(GraphQLResponseField("restrictsReviewDismissals").alias(alias))
        return this
    }

    fun reviewDismissalAllowances(subProjection: ReviewDismissalAllowanceConnectionResponseProjection): BranchProtectionRuleResponseProjection = reviewDismissalAllowances(null, subProjection)

    fun reviewDismissalAllowances(alias: String?, subProjection: ReviewDismissalAllowanceConnectionResponseProjection): BranchProtectionRuleResponseProjection {
        fields.add(GraphQLResponseField("reviewDismissalAllowances").alias(alias).projection(subProjection))
        return this
    }

    fun reviewDismissalAllowances(input: BranchProtectionRuleReviewDismissalAllowancesParametrizedInput, subProjection: ReviewDismissalAllowanceConnectionResponseProjection): BranchProtectionRuleResponseProjection = reviewDismissalAllowances(null, input, subProjection)

    fun reviewDismissalAllowances(alias: String?, input: BranchProtectionRuleReviewDismissalAllowancesParametrizedInput, subProjection: ReviewDismissalAllowanceConnectionResponseProjection): BranchProtectionRuleResponseProjection {
        fields.add(GraphQLResponseField("reviewDismissalAllowances").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun typename(): BranchProtectionRuleResponseProjection = typename(null)

    fun typename(alias: String?): BranchProtectionRuleResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
