package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class CreateBranchProtectionRulePayloadTO(
    branchProtectionRule: BranchProtectionRuleTO,
    clientMutationId: String
) {

    override def toString(): String = {
        Seq(
            if (branchProtectionRule != null) "branchProtectionRule: " + GraphQLRequestSerializer.getEntry(branchProtectionRule) else "",
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object CreateBranchProtectionRulePayloadTO {

    def builder(): CreateBranchProtectionRulePayloadTO.Builder = new Builder()

    class Builder {

        private var branchProtectionRule: BranchProtectionRuleTO = _
        private var clientMutationId: String = _

        def setBranchProtectionRule(branchProtectionRule: BranchProtectionRuleTO): Builder = {
            this.branchProtectionRule = branchProtectionRule
            this
        }

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def build(): CreateBranchProtectionRulePayloadTO = new CreateBranchProtectionRulePayloadTO(branchProtectionRule, clientMutationId)

    }
}
