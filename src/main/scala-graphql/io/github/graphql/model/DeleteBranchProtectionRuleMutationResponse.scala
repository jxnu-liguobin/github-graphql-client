package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
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
