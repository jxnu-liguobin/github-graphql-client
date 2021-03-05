package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class BranchProtectionRuleTO(
    val creator: ActorTO?,
    val databaseId: Int?,
    val dismissesStaleReviews: Boolean,
    override
    val id: String,
    val isAdminEnforced: Boolean,
    val pattern: String,
    val repository: RepositoryTO?,
    val requiredApprovingReviewCount: Int?,
    val requiredStatusCheckContexts: List<String?>?,
    val requiresApprovingReviews: Boolean,
    val requiresCodeOwnerReviews: Boolean,
    val requiresCommitSignatures: Boolean,
    val requiresStatusChecks: Boolean,
    val requiresStrictStatusChecks: Boolean,
    val restrictsPushes: Boolean,
    val restrictsReviewDismissals: Boolean
) : NodeTO {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (creator != null) {
            joiner.add("creator: " + GraphQLRequestSerializer.getEntry(creator))
        }
        if (databaseId != null) {
            joiner.add("databaseId: " + GraphQLRequestSerializer.getEntry(databaseId))
        }
        joiner.add("dismissesStaleReviews: " + GraphQLRequestSerializer.getEntry(dismissesStaleReviews))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("isAdminEnforced: " + GraphQLRequestSerializer.getEntry(isAdminEnforced))
        joiner.add("pattern: " + GraphQLRequestSerializer.getEntry(pattern))
        if (repository != null) {
            joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository))
        }
        if (requiredApprovingReviewCount != null) {
            joiner.add("requiredApprovingReviewCount: " + GraphQLRequestSerializer.getEntry(requiredApprovingReviewCount))
        }
        if (requiredStatusCheckContexts != null) {
            joiner.add("requiredStatusCheckContexts: " + GraphQLRequestSerializer.getEntry(requiredStatusCheckContexts))
        }
        joiner.add("requiresApprovingReviews: " + GraphQLRequestSerializer.getEntry(requiresApprovingReviews))
        joiner.add("requiresCodeOwnerReviews: " + GraphQLRequestSerializer.getEntry(requiresCodeOwnerReviews))
        joiner.add("requiresCommitSignatures: " + GraphQLRequestSerializer.getEntry(requiresCommitSignatures))
        joiner.add("requiresStatusChecks: " + GraphQLRequestSerializer.getEntry(requiresStatusChecks))
        joiner.add("requiresStrictStatusChecks: " + GraphQLRequestSerializer.getEntry(requiresStrictStatusChecks))
        joiner.add("restrictsPushes: " + GraphQLRequestSerializer.getEntry(restrictsPushes))
        joiner.add("restrictsReviewDismissals: " + GraphQLRequestSerializer.getEntry(restrictsReviewDismissals))
        return joiner.toString()
    }
}
