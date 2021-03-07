package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class UpdatePullRequestMutationResponse extends GraphQLResult[JMap[String, UpdatePullRequestPayloadTO]] {

    def updatePullRequest(): UpdatePullRequestPayloadTO = {
        val data: JMap[String, UpdatePullRequestPayloadTO] = getData
        if (data != null) data.get(UpdatePullRequestMutationResponse.OPERATION_NAME) else null
    }

}

object UpdatePullRequestMutationResponse {

    private final val OPERATION_NAME: String = "updatePullRequest"

}
