package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class UpdateProjectColumnMutationResponse : GraphQLResult<MutableMap<String, UpdateProjectColumnPayloadTO?>>() {

    companion object {
        const val OPERATION_NAME: String = "updateProjectColumn"
    }

    fun updateProjectColumn(): UpdateProjectColumnPayloadTO? {
        val data: MutableMap<String, UpdateProjectColumnPayloadTO?> = super.getData()
        return data[OPERATION_NAME]
    }
}
