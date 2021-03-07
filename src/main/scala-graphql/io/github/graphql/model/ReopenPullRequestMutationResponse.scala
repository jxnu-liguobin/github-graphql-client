package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class ReopenPullRequestMutationResponse extends GraphQLResult[JMap[String, ReopenPullRequestPayloadTO]] {

    def reopenPullRequest(): ReopenPullRequestPayloadTO = {
        val data: JMap[String, ReopenPullRequestPayloadTO] = getData
        if (data != null) data.get(ReopenPullRequestMutationResponse.OPERATION_NAME) else null
    }

}

object ReopenPullRequestMutationResponse {

    private final val OPERATION_NAME: String = "reopenPullRequest"

}
