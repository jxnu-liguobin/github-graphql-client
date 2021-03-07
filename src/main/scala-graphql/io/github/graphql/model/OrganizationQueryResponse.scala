package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class OrganizationQueryResponse extends GraphQLResult[JMap[String, OrganizationTO]] {

    def organization(): OrganizationTO = {
        val data: JMap[String, OrganizationTO] = getData
        if (data != null) data.get(OrganizationQueryResponse.OPERATION_NAME) else null
    }

}

object OrganizationQueryResponse {

    private final val OPERATION_NAME: String = "organization"

}
