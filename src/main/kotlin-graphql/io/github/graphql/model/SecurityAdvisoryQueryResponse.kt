package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class SecurityAdvisoryQueryResponse : GraphQLResult<MutableMap<String, SecurityAdvisoryTO?>>() {

    companion object {
        const val OPERATION_NAME: String = "securityAdvisory"
    }

    fun securityAdvisory(): SecurityAdvisoryTO? {
        val data: MutableMap<String, SecurityAdvisoryTO?> = super.getData()
        return data[OPERATION_NAME]
    }
}
