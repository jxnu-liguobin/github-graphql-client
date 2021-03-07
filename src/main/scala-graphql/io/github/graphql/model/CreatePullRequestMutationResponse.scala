package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class CreatePullRequestMutationResponse extends GraphQLResult[JMap[String, CreatePullRequestPayloadTO]] {

    def createPullRequest(): CreatePullRequestPayloadTO = {
        val data: JMap[String, CreatePullRequestPayloadTO] = getData
        if (data != null) data.get(CreatePullRequestMutationResponse.OPERATION_NAME) else null
    }

}

object CreatePullRequestMutationResponse {

    private final val OPERATION_NAME: String = "createPullRequest"

}