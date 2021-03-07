package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class CloseIssueMutationResponse extends GraphQLResult[JMap[String, CloseIssuePayloadTO]] {

    def closeIssue(): CloseIssuePayloadTO = {
        val data: JMap[String, CloseIssuePayloadTO] = getData
        if (data != null) data.get(CloseIssueMutationResponse.OPERATION_NAME) else null
    }

}

object CloseIssueMutationResponse {

    private final val OPERATION_NAME: String = "closeIssue"

}
