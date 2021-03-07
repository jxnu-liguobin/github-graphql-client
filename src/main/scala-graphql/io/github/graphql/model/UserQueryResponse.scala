package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
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
