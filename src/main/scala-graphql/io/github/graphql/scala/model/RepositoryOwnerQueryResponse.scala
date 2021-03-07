package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class RepositoryOwnerQueryResponse extends GraphQLResult[JMap[String, RepositoryOwnerTO]] {

    def repositoryOwner(): RepositoryOwnerTO = {
        val data: JMap[String, RepositoryOwnerTO] = getData
        if (data != null) data.get(RepositoryOwnerQueryResponse.OPERATION_NAME) else null
    }

}

object RepositoryOwnerQueryResponse {

    private final val OPERATION_NAME: String = "repositoryOwner"

}
