package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class RateLimitQueryResponse extends GraphQLResult[JMap[String, RateLimitTO]] {

    def rateLimit(): RateLimitTO = {
        val data: JMap[String, RateLimitTO] = getData
        if (data != null) data.get(RateLimitQueryResponse.OPERATION_NAME) else null
    }

}

object RateLimitQueryResponse {

    private final val OPERATION_NAME: String = "rateLimit"

}
