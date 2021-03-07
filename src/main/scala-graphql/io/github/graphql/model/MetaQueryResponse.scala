package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class MetaQueryResponse extends GraphQLResult[JMap[String, GitHubMetadataTO]] {

    def meta(): GitHubMetadataTO = {
        val data: JMap[String, GitHubMetadataTO] = getData
        if (data != null) data.get(MetaQueryResponse.OPERATION_NAME) else null
    }

}

object MetaQueryResponse {

    private final val OPERATION_NAME: String = "meta"

}
