package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class DeleteBranchProtectionRulePayloadTO(
    clientMutationId: String
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object DeleteBranchProtectionRulePayloadTO {

    def builder(): DeleteBranchProtectionRulePayloadTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def build(): DeleteBranchProtectionRulePayloadTO = new DeleteBranchProtectionRulePayloadTO(clientMutationId)

    }
}
