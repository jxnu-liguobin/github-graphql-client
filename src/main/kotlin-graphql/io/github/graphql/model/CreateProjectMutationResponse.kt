package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class CreateProjectMutationResponse : GraphQLResult<MutableMap<String, CreateProjectPayloadTO?>>() {

    companion object {
        const val OPERATION_NAME: String = "createProject"
    }

    fun createProject(): CreateProjectPayloadTO? {
        val data: MutableMap<String, CreateProjectPayloadTO?> = super.getData()
        return data[OPERATION_NAME]
    }
}