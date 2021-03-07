package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class RepositoryQueryResponse extends GraphQLResult[JMap[String, RepositoryTO]] {

    def repository(): RepositoryTO = {
        val data: JMap[String, RepositoryTO] = getData
        if (data != null) data.get(RepositoryQueryResponse.OPERATION_NAME) else null
    }

}

object RepositoryQueryResponse {

    private final val OPERATION_NAME: String = "repository"

}
