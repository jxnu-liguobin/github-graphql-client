package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class NodesQueryResponse extends GraphQLResult[JMap[String, Seq[NodeTO]]] {

    def nodes(): Seq[NodeTO] = {
        val data: JMap[String, Seq[NodeTO]] = getData
        if (data != null) data.get(NodesQueryResponse.OPERATION_NAME) else null
    }

}

object NodesQueryResponse {

    private final val OPERATION_NAME: String = "nodes"

}
