package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class SecurityAdvisoriesQueryResponse : GraphQLResult<MutableMap<String, SecurityAdvisoryConnectionTO>>() {

    companion object {
        const val OPERATION_NAME: String = "securityAdvisories"
    }

    fun securityAdvisories(): SecurityAdvisoryConnectionTO {
        val data: MutableMap<String, SecurityAdvisoryConnectionTO> = super.getData()
        return data.getValue(OPERATION_NAME)
    }
}
