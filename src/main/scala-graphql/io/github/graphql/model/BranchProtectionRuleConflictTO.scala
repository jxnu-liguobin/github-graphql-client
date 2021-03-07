package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class BranchProtectionRuleConflictTO(
    branchProtectionRule: BranchProtectionRuleTO,
    conflictingBranchProtectionRule: BranchProtectionRuleTO,
    ref: RefTO
) {

    override def toString(): String = {
        Seq(
            if (branchProtectionRule != null) "branchProtectionRule: " + GraphQLRequestSerializer.getEntry(branchProtectionRule) else "",
            if (conflictingBranchProtectionRule != null) "conflictingBranchProtectionRule: " + GraphQLRequestSerializer.getEntry(conflictingBranchProtectionRule) else "",
            if (ref != null) "ref: " + GraphQLRequestSerializer.getEntry(ref) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object BranchProtectionRuleConflictTO {

    def builder(): BranchProtectionRuleConflictTO.Builder = new Builder()

    class Builder {

        private var branchProtectionRule: BranchProtectionRuleTO = _
        private var conflictingBranchProtectionRule: BranchProtectionRuleTO = _
        private var ref: RefTO = _

        def setBranchProtectionRule(branchProtectionRule: BranchProtectionRuleTO): Builder = {
            this.branchProtectionRule = branchProtectionRule
            this
        }

        def setConflictingBranchProtectionRule(conflictingBranchProtectionRule: BranchProtectionRuleTO): Builder = {
            this.conflictingBranchProtectionRule = conflictingBranchProtectionRule
            this
        }

        def setRef(ref: RefTO): Builder = {
            this.ref = ref
            this
        }

        def build(): BranchProtectionRuleConflictTO = new BranchProtectionRuleConflictTO(branchProtectionRule, conflictingBranchProtectionRule, ref)

    }
}
