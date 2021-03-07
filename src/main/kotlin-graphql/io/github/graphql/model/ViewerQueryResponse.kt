package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class ViewerQueryResponse : GraphQLResult<MutableMap<String, UserTO>>() {

    companion object {
        const val OPERATION_NAME: String = "viewer"
    }

    fun viewer(): UserTO {
        val data: MutableMap<String, UserTO> = super.getData()
        return data.getValue(OPERATION_NAME)
    }
}
