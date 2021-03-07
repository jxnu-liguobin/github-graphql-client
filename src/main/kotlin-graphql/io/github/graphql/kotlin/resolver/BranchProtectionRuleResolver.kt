package io.github.graphql.kotlin.resolver

import io.github.graphql.kotlin.model.*

/**
 * Resolver for BranchProtectionRule
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
interface BranchProtectionRuleResolver {

    @Throws(Exception::class)
    fun branchProtectionRuleConflicts(branchProtectionRuleTO: BranchProtectionRuleTO, after: String?, before: String?, first: Int?, last: Int?): BranchProtectionRuleConflictConnectionTO

    @Throws(Exception::class)
    fun matchingRefs(branchProtectionRuleTO: BranchProtectionRuleTO, after: String?, before: String?, first: Int?, last: Int?): RefConnectionTO

    @Throws(Exception::class)
    fun pushAllowances(branchProtectionRuleTO: BranchProtectionRuleTO, after: String?, before: String?, first: Int?, last: Int?): PushAllowanceConnectionTO

    @Throws(Exception::class)
    fun reviewDismissalAllowances(branchProtectionRuleTO: BranchProtectionRuleTO, after: String?, before: String?, first: Int?, last: Int?): ReviewDismissalAllowanceConnectionTO

}
