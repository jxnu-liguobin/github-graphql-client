package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class ResourceQueryResponse extends GraphQLResult[JMap[String, UniformResourceLocatableTO]] {

    def resource(): UniformResourceLocatableTO = {
        val data: JMap[String, UniformResourceLocatableTO] = getData
        if (data != null) data.get(ResourceQueryResponse.OPERATION_NAME) else null
    }

}

object ResourceQueryResponse {

    private final val OPERATION_NAME: String = "resource"

}
