package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class NodesQueryResponse : GraphQLResult<MutableMap<String, List<NodeTO?>>>() {

    companion object {
        const val OPERATION_NAME: String = "nodes"
    }

    fun nodes(): List<NodeTO?> {
        val data: MutableMap<String, List<NodeTO?>> = super.getData()
        return data.getValue(OPERATION_NAME)
    }
}
