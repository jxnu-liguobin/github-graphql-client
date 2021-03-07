package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class SecurityVulnerabilitiesQueryResponse extends GraphQLResult[JMap[String, SecurityVulnerabilityConnectionTO]] {

    def securityVulnerabilities(): SecurityVulnerabilityConnectionTO = {
        val data: JMap[String, SecurityVulnerabilityConnectionTO] = getData
        if (data != null) data.get(SecurityVulnerabilitiesQueryResponse.OPERATION_NAME) else null
    }

}

object SecurityVulnerabilitiesQueryResponse {

    private final val OPERATION_NAME: String = "securityVulnerabilities"

}
