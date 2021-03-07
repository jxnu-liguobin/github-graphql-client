package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class NodeQueryResponse extends GraphQLResult[JMap[String, NodeTO]] {

    def node(): NodeTO = {
        val data: JMap[String, NodeTO] = getData
        if (data != null) data.get(NodeQueryResponse.OPERATION_NAME) else null
    }

}

object NodeQueryResponse {

    private final val OPERATION_NAME: String = "node"

}
