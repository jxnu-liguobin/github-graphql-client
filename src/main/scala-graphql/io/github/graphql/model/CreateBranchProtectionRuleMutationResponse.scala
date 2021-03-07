package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class CreateBranchProtectionRuleMutationResponse extends GraphQLResult[JMap[String, CreateBranchProtectionRulePayloadTO]] {

    def createBranchProtectionRule(): CreateBranchProtectionRulePayloadTO = {
        val data: JMap[String, CreateBranchProtectionRulePayloadTO] = getData
        if (data != null) data.get(CreateBranchProtectionRuleMutationResponse.OPERATION_NAME) else null
    }

}

object CreateBranchProtectionRuleMutationResponse {

    private final val OPERATION_NAME: String = "createBranchProtectionRule"

}
