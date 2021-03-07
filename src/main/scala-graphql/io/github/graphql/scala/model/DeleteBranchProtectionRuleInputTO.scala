package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class DeleteBranchProtectionRuleInputTO(
    @javax.validation.constraints.NotNull
    branchProtectionRuleId: String,
    clientMutationId: String
) {

    override def toString(): String = {
        Seq(
            if (branchProtectionRuleId != null) "branchProtectionRuleId: " + GraphQLRequestSerializer.getEntry(branchProtectionRuleId) else "",
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
        val that = obj.asInstanceOf[DeleteBranchProtectionRuleInputTO]
        Objects.equals(branchProtectionRuleId, that.branchProtectionRuleId) &&
        Objects.equals(clientMutationId, that.clientMutationId)
    }

    override def hashCode(): Int = {
        Objects.hash(branchProtectionRuleId, clientMutationId)
    }
}

object DeleteBranchProtectionRuleInputTO {

    def builder(): DeleteBranchProtectionRuleInputTO.Builder = new Builder()

    class Builder {

        private var branchProtectionRuleId: String = _
        private var clientMutationId: String = _

        def setBranchProtectionRuleId(branchProtectionRuleId: String): Builder = {
            this.branchProtectionRuleId = branchProtectionRuleId
            this
        }

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def build(): DeleteBranchProtectionRuleInputTO = new DeleteBranchProtectionRuleInputTO(branchProtectionRuleId, clientMutationId)

    }
}
