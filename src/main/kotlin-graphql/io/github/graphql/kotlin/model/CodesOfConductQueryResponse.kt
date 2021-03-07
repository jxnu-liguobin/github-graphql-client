package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
open class CodesOfConductQueryResponse : GraphQLResult<MutableMap<String, List<CodeOfConductTO?>?>>() {

    companion object {
        const val OPERATION_NAME: String = "codesOfConduct"
    }

    fun codesOfConduct(): List<CodeOfConductTO?>? {
        val data: MutableMap<String, List<CodeOfConductTO?>?> = super.getData()
        return data[OPERATION_NAME]
    }
}
