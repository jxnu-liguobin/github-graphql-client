package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class BranchProtectionRuleTO implements java.io.Serializable, NodeTO {

    private ActorTO creator;
    private Integer databaseId;
    private boolean dismissesStaleReviews;
    @javax.validation.constraints.NotNull
    private String id;
    private boolean isAdminEnforced;
    @javax.validation.constraints.NotNull
    private String pattern;
    private RepositoryTO repository;
    private Integer requiredApprovingReviewCount;
    private java.util.List<String> requiredStatusCheckContexts;
    private boolean requiresApprovingReviews;
    private boolean requiresCodeOwnerReviews;
    private boolean requiresCommitSignatures;
    private boolean requiresStatusChecks;
    private boolean requiresStrictStatusChecks;
    private boolean restrictsPushes;
    private boolean restrictsReviewDismissals;

    public BranchProtectionRuleTO() {
    }

    public BranchProtectionRuleTO(ActorTO creator, Integer databaseId, boolean dismissesStaleReviews, String id, boolean isAdminEnforced, String pattern, RepositoryTO repository, Integer requiredApprovingReviewCount, java.util.List<String> requiredStatusCheckContexts, boolean requiresApprovingReviews, boolean requiresCodeOwnerReviews, boolean requiresCommitSignatures, boolean requiresStatusChecks, boolean requiresStrictStatusChecks, boolean restrictsPushes, boolean restrictsReviewDismissals) {
        this.creator = creator;
        this.databaseId = databaseId;
        this.dismissesStaleReviews = dismissesStaleReviews;
        this.id = id;
        this.isAdminEnforced = isAdminEnforced;
        this.pattern = pattern;
        this.repository = repository;
        this.requiredApprovingReviewCount = requiredApprovingReviewCount;
        this.requiredStatusCheckContexts = requiredStatusCheckContexts;
        this.requiresApprovingReviews = requiresApprovingReviews;
        this.requiresCodeOwnerReviews = requiresCodeOwnerReviews;
        this.requiresCommitSignatures = requiresCommitSignatures;
        this.requiresStatusChecks = requiresStatusChecks;
        this.requiresStrictStatusChecks = requiresStrictStatusChecks;
        this.restrictsPushes = restrictsPushes;
        this.restrictsReviewDismissals = restrictsReviewDismissals;
    }

    public ActorTO getCreator() {
        return creator;
    }

    public Integer getDatabaseId() {
        return databaseId;
    }

    public boolean getDismissesStaleReviews() {
        return dismissesStaleReviews;
    }

    public String getId() {
        return id;
    }

    public boolean getIsAdminEnforced() {
        return isAdminEnforced;
    }

    public String getPattern() {
        return pattern;
    }

    public RepositoryTO getRepository() {
        return repository;
    }

    public Integer getRequiredApprovingReviewCount() {
        return requiredApprovingReviewCount;
    }

    public java.util.List<String> getRequiredStatusCheckContexts() {
        return requiredStatusCheckContexts;
    }

    public boolean getRequiresApprovingReviews() {
        return requiresApprovingReviews;
    }

    public boolean getRequiresCodeOwnerReviews() {
        return requiresCodeOwnerReviews;
    }

    public boolean getRequiresCommitSignatures() {
        return requiresCommitSignatures;
    }

    public boolean getRequiresStatusChecks() {
        return requiresStatusChecks;
    }

    public boolean getRequiresStrictStatusChecks() {
        return requiresStrictStatusChecks;
    }

    public boolean getRestrictsPushes() {
        return restrictsPushes;
    }

    public boolean getRestrictsReviewDismissals() {
        return restrictsReviewDismissals;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (creator != null) {
            joiner.add("creator: " + GraphQLRequestSerializer.getEntry(creator));
        }
        if (databaseId != null) {
            joiner.add("databaseId: " + GraphQLRequestSerializer.getEntry(databaseId));
        }
        joiner.add("dismissesStaleReviews: " + GraphQLRequestSerializer.getEntry(dismissesStaleReviews));
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        joiner.add("isAdminEnforced: " + GraphQLRequestSerializer.getEntry(isAdminEnforced));
        if (pattern != null) {
            joiner.add("pattern: " + GraphQLRequestSerializer.getEntry(pattern));
        }
        if (repository != null) {
            joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository));
        }
        if (requiredApprovingReviewCount != null) {
            joiner.add("requiredApprovingReviewCount: " + GraphQLRequestSerializer.getEntry(requiredApprovingReviewCount));
        }
        if (requiredStatusCheckContexts != null) {
            joiner.add("requiredStatusCheckContexts: " + GraphQLRequestSerializer.getEntry(requiredStatusCheckContexts));
        }
        joiner.add("requiresApprovingReviews: " + GraphQLRequestSerializer.getEntry(requiresApprovingReviews));
        joiner.add("requiresCodeOwnerReviews: " + GraphQLRequestSerializer.getEntry(requiresCodeOwnerReviews));
        joiner.add("requiresCommitSignatures: " + GraphQLRequestSerializer.getEntry(requiresCommitSignatures));
        joiner.add("requiresStatusChecks: " + GraphQLRequestSerializer.getEntry(requiresStatusChecks));
        joiner.add("requiresStrictStatusChecks: " + GraphQLRequestSerializer.getEntry(requiresStrictStatusChecks));
        joiner.add("restrictsPushes: " + GraphQLRequestSerializer.getEntry(restrictsPushes));
        joiner.add("restrictsReviewDismissals: " + GraphQLRequestSerializer.getEntry(restrictsReviewDismissals));
        return joiner.toString();
    }

    public static BranchProtectionRuleTO.Builder builder() {
        return new BranchProtectionRuleTO.Builder();
    }

    public static class Builder {

        private ActorTO creator;
        private Integer databaseId;
        private boolean dismissesStaleReviews;
        private String id;
        private boolean isAdminEnforced;
        private String pattern;
        private RepositoryTO repository;
        private Integer requiredApprovingReviewCount;
        private java.util.List<String> requiredStatusCheckContexts;
        private boolean requiresApprovingReviews;
        private boolean requiresCodeOwnerReviews;
        private boolean requiresCommitSignatures;
        private boolean requiresStatusChecks;
        private boolean requiresStrictStatusChecks;
        private boolean restrictsPushes;
        private boolean restrictsReviewDismissals;

        public Builder() {
        }

        public Builder setCreator(ActorTO creator) {
            this.creator = creator;
            return this;
        }

        public Builder setDatabaseId(Integer databaseId) {
            this.databaseId = databaseId;
            return this;
        }

        public Builder setDismissesStaleReviews(boolean dismissesStaleReviews) {
            this.dismissesStaleReviews = dismissesStaleReviews;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setIsAdminEnforced(boolean isAdminEnforced) {
            this.isAdminEnforced = isAdminEnforced;
            return this;
        }

        public Builder setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }

        public Builder setRepository(RepositoryTO repository) {
            this.repository = repository;
            return this;
        }

        public Builder setRequiredApprovingReviewCount(Integer requiredApprovingReviewCount) {
            this.requiredApprovingReviewCount = requiredApprovingReviewCount;
            return this;
        }

        public Builder setRequiredStatusCheckContexts(java.util.List<String> requiredStatusCheckContexts) {
            this.requiredStatusCheckContexts = requiredStatusCheckContexts;
            return this;
        }

        public Builder setRequiresApprovingReviews(boolean requiresApprovingReviews) {
            this.requiresApprovingReviews = requiresApprovingReviews;
            return this;
        }

        public Builder setRequiresCodeOwnerReviews(boolean requiresCodeOwnerReviews) {
            this.requiresCodeOwnerReviews = requiresCodeOwnerReviews;
            return this;
        }

        public Builder setRequiresCommitSignatures(boolean requiresCommitSignatures) {
            this.requiresCommitSignatures = requiresCommitSignatures;
            return this;
        }

        public Builder setRequiresStatusChecks(boolean requiresStatusChecks) {
            this.requiresStatusChecks = requiresStatusChecks;
            return this;
        }

        public Builder setRequiresStrictStatusChecks(boolean requiresStrictStatusChecks) {
            this.requiresStrictStatusChecks = requiresStrictStatusChecks;
            return this;
        }

        public Builder setRestrictsPushes(boolean restrictsPushes) {
            this.restrictsPushes = restrictsPushes;
            return this;
        }

        public Builder setRestrictsReviewDismissals(boolean restrictsReviewDismissals) {
            this.restrictsReviewDismissals = restrictsReviewDismissals;
            return this;
        }


        public BranchProtectionRuleTO build() {
            return new BranchProtectionRuleTO(creator, databaseId, dismissesStaleReviews, id, isAdminEnforced, pattern, repository, requiredApprovingReviewCount, requiredStatusCheckContexts, requiresApprovingReviews, requiresCodeOwnerReviews, requiresCommitSignatures, requiresStatusChecks, requiresStrictStatusChecks, restrictsPushes, restrictsReviewDismissals);
        }

    }
}
