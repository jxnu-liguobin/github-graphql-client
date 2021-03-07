package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
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
