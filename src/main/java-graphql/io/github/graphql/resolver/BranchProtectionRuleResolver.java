package io.github.graphql.resolver;

import io.github.graphql.model.*;

/**
 * Resolver for BranchProtectionRule
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public interface BranchProtectionRuleResolver {

    @javax.validation.constraints.NotNull
    BranchProtectionRuleConflictConnectionTO branchProtectionRuleConflicts(BranchProtectionRuleTO branchProtectionRuleTO, String after, String before, Integer first, Integer last) throws Exception;

    @javax.validation.constraints.NotNull
    RefConnectionTO matchingRefs(BranchProtectionRuleTO branchProtectionRuleTO, String after, String before, Integer first, Integer last) throws Exception;

    @javax.validation.constraints.NotNull
    PushAllowanceConnectionTO pushAllowances(BranchProtectionRuleTO branchProtectionRuleTO, String after, String before, Integer first, Integer last) throws Exception;

    @javax.validation.constraints.NotNull
    ReviewDismissalAllowanceConnectionTO reviewDismissalAllowances(BranchProtectionRuleTO branchProtectionRuleTO, String after, String before, Integer first, Integer last) throws Exception;

}
