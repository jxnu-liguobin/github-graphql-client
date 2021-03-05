package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class LicensesQueryResponse : GraphQLResult<MutableMap<String, List<LicenseTO?>>>() {

    companion object {
        const val OPERATION_NAME: String = "licenses"
    }

    fun licenses(): List<LicenseTO?> {
        val data: MutableMap<String, List<LicenseTO?>> = super.getData()
        return data.getValue(OPERATION_NAME)
    }
}
