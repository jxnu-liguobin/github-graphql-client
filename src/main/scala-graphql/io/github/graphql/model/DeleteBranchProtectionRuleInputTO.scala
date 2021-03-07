package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
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