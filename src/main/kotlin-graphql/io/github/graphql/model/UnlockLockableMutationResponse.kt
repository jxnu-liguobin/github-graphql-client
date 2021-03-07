package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class UnlockLockableMutationResponse : GraphQLResult<MutableMap<String, UnlockLockablePayloadTO?>>() {

    companion object {
        const val OPERATION_NAME: String = "unlockLockable"
    }

    fun unlockLockable(): UnlockLockablePayloadTO? {
        val data: MutableMap<String, UnlockLockablePayloadTO?> = super.getData()
        return data[OPERATION_NAME]
    }
}
