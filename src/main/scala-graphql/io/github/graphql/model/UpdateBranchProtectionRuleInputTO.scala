package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class UpdateBranchProtectionRuleInputTO(
    @javax.validation.constraints.NotNull
    branchProtectionRuleId: String,
    clientMutationId: String,
    dismissesStaleReviews: Option[Boolean],
    isAdminEnforced: Option[Boolean],
    pattern: String,
    @javax.validation.constraints.NotNull
    pushActorIds: Seq[String],
    requiredApprovingReviewCount: Option[Int],
    @javax.validation.constraints.NotNull
    requiredStatusCheckContexts: Seq[String],
    requiresApprovingReviews: Option[Boolean],
    requiresCodeOwnerReviews: Option[Boolean],
    requiresCommitSignatures: Option[Boolean],
    requiresStatusChecks: Option[Boolean],
    requiresStrictStatusChecks: Option[Boolean],
    restrictsPushes: Option[Boolean],
    restrictsReviewDismissals: Option[Boolean],
    @javax.validation.constraints.NotNull
    reviewDismissalActorIds: Seq[String]
) {

    override def toString(): String = {
        Seq(
            if (branchProtectionRuleId != null) "branchProtectionRuleId: " + GraphQLRequestSerializer.getEntry(branchProtectionRuleId) else "",
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (dismissesStaleReviews.isDefined) "dismissesStaleReviews: " + GraphQLRequestSerializer.getEntry(dismissesStaleReviews.get) else "",
            if (isAdminEnforced.isDefined) "isAdminEnforced: " + GraphQLRequestSerializer.getEntry(isAdminEnforced.get) else "",
            if (pattern != null) "pattern: " + GraphQLRequestSerializer.getEntry(pattern) else "",
            if (pushActorIds != null) "pushActorIds: " + GraphQLRequestSerializer.getEntry(pushActorIds.asJava) else "",
            if (requiredApprovingReviewCount.isDefined) "requiredApprovingReviewCount: " + GraphQLRequestSerializer.getEntry(requiredApprovingReviewCount.get) else "",
            if (requiredStatusCheckContexts != null) "requiredStatusCheckContexts: " + GraphQLRequestSerializer.getEntry(requiredStatusCheckContexts.asJava) else "",
            if (requiresApprovingReviews.isDefined) "requiresApprovingReviews: " + GraphQLRequestSerializer.getEntry(requiresApprovingReviews.get) else "",
            if (requiresCodeOwnerReviews.isDefined) "requiresCodeOwnerReviews: " + GraphQLRequestSerializer.getEntry(requiresCodeOwnerReviews.get) else "",
            if (requiresCommitSignatures.isDefined) "requiresCommitSignatures: " + GraphQLRequestSerializer.getEntry(requiresCommitSignatures.get) else "",
            if (requiresStatusChecks.isDefined) "requiresStatusChecks: " + GraphQLRequestSerializer.getEntry(requiresStatusChecks.get) else "",
            if (requiresStrictStatusChecks.isDefined) "requiresStrictStatusChecks: " + GraphQLRequestSerializer.getEntry(requiresStrictStatusChecks.get) else "",
            if (restrictsPushes.isDefined) "restrictsPushes: " + GraphQLRequestSerializer.getEntry(restrictsPushes.get) else "",
            if (restrictsReviewDismissals.isDefined) "restrictsReviewDismissals: " + GraphQLRequestSerializer.getEntry(restrictsReviewDismissals.get) else "",
            if (reviewDismissalActorIds != null) "reviewDismissalActorIds: " + GraphQLRequestSerializer.getEntry(reviewDismissalActorIds.asJava) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object UpdateBranchProtectionRuleInputTO {

    def builder(): UpdateBranchProtectionRuleInputTO.Builder = new Builder()

    class Builder {

        private var branchProtectionRuleId: String = _
        private var clientMutationId: String = _
        private var dismissesStaleReviews: Option[Boolean] = _
        private var isAdminEnforced: Option[Boolean] = _
        private var pattern: String = _
        private var pushActorIds: Seq[String] = _
        private var requiredApprovingReviewCount: Option[Int] = _
        private var requiredStatusCheckContexts: Seq[String] = _
        private var requiresApprovingReviews: Option[Boolean] = _
        private var requiresCodeOwnerReviews: Option[Boolean] = _
        private var requiresCommitSignatures: Option[Boolean] = _
        private var requiresStatusChecks: Option[Boolean] = _
        private var requiresStrictStatusChecks: Option[Boolean] = _
        private var restrictsPushes: Option[Boolean] = _
        private var restrictsReviewDismissals: Option[Boolean] = _
        private var reviewDismissalActorIds: Seq[String] = _

        def setBranchProtectionRuleId(branchProtectionRuleId: String): Builder = {
            this.branchProtectionRuleId = branchProtectionRuleId
            this
        }

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setDismissesStaleReviews(dismissesStaleReviews: Option[Boolean]): Builder = {
            this.dismissesStaleReviews = dismissesStaleReviews
            this
        }

        def setIsAdminEnforced(isAdminEnforced: Option[Boolean]): Builder = {
            this.isAdminEnforced = isAdminEnforced
            this
        }

        def setPattern(pattern: String): Builder = {
            this.pattern = pattern
            this
        }

        def setPushActorIds(pushActorIds: Seq[String]): Builder = {
            this.pushActorIds = pushActorIds
            this
        }

        def setRequiredApprovingReviewCount(requiredApprovingReviewCount: Option[Int]): Builder = {
            this.requiredApprovingReviewCount = requiredApprovingReviewCount
            this
        }

        def setRequiredStatusCheckContexts(requiredStatusCheckContexts: Seq[String]): Builder = {
            this.requiredStatusCheckContexts = requiredStatusCheckContexts
            this
        }

        def setRequiresApprovingReviews(requiresApprovingReviews: Option[Boolean]): Builder = {
            this.requiresApprovingReviews = requiresApprovingReviews
            this
        }

        def setRequiresCodeOwnerReviews(requiresCodeOwnerReviews: Option[Boolean]): Builder = {
            this.requiresCodeOwnerReviews = requiresCodeOwnerReviews
            this
        }

        def setRequiresCommitSignatures(requiresCommitSignatures: Option[Boolean]): Builder = {
            this.requiresCommitSignatures = requiresCommitSignatures
            this
        }

        def setRequiresStatusChecks(requiresStatusChecks: Option[Boolean]): Builder = {
            this.requiresStatusChecks = requiresStatusChecks
            this
        }

        def setRequiresStrictStatusChecks(requiresStrictStatusChecks: Option[Boolean]): Builder = {
            this.requiresStrictStatusChecks = requiresStrictStatusChecks
            this
        }

        def setRestrictsPushes(restrictsPushes: Option[Boolean]): Builder = {
            this.restrictsPushes = restrictsPushes
            this
        }

        def setRestrictsReviewDismissals(restrictsReviewDismissals: Option[Boolean]): Builder = {
            this.restrictsReviewDismissals = restrictsReviewDismissals
            this
        }

        def setReviewDismissalActorIds(reviewDismissalActorIds: Seq[String]): Builder = {
            this.reviewDismissalActorIds = reviewDismissalActorIds
            this
        }

        def build(): UpdateBranchProtectionRuleInputTO = new UpdateBranchProtectionRuleInputTO(branchProtectionRuleId, clientMutationId, dismissesStaleReviews, isAdminEnforced, pattern, pushActorIds, requiredApprovingReviewCount, requiredStatusCheckContexts, requiresApprovingReviews, requiresCodeOwnerReviews, requiresCommitSignatures, requiresStatusChecks, requiresStrictStatusChecks, restrictsPushes, restrictsReviewDismissals, reviewDismissalActorIds)

    }
}
