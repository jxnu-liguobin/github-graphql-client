package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
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

    companion object {
        fun builder(): Builder = Builder()
    }

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

    class Builder {

        private var creator: ActorTO? = null
        private var databaseId: Int? = null
        private var dismissesStaleReviews: Boolean = false
        private lateinit var id: String
        private var isAdminEnforced: Boolean = false
        private lateinit var pattern: String
        private var repository: RepositoryTO? = null
        private var requiredApprovingReviewCount: Int? = null
        private var requiredStatusCheckContexts: List<String?>? = null
        private var requiresApprovingReviews: Boolean = false
        private var requiresCodeOwnerReviews: Boolean = false
        private var requiresCommitSignatures: Boolean = false
        private var requiresStatusChecks: Boolean = false
        private var requiresStrictStatusChecks: Boolean = false
        private var restrictsPushes: Boolean = false
        private var restrictsReviewDismissals: Boolean = false

        fun setCreator(creator: ActorTO?): Builder {
            this.creator = creator
            return this
        }

        fun setDatabaseId(databaseId: Int?): Builder {
            this.databaseId = databaseId
            return this
        }

        fun setDismissesStaleReviews(dismissesStaleReviews: Boolean): Builder {
            this.dismissesStaleReviews = dismissesStaleReviews
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setIsAdminEnforced(isAdminEnforced: Boolean): Builder {
            this.isAdminEnforced = isAdminEnforced
            return this
        }

        fun setPattern(pattern: String): Builder {
            this.pattern = pattern
            return this
        }

        fun setRepository(repository: RepositoryTO?): Builder {
            this.repository = repository
            return this
        }

        fun setRequiredApprovingReviewCount(requiredApprovingReviewCount: Int?): Builder {
            this.requiredApprovingReviewCount = requiredApprovingReviewCount
            return this
        }

        fun setRequiredStatusCheckContexts(requiredStatusCheckContexts: List<String?>?): Builder {
            this.requiredStatusCheckContexts = requiredStatusCheckContexts
            return this
        }

        fun setRequiresApprovingReviews(requiresApprovingReviews: Boolean): Builder {
            this.requiresApprovingReviews = requiresApprovingReviews
            return this
        }

        fun setRequiresCodeOwnerReviews(requiresCodeOwnerReviews: Boolean): Builder {
            this.requiresCodeOwnerReviews = requiresCodeOwnerReviews
            return this
        }

        fun setRequiresCommitSignatures(requiresCommitSignatures: Boolean): Builder {
            this.requiresCommitSignatures = requiresCommitSignatures
            return this
        }

        fun setRequiresStatusChecks(requiresStatusChecks: Boolean): Builder {
            this.requiresStatusChecks = requiresStatusChecks
            return this
        }

        fun setRequiresStrictStatusChecks(requiresStrictStatusChecks: Boolean): Builder {
            this.requiresStrictStatusChecks = requiresStrictStatusChecks
            return this
        }

        fun setRestrictsPushes(restrictsPushes: Boolean): Builder {
            this.restrictsPushes = restrictsPushes
            return this
        }

        fun setRestrictsReviewDismissals(restrictsReviewDismissals: Boolean): Builder {
            this.restrictsReviewDismissals = restrictsReviewDismissals
            return this
        }

        fun build(): BranchProtectionRuleTO {
            return BranchProtectionRuleTO(creator, databaseId, dismissesStaleReviews, id, isAdminEnforced, pattern, repository, requiredApprovingReviewCount, requiredStatusCheckContexts, requiresApprovingReviews, requiresCodeOwnerReviews, requiresCommitSignatures, requiresStatusChecks, requiresStrictStatusChecks, restrictsPushes, restrictsReviewDismissals)
        }
    }
}
