package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
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
