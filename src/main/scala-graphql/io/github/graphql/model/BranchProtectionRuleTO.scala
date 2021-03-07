package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class BranchProtectionRuleTO(
    creator: ActorTO,
    databaseId: Option[Int],
    dismissesStaleReviews: Boolean,
    @javax.validation.constraints.NotNull
    override val id: String,
    isAdminEnforced: Boolean,
    @javax.validation.constraints.NotNull
    pattern: String,
    repository: RepositoryTO,
    requiredApprovingReviewCount: Option[Int],
    requiredStatusCheckContexts: Seq[String],
    requiresApprovingReviews: Boolean,
    requiresCodeOwnerReviews: Boolean,
    requiresCommitSignatures: Boolean,
    requiresStatusChecks: Boolean,
    requiresStrictStatusChecks: Boolean,
    restrictsPushes: Boolean,
    restrictsReviewDismissals: Boolean
) extends NodeTO {

    override def toString(): String = {
        Seq(
            if (creator != null) "creator: " + GraphQLRequestSerializer.getEntry(creator) else "",
            if (databaseId.isDefined) "databaseId: " + GraphQLRequestSerializer.getEntry(databaseId.get) else "",
            "dismissesStaleReviews: " + GraphQLRequestSerializer.getEntry(dismissesStaleReviews),
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            "isAdminEnforced: " + GraphQLRequestSerializer.getEntry(isAdminEnforced),
            if (pattern != null) "pattern: " + GraphQLRequestSerializer.getEntry(pattern) else "",
            if (repository != null) "repository: " + GraphQLRequestSerializer.getEntry(repository) else "",
            if (requiredApprovingReviewCount.isDefined) "requiredApprovingReviewCount: " + GraphQLRequestSerializer.getEntry(requiredApprovingReviewCount.get) else "",
            if (requiredStatusCheckContexts != null) "requiredStatusCheckContexts: " + GraphQLRequestSerializer.getEntry(requiredStatusCheckContexts.asJava) else "",
            "requiresApprovingReviews: " + GraphQLRequestSerializer.getEntry(requiresApprovingReviews),
            "requiresCodeOwnerReviews: " + GraphQLRequestSerializer.getEntry(requiresCodeOwnerReviews),
            "requiresCommitSignatures: " + GraphQLRequestSerializer.getEntry(requiresCommitSignatures),
            "requiresStatusChecks: " + GraphQLRequestSerializer.getEntry(requiresStatusChecks),
            "requiresStrictStatusChecks: " + GraphQLRequestSerializer.getEntry(requiresStrictStatusChecks),
            "restrictsPushes: " + GraphQLRequestSerializer.getEntry(restrictsPushes),
            "restrictsReviewDismissals: " + GraphQLRequestSerializer.getEntry(restrictsReviewDismissals)
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object BranchProtectionRuleTO {

    def builder(): BranchProtectionRuleTO.Builder = new Builder()

    class Builder {

        private var creator: ActorTO = _
        private var databaseId: Option[Int] = _
        private var dismissesStaleReviews: Boolean = _
        private var id: String = _
        private var isAdminEnforced: Boolean = _
        private var pattern: String = _
        private var repository: RepositoryTO = _
        private var requiredApprovingReviewCount: Option[Int] = _
        private var requiredStatusCheckContexts: Seq[String] = _
        private var requiresApprovingReviews: Boolean = _
        private var requiresCodeOwnerReviews: Boolean = _
        private var requiresCommitSignatures: Boolean = _
        private var requiresStatusChecks: Boolean = _
        private var requiresStrictStatusChecks: Boolean = _
        private var restrictsPushes: Boolean = _
        private var restrictsReviewDismissals: Boolean = _

        def setCreator(creator: ActorTO): Builder = {
            this.creator = creator
            this
        }

        def setDatabaseId(databaseId: Option[Int]): Builder = {
            this.databaseId = databaseId
            this
        }

        def setDismissesStaleReviews(dismissesStaleReviews: Boolean): Builder = {
            this.dismissesStaleReviews = dismissesStaleReviews
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setIsAdminEnforced(isAdminEnforced: Boolean): Builder = {
            this.isAdminEnforced = isAdminEnforced
            this
        }

        def setPattern(pattern: String): Builder = {
            this.pattern = pattern
            this
        }

        def setRepository(repository: RepositoryTO): Builder = {
            this.repository = repository
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

        def setRequiresApprovingReviews(requiresApprovingReviews: Boolean): Builder = {
            this.requiresApprovingReviews = requiresApprovingReviews
            this
        }

        def setRequiresCodeOwnerReviews(requiresCodeOwnerReviews: Boolean): Builder = {
            this.requiresCodeOwnerReviews = requiresCodeOwnerReviews
            this
        }

        def setRequiresCommitSignatures(requiresCommitSignatures: Boolean): Builder = {
            this.requiresCommitSignatures = requiresCommitSignatures
            this
        }

        def setRequiresStatusChecks(requiresStatusChecks: Boolean): Builder = {
            this.requiresStatusChecks = requiresStatusChecks
            this
        }

        def setRequiresStrictStatusChecks(requiresStrictStatusChecks: Boolean): Builder = {
            this.requiresStrictStatusChecks = requiresStrictStatusChecks
            this
        }

        def setRestrictsPushes(restrictsPushes: Boolean): Builder = {
            this.restrictsPushes = restrictsPushes
            this
        }

        def setRestrictsReviewDismissals(restrictsReviewDismissals: Boolean): Builder = {
            this.restrictsReviewDismissals = restrictsReviewDismissals
            this
        }

        def build(): BranchProtectionRuleTO = new BranchProtectionRuleTO(creator, databaseId, dismissesStaleReviews, id, isAdminEnforced, pattern, repository, requiredApprovingReviewCount, requiredStatusCheckContexts, requiresApprovingReviews, requiresCodeOwnerReviews, requiresCommitSignatures, requiresStatusChecks, requiresStrictStatusChecks, restrictsPushes, restrictsReviewDismissals)

    }
}
