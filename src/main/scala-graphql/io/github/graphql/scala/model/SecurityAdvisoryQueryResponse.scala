package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class SecurityAdvisoryQueryResponse extends GraphQLResult[JMap[String, SecurityAdvisoryTO]] {

    def securityAdvisory(): SecurityAdvisoryTO = {
        val data: JMap[String, SecurityAdvisoryTO] = getData
        if (data != null) data.get(SecurityAdvisoryQueryResponse.OPERATION_NAME) else null
    }

}

object SecurityAdvisoryQueryResponse {

    private final val OPERATION_NAME: String = "securityAdvisory"

}
