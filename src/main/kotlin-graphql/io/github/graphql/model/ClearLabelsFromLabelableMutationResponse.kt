package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class ClearLabelsFromLabelableMutationResponse : GraphQLResult<MutableMap<String, ClearLabelsFromLabelablePayloadTO?>>() {

    companion object {
        const val OPERATION_NAME: String = "clearLabelsFromLabelable"
    }

    fun clearLabelsFromLabelable(): ClearLabelsFromLabelablePayloadTO? {
        val data: MutableMap<String, ClearLabelsFromLabelablePayloadTO?> = super.getData()
        return data[OPERATION_NAME]
    }
}
