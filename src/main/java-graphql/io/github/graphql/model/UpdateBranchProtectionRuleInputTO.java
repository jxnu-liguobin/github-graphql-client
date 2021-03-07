package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class UpdateBranchProtectionRuleInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String branchProtectionRuleId;
    private String clientMutationId;
    private Boolean dismissesStaleReviews;
    private Boolean isAdminEnforced;
    private String pattern;
    @javax.validation.constraints.NotNull
    private java.util.List<String> pushActorIds;
    private Integer requiredApprovingReviewCount;
    @javax.validation.constraints.NotNull
    private java.util.List<String> requiredStatusCheckContexts;
    private Boolean requiresApprovingReviews;
    private Boolean requiresCodeOwnerReviews;
    private Boolean requiresCommitSignatures;
    private Boolean requiresStatusChecks;
    private Boolean requiresStrictStatusChecks;
    private Boolean restrictsPushes;
    private Boolean restrictsReviewDismissals;
    @javax.validation.constraints.NotNull
    private java.util.List<String> reviewDismissalActorIds;

    public UpdateBranchProtectionRuleInputTO() {
    }

    public UpdateBranchProtectionRuleInputTO(String branchProtectionRuleId, String clientMutationId, Boolean dismissesStaleReviews, Boolean isAdminEnforced, String pattern, java.util.List<String> pushActorIds, Integer requiredApprovingReviewCount, java.util.List<String> requiredStatusCheckContexts, Boolean requiresApprovingReviews, Boolean requiresCodeOwnerReviews, Boolean requiresCommitSignatures, Boolean requiresStatusChecks, Boolean requiresStrictStatusChecks, Boolean restrictsPushes, Boolean restrictsReviewDismissals, java.util.List<String> reviewDismissalActorIds) {
        this.branchProtectionRuleId = branchProtectionRuleId;
        this.clientMutationId = clientMutationId;
        this.dismissesStaleReviews = dismissesStaleReviews;
        this.isAdminEnforced = isAdminEnforced;
        this.pattern = pattern;
        this.pushActorIds = pushActorIds;
        this.requiredApprovingReviewCount = requiredApprovingReviewCount;
        this.requiredStatusCheckContexts = requiredStatusCheckContexts;
        this.requiresApprovingReviews = requiresApprovingReviews;
        this.requiresCodeOwnerReviews = requiresCodeOwnerReviews;
        this.requiresCommitSignatures = requiresCommitSignatures;
        this.requiresStatusChecks = requiresStatusChecks;
        this.requiresStrictStatusChecks = requiresStrictStatusChecks;
        this.restrictsPushes = restrictsPushes;
        this.restrictsReviewDismissals = restrictsReviewDismissals;
        this.reviewDismissalActorIds = reviewDismissalActorIds;
    }

    public String getBranchProtectionRuleId() {
        return branchProtectionRuleId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public Boolean getDismissesStaleReviews() {
        return dismissesStaleReviews;
    }

    public Boolean getIsAdminEnforced() {
        return isAdminEnforced;
    }

    public String getPattern() {
        return pattern;
    }

    public java.util.List<String> getPushActorIds() {
        return pushActorIds;
    }

    public Integer getRequiredApprovingReviewCount() {
        return requiredApprovingReviewCount;
    }

    public java.util.List<String> getRequiredStatusCheckContexts() {
        return requiredStatusCheckContexts;
    }

    public Boolean getRequiresApprovingReviews() {
        return requiresApprovingReviews;
    }

    public Boolean getRequiresCodeOwnerReviews() {
        return requiresCodeOwnerReviews;
    }

    public Boolean getRequiresCommitSignatures() {
        return requiresCommitSignatures;
    }

    public Boolean getRequiresStatusChecks() {
        return requiresStatusChecks;
    }

    public Boolean getRequiresStrictStatusChecks() {
        return requiresStrictStatusChecks;
    }

    public Boolean getRestrictsPushes() {
        return restrictsPushes;
    }

    public Boolean getRestrictsReviewDismissals() {
        return restrictsReviewDismissals;
    }

    public java.util.List<String> getReviewDismissalActorIds() {
        return reviewDismissalActorIds;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (branchProtectionRuleId != null) {
            joiner.add("branchProtectionRuleId: " + GraphQLRequestSerializer.getEntry(branchProtectionRuleId));
        }
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (dismissesStaleReviews != null) {
            joiner.add("dismissesStaleReviews: " + GraphQLRequestSerializer.getEntry(dismissesStaleReviews));
        }
        if (isAdminEnforced != null) {
            joiner.add("isAdminEnforced: " + GraphQLRequestSerializer.getEntry(isAdminEnforced));
        }
        if (pattern != null) {
            joiner.add("pattern: " + GraphQLRequestSerializer.getEntry(pattern));
        }
        if (pushActorIds != null) {
            joiner.add("pushActorIds: " + GraphQLRequestSerializer.getEntry(pushActorIds));
        }
        if (requiredApprovingReviewCount != null) {
            joiner.add("requiredApprovingReviewCount: " + GraphQLRequestSerializer.getEntry(requiredApprovingReviewCount));
        }
        if (requiredStatusCheckContexts != null) {
            joiner.add("requiredStatusCheckContexts: " + GraphQLRequestSerializer.getEntry(requiredStatusCheckContexts));
        }
        if (requiresApprovingReviews != null) {
            joiner.add("requiresApprovingReviews: " + GraphQLRequestSerializer.getEntry(requiresApprovingReviews));
        }
        if (requiresCodeOwnerReviews != null) {
            joiner.add("requiresCodeOwnerReviews: " + GraphQLRequestSerializer.getEntry(requiresCodeOwnerReviews));
        }
        if (requiresCommitSignatures != null) {
            joiner.add("requiresCommitSignatures: " + GraphQLRequestSerializer.getEntry(requiresCommitSignatures));
        }
        if (requiresStatusChecks != null) {
            joiner.add("requiresStatusChecks: " + GraphQLRequestSerializer.getEntry(requiresStatusChecks));
        }
        if (requiresStrictStatusChecks != null) {
            joiner.add("requiresStrictStatusChecks: " + GraphQLRequestSerializer.getEntry(requiresStrictStatusChecks));
        }
        if (restrictsPushes != null) {
            joiner.add("restrictsPushes: " + GraphQLRequestSerializer.getEntry(restrictsPushes));
        }
        if (restrictsReviewDismissals != null) {
            joiner.add("restrictsReviewDismissals: " + GraphQLRequestSerializer.getEntry(restrictsReviewDismissals));
        }
        if (reviewDismissalActorIds != null) {
            joiner.add("reviewDismissalActorIds: " + GraphQLRequestSerializer.getEntry(reviewDismissalActorIds));
        }
        return joiner.toString();
    }

    public static UpdateBranchProtectionRuleInputTO.Builder builder() {
        return new UpdateBranchProtectionRuleInputTO.Builder();
    }

    public static class Builder {

        private String branchProtectionRuleId;
        private String clientMutationId;
        private Boolean dismissesStaleReviews;
        private Boolean isAdminEnforced;
        private String pattern;
        private java.util.List<String> pushActorIds;
        private Integer requiredApprovingReviewCount;
        private java.util.List<String> requiredStatusCheckContexts;
        private Boolean requiresApprovingReviews;
        private Boolean requiresCodeOwnerReviews;
        private Boolean requiresCommitSignatures;
        private Boolean requiresStatusChecks;
        private Boolean requiresStrictStatusChecks;
        private Boolean restrictsPushes;
        private Boolean restrictsReviewDismissals;
        private java.util.List<String> reviewDismissalActorIds;

        public Builder() {
        }

        public Builder setBranchProtectionRuleId(String branchProtectionRuleId) {
            this.branchProtectionRuleId = branchProtectionRuleId;
            return this;
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setDismissesStaleReviews(Boolean dismissesStaleReviews) {
            this.dismissesStaleReviews = dismissesStaleReviews;
            return this;
        }

        public Builder setIsAdminEnforced(Boolean isAdminEnforced) {
            this.isAdminEnforced = isAdminEnforced;
            return this;
        }

        public Builder setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }

        public Builder setPushActorIds(java.util.List<String> pushActorIds) {
            this.pushActorIds = pushActorIds;
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

        public Builder setRequiresApprovingReviews(Boolean requiresApprovingReviews) {
            this.requiresApprovingReviews = requiresApprovingReviews;
            return this;
        }

        public Builder setRequiresCodeOwnerReviews(Boolean requiresCodeOwnerReviews) {
            this.requiresCodeOwnerReviews = requiresCodeOwnerReviews;
            return this;
        }

        public Builder setRequiresCommitSignatures(Boolean requiresCommitSignatures) {
            this.requiresCommitSignatures = requiresCommitSignatures;
            return this;
        }

        public Builder setRequiresStatusChecks(Boolean requiresStatusChecks) {
            this.requiresStatusChecks = requiresStatusChecks;
            return this;
        }

        public Builder setRequiresStrictStatusChecks(Boolean requiresStrictStatusChecks) {
            this.requiresStrictStatusChecks = requiresStrictStatusChecks;
            return this;
        }

        public Builder setRestrictsPushes(Boolean restrictsPushes) {
            this.restrictsPushes = restrictsPushes;
            return this;
        }

        public Builder setRestrictsReviewDismissals(Boolean restrictsReviewDismissals) {
            this.restrictsReviewDismissals = restrictsReviewDismissals;
            return this;
        }

        public Builder setReviewDismissalActorIds(java.util.List<String> reviewDismissalActorIds) {
            this.reviewDismissalActorIds = reviewDismissalActorIds;
            return this;
        }


        public UpdateBranchProtectionRuleInputTO build() {
            return new UpdateBranchProtectionRuleInputTO(branchProtectionRuleId, clientMutationId, dismissesStaleReviews, isAdminEnforced, pattern, pushActorIds, requiredApprovingReviewCount, requiredStatusCheckContexts, requiresApprovingReviews, requiresCodeOwnerReviews, requiresCommitSignatures, requiresStatusChecks, requiresStrictStatusChecks, restrictsPushes, restrictsReviewDismissals, reviewDismissalActorIds);
        }

    }
}
