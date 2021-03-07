package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class RelayQueryResponse extends GraphQLResult[JMap[String, QueryTO]] {

    def relay(): QueryTO = {
        val data: JMap[String, QueryTO] = getData
        if (data != null) data.get(RelayQueryResponse.OPERATION_NAME) else null
    }

}

object RelayQueryResponse {

    private final val OPERATION_NAME: String = "relay"

}
