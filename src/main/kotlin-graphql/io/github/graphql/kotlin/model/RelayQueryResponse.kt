package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
open class RelayQueryResponse : GraphQLResult<MutableMap<String, QueryTO>>() {

    companion object {
        const val OPERATION_NAME: String = "relay"
    }

    fun relay(): QueryTO {
        val data: MutableMap<String, QueryTO> = super.getData()
        return data.getValue(OPERATION_NAME)
    }
}
