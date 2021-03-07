package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
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
