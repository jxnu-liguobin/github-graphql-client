package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class ChangeUserStatusMutationResponse : GraphQLResult<MutableMap<String, ChangeUserStatusPayloadTO?>>() {

    companion object {
        const val OPERATION_NAME: String = "changeUserStatus"
    }

    fun changeUserStatus(): ChangeUserStatusPayloadTO? {
        val data: MutableMap<String, ChangeUserStatusPayloadTO?> = super.getData()
        return data[OPERATION_NAME]
    }
}
