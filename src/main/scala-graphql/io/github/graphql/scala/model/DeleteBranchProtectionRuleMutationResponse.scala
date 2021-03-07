package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class DeleteBranchProtectionRuleMutationResponse extends GraphQLResult[JMap[String, DeleteBranchProtectionRulePayloadTO]] {

    def deleteBranchProtectionRule(): DeleteBranchProtectionRulePayloadTO = {
        val data: JMap[String, DeleteBranchProtectionRulePayloadTO] = getData
        if (data != null) data.get(DeleteBranchProtectionRuleMutationResponse.OPERATION_NAME) else null
    }

}

object DeleteBranchProtectionRuleMutationResponse {

    private final val OPERATION_NAME: String = "deleteBranchProtectionRule"

}
