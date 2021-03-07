package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
open class ResourceQueryResponse : GraphQLResult<MutableMap<String, UniformResourceLocatableTO?>>() {

    companion object {
        const val OPERATION_NAME: String = "resource"
    }

    fun resource(): UniformResourceLocatableTO? {
        val data: MutableMap<String, UniformResourceLocatableTO?> = super.getData()
        return data[OPERATION_NAME]
    }
}
