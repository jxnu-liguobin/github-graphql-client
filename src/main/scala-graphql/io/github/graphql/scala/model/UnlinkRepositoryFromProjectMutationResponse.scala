package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class UnlinkRepositoryFromProjectMutationResponse extends GraphQLResult[JMap[String, UnlinkRepositoryFromProjectPayloadTO]] {

    def unlinkRepositoryFromProject(): UnlinkRepositoryFromProjectPayloadTO = {
        val data: JMap[String, UnlinkRepositoryFromProjectPayloadTO] = getData
        if (data != null) data.get(UnlinkRepositoryFromProjectMutationResponse.OPERATION_NAME) else null
    }

}

object UnlinkRepositoryFromProjectMutationResponse {

    private final val OPERATION_NAME: String = "unlinkRepositoryFromProject"

}
