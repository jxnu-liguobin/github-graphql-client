package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class ViewerQueryResponse extends GraphQLResult[JMap[String, UserTO]] {

    def viewer(): UserTO = {
        val data: JMap[String, UserTO] = getData
        if (data != null) data.get(ViewerQueryResponse.OPERATION_NAME) else null
    }

}

object ViewerQueryResponse {

    private final val OPERATION_NAME: String = "viewer"

}
