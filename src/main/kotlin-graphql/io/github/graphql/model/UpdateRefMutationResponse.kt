package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class UpdateRefMutationResponse : GraphQLResult<MutableMap<String, UpdateRefPayloadTO?>>() {

    companion object {
        const val OPERATION_NAME: String = "updateRef"
    }

    fun updateRef(): UpdateRefPayloadTO? {
        val data: MutableMap<String, UpdateRefPayloadTO?> = super.getData()
        return data[OPERATION_NAME]
    }
}
