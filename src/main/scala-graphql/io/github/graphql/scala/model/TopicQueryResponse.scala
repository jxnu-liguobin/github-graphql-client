package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class TopicQueryResponse extends GraphQLResult[JMap[String, TopicTO]] {

    def topic(): TopicTO = {
        val data: JMap[String, TopicTO] = getData
        if (data != null) data.get(TopicQueryResponse.OPERATION_NAME) else null
    }

}

object TopicQueryResponse {

    private final val OPERATION_NAME: String = "topic"

}
