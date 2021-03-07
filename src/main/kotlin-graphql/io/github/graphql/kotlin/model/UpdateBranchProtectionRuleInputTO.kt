package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
open class UpdateBranchProtectionRuleInputTO(
    val branchProtectionRuleId: String,
    val clientMutationId: String?,
    val dismissesStaleReviews: Boolean?,
    val isAdminEnforced: Boolean?,
    val pattern: String?,
    val pushActorIds: List<String>?,
    val requiredApprovingReviewCount: Int?,
    val requiredStatusCheckContexts: List<String>?,
    val requiresApprovingReviews: Boolean?,
    val requiresCodeOwnerReviews: Boolean?,
    val requiresCommitSignatures: Boolean?,
    val requiresStatusChecks: Boolean?,
    val requiresStrictStatusChecks: Boolean?,
    val restrictsPushes: Boolean?,
    val restrictsReviewDismissals: Boolean?,
    val reviewDismissalActorIds: List<String>?
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("branchProtectionRuleId: " + GraphQLRequestSerializer.getEntry(branchProtectionRuleId))
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        if (dismissesStaleReviews != null) {
            joiner.add("dismissesStaleReviews: " + GraphQLRequestSerializer.getEntry(dismissesStaleReviews))
        }
        if (isAdminEnforced != null) {
            joiner.add("isAdminEnforced: " + GraphQLRequestSerializer.getEntry(isAdminEnforced))
        }
        if (pattern != null) {
            joiner.add("pattern: " + GraphQLRequestSerializer.getEntry(pattern))
        }
        if (pushActorIds != null) {
            joiner.add("pushActorIds: " + GraphQLRequestSerializer.getEntry(pushActorIds))
        }
        if (requiredApprovingReviewCount != null) {
            joiner.add("requiredApprovingReviewCount: " + GraphQLRequestSerializer.getEntry(requiredApprovingReviewCount))
        }
        if (requiredStatusCheckContexts != null) {
            joiner.add("requiredStatusCheckContexts: " + GraphQLRequestSerializer.getEntry(requiredStatusCheckContexts))
        }
        if (requiresApprovingReviews != null) {
            joiner.add("requiresApprovingReviews: " + GraphQLRequestSerializer.getEntry(requiresApprovingReviews))
        }
        if (requiresCodeOwnerReviews != null) {
            joiner.add("requiresCodeOwnerReviews: " + GraphQLRequestSerializer.getEntry(requiresCodeOwnerReviews))
        }
        if (requiresCommitSignatures != null) {
            joiner.add("requiresCommitSignatures: " + GraphQLRequestSerializer.getEntry(requiresCommitSignatures))
        }
        if (requiresStatusChecks != null) {
            joiner.add("requiresStatusChecks: " + GraphQLRequestSerializer.getEntry(requiresStatusChecks))
        }
        if (requiresStrictStatusChecks != null) {
            joiner.add("requiresStrictStatusChecks: " + GraphQLRequestSerializer.getEntry(requiresStrictStatusChecks))
        }
        if (restrictsPushes != null) {
            joiner.add("restrictsPushes: " + GraphQLRequestSerializer.getEntry(restrictsPushes))
        }
        if (restrictsReviewDismissals != null) {
            joiner.add("restrictsReviewDismissals: " + GraphQLRequestSerializer.getEntry(restrictsReviewDismissals))
        }
        if (reviewDismissalActorIds != null) {
            joiner.add("reviewDismissalActorIds: " + GraphQLRequestSerializer.getEntry(reviewDismissalActorIds))
        }
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as UpdateBranchProtectionRuleInputTO
        return Objects.equals(branchProtectionRuleId, that.branchProtectionRuleId)
                && Objects.equals(clientMutationId, that.clientMutationId)
                && Objects.equals(dismissesStaleReviews, that.dismissesStaleReviews)
                && Objects.equals(isAdminEnforced, that.isAdminEnforced)
                && Objects.equals(pattern, that.pattern)
                && Objects.equals(pushActorIds, that.pushActorIds)
                && Objects.equals(requiredApprovingReviewCount, that.requiredApprovingReviewCount)
                && Objects.equals(requiredStatusCheckContexts, that.requiredStatusCheckContexts)
                && Objects.equals(requiresApprovingReviews, that.requiresApprovingReviews)
                && Objects.equals(requiresCodeOwnerReviews, that.requiresCodeOwnerReviews)
                && Objects.equals(requiresCommitSignatures, that.requiresCommitSignatures)
                && Objects.equals(requiresStatusChecks, that.requiresStatusChecks)
                && Objects.equals(requiresStrictStatusChecks, that.requiresStrictStatusChecks)
                && Objects.equals(restrictsPushes, that.restrictsPushes)
                && Objects.equals(restrictsReviewDismissals, that.restrictsReviewDismissals)
                && Objects.equals(reviewDismissalActorIds, that.reviewDismissalActorIds)

    }

    override fun hashCode(): Int = {
        return Objects.hash(branchProtectionRuleId, clientMutationId, dismissesStaleReviews, isAdminEnforced, pattern, pushActorIds, requiredApprovingReviewCount, requiredStatusCheckContexts, requiresApprovingReviews, requiresCodeOwnerReviews, requiresCommitSignatures, requiresStatusChecks, requiresStrictStatusChecks, restrictsPushes, restrictsReviewDismissals, reviewDismissalActorIds)
    }

    class Builder {

        private lateinit var branchProtectionRuleId: String
        private var clientMutationId: String? = null
        private var dismissesStaleReviews: Boolean? = null
        private var isAdminEnforced: Boolean? = null
        private var pattern: String? = null
        private var pushActorIds: List<String>? = null
        private var requiredApprovingReviewCount: Int? = null
        private var requiredStatusCheckContexts: List<String>? = null
        private var requiresApprovingReviews: Boolean? = null
        private var requiresCodeOwnerReviews: Boolean? = null
        private var requiresCommitSignatures: Boolean? = null
        private var requiresStatusChecks: Boolean? = null
        private var requiresStrictStatusChecks: Boolean? = null
        private var restrictsPushes: Boolean? = null
        private var restrictsReviewDismissals: Boolean? = null
        private var reviewDismissalActorIds: List<String>? = null

        fun setBranchProtectionRuleId(branchProtectionRuleId: String): Builder {
            this.branchProtectionRuleId = branchProtectionRuleId
            return this
        }

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setDismissesStaleReviews(dismissesStaleReviews: Boolean?): Builder {
            this.dismissesStaleReviews = dismissesStaleReviews
            return this
        }

        fun setIsAdminEnforced(isAdminEnforced: Boolean?): Builder {
            this.isAdminEnforced = isAdminEnforced
            return this
        }

        fun setPattern(pattern: String?): Builder {
            this.pattern = pattern
            return this
        }

        fun setPushActorIds(pushActorIds: List<String>?): Builder {
            this.pushActorIds = pushActorIds
            return this
        }

        fun setRequiredApprovingReviewCount(requiredApprovingReviewCount: Int?): Builder {
            this.requiredApprovingReviewCount = requiredApprovingReviewCount
            return this
        }

        fun setRequiredStatusCheckContexts(requiredStatusCheckContexts: List<String>?): Builder {
            this.requiredStatusCheckContexts = requiredStatusCheckContexts
            return this
        }

        fun setRequiresApprovingReviews(requiresApprovingReviews: Boolean?): Builder {
            this.requiresApprovingReviews = requiresApprovingReviews
            return this
        }

        fun setRequiresCodeOwnerReviews(requiresCodeOwnerReviews: Boolean?): Builder {
            this.requiresCodeOwnerReviews = requiresCodeOwnerReviews
            return this
        }

        fun setRequiresCommitSignatures(requiresCommitSignatures: Boolean?): Builder {
            this.requiresCommitSignatures = requiresCommitSignatures
            return this
        }

        fun setRequiresStatusChecks(requiresStatusChecks: Boolean?): Builder {
            this.requiresStatusChecks = requiresStatusChecks
            return this
        }

        fun setRequiresStrictStatusChecks(requiresStrictStatusChecks: Boolean?): Builder {
            this.requiresStrictStatusChecks = requiresStrictStatusChecks
            return this
        }

        fun setRestrictsPushes(restrictsPushes: Boolean?): Builder {
            this.restrictsPushes = restrictsPushes
            return this
        }

        fun setRestrictsReviewDismissals(restrictsReviewDismissals: Boolean?): Builder {
            this.restrictsReviewDismissals = restrictsReviewDismissals
            return this
        }

        fun setReviewDismissalActorIds(reviewDismissalActorIds: List<String>?): Builder {
            this.reviewDismissalActorIds = reviewDismissalActorIds
            return this
        }

        fun build(): UpdateBranchProtectionRuleInputTO {
            return UpdateBranchProtectionRuleInputTO(branchProtectionRuleId, clientMutationId, dismissesStaleReviews, isAdminEnforced, pattern, pushActorIds, requiredApprovingReviewCount, requiredStatusCheckContexts, requiresApprovingReviews, requiresCodeOwnerReviews, requiresCommitSignatures, requiresStatusChecks, requiresStrictStatusChecks, restrictsPushes, restrictsReviewDismissals, reviewDismissalActorIds)
        }
    }
}
