package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class DeleteRefMutationResponse : GraphQLResult<MutableMap<String, DeleteRefPayloadTO?>>() {

    companion object {
        const val OPERATION_NAME: String = "deleteRef"
    }

    fun deleteRef(): DeleteRefPayloadTO? {
        val data: MutableMap<String, DeleteRefPayloadTO?> = super.getData()
        return data[OPERATION_NAME]
    }
}
