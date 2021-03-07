package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class SecurityAdvisoriesQueryResponse extends GraphQLResult[JMap[String, SecurityAdvisoryConnectionTO]] {

    def securityAdvisories(): SecurityAdvisoryConnectionTO = {
        val data: JMap[String, SecurityAdvisoryConnectionTO] = getData
        if (data != null) data.get(SecurityAdvisoriesQueryResponse.OPERATION_NAME) else null
    }

}

object SecurityAdvisoriesQueryResponse {

    private final val OPERATION_NAME: String = "securityAdvisories"

}
