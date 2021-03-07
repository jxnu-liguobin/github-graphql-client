package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class LinkRepositoryToProjectMutationResponse extends GraphQLResult[JMap[String, LinkRepositoryToProjectPayloadTO]] {

    def linkRepositoryToProject(): LinkRepositoryToProjectPayloadTO = {
        val data: JMap[String, LinkRepositoryToProjectPayloadTO] = getData
        if (data != null) data.get(LinkRepositoryToProjectMutationResponse.OPERATION_NAME) else null
    }

}

object LinkRepositoryToProjectMutationResponse {

    private final val OPERATION_NAME: String = "linkRepositoryToProject"

}
