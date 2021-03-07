package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
open class LockLockableMutationResponse : GraphQLResult<MutableMap<String, LockLockablePayloadTO?>>() {

    companion object {
        const val OPERATION_NAME: String = "lockLockable"
    }

    fun lockLockable(): LockLockablePayloadTO? {
        val data: MutableMap<String, LockLockablePayloadTO?> = super.getData()
        return data[OPERATION_NAME]
    }
}
