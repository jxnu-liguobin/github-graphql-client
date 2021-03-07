package io.github.graphql.resolver

import io.github.graphql.model._

/**
 * Resolver for BranchProtectionRule
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
trait BranchProtectionRuleResolver {

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def branchProtectionRuleConflicts(branchProtectionRuleTO: BranchProtectionRuleTO, after: String, before: String, first: Option[Int], last: Option[Int]): BranchProtectionRuleConflictConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def matchingRefs(branchProtectionRuleTO: BranchProtectionRuleTO, after: String, before: String, first: Option[Int], last: Option[Int]): RefConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def pushAllowances(branchProtectionRuleTO: BranchProtectionRuleTO, after: String, before: String, first: Option[Int], last: Option[Int]): PushAllowanceConnectionTO

    @javax.validation.constraints.NotNull
    @throws[Exception]
    def reviewDismissalAllowances(branchProtectionRuleTO: BranchProtectionRuleTO, after: String, before: String, first: Option[Int], last: Option[Int]): ReviewDismissalAllowanceConnectionTO

}
