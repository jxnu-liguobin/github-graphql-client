package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class MergePullRequestMutationResponse extends GraphQLResult[JMap[String, MergePullRequestPayloadTO]] {

    def mergePullRequest(): MergePullRequestPayloadTO = {
        val data: JMap[String, MergePullRequestPayloadTO] = getData
        if (data != null) data.get(MergePullRequestMutationResponse.OPERATION_NAME) else null
    }

}

object MergePullRequestMutationResponse {

    private final val OPERATION_NAME: String = "mergePullRequest"

}
