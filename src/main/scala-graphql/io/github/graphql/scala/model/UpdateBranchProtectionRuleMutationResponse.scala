package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class UpdateBranchProtectionRuleMutationResponse extends GraphQLResult[JMap[String, UpdateBranchProtectionRulePayloadTO]] {

    def updateBranchProtectionRule(): UpdateBranchProtectionRulePayloadTO = {
        val data: JMap[String, UpdateBranchProtectionRulePayloadTO] = getData
        if (data != null) data.get(UpdateBranchProtectionRuleMutationResponse.OPERATION_NAME) else null
    }

}

object UpdateBranchProtectionRuleMutationResponse {

    private final val OPERATION_NAME: String = "updateBranchProtectionRule"

}
