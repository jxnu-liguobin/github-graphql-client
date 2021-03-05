package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class SecurityVulnerabilitiesQueryResponse : GraphQLResult<MutableMap<String, SecurityVulnerabilityConnectionTO>>() {

    companion object {
        const val OPERATION_NAME: String = "securityVulnerabilities"
    }

    fun securityVulnerabilities(): SecurityVulnerabilityConnectionTO {
        val data: MutableMap<String, SecurityVulnerabilityConnectionTO> = super.getData()
        return data.getValue(OPERATION_NAME)
    }
}
