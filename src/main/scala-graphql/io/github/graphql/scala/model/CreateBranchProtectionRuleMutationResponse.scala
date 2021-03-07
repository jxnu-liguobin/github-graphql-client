package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
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
