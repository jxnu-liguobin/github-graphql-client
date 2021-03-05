package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class CreateBranchProtectionRuleInputTO(
    val clientMutationId: String?,
    val dismissesStaleReviews: Boolean?,
    val isAdminEnforced: Boolean?,
    val pattern: String,
    val pushActorIds: List<String>?,
    val repositoryId: String,
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

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        if (dismissesStaleReviews != null) {
            joiner.add("dismissesStaleReviews: " + GraphQLRequestSerializer.getEntry(dismissesStaleReviews))
        }
        if (isAdminEnforced != null) {
            joiner.add("isAdminEnforced: " + GraphQLRequestSerializer.getEntry(isAdminEnforced))
        }
        joiner.add("pattern: " + GraphQLRequestSerializer.getEntry(pattern))
        if (pushActorIds != null) {
            joiner.add("pushActorIds: " + GraphQLRequestSerializer.getEntry(pushActorIds))
        }
        joiner.add("repositoryId: " + GraphQLRequestSerializer.getEntry(repositoryId))
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
}
