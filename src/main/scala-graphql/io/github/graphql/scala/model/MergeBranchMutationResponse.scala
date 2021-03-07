package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class MergeBranchMutationResponse extends GraphQLResult[JMap[String, MergeBranchPayloadTO]] {

    def mergeBranch(): MergeBranchPayloadTO = {
        val data: JMap[String, MergeBranchPayloadTO] = getData
        if (data != null) data.get(MergeBranchMutationResponse.OPERATION_NAME) else null
    }

}

object MergeBranchMutationResponse {

    private final val OPERATION_NAME: String = "mergeBranch"

}
