package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class CreateIssueMutationResponse extends GraphQLResult[JMap[String, CreateIssuePayloadTO]] {

    def createIssue(): CreateIssuePayloadTO = {
        val data: JMap[String, CreateIssuePayloadTO] = getData
        if (data != null) data.get(CreateIssueMutationResponse.OPERATION_NAME) else null
    }

}

object CreateIssueMutationResponse {

    private final val OPERATION_NAME: String = "createIssue"

}
