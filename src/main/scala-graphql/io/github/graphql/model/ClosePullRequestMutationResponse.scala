package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class ClosePullRequestMutationResponse extends GraphQLResult[JMap[String, ClosePullRequestPayloadTO]] {

    def closePullRequest(): ClosePullRequestPayloadTO = {
        val data: JMap[String, ClosePullRequestPayloadTO] = getData
        if (data != null) data.get(ClosePullRequestMutationResponse.OPERATION_NAME) else null
    }

}

object ClosePullRequestMutationResponse {

    private final val OPERATION_NAME: String = "closePullRequest"

}