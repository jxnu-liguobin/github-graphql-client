package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
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

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[CreateBranchProtectionRulePayloadTO]
        Objects.equals(branchProtectionRule, that.branchProtectionRule) &&
        Objects.equals(clientMutationId, that.clientMutationId)
    }

    override def hashCode(): Int = {
        Objects.hash(branchProtectionRule, clientMutationId)
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
