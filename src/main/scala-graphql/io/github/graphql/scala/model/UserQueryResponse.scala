package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class UserQueryResponse extends GraphQLResult[JMap[String, UserTO]] {

    def user(): UserTO = {
        val data: JMap[String, UserTO] = getData
        if (data != null) data.get(UserQueryResponse.OPERATION_NAME) else null
    }

}

object UserQueryResponse {

    private final val OPERATION_NAME: String = "user"

}
